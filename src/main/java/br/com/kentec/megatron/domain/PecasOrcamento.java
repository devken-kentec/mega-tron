package br.com.kentec.megatron.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="pecas_orcamento")
@SuppressWarnings("serial")
public class PecasOrcamento implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="quantidade", nullable = false, length = 5)
	private String quantidade;
	
	@Column(name="valor", nullable = true, precision = 10, scale = 2)
	private BigDecimal valor;
	
	@Column(name="margem_lucro", nullable = true, precision = 10, scale = 2)
	private BigDecimal margemLucro;
	
	@Column(name="valor_total", nullable = true, precision = 10, scale = 2)
	private BigDecimal valorTotal;
	
	@Column(name="valor_desconto", nullable = true, precision = 10, scale = 2)
	private BigDecimal valorDesconto;
	
	@Column(name="valor_final", nullable = true, precision = 10, scale = 2)
	private BigDecimal valorFinal;
	
	@ManyToOne
	@JoinColumn(name="id_peca", nullable = true)
	private Pecas peca = new Pecas();

	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="id_orcamento", nullable = true)
	private Orcamento orcamento = new Orcamento();
	
	public PecasOrcamento() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(BigDecimal margemLucro) {
		this.margemLucro = margemLucro;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(BigDecimal valorFinal) {
		this.valorFinal = valorFinal;
	}

	public Pecas getPeca() {
		return peca;
	}

	public void setPeca(Pecas peca) {
		this.peca = peca;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
	}

	@Override
	public String toString() {
		return "PecasOrcamento [id=" + id + ", quantidade=" + quantidade + ", valor=" + valor + ", margemLucro="
				+ margemLucro + ", valorTotal=" + valorTotal + ", valorDesconto=" + valorDesconto + ", valorFinal="
				+ valorFinal + ", peca=" + peca + ", status=" + status + ", orcamento=" + orcamento + "]";
	}
}
