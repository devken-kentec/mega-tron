package br.com.kentec.megatron.configuracao;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

import br.com.kentec.megatron.domain.Proprietario;
import br.com.kentec.megatron.repository.ProprietarioRepository;
import br.com.kentec.megatron.util.Comum;


@Configuration
@Profile("dev")
public class CreateUserDefault {
	
	@Autowired
	private ProprietarioRepository pr;

	@Bean
	@Transactional
	CommandLineRunner executar() {
		return args -> {
			long users = pr.count();
			if(users == 0) {
				Proprietario user = new Proprietario();
				user.setNome("Kennedy Tomazete");
				user.setEmail("contato@kentec.com.br");
				user.setRole("DEV-SYSTEM");
				user.setStatus("Ativo");
				user.setSenhaUsuario(Comum.encrypt("devken"));
				user.setChaveUsuario(UUID.randomUUID().toString());
				pr.save(user);
			}
		};
	}
}