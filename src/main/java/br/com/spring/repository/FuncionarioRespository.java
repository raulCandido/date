package br.com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.orm.Cargo;
import br.com.spring.orm.Funcionario;

@Repository
public interface FuncionarioRespository extends CrudRepository<Funcionario, Integer> {
	List<Funcionario> findByNome(String nome);

	List<Funcionario> findByCpf(String cpf);
	
	List<Funcionario> findByCargo(Cargo cargo);
	
	@Query("select f from Funcionario f")
	List<FuncionarioProjeccao> findFuncionarioPorSalario();
}
