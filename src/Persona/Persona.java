/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;
import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class Persona {
    private int cedula=0;
    private String nombre="";
    private int anio_nacimiento=0;

    public Persona(int cedula,String nombre,int anio_nacimiento)
    {
        this.cedula=cedula;
        this.nombre=nombre;
        this.anio_nacimiento=anio_nacimiento;
    }

    public Persona() {
    }
    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio_nacimiento() {
        return anio_nacimiento;
    }

    public void setAnio_nacimiento(int anio_nacimiento) {
        this.anio_nacimiento = anio_nacimiento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.cedula;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + this.anio_nacimiento;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.cedula != other.cedula) {
            return false;
        }
        if (this.anio_nacimiento != other.anio_nacimiento) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    public String getEdad() {
        return "La edad de la persona es "+(2019-this.getAnio_nacimiento());
    }

    @Override
    public String toString() {
        return "Cedula " + cedula + "\n Nombre " + nombre + "\n Edad " + this.getEdad();
    }
    
}
