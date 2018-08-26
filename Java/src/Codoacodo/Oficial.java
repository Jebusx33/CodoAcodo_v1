package Codoacodo;


public class Oficial extends Empleado  {
public Oficial (){}
    public Oficial (String nombre){
    super(nombre);
    }
    
    @Override
    public String toString(){
    return super.toString()+" Oficial  ";
    }
    
}