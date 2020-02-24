package br.com.kotake.minhasfinancas.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import br.com.kotake.minhasfinancas.model.entity.Lancamento;
import br.com.kotake.minhasfinancas.model.enums.StatusLancamento;

public interface LancamentoService {

	Lancamento salvar(Lancamento lancamento);
	
	Lancamento atualizar(Lancamento lancamento);
	
	void deletar(Lancamento lancamento);
	
	List<Lancamento> buscar( Lancamento lancamentoFiltro );
	
	void atualizarStatus(Lancamento lancamento, StatusLancamento status);
	
	void validar(Lancamento lancamento);
	
	Optional<Lancamento> obterPorId(int id);
	
	BigDecimal obterSaldoPorUsuario(int id);
}