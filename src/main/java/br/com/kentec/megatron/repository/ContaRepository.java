package br.com.kentec.megatron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kentec.megatron.domain.Contas;

public interface ContaRepository extends JpaRepository<Contas, Long> {

}
