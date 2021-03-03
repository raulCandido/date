package br.com.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.orm.Funcionario;

@Repository
public interface FuncionarioRespository extends CrudRepository<Funcionario, Integer>{

}
