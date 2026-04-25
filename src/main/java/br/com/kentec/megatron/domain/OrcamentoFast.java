package br.com.kentec.megatron.domain;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class OrcamentoFast {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="numero_orcamento", nullable = false, length = 6)
	private Integer numeroOrcamento;
	
	@Column(name="quantidade", nullable = false, length = 5)
	private String quantidade;
	
	@Column(name="valor", nullable = false, precision = 10, scale = 2)
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name="id_peca_fast", nullable = false)
	private PecaFast peca = new PecaFast();
	
	@ManyToOne
	@JoinColumn(name="id_cadastro_fast", nullable = false)
	private CadastroFast cadastro = new CadastroFast();
	
	public OrcamentoFast() {
		
	}

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

	public PecaFast getPeca() {
		return peca;
	}

	public void setPeca(PecaFast peca) {
		this.peca = peca;
	}

	public CadastroFast getCadastro() {
		return cadastro;
	}

	public void setCadastro(CadastroFast cadastro) {
		this.cadastro = cadastro;
	}

	public Integer getNumeroOrcamento() {
		return numeroOrcamento;
	}

	public void setNumeroOrcamento(Integer numeroOrcamento) {
		this.numeroOrcamento = numeroOrcamento;
	}

	@Override
	public String toString() {
		return "OrcamentoFast [id=" + id + ", numeroOrcamento=" + numeroOrcamento + ", quantidade=" + quantidade
				+ ", valor=" + valor + ", peca=" + peca + ", cadastro=" + cadastro + "]";
	}
}
