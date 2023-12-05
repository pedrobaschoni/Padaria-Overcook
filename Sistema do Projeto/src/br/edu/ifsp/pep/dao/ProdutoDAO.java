/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Produto;
import java.util.List;

/**
 *
 * @author aluno
 */
public class ProdutoDAO extends AbstractDAO<Produto>{
 
    public List<Produto> buscarTodos() {
       return getEntityManager().createNamedQuery("Produto.buscarTodos", Produto.class)
               .getResultList();
   }
    
    public List<Produto> buscarPorDescricao(String descricao) {

        return getEntityManager()
                .createNamedQuery("buscarPorDescricao", Produto.class)
                .setParameter("descricao", "%" + descricao + "%")
                .getResultList();
    }
}
