/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;
import Persona.Persona;
import java.util.Objects;

public class Vendedor extends Persona
{
    private float salario=0; 
    private String cargo="";


    public Vendedor(int cedula, String nombre, int anio_nacimiento,float salario,String cargo) {
        super(cedula, nombre, anio_nacimiento);
        this.salario=salario;
        this.cargo=cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Float.floatToIntBits(this.salario);
        hash = 67 * hash + Objects.hashCode(this.cargo);
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
        final Vendedor other = (Vendedor) obj;
        if (Float.floatToIntBits(this.salario) != Float.floatToIntBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        return true;
    }

    


    public String getPrima() {
        return "La prima del Vendedor es"+(this.getSalario()/2);
    }
    
    @Override
    public String toString() {
        return super.toString()+"\n Salario " + salario + "\n Prima "+this.getPrima()+"\n Cargo " + cargo;
    }
    
}
