package com.guilherme.minhasfinancas.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import com.guilherme.minhasfinancas.model.enums.StatusLancamento;
import com.guilherme.minhasfinancas.model.enums.TipoLancamento;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name="lancamento", schema="financas")
@Data
@Builder
public class Lancamento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "mes")
	private Integer mes;
	
	@Column(name = "ano")
	private Integer ano;
	
	//Aqui, estamos referenciando os lançamentos com os usuarios, utilizando a anotação ManyToOne mostramos que teremos varios
	//lançamentos por usuario e o @JoinColumn esta ligando os lançamentos ao usuario pelo id (chave estrangeira)
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@Column(name = "valor")
	private BigDecimal valor;
	
	@Column(name = "data_cadastro")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate dataCadastro;
	
	@Column(name = "tipo")
	@Enumerated(value = EnumType.STRING)
	private TipoLancamento tipo;
	
	@Column(name = "status")
	@Enumerated(value = EnumType.STRING)
	private StatusLancamento status;

}