package Codoacodo;

import java.awt.*;
import java.awt.Label;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("unused")
public class codoacodo_EjOb_unidad4parte3ej5 {

	@SuppressWarnings("rawtypes")
	private static Map attributes;
	private static JPanel jPanel1;
	private static JPanel jPanel2;
	private static JPanel jPanel3;

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame ventana = new JFrame();

		// CREACION DEL panel1
		jPanel1 = new javax.swing.JPanel();

		// jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Calibri", 1, 14), new java.awt.Color(255, 255, 255)));
		jPanel1.setPreferredSize(new java.awt.Dimension(650, 170));

		// CREACION DEL JLabel y ComboBox Cliente
		// INGRESO DEL NOMBRE
		JLabel lblNombres = new JLabel("Nombre:");
		Font font1 = lblNombres.getFont();
		setAttributes(font1.getAttributes());
		// subrayar
		// attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblNombres.setFont(font1.deriveFont(getAttributes()));
		String opciones2[] = { "Jesus", "Pedro", "Eduardo", "Lucas", "Pablo" };
		JComboBox<Object> nombreCli = new JComboBox<Object>(opciones2);

		// INGRESO DEL APELLIDO
		JLabel lblApellidos = new JLabel("Apellido:");
		Font font2 = lblApellidos.getFont();
		setAttributes(font2.getAttributes());
		// subrayar
		// attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblApellidos.setFont(font2.deriveFont(getAttributes()));
		String opciones3[] = { "Arias", "Rodriguez", "Genes", "Basteiro", "Romero" };
		JComboBox<Object> apellidoCli = new JComboBox<Object>(opciones3);

		// INGRESO DE LA FECHA DE NACIMIENTO
		JLabel lblfechanac = new JLabel("Fecha de nacimiento:");
		Font font3 = lblNombres.getFont();
		setAttributes(font3.getAttributes());
		// subrayar
		// attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblfechanac.setFont(font3.deriveFont(getAttributes()));
		String opciones4[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15",
				"16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "39", "30", "31" };
		JComboBox<Object> dianacCli = new JComboBox<Object>(opciones4);
		String opciones5[] = { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE",
				"OCTUBRE", "NOVIEMBRE", "DICIEMBRE" };
		JComboBox<Object> mesnacCli = new JComboBox<Object>(opciones5);
		String opciones6[] = { "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970",
				"1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1980", "1981",
				"1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1990", "1991", "1992", "1993",
				"1994", "1995", "1996", "1997", "1998", "1999", "2000", "2000", "2001", "2002", "2003", "2004", "2005",
				"2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
				"2018" };
		JComboBox<Object> anionacCli = new JComboBox<Object>(opciones6);

		// INGRESO DE LA DIRECCION
		JLabel lblDireccion = new JLabel("Direccion:");
		Font font4 = lblDireccion.getFont();
		setAttributes(font4.getAttributes());
		// subrayar
		// attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblDireccion.setFont(font4.deriveFont(getAttributes()));
		String opciones7[] = { "Av.Cabildo", "Av.santa fe", "Av.Cordoba", "Av.Corrientes", "Av.Rivadavia" };
		JComboBox<Object> DireccionCli = new JComboBox<Object>(opciones7);

		// INGRESO DEL CODIGO PÒSTAL
		JLabel lblCodigoP = new JLabel("Codigo Postal:");
		Font font5 = lblCodigoP.getFont();
		setAttributes(font5.getAttributes());
		// subrayar
		// attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblCodigoP.setFont(font5.deriveFont(getAttributes()));
		String opciones8[] = { "1000", "1200", "1300", "1500", "1600" };
		JComboBox<Object> CodigoPCli = new JComboBox<Object>(opciones8);

		// INGRESO DE LA PROVINCIA
		JLabel lblProvincia = new JLabel("Provincia:");
		Font font6 = lblProvincia.getFont();
		setAttributes(font6.getAttributes());
		// subrayar
		// attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblProvincia.setFont(font5.deriveFont(getAttributes()));
		String opciones9[] = { "BUENOS AIRES", "CORDOBA", "SANTA FE", "MENDOZA", "SAN LUIS" };
		JComboBox<Object> provinciaCli = new JComboBox<Object>(opciones9);

		// PROPIEDADES DEL Panel1

		jPanel1.add(lblNombres);
		jPanel1.add(nombreCli);
		jPanel1.add(lblApellidos);
		jPanel1.add(apellidoCli);
		jPanel1.add(lblfechanac);
		jPanel1.add(dianacCli);
		jPanel1.add(mesnacCli);
		jPanel1.add(anionacCli);
		jPanel1.add(lblDireccion);
		jPanel1.add(DireccionCli);
		jPanel1.add(lblCodigoP);
		jPanel1.add(CodigoPCli);
		jPanel1.add(lblProvincia);
		jPanel1.add(provinciaCli);

		// creo panel2
		jPanel2 = new javax.swing.JPanel();

		jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vendedores",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Calibri", 1, 14), new java.awt.Color(255, 255, 255)));
		jPanel2.setPreferredSize(new java.awt.Dimension(650, 170));

		// CREACION DEL JLabel y ComboBox Vendedor
		// INGRESO DEL NOMBRE
		JLabel lblNombresven = new JLabel("Nombre:");
		Font font1ven = lblNombresven.getFont();
		setAttributes(font1ven.getAttributes());
		// subrayar
		// attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblNombres.setFont(font1.deriveFont(getAttributes()));
		String opciones2ven[] = { "Jesus", "Pedro", "Eduardo", "Lucas", "Pablo" };
		JComboBox<Object> nombreven = new JComboBox<Object>(opciones2);

		// INGRESO DEL APELLIDO
		JLabel lblApellidosven = new JLabel("Apellido:");
		Font font2ven = lblApellidosven.getFont();
		setAttributes(font2ven.getAttributes());
		// subrayar
		// attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblApellidosven.setFont(font2ven.deriveFont(getAttributes()));
		String opciones3ven[] = { "Arias", "Rodriguez", "Genes", "Basteiro", "Romero" };
		JComboBox<Object> apellidoven = new JComboBox<Object>(opciones3ven);

		// INGRESO DE LA FECHA DE NACIMIENTO
		JLabel lblfechanacven = new JLabel("Fecha de nacimiento:");
		Font font3ven = lblfechanacven.getFont();
		setAttributes(font3ven.getAttributes());
		// subrayar
		// attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblfechanacven.setFont(font3.deriveFont(getAttributes()));
		String opciones4ven[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
				"15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "39", "30", "31" };
		JComboBox<Object> dianacven = new JComboBox<Object>(opciones4ven);
		String opciones5ven[] = { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO",
				"SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" };
		JComboBox<Object> mesnacven = new JComboBox<Object>(opciones5ven);
		String opciones6ven[] = { "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969",
				"1970", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1980",
				"1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1990", "1991", "1992",
				"1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2000", "2001", "2002", "2003", "2004",
				"2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017",
				"2018" };
		JComboBox<Object> anionacven = new JComboBox<Object>(opciones6ven);

		// INGRESO DE LA DIRECCION
		JLabel lblDireccionven = new JLabel("Direccion:");
		Font font4ven = lblDireccionven.getFont();
		setAttributes(font4ven.getAttributes());
		// subrayar
		// attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblDireccionven.setFont(font4ven.deriveFont(getAttributes()));
		String opciones7ven[] = { "Av.Cabildo", "Av.santa fe", "Av.Cordoba", "Av.Corrientes", "Av.Rivadavia" };
		JComboBox<Object> Direccionven = new JComboBox<Object>(opciones7ven);

		// INGRESO DE LA PROVINCIA
		JLabel lblProvinciaven = new JLabel("Sucursal:");
		Font font6ven = lblProvincia.getFont();
		setAttributes(font6ven.getAttributes());
		// subrayar
		// attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		lblProvinciaven.setFont(font6ven.deriveFont(getAttributes()));
		String opciones9ven[] = { "BUENOS AIRES", "CORDOBA", "SANTA FE", "MENDOZA", "SAN LUIS" };
		JComboBox<Object> provinciaven = new JComboBox<Object>(opciones9);

		// PROPIEDADES DE LA Panel

		jPanel2.add(lblNombresven);
		jPanel2.add(nombreven);
		jPanel2.add(lblApellidosven);
		jPanel2.add(apellidoven);
		jPanel2.add(lblfechanacven);
		jPanel2.add(dianacven);
		jPanel2.add(mesnacven);
		jPanel2.add(anionacven);
		jPanel2.add(lblDireccionven);
		jPanel2.add(Direccionven);
		jPanel2.add(lblProvinciaven);
		jPanel2.add(provinciaven);

		// creo panel3
		jPanel3 = new javax.swing.JPanel();

		// jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "",
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Calibri", 1, 14), new java.awt.Color(255, 255, 255)));

		jPanel3.setPreferredSize(new java.awt.Dimension(650, 170));

		// CREO METODO PARA EL BOTON Cliente
		JButton btnCliente = new JButton("Cliente");

		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent panel1) {
				// nombre y apellido

				if (panel1.getSource() == btnCliente) {
					String nombreClie = nombreCli.getSelectedItem().toString();
					String apellidoClie = apellidoCli.getSelectedItem().toString();
					String dianacClie = dianacCli.getSelectedItem().toString();
					String mesnacClie = mesnacCli.getSelectedItem().toString();
					String anionacClie = anionacCli.getSelectedItem().toString();
					String DireccionClie = DireccionCli.getSelectedItem().toString();
					String CodigoPClie = CodigoPCli.getSelectedItem().toString();
					String provinciaClie = provinciaCli.getSelectedItem().toString();

					JOptionPane.showMessageDialog(null,
							"Nombre: " + nombreClie + "\nApellido: " + apellidoClie + "\nFecha de Nacimiento: "
									+ dianacClie + "/" + mesnacClie + "/" + anionacClie + "\nDireccion: "
									+ DireccionClie + "\nCodigo Postal: " + CodigoPClie + "\nProvincia: "
									+ provinciaClie,
							"Datos del Cliente", JOptionPane.PLAIN_MESSAGE);
				}
			}
		});

		// CREO METODO PARA EL BOTON vendedor
		JButton btnVendedor = new JButton("Vendedor");

		btnVendedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent panel2) {
				// nombre y apellido

				if (panel2.getSource() == btnVendedor) {
					String nombrevend = nombreven.getSelectedItem().toString();
					String apellidovend = apellidoven.getSelectedItem().toString();
					String dianacvend = dianacven.getSelectedItem().toString();
					String mesnacvend = mesnacven.getSelectedItem().toString();
					String anionacvend = anionacven.getSelectedItem().toString();
					String Direccionvend = Direccionven.getSelectedItem().toString();
					String provinciavend = provinciaven.getSelectedItem().toString();

					JOptionPane.showMessageDialog(null,
							"Nombre: " + nombrevend + "\nApellido: " + apellidovend + "\nFecha de Nacimiento: "
									+ dianacvend + "/" + mesnacvend + "/" + anionacvend + "\nDireccion: "
									+ Direccionvend + "\nProvincia: " + provinciavend,
							"Datos del Cliente", JOptionPane.PLAIN_MESSAGE);

				}
			}
		});

		JButton btnSalir = new JButton("Salir");
		// CREO METODO PARA EL BOTON SALIR
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {
				System.exit(0);
			}
		});

		jPanel3.add(btnCliente);
		jPanel3.add(btnVendedor);
		jPanel3.add(btnSalir);

		// PROPIEDADES DE LA VENTANA
		ventana.setSize(800, 600);
		ventana.setTitle("Clientes");
                
                
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setLayout(new FlowLayout());
		// ventana.add(lblClientestitulo);
		// ventana.add(lblvendedortitulo);
		ventana.add(jPanel1);
		ventana.add(jPanel2);
		ventana.add(jPanel3);
		ventana.setVisible(true);

	}

	@SuppressWarnings("rawtypes")
	public static Map getAttributes() {
		return attributes;
	}

	@SuppressWarnings("rawtypes")
	public static void setAttributes(Map attributes) {
		codoacodo_EjOb_unidad4parte3ej5.attributes = attributes;
	}

	private static class jpanel1 {

		public jpanel1() {
		}
	}

}
