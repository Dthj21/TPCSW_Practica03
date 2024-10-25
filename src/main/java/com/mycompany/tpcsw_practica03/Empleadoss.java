package com.mycompany.tpcsw_practica03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;

public class Empleadoss extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloTabla;

    public Empleadoss() {
        initComponents();
        cargarDepartamentos();
        modeloTabla = new DefaultTableModel(new String[]{"Clave", "Nombre", "Direccion", "Telefono", "Departamento"}, 0);
        jTable1.setModel(modeloTabla);
        cargarEmpleados();
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
            modeloTabla.addRow(new Object[]{"", "No hay empleados", "", "", ""});
        }
    }

    private void limpiarCampos() {
        nombreField.setText("");
        claveField.setText("");
        direccionField.setText("");
        telefonoField.setText("");
        departamentoCombo.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreLabel = new javax.swing.JLabel();
        eliminarButton = new javax.swing.JButton();
        direccionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        telefonoLabel = new javax.swing.JLabel();
        claveField = new javax.swing.JTextField();
        idButton = new javax.swing.JButton();
        nombreField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        direccionField = new javax.swing.JTextField();
        telefonoField = new javax.swing.JTextField();
        departamentoLabel = new javax.swing.JLabel();
        guardarButton = new javax.swing.JButton();
        claveLabel = new javax.swing.JLabel();
        modificarButton = new javax.swing.JButton();
        departamentoCombo = new javax.swing.JComboBox<>();
        salirButton = new javax.swing.JButton();

        nombreLabel.setText("Nombre");

        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        direccionLabel.setText("Direccion");

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

        telefonoLabel.setText("Telefono");

        claveField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveFieldActionPerformed(evt);
            }
        });

        idButton.setText("Buscar by ID");
        idButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idButtonActionPerformed(evt);
            }
        });

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
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

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        claveLabel.setText("Clave");

        modificarButton.setText("Modificar");
        modificarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarButtonActionPerformed(evt);
            }
        });

        departamentoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departamentoCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentoComboActionPerformed(evt);
            }
        });

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(salirButton)
                                    .addComponent(idButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guardarButton)
                                .addGap(114, 114, 114)
                                .addComponent(modificarButton)
                                .addGap(126, 126, 126)
                                .addComponent(eliminarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(departamentoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(departamentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claveLabel)
                    .addComponent(claveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionLabel)
                    .addComponent(direccionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoLabel)
                    .addComponent(telefonoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departamentoLabel)
                    .addComponent(departamentoCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarButton)
                    .addComponent(modificarButton)
                    .addComponent(eliminarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada != -1) {
            Long claveEmpleado = (Long) modeloTabla.getValueAt(filaSeleccionada, 0);

            DAOEmpleado daoEmpleado = new DAOEmpleado();
            boolean eliminado = daoEmpleado.delete(claveEmpleado);

            if (eliminado) {
                JOptionPane.showMessageDialog(this, "Empleado eliminado correctamente.");
                cargarEmpleados();
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar el empleado.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un empleado para eliminar.");
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void claveFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveFieldActionPerformed

    }//GEN-LAST:event_claveFieldActionPerformed

    private void idButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idButtonActionPerformed
   try {
        long clave = Long.parseLong(idTextField.getText());
        DAOEmpleado dao = new DAOEmpleado();
        Empleado empleado = dao.findById(clave);

        if (empleado != null) {
            JOptionPane.showMessageDialog(this, 
                "Empleado encontrado:\nNombre: " + empleado.getNombre() +
                "\nCelular: " + empleado.getTelefono() +
                "\nDirección: " + empleado.getDireccion()
            );
            idTextField.setText(""); 
        } else {
            JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese una clave válida.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al buscar el empleado: " + e.getMessage());
    }
    }//GEN-LAST:event_idButtonActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        idButtonActionPerformed(evt);
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void direccionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionFieldActionPerformed

    private void telefonoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFieldActionPerformed

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        try {
            String nombreDepto = (String) departamentoCombo.getSelectedItem();

            Long claveDepto = null;
            for (Map.Entry<Long, String> entry : departamentosMap.entrySet()) {
                if (entry.getValue().equals(nombreDepto)) {
                    claveDepto = entry.getKey();
                    break;
                }
            }

            Empleado empleado = new Empleado();
            empleado.setClave(Long.parseLong(claveField.getText()));
            empleado.setNombre(nombreField.getText());
            empleado.setDireccion(direccionField.getText());
            empleado.setTelefono(telefonoField.getText());

            if (claveDepto != null) {
                Departamento departamento = new DAODepartamento().findById(claveDepto);
                empleado.setDepto(departamento);
                DAOEmpleado daoEmpleado = new DAOEmpleado();
                daoEmpleado.save(empleado);

                JOptionPane.showMessageDialog(this, "Empleado guardado exitosamente.");
                cargarEmpleados();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Departamento no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: La clave debe ser un número válido.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el empleado: " + e.getMessage());
        }
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        try {
            String nombreDepto = (String) departamentoCombo.getSelectedItem();

            Long claveDepto = null;
            for (Map.Entry<Long, String> entry : departamentosMap.entrySet()) {
                if (entry.getValue().equals(nombreDepto)) {
                    claveDepto = entry.getKey();
                    break;
                }
            }

            Long claveEmpleado = Long.parseLong(claveField.getText());
            DAOEmpleado daoEmpleado = new DAOEmpleado();
            Empleado empleado = daoEmpleado.findById(claveEmpleado);

            if (empleado != null) {
                empleado.setNombre(nombreField.getText());
                empleado.setDireccion(direccionField.getText());
                empleado.setTelefono(telefonoField.getText());

                if (claveDepto != null) {
                    Departamento departamento = new DAODepartamento().findById(claveDepto);
                    empleado.setDepto(departamento);
                }

                daoEmpleado.update(empleado, claveDepto);
                JOptionPane.showMessageDialog(this, "Empleado modificado exitosamente.");
                cargarEmpleados();
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: La clave debe ser un número válido.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar el empleado: " + e.getMessage());
        }
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void departamentoComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentoComboActionPerformed
        String selected = (String) departamentoCombo.getSelectedItem();
    }//GEN-LAST:event_departamentoComboActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirButtonActionPerformed

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
    private javax.swing.JTextField idTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JButton salirButton;
    private javax.swing.JTextField telefonoField;
    private javax.swing.JLabel telefonoLabel;
    // End of variables declaration//GEN-END:variables

    private Map<Long, String> departamentosMap = new HashMap<>();

    private void cargarDepartamentos() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            List<Departamento> departamentos = session.createQuery("from Departamento", Departamento.class).list();
            departamentoCombo.removeAllItems();
            departamentosMap.clear();

            for (Departamento depto : departamentos) {
                departamentoCombo.addItem(depto.getNombre());
                departamentosMap.put(depto.getClave(), depto.getNombre());
            }
            session.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar departamentos: " + e.getMessage());
        }
    }
}
