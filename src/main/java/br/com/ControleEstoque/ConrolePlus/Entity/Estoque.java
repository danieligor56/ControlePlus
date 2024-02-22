package br.com.ControleEstoque.ConrolePlus.Entity;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Estoque")

public class Estoque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID",nullable = false,unique = true)
	private long id;
	
	@Column(name = "NOME",nullable = false,unique = true)
	private String nome;
	
}