package br.com.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.spring.orm.Cargo;

@Repository
public interface CargoRespository extends CrudRepository<Cargo, Integer>{

}
