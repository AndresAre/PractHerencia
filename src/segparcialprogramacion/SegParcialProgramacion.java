/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segparcialprogramacion;
import Persona.Cliente;
import Persona.Vendedor;
import java.util.ArrayList;
import java.util.Scanner;
import Persona.Persona;
public class SegParcialProgramacion 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int cedula,anio_nacimiento,telefono;
        float salario;
        String nombre,cargo,direccion;
        
        
        ArrayList<Persona>pers=new ArrayList<Persona>();
        int seguir=0;
        System.out.println("MENU PERSONAS");
        
        do
        {
            System.out.println("MENU VENDEDORES");
            System.out.println("Digite Cedula vendedor ");
            cedula=sc.nextInt();
            System.out.println("Digite Nombre Vendedor ");
            nombre=sc.next();
            System.out.println("Digite fecha de nacimiento Vendedor ");
            anio_nacimiento=sc.nextInt();
            System.out.println("Digite Salario Vendedor ");
            salario=sc.nextFloat();
            System.out.println("Digite Cargo Vendedor ");
            cargo=sc.next();
            Vendedor p1=new Vendedor(cedula,nombre,anio_nacimiento,salario,cargo);
            int band=0;
            for(Persona item:pers)
            {
                if(item.equals(p1))
                {
                    band=1;
                    break;
                }
            }
            if(band==0)
                pers.add(p1);
            else
            {
                System.out.println("Este Vendedor ya se digito");
            }            
            System.out.println("digite 1 para Continuar 2 para Salir");
            seguir=sc.nextInt();
        }while(seguir==1);
        do
        {
            System.out.println("MENU CLIENTES");
            System.out.println("Digite Cedula Cliente ");
            cedula=sc.nextInt();
            System.out.println("Digite Nombre Cliente ");
            nombre=sc.next();
            System.out.println("Digite fecha de nacimiento Cliente ");
            anio_nacimiento=sc.nextInt();
            System.out.println("Digite Direcciono Cliente ");
            direccion=sc.next();
            System.out.println("Digite telefono Cliente ");
            telefono=sc.nextInt();
            Cliente p2=new Cliente(cedula,nombre,anio_nacimiento,direccion,telefono);
            int band=0;
            for(Persona item:pers)
            {
                if(item.equals(p2))
                {
                    band=1;
                    break;
                }
            }
            if(band==0)
                pers.add(p2);
            else
            {
                System.out.println("Este Cliente ya se digito");
            }            
            System.out.println("digite 1 para Continuar 2 para Salir");
            seguir=sc.nextInt();
        }
        while(seguir==1);
        int opc1;
        do{
            
            System.out.println("Menu de Personas");
            System.out.println("\n1:Buscar por Cedula"
                    +"          \n2:Mostrar por pantalla todas las personas");
            System.out.println("Elija la opcion que desea");
            int opc=sc.nextInt();
            switch(opc){
                case 1:
                    
                    System.out.println("Digite el numero de cedula a buscar");
                    cedula=sc.nextInt();
                    
                    for(Persona item:pers){
                        if(item.getCedula()==cedula)
                        {
                            System.out.println(item);
                        }
                    }
                break;
                case 2:
                    System.out.println("///////////////////////////////////////////////////////////////////////////////////////////////////////");
                    for(Persona item:pers){
                        System.out.println("____________________________________________________");
                        System.out.println(item);
                        }
                break;
            }
            System.out.println("digite 1 para Continuar 2 para Salir");
            opc1=sc.nextInt();
        }while(opc1==1);
    }
}
