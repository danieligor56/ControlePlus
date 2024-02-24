package br.com.ControleEstoque.ConrolePlus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ControleEstoque.ConrolePlus.Entity.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

}
