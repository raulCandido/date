package br.com.spring.service;

import org.springframework.stereotype.Service;

import br.com.spring.orm.Cargo;
import br.com.spring.repository.CargoRespository;

@Service
public class CargoService {

	private final CargoRespository cargoRespository;

	public CargoService(CargoRespository cargoRespository) {
		this.cargoRespository = cargoRespository;
	}

	public void salvar(Cargo cargo) {
		cargoRespository.save(cargo);
	}
}
