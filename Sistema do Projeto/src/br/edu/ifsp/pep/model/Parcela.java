/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "parcela")
public class Parcela implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")   
    private Integer id;
    
    @Column(name = "dataPagamento")
    private LocalDate dataPagamento;
    
    @Column(name = "dataVencimento", nullable = false)
    private LocalDate dataVencimento;
    
    @Column(name = "valor", precision = 2, scale = 10, nullable = false)
    private double valor;
    
    @ManyToOne
    @JoinColumn(name = "compra_id", nullable = false)
    private Compra compra;

    public Parcela() {
    }

    public Parcela(LocalDate dataVencimento, double valor, Compra compra) {
        this.dataVencimento = dataVencimento;
        this.valor = valor;
        this.compra = compra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate daraVencimento) {
        this.dataVencimento = daraVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Compra getCompras() {
        return compra;
    }

    public void setCompras(Compra compra) {
        this.compra = compra;
    }
}
