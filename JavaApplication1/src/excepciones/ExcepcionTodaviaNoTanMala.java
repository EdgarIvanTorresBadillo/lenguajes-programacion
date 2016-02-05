/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class ExcepcionTodaviaNoTanMala {
    //ArrayIndexOutOfBoundsException
    public static void main(String[] args) {
        //Declaramos un arreglo de enteros, TODOS LOS ARRREGLOS SON TRATADOS POR EL COMPILADOR COMO OBJETOS
        int x[]={1, 34, 6, 8, 1}; //explicitia
        float []y=new float[4]; //implicita
        float z;
        
        System.out.println(y[2]);
        A objeto=new A();
        System.out.println(objeto.m);
        // System.out.println(z);
        //Vamos a iterar el arreglo x
        for (int i=0; i<x.length; i++){  //Length siempre da el valor maximo del arreglo
            System.out.println(x[i]);
        }
        
        //El mismo cliclo for pero mejorado
        for(int w:x){
            System.out.println(w);
        }
    }
    
}

class A{
    float m;
}