package br.com.kentec.megatron.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.megatron.domain.DadosVeiculo;

@Repository
public interface DadosVeiculoRepository extends JpaRepository<DadosVeiculo, Long>{

}
