/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastroveiculos;

/**
 *
 * @author g.boone
 */
import java.util.Scanner;
 class Veiculos {
    String marca;
    int ano;
    

      public void mostrardados(){
      System.out.println("marca:" +marca);
      System.out.println("Ano :" +ano);

} 
 }


 class Moto extends Veiculos{
  int cilindradas;   
  
  public void acelerar(){
  System.out.println(" A moto "+marca+" tem "+cilindradas+" cilindradas");    
  }
 }

class Caminhao extends Veiculos{
int capacidadeCarga;

public void carregar(){
 System.out.println("O caminhão "+marca+" está carregando "+capacidadeCarga+"Kg");
}
    
}

public class CadastroVeiculos {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    Moto[]moto = new Moto[2];
    Caminhao[] caminhao = new Caminhao[2];
    
    System.out.println("----- CADASTRO DE MOTOS -----");
    for(int i = 0; i <moto.length;i++){
        moto[i] = new Moto();
        System.out.println(" Digite a marca: ");
        moto[i].marca = sc.nextLine();
        System.out.println(" Digite o ano: ");
        moto[i].ano = sc.nextInt();
        System.out.println(" Digite a cilindrada: ");
        moto[i].cilindradas = sc.nextInt();
        System.out.println ();
        sc.nextLine();
    }
    System.out.println("----- CADASTRO DE CAMINHOES -----");
    for(int i = 0; i <caminhao.length;i++){
        caminhao[i] = new Caminhao();
        System.out.println(" Digite a marca: ");
        caminhao[i].marca = sc.nextLine();
        System.out.println(" Digite o ano: ");
        caminhao[i].ano = sc.nextInt();
        System.out.println(" Digite a capacida de Carga: ");
        caminhao[i].capacidadeCarga = sc.nextInt();
        System.out.println ();
        sc.nextLine();
    }
    for(int i = 0; i <moto.length;i++){
    moto[i].mostrardados();
    moto[i].acelerar();
    System.out.println ();
        }
    
    for(int i = 0; i <caminhao.length;i++){
    caminhao[i].mostrardados();
    caminhao[i].carregar();
    System.out.println ();
}
    }
}