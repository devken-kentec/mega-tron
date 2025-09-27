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
@Table(name="dados_veiculo")
@SuppressWarnings("serial")
public class DadosVeiculo implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="cor", nullable = false, length = 15)
	private String cor;
	
	@Column(name="placa", nullable = false, length = 10)
	private String placa;
	
	@Column(name="combustivel", nullable = false, length = 20)
	private String combustivel;
	
	@Column(name="ano", nullable = true, length = 4)
	private Integer ano;
	
	@Lob
	@Column(name="foto")
	public byte[] foto;
	
	@ManyToOne
	@JoinColumn(name="id_proprietario", nullable = false)
	private Proprietario proprietario = new Proprietario();
	
	@ManyToOne
	@JoinColumn(name="id_veiculo", nullable = false)
	private Veiculo veiculo = new Veiculo();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@Override
	public String toString() {
		return "DadosVeiculo [id=" + id + ", cor=" + cor + ", placa=" + placa + ", combustivel=" + combustivel
				+ ", ano=" + ano + ", foto=" + Arrays.toString(foto) + ", proprietario=" + proprietario + ", veiculo="
				+ veiculo + "]";
	}
}
