package br.com.ControleEstoque.ConrolePlus.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ProdutoDTO {
	
		private String nome;
		private String descricao;
		private Long codBarra;
		private Double prcIte;
		private int qtdIte;
		
				}
