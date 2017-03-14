package Exercicios;


import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author igorf
 */
public class Exer01Fatorial {
    private static double fatorialRec(double num){
        if(num == 0 || num ==1) return 1;
        else 
        return num * fatorialRec(num-1);
    }
    
    public static void Run(){
        String num;
        double fat;
        num = JOptionPane.showInputDialog(null, "Digite um número: ", "Cálculo de Fatorial", 1);
        fat = fatorialRec(Double.parseDouble(num));
        JOptionPane.showMessageDialog(null, "O fatorial é: " + fat);
    }
    
    public static double CalcRec(double num){
        return fatorialRec(num);
    }
    
    public static void CalcIter(double num){
        double fat = 1;
        for(int i = 2; i < num; ++i)
            i *= i+1;
    }
}
