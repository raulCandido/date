package br.com.spring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.orm.Cargo;

@Repository
public interface CargoRespository extends CrudRepository<Cargo, Integer>{
	List<Cargo> findByDescricao(String descricao);
}
