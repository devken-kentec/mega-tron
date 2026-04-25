package br.com.kentec.megatron.domain;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cadastro_fast")
@SuppressWarnings("serial")
public class CadastroFast implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="veiculo", nullable = true, length = 256)
	private String veiculo;
	
	@Column(name="placa", nullable = true, length = 16	)
	private String placa;
	
	@Column(name="cor", nullable = true, length = 16)
	private String cor;
	
	@Column(name="proprietario", nullable = true, length = 120)
	private String proprietario;
	
	@Column(name="whatsapp", nullable = true, length = 20)
	private String whatsapp;
	
	@Column(name = "descritivo", columnDefinition = "LONGBLOB", nullable = true)
	private String descritivo;
	
	public CadastroFast() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getDescritivo() {
		return descritivo;
	}

	public void setDescritivo(String descritivo) {
		this.descritivo = descritivo;
	}

	@Override
	public String toString() {
		return "CadastroFast [id=" + id + ", veiculo=" + veiculo + ", placa=" + placa + ", cor=" + cor
				+ ", proprietario=" + proprietario + ", whatsapp=" + whatsapp + ", descritivo=" + descritivo + "]";
	}
}
