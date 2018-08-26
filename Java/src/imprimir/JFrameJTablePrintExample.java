/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimir;

/**
 *
 * @author Jesus Arias
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
 
/**
 * We created a simple table with data to show as directly print the contents 
 * of the table by printer.
 * Creamos una tabla con datos sencilla para mostrar como imprimir directamente 
 * el contenido de la tabla por impresora.
 * 
 * @author xules You can follow me on my website http://www.codigoxules.org/en
 * Puedes seguirme en mi web http://www.codigoxules.org
 */
public class JFrameJTablePrintExample extends javax.swing.JFrame {
 
    /**
     * Creates new form JFrameJTablePrintExample.
     * Creamos un nuevo form JFrameJTablePrintExample.
     */
    public JFrameJTablePrintExample() {
        initComponents();
        setLocationCenter();
        setVisible(true);
    }
    /**
     * Set the JFrame in the center of the screen. Colocamos nuestro JFrame en
     * el centro de la pantalla.
     */
    public void setLocationCenter() {
        setLocationMove(0, 0);
    }
 
    /**
     * Place the JFrame with the parameters by moving the component relative to
     * the center of the screen. Colocamos el JFrame con los parámetros
     * desplazando el componente respecto al centro de la pantalla.
     *
     * @param moveWidth int positive or negative offset width (desplazamiente de
     * width positivo o negativo).
     * @param moveHeight int Positive or negative offset height (desplazamiento
     * de height positivo o negativo).
     */
    public void setLocationMove(int moveWidth, int moveHeight) {
        // Obtenemos el tamaño de la pantalla.
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Obtenemos el tamaño de nuestro frame.
        Dimension frameSize = this.getSize();
        frameSize.width = frameSize.width > screenSize.width ? screenSize.width : frameSize.width;
        frameSize.height = frameSize.height > screenSize.height ? screenSize.height : frameSize.height;
        // We define the location. Definimos la localización.
        setLocation((screenSize.width - frameSize.width) / 2 + moveWidth, (screenSize.height - frameSize.height) / 2 + moveHeight);
    }
 
    /**
     * Standard method to print a JTable to the printer directly..
     * Método estándar para imprimir un JTable por la impresora directamente.
     * <h3>Example (Ejemplo)</h3>
     * <pre>
     *      utilJTablePrint(jTable2, getTitle(), "Código Xules", true);
     * </pre>
     *
     * @param jTable <code>JTable</code> 
     *      the JTable we are going to extract to excel 
     *      El Jtable que vamos a extraer a excel.
     * @param header <code>String</code>
     *      Header to print in the document.
     *      Cabecera que imprimiremos en el documento.
     * @param footer <code>String</code>
     *      Footer to print in the document.
     *      Pie de página que imprimiremos en el documento.
     * @param showPrintDialog  <code>boolean</code>
     *      To show or not the print dialog.
     *      Mostramos o no el diálogo de impresión.
     */
    public void utilJTablePrint(JTable jTable, String header, String footer, boolean showPrintDialog){
        boolean fitWidth = true;
        boolean interactive = true;
        // We define the print mode (Definimos el modo de impresión)
        JTable.PrintMode mode = fitWidth ? JTable.PrintMode.FIT_WIDTH : JTable.PrintMode.NORMAL;
        try {
            // Print the table (Imprimo la tabla)             
            boolean complete = jTable.print(mode,
                    new MessageFormat(header),
                    new MessageFormat(footer),
                    showPrintDialog,
                    null,
                    interactive);
            if (complete) {
                // Mostramos el mensaje de impresión existosa
                JOptionPane.showMessageDialog(jTable,
                        "Print complete (Impresión completa)",
                        "Print result (Resultado de la impresión)",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mostramos un mensaje indicando que la impresión fue cancelada                 
                JOptionPane.showMessageDialog(jTable,
                        "Print canceled (Impresión cancelada)",
                        "Print result (Resultado de la impresión)",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (PrinterException pe) {
            JOptionPane.showMessageDialog(jTable,
                    "Print fail (Fallo de impresión): " + pe.getMessage(),
                    "Print result (Resultado de la impresión)",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
 
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IMPRESIÓN DE TABLA POR IMPRESORA");
 
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Imprimimos la tabla por la impresora"));
 
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"7890", "José", "Novoa", "45866321d", "Encrucijada 2, 2º E Madrid"},
                {"5896", "Jan", "Ruiz", "78451245d", "Etiopía 3, 4ºW , Vigo"},
                {"2569", "Xian", "Iconic", "89562323e", "Salamanca 45, 3ºS, Santiago"},
                {"2548", "Pep", "Mac", "85963966e", "Barcelona, nº123, 3ºS, Girona"}
            },
            new String [] {
                "CLIENTE", "NOMBRE", "APELLIDOS", "DNI", "DIRECCIÓN"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
 
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
 
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
 
        jButton2.setText("IMPRIMIR POR IMPRESORA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(18, Short.MAX_VALUE))
        );
 
        pack();
    }// </editor-fold>                        
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        utilJTablePrint(jTable1, getTitle(), "Código Xules", true);
    }
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }
 
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
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameJTablePrintExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameJTablePrintExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameJTablePrintExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameJTablePrintExample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameJTablePrintExample().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}
