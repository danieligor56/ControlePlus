package br.com.ControleEstoque.ConrolePlus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ControleEstoque.ConrolePlus.Entity.Estoque;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long>{
	
	Estoque deleteById(long id);
	
}
