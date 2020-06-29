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
        Empregado empregado1 = new Empregado("Alan", "Junior", 1800);
        Empregado empregado2 = new Empregado("Camila", "Toledo", 3000);

        String nome1 = empregado1.getNome();
        String sobreNome1 = empregado1.getSobreNome();
        float salario1 = empregado1.salario();
        empregado1.aplicaAumento(3.0f);

        String nome = empregado2.getNome();
        String sobreNome = empregado2.getSobreNome();
        float salario = empregado2.salario();
        empregado2.aplicaAumento(3.0f);

        System.out.println(" Nome :" + nome1);
        System.out.println(" Sobre nome  :" + sobreNome1);
        System.out.println(" Salario Mensal:" + salario1);
        System.out.println(" Salario com Aumento :" + empregado1.getSalarioMensal());
        System.out.println(" --------------------------------------");
        System.out.println(" Nome :" + nome);
        System.out.println(" Sobre nome  :" + sobreNome);
        System.out.println(" Salario Mensal :" + salario);
        System.out.println(" aumento de 10% :" + empregado2.getSalarioMensal());
    }

}
