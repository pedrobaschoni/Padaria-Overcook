/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.ItemPedido;
import br.edu.ifsp.pep.model.Produto;
import br.edu.ifsp.pep.model.Venda;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author aluno
 */
public class VendaDAO extends AbstractDAO<Venda>{
    
    @Override
    public void inserir(Venda venda) throws Exception {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        for (ItemPedido iv : venda.getItens()) {
           
            Produto produto = em.find(Produto.class, iv.getProduto().getId());
            System.out.println("Qtd. produto: " + produto.getQuantidade());
            System.out.println("IV Qtd. produto: " + iv.getQuantidade());
            if (iv.getQuantidade() > produto.getQuantidade()) {
                throw new Exception(
                        "Quantidade em estoque insuficiente para o "
                        + "Produto " + produto.getDescricao());
            }

            
        }

        venda.setDataVenda(LocalDateTime.now());
        em.persist(venda);

        em.getTransaction().commit();
    }
}
