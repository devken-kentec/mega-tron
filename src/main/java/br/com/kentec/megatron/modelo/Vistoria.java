package br.com.kentec.megatron.modelo;

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
@Table(name="vistoria" )
@SuppressWarnings("serial")
public class Vistoria implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="quilometragem", nullable = true, length = 12)
	private String quilometragem;
	
	@Column(name="combustivel", nullable = true, length = 5)
	private String combustivel;
	
	@Column(name="observacao", nullable = true, length = 200)
	private String observacao; 
	
	@ManyToOne
	@JoinColumn(name="id_veiculo", nullable = true)
	private Veiculo veiculo = new Veiculo();
	
	public Vistoria() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(String quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public String toString() {
		return "Vistoria [id=" + id + ", quilometragem=" + quilometragem + ", combustivel=" + combustivel
				+ ", observacao=" + observacao + ", veiculo=" + veiculo + "]";
	}
	
}
