
//Registro de Productoras.

package Proyecto_2;

//Imports.
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class registroProductoras extends javax.swing.JPanel {    
    
//Instancia del arreglo.
    private Productora[] productoras;
    
    //Constructor.
    public registroProductoras(Productora[] productoras) {
        initComponents();
        
        //Guaarda los datos del menú.
        this.productoras = productoras;
        
        //Actualiza la tabla.
        actualizarTabla();
    }
    
    //Método para actualizar la tabla.
    private void actualizarTabla() {
        DefaultTableModel model = (DefaultTableModel) tablaProductoras.getModel();
        
        //Limpia la fila.
        model.setRowCount(0);

        //Itera en las productoras.
        for (Productora productora : productoras) {
            if (productora != null && productora.getDescripcion() != null) {
                //Agrega las productoras a la fila.
                model.addRow(new Object[]{productora.getId(), productora.getDescripcion()});
            }
        }
    }
    
    //Desgin,
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        contenedorDatos = new javax.swing.JPanel();
        panelID = new javax.swing.JPanel();
        textoID = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        panelDescripcion = new javax.swing.JPanel();
        textoDescripcion = new javax.swing.JLabel();
        descripcion = new javax.swing.JTextField();
        panelGuardarBTN = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductoras = new javax.swing.JTable();

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

        contenedorDatos.setOpaque(false);
        contenedorDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 100, 5));

        panelID.setOpaque(false);
        panelID.setPreferredSize(new java.awt.Dimension(220, 65));

        textoID.setBackground(new java.awt.Color(0, 0, 0));
        textoID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoID.setForeground(new java.awt.Color(0, 0, 0));
        textoID.setText("ID de la Productora");
        textoID.setPreferredSize(new java.awt.Dimension(180, 25));
        panelID.add(textoID);

        ID.setBackground(new java.awt.Color(255, 255, 255));
        ID.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ID.setForeground(new java.awt.Color(60, 63, 65));
        ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ID.setText("Se Genera Automaticamente");
        ID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ID.setCaretColor(new java.awt.Color(102, 102, 102));
        ID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        ID.setEnabled(false);
        ID.setMargin(new java.awt.Insets(20, 50, 20, 20));
        ID.setPreferredSize(new java.awt.Dimension(180, 25));
        ID.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        ID.setSelectionColor(new java.awt.Color(102, 102, 255));
        panelID.add(ID);

        contenedorDatos.add(panelID);

        panelDescripcion.setOpaque(false);
        panelDescripcion.setPreferredSize(new java.awt.Dimension(220, 65));

        textoDescripcion.setBackground(new java.awt.Color(0, 0, 0));
        textoDescripcion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        textoDescripcion.setText("Descripción de la Productora");
        textoDescripcion.setPreferredSize(new java.awt.Dimension(180, 25));
        panelDescripcion.add(textoDescripcion);

        descripcion.setBackground(new java.awt.Color(255, 255, 255));
        descripcion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        descripcion.setForeground(new java.awt.Color(60, 63, 65));
        descripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        descripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        descripcion.setCaretColor(new java.awt.Color(102, 102, 102));
        descripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        descripcion.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        descripcion.setMargin(new java.awt.Insets(20, 50, 20, 20));
        descripcion.setPreferredSize(new java.awt.Dimension(180, 25));
        descripcion.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        descripcion.setSelectionColor(new java.awt.Color(102, 102, 255));
        panelDescripcion.add(descripcion);

        contenedorDatos.add(panelDescripcion);

        panelGuardarBTN.setBackground(new java.awt.Color(255, 255, 255));
        panelGuardarBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelGuardarBTN.setPreferredSize(new java.awt.Dimension(150, 40));
        panelGuardarBTN.setLayout(new java.awt.BorderLayout());

        btnGuardar.setBackground(new java.awt.Color(242, 242, 242));
        btnGuardar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        panelGuardarBTN.add(btnGuardar, java.awt.BorderLayout.CENTER);

        titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Lista de Productoras");

        tablaProductoras.setBackground(new java.awt.Color(204, 204, 204));
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
                {null, null}
            },
            new String [] {
                "ID", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductoras.setShowGrid(true);
        jScrollPane1.setViewportView(tablaProductoras);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
            .addComponent(titulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(panelGuardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(contenedorDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGuardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(titulo)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(panelPrincipal, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    //Diseño del botón Guardar.
    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        panelGuardarBTN.setBackground(new Color(93, 196, 96));
        btnGuardar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        panelGuardarBTN.setBackground(new Color(255, 255, 255));
        btnGuardar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_btnGuardarMouseExited

    //Botón de Guardar.
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        //Captura los datos.
        String descripcionString = descripcion.getText().trim();

        //Valida si el campo esta vacío.
        if (!descripcionString.isEmpty()) {
            
            //Valida que solo tengan ciertos caracteres.
            if (descripcionString.matches("[a-zA-Z0-9áéíóúÁÉÍÓÚüÜñÑ //s]+")) {
                
                //Si se cumplen las validaciones agrega el dato a la productora.
                Productora productora = new Productora(descripcionString);

                //Busca la primera posición disponible en el arreglo de productoras,
                for (int i = 0; i < productoras.length; i++) {
                    
                    //Si esta vacío.
                    if (productoras[i] == null) {
                        
                        //Agrega la nueva productora.
                        productoras[i] = productora;
                        
                        //Muestra un mensaje de exito.
                        JOptionPane.showMessageDialog(null, "Se agrego correctamente la productora.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        
                        //Actualiza la tabla.
                        actualizarTabla();
                        
                        //Limpia el campo.
                        descripcion.setText("");
                        return;
                    }
                }
            } else {
                //Si tiene otros caracteres.
                JOptionPane.showMessageDialog(null, "La descripción solo puede contener letras, números, espacios y tildes.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            //Si esta vacía.
            JOptionPane.showMessageDialog(null, "El campo de descripción no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarMouseClicked
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JTextField descripcion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDescripcion;
    private javax.swing.JPanel panelGuardarBTN;
    private javax.swing.JPanel panelID;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tablaProductoras;
    private javax.swing.JLabel textoDescripcion;
    private javax.swing.JLabel textoID;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
