package br.com.kentec.megatron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kentec.megatron.domain.Senha;

public interface SenhaRepository extends JpaRepository<Senha, Long>{

}
