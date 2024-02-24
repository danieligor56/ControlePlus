package br.com.ControleEstoque.ConrolePlus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ControleEstoque.ConrolePlus.DTO.EstoqueDTO;
import br.com.ControleEstoque.ConrolePlus.Entity.Estoque;
import br.com.ControleEstoque.ConrolePlus.Services.EstoqueService;
@RestController
@RequestMapping("api/v1/estoque")
public class EstoqueControler {
@Autowired
EstoqueService estoqueService;
	@PostMapping("/criarNovoEstoque")
	public ResponseEntity<Estoque> adicionaNovoEstoque(@RequestBody EstoqueDTO estoqueDTO){
		estoqueService.criaNovoEstoque(estoqueDTO);
		return ResponseEntity.ok().build();
	}

}
