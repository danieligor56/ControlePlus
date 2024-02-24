package br.com.ControleEstoque.ConrolePlus.Services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.ControleEstoque.ConrolePlus.DTO.EstoqueDTO;
import br.com.ControleEstoque.ConrolePlus.Entity.Estoque;
import br.com.ControleEstoque.ConrolePlus.Repository.EstoqueRepository;

public class EstoqueService {
	
//ADICIONA NOVO ESTOQUE. 
	
	@Autowired
	ModelMapper modelMapper;
	
	EstoqueRepository estoqueRepository;
	
	
	public Estoque criaNovoEstoque(EstoqueDTO estoqueDTO) {
	Estoque novoEstoque = modelMapper.map(estoqueDTO, Estoque.class);
	estoqueRepository.save(novoEstoque);
	return null;
	
	
	}

}
