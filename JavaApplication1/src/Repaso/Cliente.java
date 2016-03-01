//1.Crear un modelo (no tiene main para crear clientes cuyos atributos sean:
//nombre, aPaterno, edad sueldo y direccion, la direccion incluye:
//calle, numero, municipio y telefono. Aplicar encapsulamiento a la o las posibles clases
package Repaso;

/**
 *
 * @author T-101
 */
public class Cliente {
    String nombre;
    String aPaterno;
    int edad;
    float sueldo;
    Direccion direccion;

    public Cliente(String nombre, String aPaterno, int edad, float sueldo, Direccion direccion) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.edad = edad;
        this.sueldo = sueldo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
}
