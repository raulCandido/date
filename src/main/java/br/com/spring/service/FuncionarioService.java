package br.com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.spring.orm.Cargo;
import br.com.spring.orm.Funcionario;
import br.com.spring.repository.FuncionarioProjeccao;
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

	public List<Funcionario> buscarFuncionarioPorNome(String nome) {
		return funcionarioRespository.findByNome(nome);
	}

	public List<Funcionario> buscarFuncionarioPorCpf(String cpf) {
		return funcionarioRespository.findByCpf(cpf);
	}

	public List<Funcionario> buscarFuncionariosPorCargos(Cargo cargo) {
		return funcionarioRespository.findByCargo(cargo);
	}

	public List<Funcionario> buscarTodosFuncionarios() {
		return (List<Funcionario>) funcionarioRespository.findAll();
	}
	
	public List<FuncionarioProjeccao> funcionarioPorSalario(){
		return funcionarioRespository.findFuncionarioPorSalario();
	};
}
