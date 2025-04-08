/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio12;

/**
 *
 * @author Fabricio de Aguiar
 */
/**Faça um programa em JAVA que solicite 2 números inteiros, verificar qual é
o número maior e mostrar na tela, ou se forem iguais, mostrar uma
mensagem indicando esta informação.*/
import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {
        int numero1,numero2;
        
        JOptionPane.showMessageDialog(null,"Digite dois números inteiros:");
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número "));
        
        if( numero1 > numero2){
            JOptionPane.showMessageDialog(null,numero1 + " é maior que " + numero2);
        }else{
            if(numero2 > numero1){
                JOptionPane.showMessageDialog(null, numero2 + " é maior que " + numero1);
            }else{
                if(numero1 == numero2){
                    JOptionPane.showMessageDialog(null," O primeiro número que você digitou é igual ao segundo número " );
                }
            }
        }
           
        
        
    }
}
