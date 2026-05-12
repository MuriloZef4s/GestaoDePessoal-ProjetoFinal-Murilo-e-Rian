/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaodepessoal;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Treinamento {

    private String identificadorTreinamento;
    private String nome;
    private int cargaHoraria;
    private Date data;

    public Treinamento(String identificadorTreinamento, String nome, int cargaHoraria, Date data) {
        this.identificadorTreinamento = identificadorTreinamento;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.data = data;
    }

    public String getIdentificadorTreinamento() {
        return identificadorTreinamento;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Date getData() {
        return data;
    }

    public void setIdentificadorTreinamento(String identificadorTreinamento) {
        this.identificadorTreinamento = identificadorTreinamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setData(Date data) {
        this.data = data;
    }

}
