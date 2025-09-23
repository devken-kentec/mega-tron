package br.com.kentec.megatron.domain;

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
@Table(name="mao_de_obra")
@SuppressWarnings("serial")
public class MaoDeObra implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Lob
	@Column(name="descricao", columnDefinition = "TEXT")
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id_veiculo", nullable = false)
	private Veiculo veiculo = new Veiculo();
	
	@ManyToOne
	@JoinColumn(name="id_orcamento", nullable = false)
	private Orcamento orcamento = new Orcamento();
	
	@Column(name="valor")
	private BigDecimal valor;

	public MaoDeObra() {}

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

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "MaoDeObra [id=" + id + ", descricao=" + descricao + ", veiculo=" + veiculo + ", orcamento=" + orcamento
				+ ", valor=" + valor + "]";
	}
}
