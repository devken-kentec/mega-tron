package br.com.kentec.megatron.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="contas" )
@SuppressWarnings("serial")
public class Contas implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="descricao", nullable = true, length = 32)
	private String descricao;
	
	@Column(name="natureza", nullable = true, length = 16)
	private String natureza;
	
	@Column(name="data", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String data;
	
	@Column(name="data_vencimento", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataVencimento;
	
	@Column(name="valor", precision = 15, scale = 2, nullable = false)
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "id_user", nullable = true)
	private User user = new User();
	
	public Contas() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNatureza() {
		return natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Contas [id=" + id + ", descricao=" + descricao + ", natureza=" + natureza + ", data=" + data
				+ ", dataVencimento=" + dataVencimento + ", valor=" + valor + ", user=" + user+ "]";
	}
}
