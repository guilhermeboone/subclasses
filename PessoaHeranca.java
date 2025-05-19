/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoaheranca;

/**
 *
 * @author g.boone
 */
import java.util.Scanner;

class Pessoa {
    String nome;
    String rg;

    public void mostrar (){
        System.out.println("Nome "+nome);
        System.out.println("RG "+rg);
    }
}
    class Estudante extends Pessoa{
        String curso;
        
    public void estudar(){
        System.out.println(nome+" está estudando "+curso);
        }
    }
    
    class Professor extends Pessoa{
    String departamento;
    
    public void trabalhar (){
        System.out.println(nome+" está trabalhando no departamento de "+departamento);
    }
  }

public class PessoaHeranca {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Estudante[] est = new Estudante[2];
        Professor[] prof = new Professor [2];
        
        System.out.println("---Cadastro de Estudante---");
        for (int i=0; i<est.length;i++){
        est[i] = new Estudante ();
        System.out.println ("Digite o nome "+(i+1)+" aluno: ");
        est[i].nome= sc.nextLine();
        System.out.println ("Digite o RG aluno: ");
        est[i].rg = sc.nextLine();
        System.out.println("Digite o nome do curso do aluno "+(i+1));
        est[i].curso = sc.nextLine();
        
        System.out.println ();
        }
        
        System.out.println ("---Cadastro de professores---");
        for (int i=0; i<prof.length;i++){
        prof[i]=new Professor();
        System.out.println ("Digite o nome "+(i+1)+" professor: ");
        prof[i].nome = sc.nextLine();
        System.out.println ("Digite o RG do professor "+(i+1));
        prof[i].rg = sc.nextLine();
        System.out.println ("Digite o departamento que o professor "+(i+1)+" trabalha: ");
        prof[i].departamento = sc.nextLine(); 
        System.out.println ();
    }
        
        System.out.println ("---Lista de estudantes cadastrados---");
        for (int i=0; i<est.length;i++){
        est[i].mostrar();
        est[i].estudar();
        System.out.println ();
        }
        
        System.out.println ("---Lista de professores cadastrados---");
        for (int i=0; i<prof.length;i++){
        prof[i].mostrar();
        prof[i].trabalhar();
        System.out.println ();
        }
    }
} 
