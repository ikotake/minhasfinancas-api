package br.com.kotake.minhasfinancas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.kotake.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	
	Optional<Usuario> findByEmail(String email);
	
	
	boolean existsByEmail (String email);
}
