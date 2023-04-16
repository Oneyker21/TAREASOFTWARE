package modelado_P;

import java.util.Date;

public class Persona {
    String nombre, apellido, cedula;
    int fechaNac;
    String regionActual;
    char genero;

    public Persona(String nombre, String apellido, String cedula, int fechaNac, String regionActual, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.fechaNac = fechaNac;
        this.regionActual = regionActual;
        this.genero = genero;
    }
    public void Imprimir(){
        System.out.println("Nombre   : " + nombre 
                        + "\nApellido : " + apellido 
                        + "\nCedula   : " + cedula 
                        + "\nAño      : " + fechaNac
                        + "\nPais     : " + regionActual 
                        + "\nGenero   : " + genero
                        + "\nEdad     : " + getDeterminarEdad());
        System.out.println("---------------------------------------------------");
    }
    public int getDeterminarEdad(){
        Date ac = new Date();
        int fechaActual = ac.getYear();
        return (fechaActual + 1900) - fechaNac;
    }
    
}
