package com.guilherme.minhasfinancas.service;

import com.guilherme.minhasfinancas.model.Usuario;

public interface UsuarioService {
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsusario(Usuario usuario);
	
	void validarEmail(String email);
	
}
