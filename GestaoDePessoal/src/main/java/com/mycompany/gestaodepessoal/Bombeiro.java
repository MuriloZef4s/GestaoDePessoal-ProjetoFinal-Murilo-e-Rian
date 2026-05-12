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
public class Bombeiro {

    private String identificadorBombeiro;
    private String nome;
    private String cpf;
    private String matricula;
    private Date dataNsacimento;
    private String especialidade;
    private String contato;
    private Patente patente;
    private String status;

    public Bombeiro(String identificadorBombeiro, String nome, String cpf, String matricula, Date dataNsacimento, String especialidade, String contato, Patente patente, String status) {
        this.identificadorBombeiro = identificadorBombeiro;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.dataNsacimento = dataNsacimento;
        this.especialidade = especialidade;
        this.contato = contato;
        this.patente = patente;
        this.status = status;
    }

    public void setIdentificadorBombeiro(String identificadorBombeiro) {
        this.identificadorBombeiro = identificadorBombeiro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setDataNsacimento(Date dataNsacimento) {
        this.dataNsacimento = dataNsacimento;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIdentificadorBombeiro() {
        return identificadorBombeiro;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public Date getDataNsacimento() {
        return dataNsacimento;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public String getContato() {
        return contato;
    }

    public Patente getPatente() {
        return patente;
    }

    public String getStatus() {
        return status;
    }
}
