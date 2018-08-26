package Codoacodo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AccionEj3 implements ActionListener {

    private JFrame mVentana;
    private JTextField mNombre;
    private JTextField mApellido;
    private JComboBox mPais;
    private JCheckBox idioma1;
    private JCheckBox idioma2;
    private JCheckBox idioma3;
    private JCheckBox idioma4;
    private JCheckBox idioma5;

    public AccionEj3(JFrame ventana, JTextField campoNombre, JTextField campoApellido, JComboBox paises, JCheckBox opcion1, JCheckBox opcion2, JCheckBox opcion3, JCheckBox opcion4, JCheckBox opcion5) {
        mVentana = ventana;
        mNombre = campoNombre;
        mApellido = campoApellido;
        mPais = paises;
        idioma1 = opcion1;
        idioma2 = opcion2;
        idioma3 = opcion3;
        idioma4 = opcion4;
        idioma5 = opcion5;
    }

    @Override
    public void actionPerformed(ActionEvent clicEnBoton) {
        String nombre = mNombre.getText();
        String apellido = mApellido.getText();
        String paisSeleccionado = (String) mPais.getSelectedItem();
        boolean idiomaSeleccionado1 = idioma1.isSelected();
        boolean idiomaSeleccionado2 = idioma2.isSelected();
        boolean idiomaSeleccionado3 = idioma3.isSelected();
        boolean idiomaSeleccionado4 = idioma4.isSelected();
        boolean idiomaSeleccionado5 = idioma5.isSelected();
        JFrame ventanaNueva = new JFrame();
       
        ventanaNueva.setLayout(new FlowLayout());
        ventanaNueva.setSize(700, 500);
        ventanaNueva.setLocationRelativeTo(null);
        ventanaNueva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel etiquetaNombre = new JLabel(nombre);
        ventanaNueva.add(etiquetaNombre);
        JLabel etiquetaApellido = new JLabel(apellido);
        ventanaNueva.add(etiquetaApellido);
        JLabel etiquetaPais = new JLabel(paisSeleccionado);
        ventanaNueva.add(etiquetaPais);
        if (idiomaSeleccionado1){
            JLabel etiquetaIdioma1 = new JLabel("Francés");
            ventanaNueva.add(etiquetaIdioma1);
        }
        if (idiomaSeleccionado2){
            JLabel etiquetaIdioma2 = new JLabel("Inglés");
            ventanaNueva.add(etiquetaIdioma2);
        }
        if (idiomaSeleccionado3){
            JLabel etiquetaIdioma3 = new JLabel("Italiano");
            ventanaNueva.add(etiquetaIdioma3);
        }
        if (idiomaSeleccionado4){
            JLabel etiquetaIdioma4 = new JLabel("Español");
            ventanaNueva.add(etiquetaIdioma4);
        }
        if (idiomaSeleccionado5){
            JLabel etiquetaIdioma5 = new JLabel("Ruso");
            ventanaNueva.add(etiquetaIdioma5);
        }
        ventanaNueva.setVisible(true);
        
    }

}
