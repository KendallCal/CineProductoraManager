//Traslado de Películas.
package Proyecto_2;

//Imports.
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class trasladoPeliculas extends javax.swing.JPanel {

    //Instancia los datos.
    private Productora[] productoras;
    private Productora productoraOrigenSeleccionada;
    private Productora productoraDestinoSeleccionada;

    //Constructor.
    public trasladoPeliculas(Productora[] productoras) {
        initComponents();

        //Guaarda los datos del menú.
        this.productoras = productoras;

        //Carga la lista de productoras en los JComboBox.
        cargarProductorasCombo();
    }

    //Método para cargar los datos al JComboBox.
    private void cargarProductorasCombo() {
        //Elimina los items que existan.
        productoraOrigen.removeAllItems();
        productoraDestino.removeAllItems();

        //Recorre el arreglo y agrega cada item a los combobox.
        for (Productora productora : productoras) {
            if (productora != null) {
                productoraOrigen.addItem(productora.getDescripcion());
                productoraDestino.addItem(productora.getDescripcion());
            }
        }
    }
    
    //Método para actualizar el JLabel que muestra que productora se esta mostrando.
    private void actualizarTituloProductora(Productora productora, String tipo) {
        tituloProductora.setText("Productora " + tipo + ": " + productora.getDescripcion());
    }
    
    //Método para actualizar la tabla
    private void actualizarTabla(Productora productora) {
        //Limpia la tabla.
        DefaultTableModel model = (DefaultTableModel) tabla.getModel();
        model.setRowCount(0);
        
        //Recorre y agrega las peliculas.
        for (Pelicula pelicula : productora.getPeliculas()) {
            //Agrega las productoras a la fila.
            model.addRow(new Object[]{pelicula.getDni(), pelicula.getNombre(), pelicula.getGenero(), pelicula.getTipoAudiencia()});
        }
    }

    //Desgin,
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        contenedorTraslado = new javax.swing.JPanel();
        panelProductoraOrigen = new javax.swing.JPanel();
        tituloProductoraOrigen = new javax.swing.JLabel();
        productoraOrigen = new javax.swing.JComboBox<>();
        panelProductoraDestino = new javax.swing.JPanel();
        tituloProductoraDestino = new javax.swing.JLabel();
        productoraDestino = new javax.swing.JComboBox<>();
        panelTrasladarBTN = new javax.swing.JPanel();
        btnTrasladar = new javax.swing.JLabel();
        tituloProductora = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setMaximumSize(new java.awt.Dimension(940, 580));
        setMinimumSize(new java.awt.Dimension(940, 580));
        setPreferredSize(new java.awt.Dimension(940, 580));
        setLayout(new java.awt.BorderLayout());

        panelPrincipal.setBackground(new java.awt.Color(247, 246, 216));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 66, 66), 2));
        panelPrincipal.setForeground(new java.awt.Color(242, 242, 242));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(940, 580));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(940, 580));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(940, 580));

        contenedorTraslado.setMaximumSize(new java.awt.Dimension(946, 567));
        contenedorTraslado.setMinimumSize(new java.awt.Dimension(946, 567));
        contenedorTraslado.setName(""); // NOI18N
        contenedorTraslado.setOpaque(false);
        contenedorTraslado.setPreferredSize(new java.awt.Dimension(946, 567));
        contenedorTraslado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 200, 5));

        panelProductoraOrigen.setMaximumSize(new java.awt.Dimension(145, 74));
        panelProductoraOrigen.setMinimumSize(new java.awt.Dimension(145, 74));
        panelProductoraOrigen.setOpaque(false);
        panelProductoraOrigen.setPreferredSize(new java.awt.Dimension(200, 74));

        tituloProductoraOrigen.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        tituloProductoraOrigen.setForeground(new java.awt.Color(0, 0, 0));
        tituloProductoraOrigen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloProductoraOrigen.setText("Productora Origen");
        tituloProductoraOrigen.setMaximumSize(new java.awt.Dimension(190, 25));
        tituloProductoraOrigen.setMinimumSize(new java.awt.Dimension(130, 25));
        tituloProductoraOrigen.setPreferredSize(new java.awt.Dimension(190, 25));
        panelProductoraOrigen.add(tituloProductoraOrigen);

        productoraOrigen.setBackground(new java.awt.Color(255, 255, 255));
        productoraOrigen.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        productoraOrigen.setForeground(new java.awt.Color(0, 0, 0));
        productoraOrigen.setPreferredSize(new java.awt.Dimension(180, 25));
        productoraOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoraOrigenActionPerformed(evt);
            }
        });
        panelProductoraOrigen.add(productoraOrigen);

        contenedorTraslado.add(panelProductoraOrigen);

        panelProductoraDestino.setMaximumSize(new java.awt.Dimension(145, 74));
        panelProductoraDestino.setMinimumSize(new java.awt.Dimension(145, 74));
        panelProductoraDestino.setOpaque(false);
        panelProductoraDestino.setPreferredSize(new java.awt.Dimension(200, 74));

        tituloProductoraDestino.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        tituloProductoraDestino.setForeground(new java.awt.Color(0, 0, 0));
        tituloProductoraDestino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloProductoraDestino.setText("Productora Destino");
        tituloProductoraDestino.setMaximumSize(new java.awt.Dimension(190, 25));
        tituloProductoraDestino.setMinimumSize(new java.awt.Dimension(130, 25));
        tituloProductoraDestino.setPreferredSize(new java.awt.Dimension(190, 25));
        panelProductoraDestino.add(tituloProductoraDestino);

        productoraDestino.setBackground(new java.awt.Color(255, 255, 255));
        productoraDestino.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        productoraDestino.setForeground(new java.awt.Color(0, 0, 0));
        productoraDestino.setPreferredSize(new java.awt.Dimension(180, 25));
        productoraDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoraDestinoActionPerformed(evt);
            }
        });
        panelProductoraDestino.add(productoraDestino);

        contenedorTraslado.add(panelProductoraDestino);

        panelTrasladarBTN.setBackground(new java.awt.Color(255, 255, 255));
        panelTrasladarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTrasladarBTN.setPreferredSize(new java.awt.Dimension(150, 40));
        panelTrasladarBTN.setLayout(new java.awt.BorderLayout());

        btnTrasladar.setBackground(new java.awt.Color(255, 255, 255));
        btnTrasladar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnTrasladar.setForeground(new java.awt.Color(0, 0, 0));
        btnTrasladar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTrasladar.setText("Trasladar");
        btnTrasladar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTrasladar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrasladarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrasladarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrasladarMouseExited(evt);
            }
        });
        panelTrasladarBTN.add(btnTrasladar, java.awt.BorderLayout.CENTER);

        contenedorTraslado.add(panelTrasladarBTN);

        tituloProductora.setBackground(new java.awt.Color(0, 0, 0));
        tituloProductora.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tituloProductora.setForeground(new java.awt.Color(0, 0, 0));

        tabla.setBackground(new java.awt.Color(204, 204, 204));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI de Película", "Nombre de la Película", "Género de la Pelicula", "Tipo de Audiencia"
            }
        ));
        jScrollPane.setViewportView(tabla);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(contenedorTraslado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tituloProductora)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(contenedorTraslado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(tituloProductora)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        add(panelPrincipal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    //Diseño del botón Trasladar.
    private void btnTrasladarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrasladarMouseExited
        panelTrasladarBTN.setBackground(new Color(255, 255, 255));
        btnTrasladar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnTrasladarMouseExited

    private void btnTrasladarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrasladarMouseEntered
        panelTrasladarBTN.setBackground(new Color(0, 153, 153));
        btnTrasladar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnTrasladarMouseEntered

    //Botón Trasladar.
    private void btnTrasladarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrasladarMouseClicked
        //Captura los datos.
        int indiceOrigen = productoraOrigen.getSelectedIndex();
        int indiceDestino = productoraDestino.getSelectedIndex();

        //Valida que se seleccionen productoras.
        if (indiceOrigen < 0 || indiceDestino < 0) {
            JOptionPane.showMessageDialog(this, "Seleccione ambas productoras.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Valida que se seleccionen productoras diferentes.
        if (indiceOrigen == indiceDestino) {
            JOptionPane.showMessageDialog(this, "Seleccione productoras diferentes.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Guarda los indices de donde esta cada productora.
        productoraOrigenSeleccionada = productoras[indiceOrigen];
        productoraDestinoSeleccionada = productoras[indiceDestino];

        //Valida que la productora Origen tenga películas.
        if (productoraOrigenSeleccionada.getTamanioPila() == 0) {
            JOptionPane.showMessageDialog(this, "La productora origen no tiene películas.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Bool de si se traslado correctamente o no.
        boolean trasladoExitoso = true;
        
        //Bucle
        while (productoraOrigenSeleccionada.getTamanioPila() > 0) {
            Pelicula pelicula = productoraOrigenSeleccionada.eliminarPrimeraPelicula();
            if (!productoraDestinoSeleccionada.agregarPelicula(pelicula)) {
                
                //Si no se puede agregar la película, se devuelve a la productora origen.
                productoraOrigenSeleccionada.agregarPelicula(pelicula);
                trasladoExitoso = false;
                break;
            }
        }

        //Si se logro trasladar correctamente.
        if (trasladoExitoso) {
            JOptionPane.showMessageDialog(this, "Películas trasladadas exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            
            //Actualizar el título del panel con la productora destino seleccionada.
            actualizarTituloProductora(productoraDestinoSeleccionada, "Resultante");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudieron trasladar todas las películas. La productora destino está llena.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        //Actualiza la tabla.
        actualizarTabla(productoraDestinoSeleccionada);
    }//GEN-LAST:event_btnTrasladarMouseClicked

    //ActionPerformed del JComboBox Productora Origen.
    private void productoraOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoraOrigenActionPerformed
        //Captura los datos.
        int indiceOrigen = productoraOrigen.getSelectedIndex();
        
        //Si la productora es valida.
        if (indiceOrigen >= 0) {
            //Guarda la productora seleccionada.
            productoraOrigenSeleccionada = productoras[indiceOrigen];
            
            //Actualiza la tabla con la productora Origen.
            actualizarTabla(productoraOrigenSeleccionada);
            
            //Actualiza el JLabel con el nombre de la productora Origen.
            actualizarTituloProductora(productoraOrigenSeleccionada, "Origen");
        }
    }//GEN-LAST:event_productoraOrigenActionPerformed

    //ActionPerformed del JComboBox Productora Destino.
    private void productoraDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoraDestinoActionPerformed
        //Captura los datos.
        int indiceDestino = productoraDestino.getSelectedIndex();
        
        //Si la productora es valida.
        if (indiceDestino >= 0 && productoras[indiceDestino] != null) {
            //Guarda la productora seleccionada.
            productoraDestinoSeleccionada = productoras[indiceDestino];
            
            //Actualiza la tabla con la productora Origen.
            actualizarTabla(productoraDestinoSeleccionada);
            
            //Actualiza el JLabel con el nombre de la productora Origen.
            actualizarTituloProductora(productoraDestinoSeleccionada, "Destino");
        }
    }//GEN-LAST:event_productoraDestinoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnTrasladar;
    private javax.swing.JPanel contenedorTraslado;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelProductoraDestino;
    private javax.swing.JPanel panelProductoraOrigen;
    private javax.swing.JPanel panelTrasladarBTN;
    private javax.swing.JComboBox<String> productoraDestino;
    private javax.swing.JComboBox<String> productoraOrigen;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel tituloProductora;
    private javax.swing.JLabel tituloProductoraDestino;
    private javax.swing.JLabel tituloProductoraOrigen;
    // End of variables declaration//GEN-END:variables
}
