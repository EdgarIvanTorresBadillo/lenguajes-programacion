/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.Collections;
import java.util.*;
import javax.swing.JRadioButton;
/**
 *
 * @author T-101
 */
public class GeneradorPreguntas {
public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        
        Opcion op1=new Opcion("Moscu", true);
        Opcion op2=new Opcion("Florencia", false);
        Opcion op3=new Opcion("Paris", false);
        Opcion op4=new Opcion("Londres", false); 
        
        Opcion op4p2=new Opcion("Buenos Aires", false);
        Opcion op5p2=new Opcion("Tokio", false);
        Opcion op6p2=new Opcion("Beijing", true);
        Opcion op7p2=new Opcion("Pyongyang", false); 
        
        ArrayList<Opcion> opciones=new ArrayList<Opcion>();
        
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        ArrayList<Opcion> opcionesp2=new ArrayList<Opcion>();
        opcionesp2.add(op4p2);
        opcionesp2.add(op5p2);
        opcionesp2.add(op6p2);
        opcionesp2.add(op7p2);
        
        Pregunta p1=new Pregunta("Capital De Rusia", opciones);
        Pregunta p2=new Pregunta("Cual es la Capital de China", opcionesp2);
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        preguntas.add(p2);
        return preguntas;
    }
public static boolean checarRespuesta(Pregunta p, JRadioButton[] radios){
    boolean respuesta=false;
    String seleccion="";
    for(JRadioButton radio:radios){
        if(radio.isSelected()){
            seleccion=radio.getText();
        }
    for(Opcion o:p.getOpciones()){
        if(o.isEstatus()){
            if(o.getTitulo().equals(seleccion))respuesta=true;
        }
    }
    }
    return respuesta;
}
            }
