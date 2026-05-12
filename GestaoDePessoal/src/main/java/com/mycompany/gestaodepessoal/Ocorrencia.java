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
public class Ocorrencia {

    private String identificadorOcorrencia;
    private String tipo;
    private Date data;
    private int hora;
    private String status;

    public Ocorrencia(String identificadorOcorrencia, String tipo, Date data, int hora, String status) {
        this.identificadorOcorrencia = identificadorOcorrencia;
        this.tipo = tipo;
        this.data = data;
        this.hora = hora;
        this.status = status;
    }

    public String getIdentificadorOcorrencia() {
        return identificadorOcorrencia;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getData() {
        return data;
    }

    public int getHora() {
        return hora;
    }

    public String getStatus() {
        return status;
    }

    public void setIdentificadorOcorrencia(String identificadorOcorrencia) {
        this.identificadorOcorrencia = identificadorOcorrencia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
