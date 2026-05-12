/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestaodepessoal;

/**
 *
 * @author aluno
 */
public class Usuario {

    private String identificadorUsuario;
    private String login;
    private String senha;
    private String perfil;

    public Usuario(String identificadorUsuario, String login, String senha, String perfil) {
        this.identificadorUsuario = identificadorUsuario;
        this.login = login;
        this.senha = senha;
        this.perfil = perfil;
    }

    public String getIdentificadorUsuario() {
        return identificadorUsuario;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setIdentificadorUsuario(String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public void setAtualizarDados(String senha, String perfil) {
        this.senha = senha;
        this.perfil = perfil;
    }

    public void setCadastrar(String login) {
        this.login = login;
    }

    public void setConsultaBombeiros(String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }

    public void setExclusaoBombeiros(String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }

    public void setAtualizarBombeiros(String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }
}
