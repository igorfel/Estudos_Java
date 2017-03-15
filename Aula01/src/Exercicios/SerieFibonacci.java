/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;

/**
 *
 * @author igorf
 */
public class SerieFibonacci {

    public static double[] FibonacciSeries(int term) {
        if (term == 0) {
            double[] a = {0};
            return a;
        }

        double[] serie = new double[term + 1];
        for (int i = 0; i < term + 1; ++i) {
            if (i < 2) {
                if (i % 2 == 0) {
                    serie[i] = 0;
                } else {
                    serie[i] = 1;
                }
            } else {
                serie[i] = serie[i - 1] + serie[i - 2];
            }
        }
        return serie;
    }
}
