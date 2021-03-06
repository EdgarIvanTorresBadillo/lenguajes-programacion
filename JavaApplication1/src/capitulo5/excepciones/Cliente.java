package capitulo5.excepciones;

public class Cliente {

        private String email;
        private int edad;

    public Cliente(String email, int edad) {
        this.email = email;
        this.edad = edad;
    }

    public Cliente() {
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) throws ValorNoNegativoException, MenorDeEdadException{
        
       ValidarEdad.checarEdadNegativa(edad);
        ValidarEdad.checarMenorEdad(edad);
        
        this.edad = edad;
        
    }
        
   
    
}
