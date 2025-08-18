package br.com.kentec.megatron.modelo;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="autopeca")
@SuppressWarnings("serial")
public class AutoPeca implements Serializable  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="loja", nullable = true, length = 64)
	private String loja;
	
	@Column(name="fone", nullable = true, length = 20)
	private String fone;
	
	@Column(name="whatsapp", nullable = true, length = 20)
	private String whatsapp;
	
	@Column(name="email", unique=true, nullable = true, length = 60)
	private String email;
	
	@Column(name="cep", nullable = true, length = 8)
	private String cep;
	
	@Column(name="endereco", nullable = true, length = 256)
	private String endereco;
	
	@Column(name="complemento", nullable = true, length = 128)
	private String complemento;
	
	@Column(name="vendedor", nullable = true, length = 32)
	private String vendedor;
	
	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	public AutoPeca() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AutoPeca [id=" + id + ", loja=" + loja + ", fone=" + fone + ", whatsapp=" + whatsapp + ", email="
				+ email + ", cep=" + cep + ", endereco=" + endereco + ", complemento=" + complemento + ", vendedor="
				+ vendedor + ", status=" + status + "]";
	}
	
	
}
