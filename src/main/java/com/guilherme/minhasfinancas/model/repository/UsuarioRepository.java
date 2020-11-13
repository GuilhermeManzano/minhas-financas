package com.guilherme.minhasfinancas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.minhasfinancas.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	//Faz uma busca no banco de dados pelo email, em usar codigo SQL
	Optional<Usuario> findByEmail(String email);
}
