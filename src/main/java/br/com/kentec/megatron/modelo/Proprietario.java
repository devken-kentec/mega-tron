package br.com.kentec.megatron.modelo;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="proprietario" )
@SuppressWarnings("serial")
public class Proprietario implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false)
	private Long id;
	
	@Column(name="nome", nullable = true, length = 16)
	private String nome;
	
	@Column(name="apelido", nullable = true, length = 16)
	private String apelido;
	
	@Column(name="data_nascimento", nullable = true, length = 10)
	@JsonFormat(pattern="yyyy-MM-dd")
	private String dataNascimento;
	
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
	
	@Column(name="chave_usuario", nullable = false, length = 64)
	private String chaveUsuario;
	
	@Column(name="senha_usuario", nullable = false, length = 8)
	private String senhaUsuario;
	
	@Column(name="role", nullable = true, length = 16)
	private String role; 

	@Column(name="status", nullable = true, length = 7)
	private String status; 
	
	public Proprietario() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getChaveUsuario() {
		return chaveUsuario;
	}

	public void setChaveUsuario(String chaveUsuario) {
		this.chaveUsuario = chaveUsuario;
	}
	
	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Proprietario [id=" + id + ", nome=" + nome + ", apelido=" + apelido + ", dataNascimento="
				+ dataNascimento + ", fone=" + fone + ", whatsapp=" + whatsapp + ", email=" + email + ", cep=" + cep
				+ ", endereco=" + endereco + ", complemento=" + complemento + ", chaveUsuario=" + chaveUsuario
				+ ", senhaUsuario=" + senhaUsuario + ", role=" + role + ", status=" + status + "]";
	}

}
