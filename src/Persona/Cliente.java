/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;
import Persona.Persona;
import java.util.Objects;

/**

*
 * @author ESTUDIANTE
 */
public class Cliente extends Persona
{
    private String direccion;
    private int telefono;

    public Cliente(int cedula,String nombre,int anio_nacimiento,String direccion,int telefono)
    {
        super(cedula,nombre,anio_nacimiento);
        this.direccion=direccion;
        this.telefono=telefono;
    }

    public Cliente(int cedula, String nombre, int anio_nacimiento, float salario, String cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.direccion);
        hash = 61 * hash + this.telefono;
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
        final Cliente other = (Cliente) obj;
        if (this.telefono != other.telefono) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Direccion " + direccion + "\n Telefono " + telefono;
    }
    
    
}
