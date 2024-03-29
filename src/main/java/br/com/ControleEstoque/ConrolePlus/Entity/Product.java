package br.com.ControleEstoque.ConrolePlus.Entity;

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
@Table(name = "Produto")

public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID",nullable = false,unique = true)
	private long id;
	
	@Column(name = "NOME",nullable = false,unique = true)
	private String nome;
	
	@Column(name = "DESCRIÇÃO",nullable = false)
	private String descricao;
	
	@Column(name = "CdbIte",nullable = true,unique = true)
	private Long VcodBarra;
	
	@Column(name = "prcIte",nullable = true)
	private Double prcIVte;
	
	@Column(name = "qtdIte",nullable = false)
	private int qtdIte;


}

 