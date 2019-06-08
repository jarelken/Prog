/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ler;

/**
 *
 * @author SI10688284981
 */
public class Autor {
    String nome;
    int idade;

    public Autor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String toString(){
        
        return "Autor "+getNome()+" Idade "+getIdade();
    }
    
}
