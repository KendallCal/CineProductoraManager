
//Eliminación de Películas.

package Proyecto_2;

//Imports.
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class eliminacionPeliculas extends javax.swing.JPanel {
    
    //Instancia los datos.
    private Productora[] productoras;
    private Productora productoraSeleccionada;
    
    //Constructor.
    public eliminacionPeliculas(Productora[] productoras) {
        initComponents();
        
        //Guaarda los datos del menú.
        this.productoras = productoras;
        
        //Carga la lista de productoras en el JComboBox.
        cargarProductorasCombo();
    }

    //Método para cargar las productoras en el JComboBox.
    private void cargarProductorasCombo() {
        //Elimina todos los items.
        productorasCombo.removeAllItems();
        
        //Recorre y agrega las productoras.
        for (Productora productora : productoras) {
            if (productora != null) {
                productorasCombo.addItem(productora.getDescripcion());
            }
        }
    }
    
    //Método para cargar películas en el JTable.
    private void actualizarTabla(Productora productora) {
        //Limpiar la tabla.
        DefaultTableModel model = (DefaultTableModel) tablaPeliculas.getModel();
        model.setRowCount(0); 
        
        //Recorre y agrega las peliculas.
        for (Pelicula pelicula : productora.getPeliculas()) {
            if (pelicula != null) {
                //Agrega las productoras a la fila.
                model.addRow(new Object[]{pelicula.getDni(), pelicula.getNombre(), pelicula.getGenero(), pelicula.getTipoAudiencia()});
            }
        }
    }
    
    //Desgin,
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        contenedorProductoras = new javax.swing.JPanel();
        panelProductoras = new javax.swing.JPanel();
        tituloProductoras = new javax.swing.JLabel();
        productorasCombo = new javax.swing.JComboBox<>();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPeliculas = new javax.swing.JTable();
        panelEliminarBTN = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 550));
        setMinimumSize(new java.awt.Dimension(1000, 550));
        setPreferredSize(new java.awt.Dimension(1000, 550));
        setLayout(new java.awt.BorderLayout());

        panelPrincipal.setBackground(new java.awt.Color(247, 246, 216));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(66, 66, 66), 2));
        panelPrincipal.setForeground(new java.awt.Color(242, 242, 242));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1000, 550));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1000, 550));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 550));

        contenedorProductoras.setMaximumSize(new java.awt.Dimension(400, 32767));
        contenedorProductoras.setMinimumSize(new java.awt.Dimension(400, 84));
        contenedorProductoras.setOpaque(false);
        contenedorProductoras.setPreferredSize(new java.awt.Dimension(400, 142));
        contenedorProductoras.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 5));

        panelProductoras.setMaximumSize(new java.awt.Dimension(145, 74));
        panelProductoras.setMinimumSize(new java.awt.Dimension(145, 74));
        panelProductoras.setOpaque(false);
        panelProductoras.setPreferredSize(new java.awt.Dimension(200, 74));

        tituloProductoras.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        tituloProductoras.setForeground(new java.awt.Color(0, 0, 0));
        tituloProductoras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloProductoras.setText("Seleccione la Productora");
        tituloProductoras.setMaximumSize(new java.awt.Dimension(190, 25));
        tituloProductoras.setMinimumSize(new java.awt.Dimension(130, 25));
        tituloProductoras.setPreferredSize(new java.awt.Dimension(190, 25));
        panelProductoras.add(tituloProductoras);

        productorasCombo.setBackground(new java.awt.Color(255, 255, 255));
        productorasCombo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        productorasCombo.setForeground(new java.awt.Color(0, 0, 0));
        productorasCombo.setPreferredSize(new java.awt.Dimension(180, 25));
        productorasCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productorasComboActionPerformed(evt);
            }
        });
        panelProductoras.add(productorasCombo);

        contenedorProductoras.add(panelProductoras);

        titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Lista de Peliculas");

        tablaPeliculas.setBackground(new java.awt.Color(204, 204, 204));
        tablaPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI de la Película", "Nombre de la Película", "Género de la Película", "Tipo de Audiencia"
            }
        ));
        tablaPeliculas.setShowGrid(true);
        jScrollPane1.setViewportView(tablaPeliculas);

        panelEliminarBTN.setBackground(new java.awt.Color(255, 255, 255));
        panelEliminarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEliminarBTN.setPreferredSize(new java.awt.Dimension(150, 40));
        panelEliminarBTN.setLayout(new java.awt.BorderLayout());

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        panelEliminarBTN.add(btnEliminar, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
            .addComponent(contenedorProductoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(416, 416, 416)
                .addComponent(panelEliminarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(contenedorProductoras, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelEliminarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        add(panelPrincipal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    //Diseño del botón Eliminar.
    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        panelEliminarBTN.setBackground(new Color(255, 64, 64));
        btnEliminar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        panelEliminarBTN.setBackground(new Color(255, 255, 255));
        btnEliminar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnEliminarMouseExited

    //Botón Eliminar.
    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        //Valida que hayan productoras seleccionadas.
        if (productoraSeleccionada != null) {
            //Muestra mensaje de confirmación.
            int result = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar la primera película?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            //Si acepta.
            if (result == JOptionPane.YES_OPTION) {
                //Llama al método para eliminarla.
                Pelicula peliculaEliminada = productoraSeleccionada.eliminarPrimeraPelicula();
                if (peliculaEliminada != null) {
                    actualizarTabla(productoraSeleccionada); 
                    JOptionPane.showMessageDialog(this, "Película eliminada: " + peliculaEliminada.getNombre(), "Eliminación exitosa", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No hay películas para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una productora.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    //Action de seleccionar una productora.
    private void productorasComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productorasComboActionPerformed
        //Captura los datos.
        int selectedIndex = productorasCombo.getSelectedIndex();
        
        //Valida que haya seleccionado una.
        if (selectedIndex >= 0) {
            productoraSeleccionada = productoras[selectedIndex];
            actualizarTabla(productoraSeleccionada);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una productora.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_productorasComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JPanel contenedorProductoras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEliminarBTN;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelProductoras;
    private javax.swing.JComboBox<String> productorasCombo;
    private javax.swing.JTable tablaPeliculas;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel tituloProductoras;
    // End of variables declaration//GEN-END:variables
}
