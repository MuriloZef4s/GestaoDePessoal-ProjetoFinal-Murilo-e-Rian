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
public class EscalaDeServico {

    private String identificadorEscala;
    private Date data;
    private String turno;
    private Bombeiro bombeiro;

    public EscalaDeServico(String identificadorEscala, Date data, String turno, Bombeiro bombeiro) {
        this.identificadorEscala = identificadorEscala;
        this.data = data;
        this.turno = turno;
        this.bombeiro = bombeiro;
    }

    public String getIdentificadorEscala() {
        return identificadorEscala;
    }

    public Date getData() {
        return data;
    }

    public String getTurno() {
        return turno;
    }

    public Bombeiro getBombeiro() {
        return bombeiro;
    }

    public void setIdentificadorEscala(String identificadorEscala) {
        this.identificadorEscala = identificadorEscala;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setBombeiro(Bombeiro bombeiro) {
        this.bombeiro = bombeiro;
    }

}
