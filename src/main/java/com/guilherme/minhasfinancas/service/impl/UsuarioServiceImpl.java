package com.guilherme.minhasfinancas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.guilherme.minhasfinancas.model.Usuario;
import com.guilherme.minhasfinancas.model.repository.UsuarioRepository;
import com.guilherme.minhasfinancas.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
	private UsuarioRepository repository;

	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsusario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		// TODO Auto-generated method stub
		
	}	
}
