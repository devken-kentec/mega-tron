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

import br.com.kentec.megatron.DTO.DadosVeiculoDTO;
import br.com.kentec.megatron.service.DadosVeiculoService;

@CrossOrigin(origins = "${origin.cors.url}", maxAge = 3600)
@RestController
@RequestMapping("/rtmec-kentec-6a6b6c2d6b656e7465632d32303235/api/dados-veiculo/v1")
public class DadosVeiculoController {
	
	@Autowired
	private DadosVeiculoService dvs;
	
	@GetMapping("/buscarDadosVeiculoPorId/{id}")
	public ResponseEntity<Optional<DadosVeiculoDTO>> findById(@RequestHeader("Token") String token, @PathVariable Long id) {
		return ResponseEntity.ok(dvs.findById(token, id));
	}
	
	@GetMapping("/listarDadosVeiculo")
	public ResponseEntity<Iterable<DadosVeiculoDTO>> listarTodosDadosVeiculo(@RequestHeader("Token") String token){
		return ResponseEntity.ok(dvs.findAll(token));
	}
	
	@PostMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void salvar(@RequestHeader("Token") String token, @RequestBody DadosVeiculoDTO dadosVeiculo) {
		dvs.salvar(token, dadosVeiculo);
	}
	
	@PutMapping()
	@ResponseStatus(HttpStatus.CREATED)
	public void alterar(@RequestHeader("Token") String token, @RequestBody DadosVeiculoDTO dadosVeiculo) {
		dvs.alterar(token, dadosVeiculo);
	}
}
