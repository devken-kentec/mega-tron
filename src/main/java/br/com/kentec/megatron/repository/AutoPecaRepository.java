package br.com.kentec.megatron.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.kentec.megatron.domain.AutoPeca;

@Repository
public interface AutoPecaRepository extends JpaRepository<AutoPeca, Long>{

}
