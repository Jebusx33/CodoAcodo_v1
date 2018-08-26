package Codoacodo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Map;
import static javafx.scene.input.KeyCode.B;
import static javafx.scene.input.KeyCode.G;
import static javafx.scene.input.KeyCode.R;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.*;

/**
 * 1) Crear 3 listas desplegables con valores entre 0 y 255. Cada lista
 * representa la cantidad de rojo, verde y azul que se pueden combinar para
 * formar colores. Al seleccionar una determinada combinación de RGB (Red Green
 * Blue) y hacer clic en el botón, se deberá modificar el fondo del mismo (es
 * decir, del botón). Si necesitas ayuda para resolver el ejercicio, podés ver
 * el siguiente video: https://youtu.be/JnaJm7DRPFc (Selector de Color RGB en
 * Java)
 */
public class codoacodo_EjOb_unidad4parte4ej1 {

    private static Map attributes;

    public static void main(String[] args) {

        JFrame ventana = new JFrame();

        // INGRESO DEL NOMBRE ROJO
        JLabel lblRojo = new JLabel("Rojo:");
        Font font = lblRojo.getFont();
        setAttributes(font.getAttributes());
        //subrayar
        //attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lblRojo.setFont(font.deriveFont(getAttributes()));

        // CREACION DEL ComboBox ROJO
        String opciones[] = {"255", "192", "128", "64", "0"};
        JComboBox<Object> Rojo = new JComboBox<>(opciones);

// INGRESO DEL NOMBRE VERDE
        JLabel lblVerde = new JLabel("Verde:");
        Font font2 = lblVerde.getFont();
        setAttributes(font2.getAttributes());
        //subrayar
        //attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lblRojo.setFont(font2.deriveFont(getAttributes()));

        // CREACION DEL ComboBox ROJO
        String opciones2[] = {"255", "192", "128", "64", "0"};
        JComboBox<Object> Verde = new JComboBox<>(opciones2);

// INGRESO DEL NOMBRE AZUL
        JLabel lblAzul = new JLabel("Azul:");
        Font font3 = lblVerde.getFont();
        setAttributes(font3.getAttributes());
        //subrayar
        //attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        lblAzul.setFont(font3.deriveFont(getAttributes()));

        // CREACION DEL ComboBox ROJO
        String opciones3[] = {"255", "192", "128", "64", "0"};
        JComboBox<Object> Azul = new JComboBox<>(opciones3);

        JButton btnFijar = new JButton("Fijar Color");
        // CREO METODO PARA EL BOTON ACEPTAR Y UN SI PARA QUE CAMBIE EL TITULO

        btnFijar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent Button) {
                // nombre y apellido
                // Raza de Perro
                if (Button.getSource() == btnFijar) {
                    String Red = Rojo.getSelectedItem().toString();
                    String Green = Verde.getSelectedItem().toString();
                    String Blue = Azul.getSelectedItem().toString();
                    int R = Integer.parseInt(Red);
                    int G = Integer.parseInt(Green);
                    int B = Integer.parseInt(Blue);
                    btnFijar.setBackground(new java.awt.Color(R, G, B));

                }

            }

            private void setBackground(Color color) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        });

        ventana.setSize(300, 150);
        ventana.setTitle("Ventana");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new FlowLayout());
        ventana.add(lblRojo);
        ventana.add(Rojo);
        ventana.add(lblVerde);
        ventana.add(Verde);
        ventana.add(lblAzul);
        ventana.add(Azul);
        ventana.add(btnFijar);
        ventana.setVisible(true);

    }

    @SuppressWarnings("rawtypes")
    public static Map getAttributes() {
        return attributes;
    }

    @SuppressWarnings("rawtypes")
    public static void setAttributes(Map attributes) {
        codoacodo_EjOb_unidad4parte4ej1.attributes = attributes;
    }

}
