/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamenBimestral;

/**
 *
 * @author T-101
 */
public class TestPregunta {
    public static void main(String[] args) {
     Cuestionario preg=new Cuestionario(); 
        preg=new Cuestionario();
      preg.setPregunta("Capital de Rusia");
      Opciones op1=new Opciones();
                op1.setA("Moscu");
                op1.setB("Paris");
                op1.setC("Florencia");
                op1.setD("Londres");
      preg.setOpciones(op1);
        
    }
    
}
