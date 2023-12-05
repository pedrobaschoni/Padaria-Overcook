/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.ItemPedido;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Yuri
 */
public class ItemPedidoDAO extends AbstractDAO<ItemPedido>{
    
    public List<ItemPedido> buscarPorVenda(Integer id){
    
        EntityManager em = getEntityManager();
        
        return em.createNamedQuery("buscarPorVenda", ItemPedido.class)
                .setParameter("id", id).getResultList();
    }   
}
