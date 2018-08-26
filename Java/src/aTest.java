import java.util.*;

import javax.swing.*;


public class aTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar fecha = new GregorianCalendar();
		int anio = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int fechalogic3= anio+((mes+1)*10000)+(dia*1000000);
		int fecha_actual= (dia*1000000)+((mes+1)*10000)+anio;
		
		int fecha1=Integer.parseInt(JOptionPane.showInputDialog("introdusca la 1� fecha (ddmmaaa)"));
		int dia1 = fecha1/1000000;
		int mes1 = (fecha1/10000)%dia1;
		int anio1 = fecha1%10000;
		int Fechalogic1= anio1+((mes1)*10000)+(dia1*1000000);
				
		int fecha2=Integer.parseInt(JOptionPane.showInputDialog("introdusca la 2� fecha (ddmmaaa)"));
		int dia2 = fecha2/1000000;
		int mes2 = (fecha2/10000)%dia2;
		int anio2 = fecha2%10000;
	
		int Fechalogic2= anio2+((mes2)*10000)+(dia2*1000000);		
		
		System.out.println("Fecha Actual: " + fecha1);
		System.out.println("dia ingresado: " + dia1);
		System.out.println("mes ingresado: " + mes1);
		System.out.println("mes ingresado: " + anio1);

		System.out.println("Fecha Actual: " + fecha2);
		System.out.println("dia ingresado: " + dia2);
		System.out.println("mes ingresado: " + mes2);
		System.out.println("mes ingresado: " + anio2);
		
		System.out.println("Fecha ingresada es: " + dia1 +"/"+ (mes1) +"/"+ anio1 );
		System.out.println("Fecha Actual: " + dia +"/"+ (mes+1) +"/"+ anio );
		System.out.println("Fecha la segunda fecha ingresada es : " + dia2 +"/"+ (mes2) +"/"+ anio2 );
		System.out.println("fecha actual: " + fecha_actual);
	
		System.out.println("dia ingresado: " + dia);
		System.out.println("mes ingresado: " + (mes+1));
		System.out.println("mes ingresado: " + anio);
		
		
			/*
				if(fecha1 > fecha2  &&  fecha1 > fecha_actual )
				{
										
					System.out.println(fecha2);
					System.out.println(fecha_actual);
					System.out.println(fecha1);					
				}
				else if(fecha2 > fecha1 && fecha2 > fecha_actual)
					{
					System.out.println(fecha_actual);
					System.out.println(fecha1);
					System.out.println(fecha2);
					}
					else
					{
						System.out.println(fecha2);
						System.out.println(fecha1);
						System.out.println(fecha_actual);
						}
				
				if(fecha1 < fecha2 &&  fecha1 < fecha_actual  )
				{
					System.out.println(fecha1);
					System.out.println(fecha2);
					System.out.println(fecha_actual);
				}
				else if(fecha2 < fecha1 && fecha2 < fecha_actual)
					{
					System.out.println(fecha2);
					System.out.println(fecha1);
					System.out.println(fecha_actual);
					}
					else
					{
						System.out.println(fecha_actual);
						System.out.println(fecha2);
						System.out.println(fecha1);
					}			
				*/
				if((Fechalogic1 < Fechalogic2) && (Fechalogic2>fechalogic3) && (Fechalogic1<Fechalogic2)){
					System.out.println(fecha1);
					System.out.println(fecha_actual);
					System.out.println(fecha2);
				}
				else if((Fechalogic2<Fechalogic1) && (Fechalogic2<fechalogic3) && (fechalogic3<Fechalogic1) ){
					System.out.println(fecha2);
					System.out.println(fecha_actual);
					System.out.println(fecha1);

				}
				else{
					System.out.println(fecha1);
					System.out.println(fecha2);
					System.out.println(fecha_actual);
									}
				System.out.println("las fechas son" );
					
			
			
			}
	
	}


