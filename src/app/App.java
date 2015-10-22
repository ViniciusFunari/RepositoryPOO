/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import dao.Dao;
import dao.PessoaDaoArrayList;
import modelo.Pessoa;

/**
 *
 * @author UTFPR
 */
public class App {
    
    public static void main(String[]args){
        Pessoa joao = new Pessoa("Joao", "Silva" , 20);
        Pessoa jose = new Pessoa("Jose", "Silva", 40);
        Dao dao = new PessoaDaoArrayList();
        dao.adicionar (joao);
        dao.adicionar(jose);
        dao.listarTudo();
        
        System.out.println("");
        
        dao.remover(joao);
        dao.listarTudo();
    }
}
