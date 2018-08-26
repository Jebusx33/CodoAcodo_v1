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
public class Programador extends Empleado{
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador(String nombre, String apellido, String cedula, int edad, boolean casado, int lineasDeCodigoPorHora, String lenguajeDominante,double salario) {
        super(nombre, apellido, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

     public void mostrarDatosP(){
   
    System.out.println("Nombre:" + getNombre()+"\nApellido: " + getApellido()+
            "\nCedula: " + getCedula()+"\nEdad: "+getEdad()+
            "\nCasado: "+this.estadoCivil(casado)+"\nLineas de cod/h: "+lineasDeCodigoPorHora+"\nLenguaje que domina: "+lenguajeDominante+
            "\nSalario"+getSalario());
     
    }
    
}
