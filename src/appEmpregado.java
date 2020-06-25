/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class appEmpregado {

    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Alan", "Junior", -1500);
        
       String nome = empregado1.getNome();
       String sobreNome = empregado1.getSobreNome();
       float salario = empregado1.salario();
       
        System.out.println(" Nome :" + nome);
        System.out.println(" Sobre nome  :" + nome);
        System.out.println(" Salario :" + salario);
       
    }

}
