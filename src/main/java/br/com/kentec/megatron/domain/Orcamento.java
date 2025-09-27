package br.com.kentec.megatron.domain;

import java.io.Serializable;
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
@Table(name="orcamento")
@SuppressWarnings("serial")
public class Orcamento implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", nullable = false, length = 11)
	private Long id;
	
	@Column(name="data_orcamento", nullable = false)
	private LocalDate dataOrcamento;
	
	@Column(name="os_aprovado", nullable = true, length = 7)
	private Boolean osAprovado;
	
	@ManyToOne
	@JoinColumn(name="id_dados_veiculo", nullable = false)
	private DadosVeiculo dadosVeiculo= new DadosVeiculo();
	
	@Column(name="status", nullable = true, length = 7)
	private String status;

	public Orcamento() {}

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

	public Boolean getOsAprovado() {
		return osAprovado;
	}

	public void setOsAprovado(Boolean osAprovado) {
		this.osAprovado = osAprovado;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DadosVeiculo getDadosVeiculo() {
		return dadosVeiculo;
	}

	public void setDadosVeiculo(DadosVeiculo dadosVeiculo) {
		this.dadosVeiculo = dadosVeiculo;
	}

	@Override
	public String toString() {
		return "Orcamento [id=" + id + ", dataOrcamento=" + dataOrcamento + ", osAprovado=" + osAprovado
				+ ", dadosVeiculo=" + dadosVeiculo + ", status=" + status + "]";
	}
}
