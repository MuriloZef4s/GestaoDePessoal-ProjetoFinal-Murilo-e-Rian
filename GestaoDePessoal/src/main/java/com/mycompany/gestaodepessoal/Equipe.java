/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaodepessoal;

/**
 *
 * @author aluno
 */
public class Equipe {

    private String identificadorEquipe;
    private String nome;
    private String tipo;
    private String status;

    public Equipe(String identificadorEquipe, String nome, String tipo, String status) {
        this.identificadorEquipe = identificadorEquipe;
        this.nome = nome;
        this.tipo = tipo;
        this.status = status;
    }

    public String getIdentificadorEquipe() {
        return identificadorEquipe;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setIdentificadorEquipe(String identificadorEquipe) {
        this.identificadorEquipe = identificadorEquipe;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
