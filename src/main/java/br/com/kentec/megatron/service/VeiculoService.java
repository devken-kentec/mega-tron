package br.com.kentec.megatron.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.megatron.domain.Veiculo;
import br.com.kentec.megatron.repository.VeiculoRepository;
import br.com.kentec.megatron.util.Comum;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository vr;
	
	public Optional<Veiculo> findById(String token, Long id){
		Optional<Veiculo> veiculo = null;
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			veiculo = vr.findById(id);
		}
		return veiculo;
	}
	
	public Iterable<Veiculo> findAll(String token){
		Iterable<Veiculo> veiculo = null;
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			veiculo = vr.findAll();
		}
		return veiculo;
	}
	
	public void salvar(String token, Veiculo veiculo) {
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			vr.save(veiculo);
		}
	}
	
	public void alterar(String token, Veiculo veiculo) {
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			var alteraVeiculo = vr.findById(veiculo.getId());
			if(alteraVeiculo.isPresent()) {
				alteraVeiculo.get().setId(veiculo.getId());
				alteraVeiculo.get().setMarca(veiculo.getMarca());
				alteraVeiculo.get().setModelo(veiculo.getModelo());
				alteraVeiculo.get().setDetalhe(veiculo.getDetalhe());
				alteraVeiculo.get().setStatus(veiculo.getStatus());
			}
			vr.save(alteraVeiculo.get());
		}
	}
}
