
//Registro de Películas.

package Proyecto_2;

//Imports.
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class registroPeiculas extends javax.swing.JPanel {
    
    //Instancia los datos.
    private Productora ProductoraSeleccionada;
    private Productora[] productoras;
    
    //Constructor.
    public registroPeiculas(Productora[] productoras) {
        initComponents();
        
        //Guarda los datos del menú.
        this.productoras = productoras;
        
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
    
    // Método para actualizar la tabla de películas de la productora seleccionada.
    private void actualizarTablaPeliculas() {
        DefaultTableModel model = (DefaultTableModel) tablaPeliculas.getModel();
        
        //Limpia la tabla.
        model.setRowCount(0);

        //Obtiene las películas de la productora seleccionada.
        Pelicula[] peliculas = ProductoraSeleccionada.getPeliculas();

        //Agregar las película a la tabla.
        for (Pelicula pelicula : peliculas) {
            if (pelicula != null) {
                model.addRow(new Object[]{pelicula.getDni(), pelicula.getNombre(), pelicula.getGenero(), pelicula.getTipoAudiencia()});
            }
        }
    }
       
    //Desgin,
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jScrollTabla = new javax.swing.JScrollPane();
        tablaProductoras = new javax.swing.JTable();
        titulo1 = new javax.swing.JLabel();
        contenedorDatos = new javax.swing.JPanel();
        panelDNI = new javax.swing.JPanel();
        textoDNI = new javax.swing.JLabel();
        DNI = new javax.swing.JTextField();
        panelNombre = new javax.swing.JPanel();
        textoNombre = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        panelGenero = new javax.swing.JPanel();
        textoGenero = new javax.swing.JLabel();
        genero = new javax.swing.JComboBox<>();
        panelTipo = new javax.swing.JPanel();
        textoTipo = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        panelGuardarBTN = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        jScrollTabla1 = new javax.swing.JScrollPane();
        tablaPeliculas = new javax.swing.JTable();

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

        titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Lista de Productoras");

        tablaProductoras.setBackground(new java.awt.Color(204, 204, 204));
        tablaProductoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        tablaProductoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductorasMouseClicked(evt);
            }
        });
        jScrollTabla.setViewportView(tablaProductoras);

        titulo1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        titulo1.setForeground(new java.awt.Color(51, 51, 51));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Seleccióne una Productora a la que agregar la Película");

        contenedorDatos.setOpaque(false);
        contenedorDatos.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        panelDNI.setOpaque(false);
        panelDNI.setPreferredSize(new java.awt.Dimension(220, 65));

        textoDNI.setBackground(new java.awt.Color(0, 0, 0));
        textoDNI.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoDNI.setForeground(new java.awt.Color(0, 0, 0));
        textoDNI.setText("DNI de la Película");
        textoDNI.setPreferredSize(new java.awt.Dimension(180, 25));
        panelDNI.add(textoDNI);

        DNI.setBackground(new java.awt.Color(255, 255, 255));
        DNI.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        DNI.setForeground(new java.awt.Color(60, 63, 65));
        DNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DNI.setText("Se Genera Automaticamente");
        DNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DNI.setCaretColor(new java.awt.Color(102, 102, 102));
        DNI.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DNI.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        DNI.setEnabled(false);
        DNI.setMargin(new java.awt.Insets(20, 50, 20, 20));
        DNI.setPreferredSize(new java.awt.Dimension(180, 25));
        DNI.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        DNI.setSelectionColor(new java.awt.Color(102, 102, 255));
        panelDNI.add(DNI);

        contenedorDatos.add(panelDNI);

        panelNombre.setOpaque(false);
        panelNombre.setPreferredSize(new java.awt.Dimension(220, 65));

        textoNombre.setBackground(new java.awt.Color(0, 0, 0));
        textoNombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoNombre.setForeground(new java.awt.Color(0, 0, 0));
        textoNombre.setText("Nombre de la Película");
        textoNombre.setPreferredSize(new java.awt.Dimension(180, 25));
        panelNombre.add(textoNombre);

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(60, 63, 65));
        nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombre.setCaretColor(new java.awt.Color(102, 102, 102));
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombre.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        nombre.setMargin(new java.awt.Insets(20, 50, 20, 20));
        nombre.setPreferredSize(new java.awt.Dimension(180, 25));
        nombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        nombre.setSelectionColor(new java.awt.Color(102, 102, 255));
        panelNombre.add(nombre);

        contenedorDatos.add(panelNombre);

        panelGenero.setOpaque(false);
        panelGenero.setPreferredSize(new java.awt.Dimension(220, 65));

        textoGenero.setBackground(new java.awt.Color(0, 0, 0));
        textoGenero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoGenero.setForeground(new java.awt.Color(0, 0, 0));
        textoGenero.setText("Género de la Película");
        textoGenero.setPreferredSize(new java.awt.Dimension(180, 25));
        panelGenero.add(textoGenero);

        genero.setBackground(new java.awt.Color(255, 255, 255));
        genero.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        genero.setForeground(new java.awt.Color(0, 0, 0));
        genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acción", "Aventura", "Catástrofe", "Ciencia Ficción", "Comedia", "Documental", "Drama", "Fantasía", "Musical", "Suspenso", "Terror" }));
        genero.setPreferredSize(new java.awt.Dimension(180, 25));
        panelGenero.add(genero);

        contenedorDatos.add(panelGenero);

        panelTipo.setOpaque(false);
        panelTipo.setPreferredSize(new java.awt.Dimension(220, 65));

        textoTipo.setBackground(new java.awt.Color(0, 0, 0));
        textoTipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textoTipo.setForeground(new java.awt.Color(0, 0, 0));
        textoTipo.setText("Tipo de Audiencia");
        textoTipo.setPreferredSize(new java.awt.Dimension(180, 25));
        panelTipo.add(textoTipo);

        tipo.setBackground(new java.awt.Color(255, 255, 255));
        tipo.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tipo.setForeground(new java.awt.Color(0, 0, 0));
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Infantiles", "Juveniles", "Adultos", "Familiares" }));
        tipo.setPreferredSize(new java.awt.Dimension(180, 25));
        panelTipo.add(tipo);

        contenedorDatos.add(panelTipo);

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

        tablaPeliculas.setBackground(new java.awt.Color(204, 204, 204));
        tablaPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DNI de la Película", "Nombre de la Película", "Género de la Película", "Tipo de Audiencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollTabla1.setViewportView(tablaPeliculas);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addComponent(titulo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenedorDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelGuardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(447, 447, 447))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(15, 15, 15)
                .addComponent(jScrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelGuardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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
        String nombreString = nombre.getText().trim();
        String generoString = (String) genero.getSelectedItem();
        String tipoString = (String) tipo.getSelectedItem();

        //Valida que se haya seleccionado una productora,
        if (ProductoraSeleccionada == null) {
            JOptionPane.showMessageDialog(null, "Primero seleccione una productora.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Valida que el campo no este vacío.
        if (nombreString.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre de la película no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //Valida que la película solo contiene letras, tildes y números.
        if (!nombreString.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9 ]+")) {
            JOptionPane.showMessageDialog(null, "El nombre de la película solo puede contener letras, tildes, números y espacios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Crea una nueva instancia de Película.
        Pelicula pelicula = new Pelicula(nombreString, generoString, tipoString);

        //Agrega la película a la cola de películas de la productora seleccionada.
        ProductoraSeleccionada.agregarPelicula(pelicula);

        //Actualiza la tabla de películas de la productora seleccionada.
        actualizarTablaPeliculas();

        //Limpia los campos.
        limpiarCampos();
    }//GEN-LAST:event_btnGuardarMouseClicked
    
    //Método para guardar la fila que se clickeo.
    private void tablaProductorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductorasMouseClicked
        //Obtiene la fila seleccionada.
        int filaSeleccionada = tablaProductoras.getSelectedRow();

            //Verifica que se haya seleccionado una fila válida.
        if (filaSeleccionada != -1) {
            int idProductora = (int) tablaProductoras.getValueAt(filaSeleccionada, 0);

            //Busca la productora correspondiente en el arreglo de productoras.
            for (Productora productora : productoras) {
                if (productora != null && productora.getId() == idProductora) {
                    ProductoraSeleccionada = productora;
                    actualizarTablaPeliculas();
                    return;
                }
            }
        }

        //Si no se seleccionó ninguna productora, limpia la selección de productora seleccionada.
        ProductoraSeleccionada = null;
        
        //Limpia la tabla.
        DefaultTableModel model = (DefaultTableModel) tablaPeliculas.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_tablaProductorasMouseClicked

    //Método para limpiar los campos.
    private void limpiarCampos() {
        nombre.setText("");
        genero.setSelectedIndex(0);
        tipo.setSelectedIndex(0);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DNI;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JPanel contenedorDatos;
    private javax.swing.JComboBox<String> genero;
    private javax.swing.JScrollPane jScrollTabla;
    private javax.swing.JScrollPane jScrollTabla1;
    private javax.swing.JTextField nombre;
    private javax.swing.JPanel panelDNI;
    private javax.swing.JPanel panelGenero;
    private javax.swing.JPanel panelGuardarBTN;
    private javax.swing.JPanel panelNombre;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelTipo;
    private javax.swing.JTable tablaPeliculas;
    private javax.swing.JTable tablaProductoras;
    private javax.swing.JLabel textoDNI;
    private javax.swing.JLabel textoGenero;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoTipo;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}
