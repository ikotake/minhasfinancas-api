package br.com.kotake.minhasfinancas.services;

import java.util.Optional;

import br.com.kotake.minhasfinancas.model.entity.Usuario;

public interface UsuarioServices {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);
	
	Optional<Usuario> obterPorId(int id);
}
