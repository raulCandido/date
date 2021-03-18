package br.com.spring.especification;

import org.springframework.data.jpa.domain.Specification;

import br.com.spring.orm.Funcionario;

public class SpecificationFuncionarios {

	public static Specification<Funcionario> nome(String nome) {
		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
	}
	
	public static Specification<Funcionario> maiorSalario(Double salario){
		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("salario"), salario);
	}
	
	public static Specification<Funcionario> igualOuMaiorSalario(Double salario){
		return (root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.greaterThanOrEqualTo(root.get("salario"), salario);
	}
}
