/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import org.junit.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import Estatisticas.Estatisticas;
import Estatisticas.Valores;


/**
 *
 * @author user
 */
public class testes extends TestCase{
    Estatisticas e = new Estatisticas();
    Valores v = new Valores();
    public void testeMedia(){
        float[] valores = {1,2,3};
        v.setValores(valores);
        assertEquals(2.0f, e.calculaMedia(v.getValores()));
    }
    public void testeMediana1(){
        float[] valores = {1,2,3,4,5};
        assertEquals(3.0f, e.calculaMediana(v.getValores()));
    }
    public void testeMediana2(){
        float[] valores = {1,2,3,4,5,6};
        v.setValores(valores);
        assertEquals(3.5f, e.calculaMediana(v.getValores()));
    }
    public void testeModa1(){
        float[] valores = {1,2,3,3,4,5,6};
        float[] resp = {3.0f};
        v.setValores(valores);
        assertArrayEquals(resp, e.calculaModa(v.getValores()),0);
    }
    public void testeModa2(){
        float[] valores = {3,3,4,4,5,6,6,7,7,8,8};
        float[] resp = {3.0f,4.0f,6.0f,7.0f,8.0f};
        v.setValores(valores);
        assertArrayEquals(resp, e.calculaModa(v.getValores()),0);
    }
    public void testeVariancia(){
        float[] valores = {2,2,2,2,2};
        v.setValores(valores);
        assertEquals(0.0f, e.calculaVariancia(v.getValores()));
    }
    public void testeDescioPadrao(){
        float[] valores = {2,2};
        v.setValores(valores);
        assertEquals(0.0f, e.calculaDesvioPadrao(v.getValores()));
    }
}
