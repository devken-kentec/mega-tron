package br.com.kentec.megatron.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kentec.megatron.domain.Proprietario;
import br.com.kentec.megatron.repository.ProprietarioRepository;
import br.com.kentec.megatron.util.Comum;

@Service
public class ProprietarioService {
	
	@Autowired
	private ProprietarioRepository pr; 
	
	public Optional<Proprietario> findById(String token, Long id){
		Optional<Proprietario> proprietario = null;
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			proprietario = pr.findById(id);
		}
		return proprietario;
	}
	
	public Iterable<Proprietario> findAll(String token){
		Iterable<Proprietario> proprietario = null;
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			proprietario = pr.findAll();
		}
		return proprietario;
	}
	
	public void salvar(String token, Proprietario proprietario) {
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			proprietario.setChaveUsuario(UUID.randomUUID().toString());
			proprietario.setRole("USER-SYSTEM");
			pr.save(proprietario);
		}
	}
	
	public void alterar(String token, Proprietario proprietario) {
		if(Comum.verificarTokenEnviado(token).equals(token)) {
			var alteraProprietario = pr.findById(proprietario.getId());
			if(alteraProprietario.isPresent()) {
				alteraProprietario.get().setId(proprietario.getId());
				alteraProprietario.get().setNome(proprietario.getNome());
				alteraProprietario.get().setApelido(proprietario.getApelido());
				alteraProprietario.get().setDataNascimento(proprietario.getDataNascimento());
				alteraProprietario.get().setCep(proprietario.getCep());
				alteraProprietario.get().setEndereco(proprietario.getEndereco());
				alteraProprietario.get().setComplemento(proprietario.getComplemento());
				alteraProprietario.get().setFone(proprietario.getFone());
				alteraProprietario.get().setWhatsapp(proprietario.getWhatsapp());
				alteraProprietario.get().setEmail(proprietario.getEmail());
				alteraProprietario.get().setStatus(proprietario.getStatus());
			}
			pr.save(alteraProprietario.get());
		}
	}

}
