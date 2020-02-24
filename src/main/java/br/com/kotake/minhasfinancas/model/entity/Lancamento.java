package br.com.kotake.minhasfinancas.model.entity;

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

import br.com.kotake.minhasfinancas.model.enums.StatusLancamento;
import br.com.kotake.minhasfinancas.model.enums.TipoLancamento;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "LANCAMENTO")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Lancamento {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column( name = "ID")
	private int id; 
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "MES")
	private int mes;
	
	@Column(name = "ANO")
	private int ano;
	
	@ManyToOne
	@JoinColumn(name = "ID_USUARIO")
	private Usuario usuario;
	
	@Column(name = "VALOR")
	private BigDecimal valor;
	
	@Column(name = "DATA_CADASTRO")
	@Convert(converter = Jsr310JpaConverters.LocalDateConverter.class)
	private LocalDate dataCadastro;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TIPO")
	private TipoLancamento tipo;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS")
	private StatusLancamento status;

}
