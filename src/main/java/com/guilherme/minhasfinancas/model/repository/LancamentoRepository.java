package com.guilherme.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.minhasfinancas.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
