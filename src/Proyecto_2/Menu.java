
/*

    Kendall Andrey Calderón Burgos.

    Proyecto 2. Estructuras de Datos.

    Segundo Cuatrimestre 2024.

*/

//Menú Principal
package Proyecto_2;

//Imports.
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Shape;
import java.awt.geom.Path2D;
import java.util.Arrays;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {

    //Variables.
    int xMouse, yMouse;
    
    //Arreglo
    private Productora[] productoras;
    
    //Gestionar el botón seleccionado.
    private javax.swing.JLabel botonSeleccionado = null;

    //Constructor.
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Sistema de Gestión de Productoras Cinematograficas");
         
        //Redondear bordes de la ventana.
        setShape(createCustomShape(getWidth(), getHeight(), 15));
        
        //Instancias.
        productoras = new Productora[100]; 
        Arrays.fill(productoras, null);
    }
        
    /* - - - - - - - - - - - - - - - - - - - - Métodos - - - - - - - - - - - - - - - - - - - - */
    //Método para cambiar opción.
    private void cambiarOpcion(JPanel opcion) {
        opcion.setSize(1000, 550); //Establece el tamaño de la ventana.
        opcion.setLocation(0, 0); //Establece la posición de la ventana..
        panelPrincipal.removeAll(); //Elimina lo que se muestra en la ventana.
        panelPrincipal.add(opcion, BorderLayout.CENTER); //Agrega la ventana al Jframe.
        panelPrincipal.revalidate(); //Revalida el diseño despues de haber cargado cada componente.
        panelPrincipal.repaint(); //Se repinta la ventana despues de haberlo hecho.
    }
    
    //Design.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        barraSuperior = new javax.swing.JPanel();
        panelSalir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrarProductoras = new javax.swing.JLabel();
        btnRegistroPeliculas = new javax.swing.JLabel();
        btnEliminacionPeliculas = new javax.swing.JLabel();
        btnTrasladoPeliculas = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1000, 640));
        setMinimumSize(new java.awt.Dimension(1000, 640));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 640));
        setResizable(false);

        contenedorPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 66, 66), 2));
        contenedorPrincipal.setMaximumSize(new java.awt.Dimension(1000, 640));
        contenedorPrincipal.setMinimumSize(new java.awt.Dimension(1000, 640));
        contenedorPrincipal.setPreferredSize(new java.awt.Dimension(1000, 640));
        contenedorPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraSuperior.setBackground(new java.awt.Color(66, 66, 66));
        barraSuperior.setAlignmentX(0.0F);
        barraSuperior.setAlignmentY(0.0F);
        barraSuperior.setDoubleBuffered(false);
        barraSuperior.setMaximumSize(new java.awt.Dimension(1000, 90));
        barraSuperior.setMinimumSize(new java.awt.Dimension(1000, 90));
        barraSuperior.setName(""); // NOI18N
        barraSuperior.setPreferredSize(new java.awt.Dimension(1000, 90));
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });

        panelSalir.setAlignmentX(0.0F);
        panelSalir.setAlignmentY(0.0F);
        panelSalir.setOpaque(false);
        panelSalir.setPreferredSize(new java.awt.Dimension(40, 40));

        btnSalir.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(247, 246, 216));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("x");
        btnSalir.setAlignmentY(0.0F);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelSalirLayout = new javax.swing.GroupLayout(panelSalir);
        panelSalir.setLayout(panelSalirLayout);
        panelSalirLayout.setHorizontalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSalirLayout.setVerticalGroup(
            panelSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        Titulo.setBackground(new java.awt.Color(51, 51, 51));
        Titulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Titulo.setForeground(new java.awt.Color(247, 246, 216));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Estructuras de Datos");

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarProductoras.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRegistrarProductoras.setForeground(new java.awt.Color(247, 246, 216));
        btnRegistrarProductoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarProductoras.setText("Registro de Productoras");
        btnRegistrarProductoras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarProductoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarProductorasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarProductorasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarProductorasMouseExited(evt);
            }
        });
        jPanel2.add(btnRegistrarProductoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 5, -1, -1));

        btnRegistroPeliculas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnRegistroPeliculas.setForeground(new java.awt.Color(247, 246, 216));
        btnRegistroPeliculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistroPeliculas.setText("Registro de Películas");
        btnRegistroPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistroPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroPeliculasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistroPeliculasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistroPeliculasMouseExited(evt);
            }
        });
        jPanel2.add(btnRegistroPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 5, -1, -1));

        btnEliminacionPeliculas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminacionPeliculas.setForeground(new java.awt.Color(247, 246, 216));
        btnEliminacionPeliculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminacionPeliculas.setText("Eliminación de Películas");
        btnEliminacionPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminacionPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminacionPeliculasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminacionPeliculasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminacionPeliculasMouseExited(evt);
            }
        });
        jPanel2.add(btnEliminacionPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 5, -1, -1));

        btnTrasladoPeliculas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnTrasladoPeliculas.setForeground(new java.awt.Color(247, 246, 216));
        btnTrasladoPeliculas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTrasladoPeliculas.setText("Traslado de Películas");
        btnTrasladoPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrasladoPeliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrasladoPeliculasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrasladoPeliculasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrasladoPeliculasMouseExited(evt);
            }
        });
        jPanel2.add(btnTrasladoPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 5, -1, -1));

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addGroup(barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(barraSuperiorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        contenedorPrincipal.add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 90));

        panelPrincipal.setBackground(new java.awt.Color(247, 246, 216));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 66, 66), 2));
        panelPrincipal.setForeground(new java.awt.Color(247, 247, 247));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1000, 550));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1000, 550));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 550));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );

        contenedorPrincipal.add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1000, 550));

        getContentPane().add(contenedorPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Crear forma personalizada con esquinas redondeadas solo en la parte superior
    private Shape createCustomShape(int width, int height, int radius) {
        Path2D path = new Path2D.Double();
        
        //Esquinas redondeadas en la parte superior..
        path.moveTo(0, radius); //Mover a la esquina superior izquierda redondeada.
        path.quadTo(0, 0, radius, 0); //Esquina superior izquierda.
        path.lineTo(width - radius, 0); //Línea superior.
        path.quadTo(width, 0, width, radius); //Esquina superior derecha.
        path.lineTo(width, height); //Línea derecha.
        path.lineTo(0, height); //Línea inferior.
        path.closePath(); //Cerrar el camino.
        
        return path;
    }
    
    //Método para actualizar los estilos de los botones.
    private void actualizarEstiloBotones(javax.swing.JLabel boton) {
        //Restablece el estilo del botón anteriormente seleccionado.
        if (botonSeleccionado != null) {
            botonSeleccionado.setForeground(new Color(247, 246, 216));
            botonSeleccionado.setFont(new java.awt.Font("Roboto", java.awt.Font.PLAIN, 14));
            botonSeleccionado.setBorder(null);
        }

        //Aplica el estilo al nuevo botón seleccionado.
        boton.setForeground(new Color(177, 177, 177));
        boton.setFont(new java.awt.Font("Roboto", java.awt.Font.BOLD, 14));
        boton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 177, 177)));

        //Actualiza el botón seleccionado.
        botonSeleccionado = boton;
    }
    
    //Método para aplicar estilo hover a los botones.
    private void aplicarEstiloHover(javax.swing.JLabel boton) {
        // Verificar si el botón no está seleccionado
        if (boton != botonSeleccionado) {
            boton.setForeground(new Color(177, 177, 177));
            boton.setFont(new java.awt.Font("Roboto", java.awt.Font.BOLD, 14));
            boton.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 177, 177)));
        }
    }
    
    //Método para aplicar estilo general a los botones
    private void aplicarEstiloGeneral(javax.swing.JLabel boton) {
        if (boton != botonSeleccionado) {
            boton.setForeground(new Color(247, 246, 216));
            boton.setFont(new java.awt.Font("Roboto", java.awt.Font.PLAIN, 14));
            boton.setBorder(null);
        }
    }
    
    //Diseño y acción de la barra superior.
    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed
        xMouse = evt.getX(); //Guarda la posición x.
        yMouse = evt.getY(); //Guarda la posición y.
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged
        int x = evt.getXOnScreen(); //Guarda la posición x del mouse en la pantalla.
        int y = evt.getYOnScreen(); //Guarda la posición y del mouse en la pantalla.
        this.setLocation(x - xMouse, y - yMouse); //Lo posiciona en la posición indicada.
    }//GEN-LAST:event_barraSuperiorMouseDragged

    //Diseño y acción del botón para Salir.
    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        panelSalir.setOpaque(true);
        panelSalir.setBackground(new Color(247, 83, 96, 255));
        btnSalir.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnSalirMouseEntered
    
    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        panelSalir.setOpaque(false);
        panelSalir.setBackground(new Color(244, 49, 19, 0));
        btnSalir.setForeground(new Color(247, 246, 216));
    }//GEN-LAST:event_btnSalirMouseExited
     
    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        System.exit(0); //Sirve para salir del programa.
    }//GEN-LAST:event_btnSalirMouseClicked

    /* - - - - - - - - - - - - - - - - Diseños de las opciones - - - - - - - - - - - - - - - - */
    //Diseño de Registro de Productoras.
    private void btnRegistrarProductorasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarProductorasMouseEntered
        aplicarEstiloHover(btnRegistrarProductoras);
    }//GEN-LAST:event_btnRegistrarProductorasMouseEntered

    private void btnRegistrarProductorasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarProductorasMouseExited
        aplicarEstiloGeneral(btnRegistrarProductoras);
    }//GEN-LAST:event_btnRegistrarProductorasMouseExited

    //Diseño de Registro de Películas.
    private void btnRegistroPeliculasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroPeliculasMouseEntered
        aplicarEstiloHover(btnRegistroPeliculas);
    }//GEN-LAST:event_btnRegistroPeliculasMouseEntered

    private void btnRegistroPeliculasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroPeliculasMouseExited
        aplicarEstiloGeneral(btnRegistroPeliculas);
    }//GEN-LAST:event_btnRegistroPeliculasMouseExited

    //Diseño de Eliminación de Películas.
    private void btnEliminacionPeliculasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminacionPeliculasMouseEntered
        aplicarEstiloHover(btnEliminacionPeliculas);
    }//GEN-LAST:event_btnEliminacionPeliculasMouseEntered

    private void btnEliminacionPeliculasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminacionPeliculasMouseExited
        aplicarEstiloGeneral(btnEliminacionPeliculas);
    }//GEN-LAST:event_btnEliminacionPeliculasMouseExited

    //Diseño de Traslado de Películas.
    private void btnTrasladoPeliculasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrasladoPeliculasMouseExited
        aplicarEstiloGeneral(btnTrasladoPeliculas);
    }//GEN-LAST:event_btnTrasladoPeliculasMouseExited

    private void btnTrasladoPeliculasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrasladoPeliculasMouseEntered
        aplicarEstiloHover(btnTrasladoPeliculas);
    }//GEN-LAST:event_btnTrasladoPeliculasMouseEntered

    /* - - - - - - - - - - - - - - - - Métodos de las opciones - - - - - - - - - - - - - - - - */
    //Método de Registro de Productoras.
    private void btnRegistrarProductorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarProductorasMouseClicked
        //Actualiza el estilo del botón seleccionado.
        actualizarEstiloBotones(btnRegistrarProductoras);        

        //Crea una instancia de registroProductoras y pasarle el menú actual.
        registroProductoras opcion = new registroProductoras(productoras);

        //Cambia la ventana a Registro de Productoras.
        cambiarOpcion(opcion);
    }//GEN-LAST:event_btnRegistrarProductorasMouseClicked

    //Método de Registro de Películas.
    private void btnRegistroPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroPeliculasMouseClicked
        //Actualiza el estilo del botón seleccionado.
        actualizarEstiloBotones(btnRegistroPeliculas);        

        //Crea una instancia de registroProductoras y pasarle el menú actual.
        registroPeiculas opcion = new registroPeiculas(productoras);
        
        //Cambia la ventana a Registro de Películas.
        cambiarOpcion(opcion);
    }//GEN-LAST:event_btnRegistroPeliculasMouseClicked

    //Método de Eliminación de Películas.
    private void btnEliminacionPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminacionPeliculasMouseClicked
        //Actualiza el estilo del botón seleccionado.
        actualizarEstiloBotones(btnEliminacionPeliculas);        

        //Crea una instancia de registroProductoras y pasarle el menú actual.
        eliminacionPeliculas opcion = new eliminacionPeliculas(productoras);
        
        //Cambia la ventana a Eliminación de Películas.
        cambiarOpcion(opcion);
    }//GEN-LAST:event_btnEliminacionPeliculasMouseClicked

    //Método de Traslado de Películas.
    private void btnTrasladoPeliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrasladoPeliculasMouseClicked
        //Actualiza el estilo del botón seleccionado.
        actualizarEstiloBotones(btnTrasladoPeliculas);        

        //Crea una instancia de registroProductoras y pasarle el menú actual.
        trasladoPeliculas opcion = new trasladoPeliculas(productoras);
 
        //Cambia la ventana a Traslado de Películas.
        cambiarOpcion(opcion);
    }//GEN-LAST:event_btnTrasladoPeliculasMouseClicked

   
    //Main.
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JLabel btnEliminacionPeliculas;
    private javax.swing.JLabel btnRegistrarProductoras;
    private javax.swing.JLabel btnRegistroPeliculas;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnTrasladoPeliculas;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSalir;
    // End of variables declaration//GEN-END:variables
}