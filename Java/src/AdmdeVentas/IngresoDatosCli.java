/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AdmdeVentas;

import Codoacodo.codoacodo_EjOb_unidad4parte3ej5;
import static Codoacodo.codoacodo_EjOb_unidad4parte3ej5.getAttributes;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus Arias
 */


public class IngresoDatosCli extends javax.swing.JFrame {
   ////TablaD tabladat=null;
    /** Creates new form IngresoDatosCli */
   
   // ArrayList<Clientes>lista =new ArrayList<Clientes>();
   
    
    
    
    
    
    
    public IngresoDatosCli() {
        initComponents();
        
        //  tblDatos.setModel(tabladatos);
   
        
    }
       TablaD x=new TablaD();
    public static String nombre,apellido,fechadenacimiento,dni,sexo,estado,hijos,estudios,direccion,cp,provincia,pais;
     //public static int tabla=1;   
       //
      
        
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nombreCli = new javax.swing.JTextField();
        apellidoCli = new javax.swing.JTextField();
        Sexocli = new javax.swing.JComboBox<>();
        EstadoCli = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        HijosCli = new javax.swing.JComboBox<>();
        EstudiosCli = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DatosCli = new javax.swing.JTextArea();
        btnCliente = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        dianacCli = new javax.swing.JComboBox<>();
        mesnacCli = new javax.swing.JComboBox<>();
        anionacCli = new javax.swing.JComboBox<>();
        DireccionCli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CPCli = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        PaisCli = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ProvinciaCli = new javax.swing.JComboBox<>();
        guardarT = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        DniCli = new javax.swing.JTextField();

        jLabel7.setText("jLabel7");

        jTextField3.setText("jTextField3");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("jLabel12");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos");

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setText("Datos Clientes");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellido");

        jLabel5.setText("Sexo");

        jLabel6.setText("Estado civil");

        nombreCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCliActionPerformed(evt);
            }
        });

        apellidoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoCliActionPerformed(evt);
            }
        });

        Sexocli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));

        EstadoCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltera/o", "Casada/o" }));
        EstadoCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadoCliActionPerformed(evt);
            }
        });

        jLabel8.setText("Hijos");

        jLabel9.setText("Estudios");

        jLabel10.setText("Direcc�n");

        HijosCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        HijosCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HijosCliActionPerformed(evt);
            }
        });

        EstudiosCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primario", "Secundario", "Terciario", "Universitario" }));
        EstudiosCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstudiosCliActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Seleccionados"));

        DatosCli.setColumns(20);
        DatosCli.setRows(5);
        DatosCli.setToolTipText("");
        jScrollPane1.setViewportView(DatosCli);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnCliente.setText("Aplicar");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Fecha de Nacimiento");

        dianacCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dianacCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dianacCliActionPerformed(evt);
            }
        });

        mesnacCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        mesnacCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesnacCliActionPerformed(evt);
            }
        });

        anionacCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));
        anionacCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anionacCliActionPerformed(evt);
            }
        });

        DireccionCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionCliActionPerformed(evt);
            }
        });

        jLabel2.setText("Provincia");

        CPCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPCliActionPerformed(evt);
            }
        });

        jLabel13.setText("CP");

        jLabel14.setText("Pais");

        ProvinciaCli.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CABA", "Buenos Aires", "Catamarca", "Chaco", "Chubut", "C�rdoba", "Corrientes", "Entre R�os", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuqu�n", "R�o Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucum�n" }));
        ProvinciaCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProvinciaCliActionPerformed(evt);
            }
        });

        guardarT.setText("Guardar");
        guardarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarTActionPerformed(evt);
            }
        });

        jLabel15.setText("DNI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(apellidoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PaisCli)
                                            .addComponent(CPCli)
                                            .addComponent(ProvinciaCli, 0, 127, Short.MAX_VALUE)
                                            .addComponent(DniCli)))
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(DireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Sexocli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(HijosCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EstudiosCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(EstadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dianacCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(mesnacCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(anionacCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnCliente)
                                .addGap(84, 84, 84)
                                .addComponent(jButton2)
                                .addGap(84, 84, 84)
                                .addComponent(guardarT))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15)))
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombreCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(apellidoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dianacCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesnacCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(anionacCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(DireccionCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Sexocli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ProvinciaCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(EstadoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CPCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(EstudiosCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(PaisCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(HijosCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(DniCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCliente)
                    .addComponent(jButton2)
                    .addComponent(guardarT))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoCliActionPerformed

    private void EstudiosCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstudiosCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstudiosCliActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    nombreCli.setText("");
    DatosCli.setText("");
    apellidoCli.setText("");
    DireccionCli.setText("");
    CPCli.setText("");   
    PaisCli.setText("");
    DniCli.setText("");
    dianacCli.setSelectedIndex(0);
    mesnacCli.setSelectedIndex(0);
    anionacCli.setSelectedIndex(0);
    EstadoCli.setSelectedIndex(0); 
    EstudiosCli.setSelectedIndex(0);
    HijosCli.setSelectedIndex(0);
    Sexocli.setSelectedIndex(0); 
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void anionacCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anionacCliActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_anionacCliActionPerformed

    private void dianacCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dianacCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dianacCliActionPerformed

    private void mesnacCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesnacCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesnacCliActionPerformed

    private void HijosCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HijosCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HijosCliActionPerformed

    private void DireccionCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionCliActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed

				// nombre y apellido

				if (evt.getSource() == btnCliente) {
					//String nombreClie = nombreCli.setText("").toString();;
					//String apellidoClie = apellidoCli.getSelectedText();
					String dianacClie = dianacCli.getSelectedItem().toString();
					String mesnacClie = mesnacCli.getSelectedItem().toString();
					String anionacClie = anionacCli.getSelectedItem().toString();
                			String sexoclie = Sexocli.getSelectedItem().toString();
                                        String estadoClie = EstadoCli.getSelectedItem().toString();
                                        String hijosClie = HijosCli.getSelectedItem().toString();
                                        String estudiosClie = EstudiosCli.getSelectedItem().toString();
                                        String ProvinciaClie = ProvinciaCli.getSelectedItem().toString();
					//String DireccionClie = DireccionCli.getSelectedText();
					//ingresa los datos a JtextArea
                                       DatosCli.append("Nombre: " + nombreCli.getText() + "\nApellido: " + apellidoCli.getText() + "\nFecha de Nacimiento: "
									+ dianacClie + "/" + mesnacClie + "/" + anionacClie +"\nSexo: "+ sexoclie +"\nDNI: "+DniCli.getText() +"\nEstado Civil: "+estadoClie +"\nCantidad de Hijos: "+ hijosClie+"\nEstudios: "+estudiosClie+ "\nDireccion: "+DireccionCli.getText()+ "\nProvincia: "+ProvinciaClie+ "\nCodigo Postal: "+CPCli.getText()+ "\nPais: "+PaisCli.getText());
					
				}        String FechaNac =  dianacCli.getSelectedItem().toString()+mesnacCli.getSelectedItem().toString()+anionacCli.getSelectedItem().toString();
			             String fechadenacimiento =  dianacCli.getSelectedItem().toString()+mesnacCli.getSelectedItem().toString()+anionacCli.getSelectedItem().toString();


        // TODO add your handling code here:
    }//GEN-LAST:event_btnClienteActionPerformed

    private void EstadoCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadoCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstadoCliActionPerformed

    private void CPCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CPCliActionPerformed

    private void ProvinciaCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProvinciaCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProvinciaCliActionPerformed

    private void nombreCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreCliActionPerformed
public int tabla=1;
    private void guardarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarTActionPerformed

      
     nombre=nombreCli.getText();
     apellido=apellidoCli.getText();
     direccion=DireccionCli.getText();
     fechadenacimiento =  dianacCli.getSelectedItem().toString()+mesnacCli.getSelectedItem().toString()+anionacCli.getSelectedItem().toString();
     dni= DniCli.getText();
     sexo=Sexocli.getSelectedItem().toString();
     estado=EstadoCli.getSelectedItem().toString();
     hijos=HijosCli.getSelectedItem().toString();
     estudios=EstudiosCli.getSelectedItem().toString();       
     direccion=DireccionCli.getText();
     cp=CPCli.getText();
     provincia=ProvinciaCli.getSelectedItem().toString();
     pais=PaisCli.getText();
     
//x.setVisible(true);
     
     
      
     
        Object fe[]={tabla,nombre,apellido,fechadenacimiento,dni,sexo,estado,hijos,estudios,direccion,cp,provincia,pais};
        
        x.tabladatos.addRow(fe);
        
        nombreCli.setText("");
        apellidoCli.setText("");
        
        
        tabla++;
  
  x.setVisible(true);
      
        
// TODO add your handling code here:
    }//GEN-LAST:event_guardarTActionPerformed

   /*
    public void pasarDatos(JTable ta){
     String [] columnas = {"columna1","columna2"};
     DefaultTableModel dtm = new DefaultTableModel(null,columnas); 
    String[] filas={"fila1","fila2"};
    dtm.addRow(filas);
    ta.setModel(dtm);
    }
   
    */
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IngresoDatosCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoDatosCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoDatosCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoDatosCli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoDatosCli().setVisible(true);
            }
        });
    }

    private String JTextArea(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	private static class jpanel1 {

		public jpanel1() {
		}
	}
        
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPCli;
    public javax.swing.JTextArea DatosCli;
    private javax.swing.JTextField DireccionCli;
    private javax.swing.JTextField DniCli;
    private javax.swing.JComboBox<String> EstadoCli;
    private javax.swing.JComboBox<String> EstudiosCli;
    private javax.swing.JComboBox<String> HijosCli;
    private javax.swing.JTextField PaisCli;
    private javax.swing.JComboBox<String> ProvinciaCli;
    private javax.swing.JComboBox<String> Sexocli;
    private javax.swing.JComboBox<String> anionacCli;
    public javax.swing.JTextField apellidoCli;
    public javax.swing.JButton btnCliente;
    private javax.swing.JComboBox<String> dianacCli;
    private javax.swing.JButton guardarT;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> mesnacCli;
    public javax.swing.JTextField nombreCli;
    // End of variables declaration//GEN-END:variables

}
