package br.com.kentec.megatron.DTO;

import java.util.Arrays;

import br.com.kentec.megatron.domain.DadosVeiculo;

public class DadosVeiculoDTO {
	
	private Long id;
	private String cor;
	private String placa;
	private String combustivel;
	private Integer ano;
	private byte[] foto;
	private Long proprietarioId;
	private String proprietarioDescricao;
	private Long veiculoId;
	private String veiculoDescricao;
	private String status;
	
	public DadosVeiculoDTO() {
		
	}
	
	public DadosVeiculoDTO(DadosVeiculo dv) {
		this.id = dv.getId();
		this.cor = dv.getCor();
		this.placa = dv.getPlaca();
		this.combustivel = dv.getCombustivel();
		this.ano = dv.getAno();
		this.proprietarioId = dv.getProprietario().getId();
		this.proprietarioDescricao = dv.getProprietario().getNome();
		this.veiculoId = dv.getVeiculo().getId();
		this.veiculoDescricao = dv.getVeiculo().getMarca() + "- " + dv.getVeiculo().getModelo();
		this.status = dv.getStatus();
	}

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

	public Long getProprietarioId() {
		return proprietarioId;
	}

	public void setProprietarioId(Long proprietarioId) {
		this.proprietarioId = proprietarioId;
	}

	public Long getVeiculoId() {
		return veiculoId;
	}

	public void setVeiculoId(Long veiculoId) {
		this.veiculoId = veiculoId;
	}

	public String getProprietarioDescricao() {
		return proprietarioDescricao;
	}

	public void setProprietarioDescricao(String proprietarioDescricao) {
		this.proprietarioDescricao = proprietarioDescricao;
	}

	public String getVeiculoDescricao() {
		return veiculoDescricao;
	}

	public void setVeiculoDescricao(String veiculoDescricao) {
		this.veiculoDescricao = veiculoDescricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "DadosVeiculoDTO [id=" + id + ", cor=" + cor + ", placa=" + placa + ", combustivel=" + combustivel
				+ ", ano=" + ano + ", foto=" + Arrays.toString(foto) + ", proprietarioId=" + proprietarioId
				+ ", proprietarioDescricao=" + proprietarioDescricao + ", veiculoId=" + veiculoId
				+ ", veiculoDescricao=" + veiculoDescricao + ", status=" + status + "]";
	}
	
}
