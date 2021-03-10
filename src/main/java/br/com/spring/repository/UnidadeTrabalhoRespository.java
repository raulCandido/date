package br.com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.orm.UnidadeTrabalho;

@Repository
public interface UnidadeTrabalhoRespository extends CrudRepository<UnidadeTrabalho, Integer>{

	//@Query("SELECT f FROM Funcionario f JOIN f.cargo c WHERE c.descricao = :descricao")

	@Query("SELECT ut FROM UnidadeTrabalho ut WHERE ut.descricao = :nomeUnidadeTrabalho")
	List<UnidadeTrabalho> findUnidadeTrabalhoDecrescente(String nomeUnidadeTrabalho);
}
