package br.com.kentec.megatron.domain;

import java.io.Serializable;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="veiculo")
@SuppressWarnings("serial")
public class Veiculo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="marca", nullable = false, length = 50)
	private String marca;
	
	@Column(name="modelo", nullable = false, length = 50)
	private String modelo;
	
	@Column(name="cor", nullable = false, length = 15)
	private String cor;
	
	@Column(name="placa", nullable = false, length = 10)
	private String placa;
	
	@Column(name="combustivel", nullable = false, length = 20)
	private String combustivel;
	
	@Column(name="ano", nullable = true, length = 4)
	private Integer ano;
	
	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	@Lob
	@Column(name="foto")
	public byte[] foto;
	
	@ManyToOne
	@JoinColumn(name="id_proprietario", nullable = true)
	private Proprietario proprietario = new Proprietario();
	
	public Veiculo() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", placa=" + placa
				+ ", combustivel=" + combustivel + ", ano=" + ano + ", status=" + status + ", foto="
				+ Arrays.toString(foto) + ", proprietario=" + proprietario + "]";
	}
}
