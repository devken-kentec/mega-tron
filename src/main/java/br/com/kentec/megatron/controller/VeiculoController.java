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

import br.com.kentec.megatron.domain.Veiculo;
import br.com.kentec.megatron.service.VeiculoService;

@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RestController
@RequestMapping("/rtmec-kentec-6a6b6c2d6b656e7465632d32303235/api/veiculo/v1")
public class VeiculoController {
	
	@Autowired
	private VeiculoService vs;
	
	@GetMapping("/buscarVeiculoPorId/{id}")
	public ResponseEntity<Optional<Veiculo>> findById(@RequestHeader("Token") String token, @PathVariable Long id) {
		return ResponseEntity.ok(vs.findById(token, id));
	}
	
	@GetMapping("/listarVeiculos")
	public ResponseEntity<Iterable<Veiculo>> listarTodosVeiculos(@RequestHeader("Token") String token){
		return ResponseEntity.ok(vs.findAll(token));
	}
		
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void salvar(@RequestHeader("Token") String token, @RequestBody Veiculo veiculo) {
		vs.salvar(token, veiculo);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void alterar(@RequestHeader("Token") String token, @RequestBody Veiculo veiculo) {
		vs.alterar(token, veiculo);
	}
}
