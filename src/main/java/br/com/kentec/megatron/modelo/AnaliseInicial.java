package br.com.kentec.megatron.modelo;

import java.io.Serializable;
import java.math.BigDecimal;

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
@Table(name="analise_inicial")
@SuppressWarnings("serial")
public class AnaliseInicial implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Lob
	@Column(name="descricao", columnDefinition = "TEXT")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id_veiculo", nullable = true)
	private Veiculo veiculo = new Veiculo();
	
	@Column(name="mao_de_obra")
	private BigDecimal maoDeObra;

	public AnaliseInicial() {}

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

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public BigDecimal getMaoDeObra() {
		return maoDeObra;
	}

	public void setMaoDeObra(BigDecimal maoDeObra) {
		this.maoDeObra = maoDeObra;
	}

	@Override
	public String toString() {
		return "InvestigaçãoInicial [id=" + id + ", descricao=" + descricao + ", veiculo=" + veiculo + ", maoDeObra="
				+ maoDeObra + "]";
	}
}
