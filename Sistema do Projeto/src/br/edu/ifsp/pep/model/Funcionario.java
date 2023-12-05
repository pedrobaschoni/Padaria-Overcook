/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "funcionario")
@NamedQueries(value = {

    @NamedQuery(name = "buscarLogin", 
            query = "FROM Funcionario f WHERE f.login = :login AND f.senha = :senha AND f.statusFuncionario = br.edu.ifsp.pep.model.StatusFuncionario.Ativo"),
        
    @NamedQuery(name = "buscarPorNome",
            query = "FROM Funcionario f WHERE f.nome LIKE :nome AND f.statusFuncionario = br.edu.ifsp.pep.model.StatusFuncionario.Ativo")
})
public class Funcionario implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "nome", length = 60, nullable = false)
    private String nome;
    
    @Column(name = "tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoFuncionario tipo;
    
    @Column(name = "cpf", length = 14, nullable = false)
    private String cpf;
    
    @Column(name = "login", length = 30, nullable = false)
    private String login;
    
    @Column(name = "senha", length = 16, nullable = false)
    private String senha;
    
    @Column(name = "status_funcionario", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusFuncionario statusFuncionario;
    
    @Column(name = "telefone", length = 14)
    private String telefone;
    
    @Column(name = "email")
    private String email;

    public Funcionario() {
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public StatusFuncionario getStatusFuncionario() {
        return statusFuncionario;
    }

    public void setStatusFuncionario(StatusFuncionario status) {
        this.statusFuncionario = status;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", tipo=" + tipo + ", login=" + login + ", senha=" + senha + '}';
    }
    
    
}
