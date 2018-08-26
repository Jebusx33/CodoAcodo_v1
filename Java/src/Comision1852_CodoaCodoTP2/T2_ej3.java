/*
 3. Leer tres n�meros que denoten una fecha (d�a, mes, a�o).
Comprobar que es una fecha v�lida. Si no es v�lida escribir un
mensaje de error. Si es v�lida escribir la fecha cambiando el n�mero
del mes por su nombre. Ej. si se introduce 1 2 2006, se deber�
imprimir ?1 de febrero de 2006?. El a�o debe ser mayor que 0.
(Recuerda la estructura seg�n sea para java ).
 */
package Comision1852_CodoaCodoTP2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Arias
 */
public class T2_ej3 {

    public static void main(String[] args) {

        int fecha = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una fecha en formato dd/mm/aaaa:"));
        // int fecha=26041982;
        int dia = fecha / 1000000;
        int mes = (fecha / 10000) - (dia * 100);
        int a�o = (fecha - (dia * 1000000)) - (mes * 10000);
        //  System.out.println(dia);
        //  System.out.println(mes);
        //  System.out.println(a�o);
        if (dia <= 0 || dia >= 32) {
            JOptionPane.showMessageDialog(null, "Usted ingreso " + dia + " en el dia"
                    + "\nError ingrese una fecha valida ",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            if (mes <= 0 || mes >= 13) {
                JOptionPane.showMessageDialog(null, "Usted ingreso " + mes + " en el mes"
                        + "\nError ingrese una fecha valida ",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);

            } else {
                if (a�o <= 0 || a�o > 3021) {
                    JOptionPane.showMessageDialog(null, "Usted ingreso " + a�o + "en el a�os "
                            + "\nError ingrese una fecha valida ",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    switch (mes) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Enero del a�o " + a�o);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Febrero del a�o " + a�o);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Marzo del a�o " + a�o);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Abril del a�o " + a�o);
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Mayo del a�o " + a�o);
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Junio del a�o " + a�o);
                            break;
                        case 7:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Julio del a�o " + a�o);
                            break;
                        case 8:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Agosto del a�o " + a�o);
                            break;
                        case 9:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Septiembre del a�o " + a�o);
                            break;
                        case 10:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Octubre del a�o " + a�o);
                            break;
                        case 11:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Noviembre del a�o " + a�o);
                            break;
                        case 12:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Diciembre del a�o " + a�o);
                            break;

                    }

                }

            }
        }

    }
}
