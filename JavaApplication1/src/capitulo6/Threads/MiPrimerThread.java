/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.Threads;

/**
 *
 * @author T-101
 * creaxcion de un thread heredando la clase thread
 */
public class MiPrimerThread extends Thread{
    @Override
    public void run(){
        System.out.println("Soy un Thread y me llamo: " +this.getName());
    }
    
}
