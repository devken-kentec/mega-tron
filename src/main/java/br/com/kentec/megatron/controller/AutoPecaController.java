package br.com.kentec.megatron.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.kentec.megatron.domain.AutoPeca;
import br.com.kentec.megatron.service.AutoPecaService;

@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RestController
@RequestMapping("/rtmec-kentec-6a6b6c2d6b656e7465632d32303235/api/auto-peca/v1")
public class AutoPecaController {
	
	@Autowired
	private AutoPecaService aps;
	
	@GetMapping("/buscarAutoPecaPorId/{id}")
	public ResponseEntity<Optional<AutoPeca>> findById(@RequestHeader("Token") String token, @PathVariable Long id) {
		return ResponseEntity.ok(aps.findById(token, id));
	}
	
	@GetMapping("/listarAutoPecas")
	public ResponseEntity<Iterable<AutoPeca>> listarTodasAutoPecas(@RequestHeader("Token") String token){
		return ResponseEntity.ok(aps.findAll(token));
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void salvar(@RequestHeader("Token") String token, @RequestBody AutoPeca autoPeca) {
		aps.salvar(token, autoPeca);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void alterar(@RequestHeader("Token") String token, @RequestBody AutoPeca autoPeca) {
		aps.alterar(token, autoPeca);
	}
}	
