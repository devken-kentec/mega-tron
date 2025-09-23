package br.com.kentec.megatron.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Random;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Comum {

	public static String dataAtual() {
		LocalDateTime agora = LocalDateTime.now();
		DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dataFormatada = formatterData.format(agora);
		return dataFormatada;
	}

	public static String encodeB64(String senha) {
		var senhaBase64 = Base64.getEncoder().encodeToString(senha.getBytes());
		return senhaBase64;
	}

	public static String decodeB64(String senha) {
		byte[] decodedBytes = Base64.getDecoder().decode(senha);
		String decodedString = new String(decodedBytes);
		return decodedString;
	}

	public static String gerarSenhaAleatoria() {
		Random random = new Random();
		Integer senhaAle = random.nextInt(1000, 9999);
		return senhaAle.toString();
	}

	public static String hexToString(String hex) {
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < hex.length(); i += 2) {
			String str = hex.substring(i, i + 2);
			int decimal = Integer.parseInt(str, 16);
			output.append((char) decimal);
		}
		return output.toString();
	}

	public static String encrypt(String encriptarSenha) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.encode(encriptarSenha);
	}

	public static Boolean match(String senhaGravada, String senhaTestada) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder.matches(senhaGravada, senhaTestada);
	}

}
