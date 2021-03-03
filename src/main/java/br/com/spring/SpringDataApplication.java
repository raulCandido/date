package br.com.spring;

import java.util.Arrays;
import java.util.Calendar;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.spring.orm.Cargo;
import br.com.spring.orm.Funcionario;
import br.com.spring.service.CargoService;
import br.com.spring.service.FuncionarioService;

@EnableJpaRepositories
@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
	
	private final CargoService cargoService;
	private final FuncionarioService funcionarioService;
	
	public SpringDataApplication(CargoService cargoService, FuncionarioService funcionarioService) {
		this.cargoService = cargoService;
		this.funcionarioService = funcionarioService;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Funcionario funcionario = new Funcionario();
		Cargo cargo = new Cargo("Programador", Arrays.asList(funcionario));
		
		funcionario.setCpf("654564");
		funcionario.setDataContratacao(Calendar.getInstance());
		funcionario.setNome("Raul Candido");
		funcionario.setSalario(5000.0);
		funcionario.setCargo(cargo);
		
		
		
		cargoService.salvar(cargo);
		funcionarioService.salvar(funcionario);
		
	}
}
