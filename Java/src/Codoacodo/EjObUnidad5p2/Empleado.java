/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codoacodo.EjObUnidad5p2;

/**
 *
 * @author Jesus Arias
 */
public class Empleado  {
 private String nombre,apellido,cedula;
   private int edad;
   boolean casado;
   double salario;
   
   
    public Empleado(String nombre, String apellido, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

  


public void rangoedad(){

    if(edad>=18 && edad<=21){
        System.out.println("Principiante");
    }else
    {if(edad>=22 && edad<=35 ){
        System.out.println("Intermedio");
    }else
    {if(edad >=35 &&  edad<=45){
    System.out.println("Senior");
    }else {
        System.out.println("No cumple con los requisitos de edad");
   }
    }  }
      
}
 
public String estadoCivil(boolean casado) {
        if (casado == true) {
            return "SI";
        } else {
            return "NO";
        }
}


//aumento de del salario 

public void Aumento(){
int porcentaje=0;
double salarioA;
porcentaje=20;

salarioA=salario*porcentaje/100;
    System.out.println("con el aumento del: "+porcentaje+"% "+ "\nel sueldo a cobrar es de: "+ (salario+salarioA));

}
    


    public void mostrarDatosE(){
   
    System.out.println("Nombre:" + getNombre()+"\nApellido: " + getApellido()+
            "\nCedula: " + getCedula()+"\nEdad: "+getEdad()+
            "\nCasado: "+this.estadoCivil(casado)+"\nSalario"+getSalario()+"\t");

    

   
}

}