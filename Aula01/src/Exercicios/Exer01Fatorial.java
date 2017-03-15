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
    
    public static void RunPrompt(){
        String num;
        double fat;
        num = JOptionPane.showInputDialog(null, "Digite um número: ", "Cálculo de Fatorial", 1);
        fat = CalcRec(Double.parseDouble(num));
        JOptionPane.showMessageDialog(null, "O fatorial é: " + fat);
    }
    
    public static double CalcRec(double num){
        if(num == 0 || num ==1) return 1;
        else 
        return num * CalcRec(num-1);
    }
    
    public static double CalcIter(double num){
        double fat = 1;
        for(int i = 2; i <= num; ++i)
            fat *= i;
        
        return fat;
    }
}
