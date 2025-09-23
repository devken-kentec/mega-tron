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
@Table(name="pecas")
@SuppressWarnings("serial")
public class Pecas implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="unidade_medida", nullable = true, length = 12)
	private String undidadeMedida;
	
	@Column(name="descricao", nullable = true, length = 256)
	private String descricao;
	
	@Column(name="marca", nullable = false, length = 50)
	private String marca;
	
	@Column(name="modelo", nullable = false, length = 50)
	private String modelo;
	
	@Column(name="codigo_referencia", nullable = false, length = 50)
	private String codigoRefencia;

	@ManyToOne
	@JoinColumn(name="id_autopeca", nullable = true)
	private AutoPeca autopeca = new AutoPeca();
	
	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	public Pecas() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUndidadeMedida() {
		return undidadeMedida;
	}

	public void setUndidadeMedida(String undidadeMedida) {
		this.undidadeMedida = undidadeMedida;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCodigoRefencia() {
		return codigoRefencia;
	}

	public void setCodigoRefencia(String codigoRefencia) {
		this.codigoRefencia = codigoRefencia;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public AutoPeca getAutopeca() {
		return autopeca;
	}

	public void setAutopeca(AutoPeca autopeca) {
		this.autopeca = autopeca;
	}

	@Override
	public String toString() {
		return "Pecas [id=" + id + ", undidadeMedida=" + undidadeMedida + ", descricao=" + descricao + ", marca="
				+ marca + ", modelo=" + modelo + ", codigoRefencia=" + codigoRefencia + ", autopeca=" + autopeca
				+ ", status=" + status + "]";
	}
}
