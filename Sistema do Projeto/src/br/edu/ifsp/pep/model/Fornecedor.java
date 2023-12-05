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
@Table(name = "fornecedor")
@NamedQueries(value = {

    @NamedQuery(name = "buscarFornecedorPorNome",
            query = "FROM Fornecedor f WHERE f.nome LIKE :nome AND f.statusFornecedor = br.edu.ifsp.pep.model.StatusFornecedor.Ativo")
        
})
public class Fornecedor implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "nome", length = 60, nullable = false)
    private String nome;
    
    @Column(name = "valor_total_Comprado", precision = 2, scale = 10)
    private double valorTotalComprado;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "telefone", length = 60, nullable = false)
    private String telefone;
    
    @Column(name = "valor_total_pago", precision = 2, scale = 10)
    private double valorTotalPago;
    
    @Column(name = "status_fornecedor")
    @Enumerated(EnumType.STRING)
    private StatusFornecedor statusFornecedor;
    
    public Fornecedor() {
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorTotalComprado() {
        return valorTotalComprado;
    }

    public void setValorTotalComprado(double valorTotalComprado) {
        this.valorTotalComprado = valorTotalComprado;
    }   

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValorTotalPago() {
        return valorTotalPago;
    }

    public void setValorTotalPago(double valorTotalPago) {
        this.valorTotalPago = valorTotalPago;
    }

    public StatusFornecedor getStatusFornecedor() {
        return statusFornecedor;
    }

    public void setStatusFornecedor(StatusFornecedor statusFornecedor) {
        this.statusFornecedor = statusFornecedor;
    }

    @Override
    public String toString() {
        return nome;
    }
}
