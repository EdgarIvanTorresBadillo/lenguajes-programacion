/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.inputoutput;

import java.net.*;
import java.io.*;

public class MiPrimeraConexion {
    public static void main(String[] args) throws Exception{
        URL url1=new
                    URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        HttpURLConnection con=(HttpURLConnection) url1.openConnection();
                InputStream input=con.getInputStream();
                InputStreamReader isr=new InputStreamReader(input);
                BufferedReader reader=new BufferedReader(isr);
                int renglones=0;
                while(reader.readLine()!=null){
                    renglones++;
                    //if(reader.readLine().contains("Current Conditions as of")){
                    //    System.out.println(reader.readLine()+"\n");
                    }// else {
                   // }
                String hola="<td width=class summary_data>21.2 C</td>";
                int indice1= hola.indexOf("summary_data");
                int indice2= hola.indexOf("</td>");
                String nuevo=hola.substring(indice1+13, indice2);
                System.out.println(nuevo);
 
        }
                
               // System.out.println("Numero de renglones: "+renglones);
              
        
    }
    



//if(renglones==91 ||renglones==102){