package br.com.kentec.megatron.service;

import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.megatron.DTO.DadosVeiculoDTO;
import br.com.kentec.megatron.domain.DadosVeiculo;
import br.com.kentec.megatron.repository.DadosVeiculoRepository;
import br.com.kentec.megatron.repository.ProprietarioRepository;
import br.com.kentec.megatron.repository.VeiculoRepository;
import br.com.kentec.megatron.util.Comum;

@Service
public class DadosVeiculoService {		
	
	@Autowired
	private ProprietarioRepository pr;
	
	@Autowired
	private VeiculoRepository vr;
	
	@Autowired
	private DadosVeiculoRepository dvr;
	
	public Optional<DadosVeiculoDTO> findById(String token, Long id){
		Optional<DadosVeiculoDTO> dadosVeiculoDTO = null;
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			dadosVeiculoDTO = dvr.findById(id).map(DadosVeiculoDTO::new);
		}
		return dadosVeiculoDTO;
	}
	
	public Iterable<DadosVeiculoDTO> findAll(String token){
		Iterable<DadosVeiculoDTO> dadosVeiculoDTO = null;
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			dadosVeiculoDTO = dvr.findAll().stream().map(DadosVeiculoDTO::new).collect(Collectors.toList()); 
		}
		return dadosVeiculoDTO;
	}
	
	public void salvar(String token, DadosVeiculoDTO dadosVeiculo) {
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			var veiculo = vr.findById(dadosVeiculo.getVeiculoId());
			var proprietario = pr.findById(dadosVeiculo.getProprietarioId());
			if(veiculo.isPresent() && proprietario.isPresent()) {
				DadosVeiculo dv = new DadosVeiculo();
				dv.setProprietario(proprietario.get());
				dv.setVeiculo(veiculo.get());
				dv.setCor(dadosVeiculo.getCor());
				dv.setPlaca(dadosVeiculo.getPlaca());
				dv.setCombustivel(dadosVeiculo.getCombustivel());
				dv.setAno(dadosVeiculo.getAno());
				dv.setStatus(dadosVeiculo.getStatus());
				dvr.save(dv);
			}
		}
	}
	
	public void alterar(String token, DadosVeiculoDTO dadosVeiculo) {
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			var dv = dvr.findById(dadosVeiculo.getId());
			var veiculo = vr.findById(dadosVeiculo.getVeiculoId());
			var proprietario = pr.findById(dadosVeiculo.getProprietarioId());
			
			if(dv.isPresent() && veiculo.isPresent() && proprietario.isPresent()) {
				dv.get().setId(dadosVeiculo.getId());
				dv.get().setProprietario(proprietario.get());
				dv.get().setVeiculo(veiculo.get());
				dv.get().setCor(dadosVeiculo.getCor());
				dv.get().setPlaca(dadosVeiculo.getPlaca());
				dv.get().setCombustivel(dadosVeiculo.getCombustivel());
				dv.get().setAno(dadosVeiculo.getAno());
				dv.get().setStatus(dadosVeiculo.getStatus());
				dvr.save(dv.get());
			}
		}
	}
	

}
