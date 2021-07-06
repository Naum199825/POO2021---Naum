/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo.sobrecarga;

/**
 *
 * @author Friedrich Naum
 */ 
public class Program {
    public static void main(String[] args) {
       OperacaoAritmetica op1 = new OperacaoAritmetica();       
        System.out.println(">> " + op1.calcularSoma());
                System.out.println(">> " + op1.calcularSoma(5.0f));
       OperacaoAritmetica op2 = new OperacaoAritmetica(1.0f,2.0f);       
        System.out.println(">> " + op2.calcularSoma());
        System.out.println(">> " + op2.calcularSoma(5.0f));
    }
}
