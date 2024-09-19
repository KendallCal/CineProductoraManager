
//Eliminación de Productoras.

package Proyecto_2;

//Imports.
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class eliminacionProductoras extends javax.swing.JPanel {

    //Instancia los datos.
    private Productora[] productoras;
    private int indiceUltimaProductora;

    //Constructor.
    public eliminacionProductoras(Productora[] productoras) {
        initComponents();

        //Guaarda los datos del menú.
        this.productoras = productoras;
        this.indiceUltimaProductora = productoras.length - 1;
        
        //Actualiza la tabla.
        actualizarTabla();
    }

    //Método para actualizar la tabla.
    private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaProductoras.getModel();
        
        //Limpia la tabla.
        model.setRowCount(0);

        //Itera en las productoras.
        for (Productora productora : productoras) {
            if (productora != null && productora.getDescripcion() != null) {
                //Agrega las productoras a la fila.
                model.addRow(new Object[]{productora.getId(), productora.getDescripcion()});
            }
        }
    }
    
    //Método para obtener el índice de la última productora agregada.
    private int obtenerIndice() {
        for (int i = productoras.length - 1; i >= 0; i--) {
            if (productoras[i] != null) {
                return i;
            }
        }
        return -1;
    }
    
    //Método para validar si hay películas registradas en la productora.
    private boolean puedeEliminar(int indiceProductora) {
        if (productoras[indiceProductora] != null) {
            Pelicula[] peliculas = productoras[indiceProductora].getPeliculas();
            
            //Verifica si hay al menos una película registrada.
            for (Pelicula pelicula : peliculas) {
                if (pelicula != null) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    //Design
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tablaProductoras = new javax.swing.JTable();
        contenedorEliminar = new javax.swing.JPanel();
        panelEliminarBTN = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(940, 580));
        setMinimumSize(new java.awt.Dimension(940, 580));
        setPreferredSize(new java.awt.Dimension(940, 580));
        setLayout(new java.awt.BorderLayout());

        panelPrincipal.setBackground(new java.awt.Color(242, 242, 242));
        panelPrincipal.setForeground(new java.awt.Color(242, 242, 242));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(940, 580));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(940, 580));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(940, 580));

        titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Lista de Productoras");

        titulo1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        titulo1.setForeground(new java.awt.Color(51, 51, 51));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Seleccione una productora");

        tablaProductoras.setBackground(new java.awt.Color(242, 242, 242));
        tablaProductoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID de la Productora", "Descripción de la Productora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane.setViewportView(tablaProductoras);

        contenedorEliminar.setOpaque(false);
        contenedorEliminar.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 5));

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

        contenedorEliminar.add(panelEliminarBTN);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contenedorEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
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
        //Verifica si hay alguna productora para eliminar y obteine el indice.
        int lastIndex = obtenerIndice();
        
        //Valida si hay alguna productora para eliminar.
        if (lastIndex == -1) {
            JOptionPane.showMessageDialog(this, "No hay productoras para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Vaida si se pueden eliminar las películas de la última productora.
        if (!puedeEliminar(lastIndex)) {
            JOptionPane.showMessageDialog(this, "No se puede eliminar la productora porque tiene películas registradas.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Elimina la última productora agregada.
        productoras[lastIndex] = null;
        
        //Actualiza la tabla.
        actualizarTabla();
        
        //Muestra mensaje de éxito.
        JOptionPane.showMessageDialog(this, "Última productora eliminada correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEliminarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JPanel contenedorEliminar;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JPanel panelEliminarBTN;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tablaProductoras;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
