package br.com.kentec.megatron.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="verificacao_tecnica")
@SuppressWarnings("serial")
public class VerificacaoTecnica implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="data_orcamento", nullable = false)
	private LocalDate dataOrcamento;
	
	@Column(name="quantidade", nullable = false, length = 5)
	private String quantidade;
	
	@Column(name="unidade_medida", nullable = true, length = 2)
	private String undidadeMedida;
	
	@Column(name="descricao", nullable = true, length = 256)
	private String descricao;
	
	@Column(name="valor_unitario", nullable = true, precision = 10, scale = 2)
	private BigDecimal valorUnitario;
	
	@Column(name="valor_total", nullable = true, precision = 10, scale = 2)
	private BigDecimal valorTotal;
	
	@Column(name="valor_desconto", nullable = true, precision = 10, scale = 2)
	private BigDecimal valorDesconto;
	
	@Column(name="valor_final", nullable = true, precision = 10, scale = 2)
	private BigDecimal valorFinal;
	
	@Column(name="status", nullable = true, length = 7)
	private String status;
	
	@Column(name="os_aprovado", nullable = true, length = 7)
	private Boolean osAprovado;
	
	@ManyToOne
	@JoinColumn(name="id_veiculo", nullable = true)
	private Veiculo veiculo = new Veiculo();
	
	public VerificacaoTecnica() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataOrcamento() {
		return dataOrcamento;
	}

	public void setDataOrcamento(LocalDate dataOrcamento) {
		this.dataOrcamento = dataOrcamento;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getOsAprovado() {
		return osAprovado;
	}

	public void setOsAprovado(Boolean osAprovado) {
		this.osAprovado = osAprovado;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
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

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
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

	@Override
	public String toString() {
		return "AvaliacaoTecnica [id=" + id + ", dataOrcamento=" + dataOrcamento + ", quantidade=" + quantidade
				+ ", undidadeMedida=" + undidadeMedida + ", descricao=" + descricao + ", valorUnitario=" + valorUnitario
				+ ", valorTotal=" + valorTotal + ", valorDesconto=" + valorDesconto + ", valorFinal=" + valorFinal
				+ ", status=" + status + ", osAprovado=" + osAprovado + ", veiculo=" + veiculo + "]";
	}
}
