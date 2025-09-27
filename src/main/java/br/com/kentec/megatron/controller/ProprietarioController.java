package br.com.kentec.megatron.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.megatron.domain.Proprietario;

@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RestController
@RequestMapping("/rtmec-kentec-6a6b6c2d6b656e7465632d32303235/api/proprietario/v1")
public class ProprietarioController {
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void cadastrar(@RequestHeader("Token") String token, @RequestBody Proprietario proprietario) {
		System.out.println("Proprietario" + proprietario);
	}
}
