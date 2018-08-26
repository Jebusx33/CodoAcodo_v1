/*
 3. Leer tres números que denoten una fecha (día, mes, año).
Comprobar que es una fecha válida. Si no es válida escribir un
mensaje de error. Si es válida escribir la fecha cambiando el número
del mes por su nombre. Ej. si se introduce 1 2 2006, se deberá
imprimir ?1 de febrero de 2006?. El año debe ser mayor que 0.
(Recuerda la estructura según sea para java ).
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
        int año = (fecha - (dia * 1000000)) - (mes * 10000);
        //  System.out.println(dia);
        //  System.out.println(mes);
        //  System.out.println(año);
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
                if (año <= 0 || año > 3021) {
                    JOptionPane.showMessageDialog(null, "Usted ingreso " + año + "en el años "
                            + "\nError ingrese una fecha valida ",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);

                } else {
                    switch (mes) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Enero del año " + año);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Febrero del año " + año);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Marzo del año " + año);
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Abril del año " + año);
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Mayo del año " + año);
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Junio del año " + año);
                            break;
                        case 7:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Julio del año " + año);
                            break;
                        case 8:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Agosto del año " + año);
                            break;
                        case 9:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Septiembre del año " + año);
                            break;
                        case 10:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Octubre del año " + año);
                            break;
                        case 11:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Noviembre del año " + año);
                            break;
                        case 12:
                            JOptionPane.showMessageDialog(null, "La fecha ingresada es " + dia + " de Diciembre del año " + año);
                            break;

                    }

                }

            }
        }

    }
}
