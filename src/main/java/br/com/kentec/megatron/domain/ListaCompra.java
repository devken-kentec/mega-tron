package br.com.kentec.megatron.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="lista_compra" )
@SuppressWarnings("serial")
public class ListaCompra implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="item", nullable = true, length = 32)
	private String item;
	
	@Column(name="status", nullable = true, length = 8)
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "id_item_categoria", nullable = true)
	private ItemCategoria itemCategoria = new ItemCategoria();
	
	@ManyToOne
	@JoinColumn(name = "id_user", nullable = true)
	private User user = new User();
	
	public ListaCompra() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ItemCategoria getItemCategoria() {
		return itemCategoria;
	}

	public void setItemCategoria(ItemCategoria itemCategoria) {
		this.itemCategoria = itemCategoria;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ListaCompra [id=" + id + ", item=" + item + ", status=" + status + ", itemCategoria=" + itemCategoria
				+ ", user=" + user + "]";
	}
}
