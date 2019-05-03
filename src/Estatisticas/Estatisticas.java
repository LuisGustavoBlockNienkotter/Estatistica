package Estatisticas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Estatisticas {
    
    public float calculaMedia(float[] valores){
        float sum = 0;
        for (float num : valores) {
            sum+=num;
        }
        return sum/valores.length;
    }
    public float calculaMediana(float[] valores){
        if(valores.length % 2 == 1){
            return valores[Math.round(valores.length/2)];
        }else{
            float index = valores.length/2;
            float valor;
            valor = valores[Math.round(index)] + valores[Math.round(index)-1];
            return valor/2;
        }
    }
    public float[] calculaModa(float[] valores){
        int nVezes = 1;
        List<String> lista = new ArrayList<String>();
        //float[] moda = new float[valores.length];
        int comparaV = 0;
        for (int p = 0; p < valores.length; p++) {
            nVezes = 1;
            for (int k = p + 1; k < valores.length; k++) {
                if (valores[p] == valores[k]) {
                    ++nVezes;
                }
            }
            if(nVezes > comparaV){
                lista.clear();
                comparaV = nVezes;
            }
            if (nVezes == comparaV) {
                lista.add(String.valueOf(valores[p]));
                comparaV = nVezes;
            }

        }
        float[] moda = new float[lista.size()];
        int index = 0;
        for (Iterator<String> iterator = lista.iterator(); iterator.hasNext();) {
            String next = iterator.next();
            moda[index] = Float.valueOf(next);
            index++;
        }
        return moda;
    }
    public float calculaVariancia(float[] valores){
        float sum = 0;
        for (float num : valores) {
            sum += (num - calculaMedia(valores))*(num - calculaMedia(valores));
        }
        System.out.println(sum);
        return sum/(valores.length-1);
    }
     public float calculaDesvioPadrao(float[] valores){
        return (float)Math.sqrt(calculaVariancia(valores));
    }
    
}
