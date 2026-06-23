package br.com.kentec.megatron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kentec.megatron.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
