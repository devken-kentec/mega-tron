package br.com.kentec.megatron.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.megatron.domain.AutoPeca;
import br.com.kentec.megatron.repository.AutoPecaRepository;
import br.com.kentec.megatron.util.Comum;

@Service
public class AutoPecaService {
	
	@Autowired
	private AutoPecaRepository apr;
	
	public Optional<AutoPeca> findById(String token, Long id){
		Optional<AutoPeca> autoPeca = null;
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			autoPeca = apr.findById(id);
		}
		return autoPeca;
	}
	
	public Iterable<AutoPeca> findAll(String token){
		Iterable<AutoPeca> autoPeca = null;
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			autoPeca = apr.findAll();
		}
		return autoPeca;
	}
	
	public void salvar(String token, AutoPeca autoPeca) {
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			apr.save(autoPeca);
		}
	}
	
	public void alterar(String token, AutoPeca autoPeca) {
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			var ap = apr.findById(autoPeca.getId());
			if(ap.isPresent()) {
				ap.get().setId(autoPeca.getId());
				ap.get().setLoja(autoPeca.getLoja());
				ap.get().setVendedor(autoPeca.getVendedor());
				ap.get().setCep(autoPeca.getCep());
				ap.get().setEndereco(autoPeca.getEndereco());
				ap.get().setComplemento(autoPeca.getComplemento());
				ap.get().setEmail(autoPeca.getEmail());
				ap.get().setFone(autoPeca.getFone());
				ap.get().setWhatsapp(autoPeca.getWhatsapp());
				ap.get().setStatus(autoPeca.getStatus());
				apr.save(ap.get());
			}
			
		}
	}
}
