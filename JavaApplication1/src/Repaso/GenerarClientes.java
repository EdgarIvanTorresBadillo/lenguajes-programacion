//2.Crear una nueva clase que se llame GenerarClientes, que contenga un metodo que
//se llame obtenerCliente, cuyo tipo de retorno sea un arreglo de la clase Cliente
//escribir solo la estructura

//3.Dentro del puerco del metodo anterior crear un arreglo de clientes con los 
//siguientes datos

//nombre  aPaterno  edad  sueldo   calle    numero  municipio
//ana       lopez    20   22000   "sur 10"    20    ecatepunk
//pedro   martinez   45   14000   "mexico"    122   nezayork
//laura     gomez    30   70000    "R-1"      43    cloacalco
package Repaso;


public class GenerarClientes {
    public static Cliente[] obtenerCliente(){
      Cliente[] clientes=new Cliente[3];
      clientes[0]=new Cliente("Ana", "Lopez", 20, 22000, new Direccion("sur 10", 20, "Ecatepunk"));

      //clientes[0]=new Cliente();
      //clientes[1]=new Cliente();
      //clientes[2]=new Cliente();
    /* 
      clientes[0].setNombre("Ana");
      clientes[1].setNombre("Pedro");
      clientes[2].setNombre("Laura");
      
      clientes[0].setaPaterno("Lopez");
      clientes[1].setaPaterno("Martinez");
      clientes[2].setaPaterno("Gomez");
     
      clientes[0].setEdad(20);
      clientes[1].setEdad(45);
      clientes[2].setEdad(30);
      
      clientes[0].setSueldo(22000);
      clientes[1].setSueldo(14000);
      clientes[2].setSueldo(70000);
      
      Direccion d1=new Direccion();
                d1.setCalle("sur 10");
                d1.setNumero(20);
                d1.setMunicipio("Ecatepunk");
      clientes[0].setDireccion(d1);
     */
      return clientes;
        
    }
}
