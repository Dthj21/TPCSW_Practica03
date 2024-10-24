package com.mycompany.tpcsw_practica03;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Empleados extends javax.swing.JPanel {

    private DefaultTableModel modeloTabla;

    private void limpiarCampos() {
        nombreField.setText("");
        claveField.setText("");
        direccionField.setText("");
        telefonoField.setText("");
        departamentoCombo.setSelectedIndex(0);
    }

    private void cargarEmpleados() {
        DAOEmpleado daoEmpleado = new DAOEmpleado();
        List<Empleado> empleados = daoEmpleado.findAll();

        modeloTabla.setRowCount(0);

        if (empleados != null && !empleados.isEmpty()) {
            for (Empleado empleado : empleados) {
                modeloTabla.addRow(new Object[]{
                    empleado.getClave(),
                    empleado.getNombre(),
                    empleado.getDireccion(),
                    empleado.getTelefono(),
                    empleado.getDepto() != null ? empleado.getDepto().getNombre() : "Sin departamento"
                });
            }
        } else {
            modeloTabla.addRow(new Object[]{"", "No hay empleados", "", "", ""}); // Mensaje si no hay empleados
        }
    }

    public Empleados() {
        initComponents();
        modeloTabla = new DefaultTableModel(new String[]{"Clave", "Nombre", "Direccion", "Telefono", "Departamento"}, 0);
        jTable1.setModel(modeloTabla);
        cargarEmpleados();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        claveLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        direccionLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        claveField = new javax.swing.JTextField();
        nombreField = new javax.swing.JTextField();
        direccionField = new javax.swing.JTextField();
        telefonoField = new javax.swing.JTextField();
        departamentoLabel = new javax.swing.JLabel();
        departamentoCombo = new javax.swing.JComboBox<>();
        guardarButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        idButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();

        claveLabel.setText("Clave");

        nombreLabel.setText("Nombre");

        direccionLabel.setText("Direccion");

        telefonoLabel.setText("Telefono");

        claveField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveFieldActionPerformed(evt);
            }
        });

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        direccionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionFieldActionPerformed(evt);
            }
        });

        telefonoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoFieldActionPerformed(evt);
            }
        });

        departamentoLabel.setText("Departamento");

        departamentoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departamentoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoComboActionPerformed(evt);
            }
        });

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        modificarButton.setText("Modificar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Clave", "Nombre", "Direccion", "Telefono", "Departamento"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        idButton.setText("Buscar by ID");
        idButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idButtonActionPerformed(evt);
            }
        });

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(telefonoLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(telefonoField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(direccionLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(direccionField))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addComponent(claveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(nombreLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(claveField, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                        .addComponent(nombreField))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(departamentoLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(guardarButton)
                                        .addGap(114, 114, 114)
                                        .addComponent(modificarButton)))
                                .addGap(126, 126, 126)
                                .addComponent(eliminarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(192, 192, 192)
                                .addComponent(departamentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addComponent(idButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claveLabel)
                    .addComponent(claveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionLabel)
                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoLabel)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(departamentoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departamentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idButton))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarButton)
                    .addComponent(modificarButton)
                    .addComponent(eliminarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void claveFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claveFieldActionPerformed

    private void direccionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionFieldActionPerformed

    private void telefonoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFieldActionPerformed

    private void departamentoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoComboActionPerformed
        Departamento departamentoSeleccionado = (Departamento) departamentoCombo.getSelectedItem();

        if (departamentoSeleccionado != null) {
            String mensaje = "Departamento seleccionado: " + departamentoSeleccionado.getNombre(); // Suponiendo que tienes un método getNombre()
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }//GEN-LAST:event_departamentoComboActionPerformed

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        try {
            String nombre = nombreField.getText().trim();
            String direccion = direccionField.getText().trim();
            String telefono = telefonoField.getText().trim();
            long clave;

            try {
                clave = Long.parseLong(claveField.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese una clave válida (número).");
                return;
            }

            if (nombre.isEmpty() || direccion.isEmpty() || telefono.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
                return;
            }

            Departamento departamento = (Departamento) departamentoCombo.getSelectedItem();

            Empleado empleado = new Empleado();
            empleado.setNombre(nombre);
            empleado.setDireccion(direccion);
            empleado.setTelefono(telefono);
            empleado.setClave(clave);
            empleado.setDepto(departamento);

            DAOEmpleado daoEmpleado = new DAOEmpleado();
            daoEmpleado.save(empleado);

            JOptionPane.showMessageDialog(this, "Empleado guardado exitosamente.");

            limpiarCampos();
            cargarEmpleados();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el empleado: " + e.getMessage());
        }

    }//GEN-LAST:event_guardarButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        try {
            long clave = Long.parseLong(claveField.getText().trim());
            String nombre = nombreField.getText().trim();
            String direccion = direccionField.getText().trim();
            String telefono = telefonoField.getText().trim();

            Departamento departamento = (Departamento) departamentoCombo.getSelectedItem();

            DAOEmpleado daoEmpleado = new DAOEmpleado();
            Empleado empleado = daoEmpleado.findById(clave);

            if (empleado != null) {
                empleado.setNombre(nombre);
                empleado.setDireccion(direccion);
                empleado.setTelefono(telefono);
                empleado.setDepto(departamento);

                daoEmpleado.save(empleado);

                JOptionPane.showMessageDialog(this, "Empleado modificado exitosamente.");
                limpiarCampos();
                cargarEmpleados();
            } else {
                JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una clave válida.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar el empleado: " + e.getMessage());
        }
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        try {
            long clave = Long.parseLong(claveField.getText().trim());

            DAOEmpleado daoEmpleado = new DAOEmpleado();

            if (daoEmpleado.delete(clave)) { // Asumiendo que tienes un método delete en tu DAO
                JOptionPane.showMessageDialog(this, "Empleado eliminado exitosamente.");
                limpiarCampos();
                cargarEmpleados();

            } else {
                JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una clave válida.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el empleado: " + e.getMessage());
        }

    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void idButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idButtonActionPerformed
        modeloTabla.setRowCount(0);

        try {
            Long id = Long.parseLong(idField.getText().trim());

            DAOEmpleado daoEmpleado = new DAOEmpleado();

            Empleado empleado = daoEmpleado.findById(id);

            if (empleado != null) {
                modeloTabla.addRow(new Object[]{
                    empleado.getClave(),
                    empleado.getNombre(),
                    empleado.getDireccion(),
                    empleado.getTelefono(),
                    empleado.getDepto().getNombre()
                });
            } else {
                JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un ID válido.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al buscar el empleado: " + e.getMessage());
        }
    }//GEN-LAST:event_idButtonActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        idButtonActionPerformed(evt);
    }//GEN-LAST:event_idFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField claveField;
    private javax.swing.JLabel claveLabel;
    private javax.swing.JComboBox<String> departamentoCombo;
    private javax.swing.JLabel departamentoLabel;
    private javax.swing.JTextField direccionField;
    private javax.swing.JLabel direccionLabel;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton guardarButton;
    private javax.swing.JButton idButton;
    private javax.swing.JTextField idField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables

}
