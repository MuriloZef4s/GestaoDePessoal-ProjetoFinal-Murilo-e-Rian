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
    
    public void getAtualizarDados(String senha, String perfil) {
        this.senha = senha;
        this.perfil = perfil;
    }
    
    public void getCadastrar(String login) {
        this.login = login;
    }
    
    public void getConsultaBombeiros(String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }
    
    public void geteExclusaoBombeiros(String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }
    
    public void getAtualizarBombeiros(String identificadorUsuario) {
        this.identificadorUsuario = identificadorUsuario;
    }
}