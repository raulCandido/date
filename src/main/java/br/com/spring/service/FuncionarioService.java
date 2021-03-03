package br.com.spring.service;

import org.springframework.stereotype.Service;

import br.com.spring.orm.Funcionario;
import br.com.spring.repository.FuncionarioRespository;

@Service
public class FuncionarioService {

	private FuncionarioRespository funcionarioRespository;

	public FuncionarioService(FuncionarioRespository funcionarioRespository) {
		this.funcionarioRespository = funcionarioRespository;
	}
	
	public void salvar(Funcionario funcionario) {
		funcionarioRespository.save(funcionario);
	}
}
