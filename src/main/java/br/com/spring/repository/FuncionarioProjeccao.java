package br.com.spring.repository;

import java.util.Calendar;

public interface FuncionarioProjeccao {
	Integer getId();

	String getNome();

	String getCpf();
	
	Calendar getDataContratacao();
}
