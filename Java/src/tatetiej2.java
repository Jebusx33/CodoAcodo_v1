
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *creado el 14-oct-2015
 * Daniel Diaz
 */
public class tatetiej2 extends javax.swing.JFrame 
{
    int turno,contp,contimp;
    boolean gano=false;//indica si ya hubo o no triky
    public JLabel[][] cuadros;//matriz para guardar los label
    public Color colorx=Color.red;//indica el color de la letra X
    public Color coloro=Color.YELLOW;//indica el color de la letra O

    public tatetiej2() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        turno=contp=contimp=1;
        cuadros=new JLabel[][]{{c1,c2,c3},{c4,c5,c6},{c7,c8,c9}};//Este arreglo almacena lo label

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        c6 = new javax.swing.JLabel();
        c7 = new javax.swing.JLabel();
        c8 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        c1.setBackground(new java.awt.Color(0, 153, 153));
        c1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c1.setOpaque(true);
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1MouseClicked(evt);
            }
        });
        jPanel1.add(c1);

        c2.setBackground(new java.awt.Color(0, 153, 153));
        c2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c2.setOpaque(true);
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2MouseClicked(evt);
            }
        });
        jPanel1.add(c2);

        c3.setBackground(new java.awt.Color(0, 153, 153));
        c3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c3.setOpaque(true);
        c3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c3MouseClicked(evt);
            }
        });
        jPanel1.add(c3);

        c4.setBackground(new java.awt.Color(0, 153, 153));
        c4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c4.setOpaque(true);
        c4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c4MouseClicked(evt);
            }
        });
        jPanel1.add(c4);

        c5.setBackground(new java.awt.Color(0, 153, 153));
        c5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c5.setOpaque(true);
        c5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c5MouseClicked(evt);
            }
        });
        jPanel1.add(c5);

        c6.setBackground(new java.awt.Color(0, 153, 153));
        c6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        c6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c6.setOpaque(true);
        c6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c6MouseClicked(evt);
            }
        });
        jPanel1.add(c6);

        c7.setBackground(new java.awt.Color(0, 153, 153));
        c7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        c7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c7.setOpaque(true);
        c7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c7MouseClicked(evt);
            }
        });
        jPanel1.add(c7);

        c8.setBackground(new java.awt.Color(0, 153, 153));
        c8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        c8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c8.setOpaque(true);
        c8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c8MouseClicked(evt);
            }
        });
        jPanel1.add(c8);

        c9.setBackground(new java.awt.Color(0, 153, 153));
        c9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        c9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        c9.setOpaque(true);
        c9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c9MouseClicked(evt);
            }
        });
        jPanel1.add(c9);

        jMenu1.setText("nuevo");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void c1MouseClicked(java.awt.event.MouseEvent evt) {                                
        Dato(c1);
    }                               

    private void c2MouseClicked(java.awt.event.MouseEvent evt) {                                
        Dato(c2);
    }                               

    private void c3MouseClicked(java.awt.event.MouseEvent evt) {                                
        Dato(c3);
    }                               

    private void c4MouseClicked(java.awt.event.MouseEvent evt) {                                
        Dato(c4);
    }                               

    private void c5MouseClicked(java.awt.event.MouseEvent evt) {                                
        Dato(c5);
    }                               

    private void c6MouseClicked(java.awt.event.MouseEvent evt) {                                
        Dato(c6);
    }                               

    private void c7MouseClicked(java.awt.event.MouseEvent evt) {                                
        Dato(c7);
    }                               

    private void c8MouseClicked(java.awt.event.MouseEvent evt) {                                
        Dato(c8);
    }                               

    private void c9MouseClicked(java.awt.event.MouseEvent evt) {                                
        Dato(c9);
    }                               

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {                                    
       nuevo();
    }                                   
    public void Dato(JLabel cuadro) 
    {
        if (!gano)//verifica si no se gano el juego 
        {
            if(cuadro.getText().equals(""))//comprueba que el label no tenga letras
            {
                if (turno%2==1)//verifica el valor del turno para saber que letra asigna 
                {
                    cuadro.setText("x");
                    cuadro.setForeground(colorx);//asigna el color a la letra x
                    if (contimp>=3)//comprueba que ya esten almenos 3 x en el tablero 
                    {
                        verificar("x");//verifica si la x ya esta en triky
                        
                    }
                    contimp++;//cuenta las x
                } 
                else
                {
                    cuadro.setText("o");
                    cuadro.setForeground(coloro);//asigna el color a la letra x
                    if (contp>=3) //comprueba que ya esten almenos 3 0 en el tablero 
                    {
                        verificar("o");//verifica si la o ya esta en triky
                    }
                    contp++;
                }
                turno++;//cuenta las o
            }
        }        
    }
    public void verificar(String parametro) 
    {
        int contador=0;
        int a,b;  
        boolean reinicio=false;//inidica si ya se reinicio el juego
        for (int x = 0; x < 2; x++) 
        {
            for (int i = 0; i < cuadros.length; i++) 
            {  
                for (int j = 0; j < cuadros.length; j++) 
                {
                    if (x==0) {
                      a=i;//posicion de la fila
                      b=j;//posicion de la columna 
                    }else
                    {
                        a=j;//posicion de la fila
                        b=i;//posicion de la columna 
                    }
                    if (cuadros[a][b].getText().equals(parametro)) {
                        contador++;//cuenta las de una misma letra
                    }
                }
                if (!gano&&contador==3) 
                {
                    JOptionPane.showMessageDialog(null, "Triky");
                    if(JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ")==0)
                    {
                        nuevo();//reinicia el juego
                        reinicio=true;//inidica q el juego se reinicio
                    }
                    else
                    {
                        gano=false;                        
                    }
                    break;
                }
                contador=0;
            } 
        }
        if (!reinicio) {
            int pos;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < cuadros.length; j++) {
                   if (i==0) {
                        pos=j;
                    } else {
                        pos=2-j;
                    }
                    if (cuadros[j][pos].getText().equals(parametro)) {
                        contador++;
                    }
                }
                if (contador==3) {
                    JOptionPane.showMessageDialog(null, "Triky");
                    if(JOptionPane.showConfirmDialog(null, "Desea iniciar un nuevo juego? ")==0)
                    {
                        nuevo();
                        break;
                    }
                    else
                    {
                        gano=false;
                        break;
                    }
                }
                contador=0;
            }
        }
    }
    //Esta funcion reinicia el juego
    public void nuevo() {
        gano=false;
        turno=contp=contimp=2;
        Color colorx=Color.red;
        Color coloro=Color.YELLOW;
        for (int i = 0; i < cuadros.length; i++) {
            for (int j = 0; j < cuadros.length; j++) {
                cuadros[i][j].setText("");
            }
        }
    }

    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(tatetiej2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tatetiej2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tatetiej2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tatetiej2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new tatetiej2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    javax.swing.JLabel c1;
    javax.swing.JLabel c2;
    javax.swing.JLabel c3;
    javax.swing.JLabel c4;
    javax.swing.JLabel c5;
    javax.swing.JLabel c6;
    javax.swing.JLabel c7;
    javax.swing.JLabel c8;
    javax.swing.JLabel c9;
    javax.swing.JMenu jMenu1;
    javax.swing.JMenuBar jMenuBar1;
    javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
