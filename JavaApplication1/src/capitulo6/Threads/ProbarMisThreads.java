/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.Threads;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads {
    public static void main(String[] args) {
        //Ciclo de vida del thread sin contar pausa
        //1. Creado
        MiPrimerThread t1=new MiPrimerThread();
        //Opcionalmente lo bautizamos
        t1.setName("El Riuker");
        
        
        //2. Inicializando
        t1.start();
        
        //3. En ejecucion (cuando corras este programa!!! y se active su metodo run)
        
        //5. Muerte: cuando complete la tarea que tiene el codigo del metodo run
    }
}
