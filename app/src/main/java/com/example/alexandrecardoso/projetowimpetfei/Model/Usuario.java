/*
 * Class: Usuario
 * Version 1.0
 * Date: 28/03/2019 (20:50)
 * Author: Alexandre Cardoso
 */

package com.example.alexandrecardoso.projetowimpetfei.Model;

public class Usuario {
    /* Attributes */
    private int id;
    private String nome; // Nome do User
    private String email; // E-mail do Usuário
    private String telefone; // Telefone do Usuário
    private String endereco; // Endereço do Usuário
    private String CEP; // CEP do Usuário
    private String CPF; // CPF sem DAC do Usuário
    private String login; // Login de Acesso a plataforma
    private String password; // Senha de Acesso a plataforma
    private double confiabilidade; // Nível de confiabilidade do usuário





    private int tipoUser; // Define os previlégios do usuário, sendo: 0 - User Comum, 1 - User Premium e 2 - Administrador
    private Animal meusAnimais[]; // Chave para conexão com o banco de dados
    private static final int idInvalido = -1;

    public Usuario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(int tipoUser) {
        this.tipoUser = tipoUser;
    }
    /* Constructor
    public Usuario(String login, String password[]) {
        // Recebe o login e senha (inseridos pelo usuário) e testa o login
        this.id = this.testaLogin(login,password);
        if( this.id  != idInvalido){
            // Se chegou aqui, é porque logou. Então vamos capturar os dados
            if(this.getDados(this.id)){
                // Se chegou aqui, conseguiu capturar os dados.
            }else{
                // Se chegou aqui, deu algum problema na hora de capturar os dados
            }
        }

    }*/

    /* Methods: Login e Inicialização

    public int testaLogin(String login, String password[]){
        /* Aqui, devemos procurar no banco se este login existe, e caso exista, verificamos se a senha está certa
        *  Se verificar corretamente, retorna o id correspondente, se não conseguir, retornar a variavel global idInvalido
        *
        return 1; // Momentanêo para ficar sem erro
    }

    public boolean getDados(int id){
        /* Aqui, utilizamos a id (chave do banco) para preencher todos os atributos do objeto
        return true;
    }

    /* Methods: Gestão dos Animais

    public void adicionaAnimal(Animal novoAnimal){
        /* Implementar
    }

    public void listaAnimais(){
        /* Implementar
    }

    public void editaAnimal(Animal novoAnimal){
        /* Implementar
    }

    /* Methods: Gestão da Conta

    public void editaInfoPessoal(){
        /* Implementar
    }

    public void alteraSenha(){
        /* Implementar
    }
*/

}
