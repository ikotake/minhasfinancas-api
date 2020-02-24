package br.com.kotake.minhasfinancas.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table( name = "USUARIO")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	@Column(name = "ID")	
	private int id;
	
	@Column(name = "NOME")
	private String nome ;
	
	@Column	(name = "EMAIL")
	private String email;
	
	@Column(name = "SENHA")
	private String senha;


}

