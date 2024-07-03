package com.mycompany.concesionaria.igu;

import com.mycompany.concesionaria.logica.Auto;
import com.mycompany.concesionaria.logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VentaAuto extends javax.swing.JFrame {

    Controladora control = new Controladora();
    
    public VentaAuto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Lista de Autos");

        btnVolver.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnComprar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnComprar.setText("Comprar");

        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaVehiculos);

        btnModificar.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Control tabla no este vacia
        if(tablaVehiculos.getRowCount()> 0 ){
            //valido que se haya seleccionado un registro
            if(tablaVehiculos.getSelectedRow()!=-1){
                //obtener id del vehiculo a borrar
                int id = Integer.parseInt(String.valueOf(tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(),0)));
                control.borrarAuto(id);
                //Mensaje de borrado
                mostrarMensaje("Auto borrado correctamente", "info", "Borrado Exitoso!!!!");
                cargarTabla();
            }else{
                //Mensaje si no selecciona ningun registro y presiona el boton eliminar
                mostrarMensaje("No selecciono un registro a eliminar", "Error", "Error al Eliminar!!!!");
            }
        }else{
            //Mensaje si la tabla esta vacia y presiona el boton eliminar
            mostrarMensaje("Tabla vacia, no se puede eliminar", "Error", "Error al Eliminar!!!!");  
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
         //Control tabla no este vacia
        if(tablaVehiculos.getRowCount()> 0 ){
            //valido que se haya seleccionado un registro
            if(tablaVehiculos.getSelectedRow()!=-1){
                //Id a Modificar
                int id = Integer.parseInt(String.valueOf(tablaVehiculos.getValueAt(tablaVehiculos.getSelectedRow(),0)));
                ModificarAuto modificarAuto = new ModificarAuto(id);
                //Abro la ventana modificarauto
                modificarAuto.setVisible(true);
                modificarAuto.setLocationRelativeTo(null);
                 // Cierra la ventana
                this.dispose();
                
            }else{
                //Mensaje si no selecciona ningun registro y presiona el boton modificar
                mostrarMensaje("No selecciono un registro a modificar", "Error", "Error al Modificar!!!!");
            }
        }else{
            //Mensaje si la tabla esta vacia y presiona el boton modificar
            mostrarMensaje("Tabla vacia, no se puede modificar", "Error", "Error al Modificar!!!!");  
        }
    }//GEN-LAST:event_btnModificarActionPerformed
        
    public void mostrarMensaje(String mensaje, String tipo, String titulo){
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }else if(tipo.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaVehiculos;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        //Hago que no sea editable la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        //Pongo titulos de las columnas
        String titulos[] = {"Id", "Marca", "Modelo", "Año", "Color", "Puertas", "Transmision", "Motor"};
        
        //Cargo los titulos en la tabla
        modeloTabla.setColumnIdentifiers(titulos);
        
        //Traer vehiculos desde la base de datos
        List <Auto> listaAutos = control.traerAutos();
        
        //setear los datos en la tabla
        if(listaAutos != null){
            for (Auto auto : listaAutos){
                Object[] objecto = {
                    auto.getIdVehiculo(), auto.getMarca(),auto.getModelo(), auto.getAnio(), auto.getColor(),
                    auto.getNumeroPuertas(), auto.getTipoTransmision(), auto.getTipoMotor()
                };
                modeloTabla.addRow(objecto);
            }
        }
        tablaVehiculos.setModel(modeloTabla);
        
    }
        
} 
          
