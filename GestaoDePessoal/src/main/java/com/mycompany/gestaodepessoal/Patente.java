/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaodepessoal;

/**
 *
 * @author aluno
 */
public class Patente {

    private String identificadorPatente;
    private String nome;
    private String descricao;
    private String nivelHiearquico;

    public Patente(String identificadorPatente, String nome, String descricao, String nivelHiearquico) {
        this.identificadorPatente = identificadorPatente;
        this.nome = nome;
        this.descricao = descricao;
        this.nivelHiearquico = nivelHiearquico;
    }

    public String getIdentificadorPatente() {
        return identificadorPatente;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getNivelHiearquico() {
        return nivelHiearquico;
    }

    public void setIdentificadorPatente(String identificadorPatente) {
        this.identificadorPatente = identificadorPatente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNivelHiearquico(String nivelHiearquico) {
        this.nivelHiearquico = nivelHiearquico;
    }

}
