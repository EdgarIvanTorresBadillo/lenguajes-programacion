/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads implements Runnable {
    public static void main(String[] args) {
        //Ciclo de vida del thread sin contar pausa
        //1. Creado
        MiPrimerThread t1=new MiPrimerThread();
        //Otro Thread
        Runnable r=new ProbarMisThreads();
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        
        //El thread t2 tiene que hacer que se impriman del 1 al 10 con 5 seg entre impersion 
        //El thread 
        
        
        
        t1.setName("Chana");
        t2.setName("Juana");
        t3.setName("Pedro");
        //2. Inicializando
        t1.start();
        t2.start();
        t3.start();
        
        //3. En ejecucion (cuando corras este programa!!! y se active su metodo run)
        
        //5. Muerte: cuando complete la tarea que tiene el codigo del metodo run
    }

    @Override
    public void run() {
      //Primero pregunta,os si es el thread t2 y si es que imprima del 1 al 10
        if(Thread.currentThread().getName().equals("Juana")){
            int x=1;
            for (int i=0;i<10;i++) {
                System.out.println(x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
        }if(Thread.currentThread().getName().equals("Pedro")){
            while(true){
                System.out.println("Todos vamos a morir");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
