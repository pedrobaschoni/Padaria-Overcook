/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Fornecedor;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class FornecedorDAO extends AbstractDAO<Fornecedor>{
    
    public List<Fornecedor> buscarFornecedorPorNome(String nome) {

        return getEntityManager()
                .createNamedQuery("buscarFornecedorPorNome", Fornecedor.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();

    }
}
