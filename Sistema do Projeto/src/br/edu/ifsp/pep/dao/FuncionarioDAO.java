/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Funcionario;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class FuncionarioDAO extends AbstractDAO<Funcionario>{
    
    public Funcionario buscarLogin(String login, String senha){
    
        try {
            
            return getEntityManager()
                    .createNamedQuery("buscarLogin", Funcionario.class)
                    .setParameter("login", login)
                    .setParameter("senha", senha)
                    .getSingleResult();
            
        } catch (Exception e) {
        
            return null;
        }
    }
    
    public List<Funcionario> buscarPorNome(String nome) {

        return getEntityManager()
                .createNamedQuery("buscarPorNome", Funcionario.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();

    }
}
