package com.mycompany.tpcsw_practica03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Departamentoss extends javax.swing.JInternalFrame {

    private Map<String, Departamento> departamentosMap = new HashMap<>();
    private JTable departamentosTable;
    private DefaultTableModel tableModel;

    public Departamentoss() {
        initComponents();
        tableModel = new DefaultTableModel(new String[]{"Clave", "Nombre"}, 0);
        jTable1.setModel(tableModel);
        cargarDepartamentos();

    }

    private void limpiarCampos() {
        claveField.setText("");
        nombreField.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guardarButton = new javax.swing.JButton();
        claveLabel = new javax.swing.JLabel();
        claveField = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        guardarButton1 = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        salirButton = new javax.swing.JButton();

        guardarButton.setText("Guardar");
        guardarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButtonActionPerformed(evt);
            }
        });

        claveLabel.setText("Clave");

        claveField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claveFieldActionPerformed(evt);
            }
        });

        nombreLabel.setText("Nombre");

        nombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreFieldActionPerformed(evt);
            }
        });

        guardarButton1.setText("Guardar");
        guardarButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarButton1ActionPerformed(evt);
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
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CLAVE", "NOMBRE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

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
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(guardarButton1)
                                .addGap(82, 82, 82)
                                .addComponent(modificarButton)
                                .addGap(83, 83, 83)
                                .addComponent(eliminarButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(claveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombreLabel))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(claveField, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(nombreField))
                                .addGap(74, 74, 74)
                                .addComponent(salirButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(claveLabel)
                            .addComponent(claveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(salirButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarButton1)
                    .addComponent(modificarButton)
                    .addComponent(eliminarButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void claveFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveFieldActionPerformed

    }//GEN-LAST:event_claveFieldActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed

    }//GEN-LAST:event_nombreFieldActionPerformed

    private void guardarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButtonActionPerformed
        try {
            Departamento departamento = new Departamento();

            long clave = Long.parseLong(claveField.getText());
            String nombre = nombreField.getText();

            departamento.setClave(clave);
            departamento.setNombre(nombre);

            DAODepartamento dao = new DAODepartamento();
            dao.save(departamento);

            JOptionPane.showMessageDialog(this, "Departamento guardado exitosamente.");
            cargarDepartamentos();

            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una clave válida.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el departamento: " + e.getMessage());
        }
    }//GEN-LAST:event_guardarButtonActionPerformed

    private void guardarButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarButton1ActionPerformed
        try {
            Departamento departamento = new Departamento();

            long clave = Long.parseLong(claveField.getText());
            String nombre = nombreField.getText();

            departamento.setClave(clave);
            departamento.setNombre(nombre);

            DAODepartamento dao = new DAODepartamento();
            dao.save(departamento);

            JOptionPane.showMessageDialog(this, "Departamento guardado exitosamente.");
            cargarDepartamentos();

            limpiarCampos();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una clave válida.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el departamento: " + e.getMessage());
        }
    }//GEN-LAST:event_guardarButton1ActionPerformed

    private void modificarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarButtonActionPerformed
        try {
        long clave = Long.parseLong(claveField.getText());
        DAODepartamento dao = new DAODepartamento();
        Departamento departamento = dao.findById(clave);

        if (departamento != null) {
            departamento.setNombre(nombreField.getText());
            dao.update(departamento, clave);
            JOptionPane.showMessageDialog(this, "Departamento modificado exitosamente.");
            limpiarCampos();
            cargarDepartamentos(); 
        } else {
            JOptionPane.showMessageDialog(this, "Departamento no encontrado.");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese una clave válida.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al modificar el departamento: " + e.getMessage());
    }
    }//GEN-LAST:event_modificarButtonActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();

        if (filaSeleccionada != -1) {
            Long claveDepartamento = (Long) tableModel.getValueAt(filaSeleccionada, 0);

            DAODepartamento daoDepartamento = new DAODepartamento();

            try {
                if (daoDepartamento.delete(claveDepartamento)) {
                    JOptionPane.showMessageDialog(this, "Departamento eliminado exitosamente.");
                    cargarDepartamentos();
                } else {
                    JOptionPane.showMessageDialog(this, "Departamento no encontrado.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al eliminar el departamento: " + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un departamento para eliminar.");
        }
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirButtonActionPerformed

    private void cargarDepartamentos() {
        try {
            DAODepartamento daoDepartamento = new DAODepartamento();
            List<Departamento> departamentos = daoDepartamento.findAll();

            tableModel.setRowCount(0);

            for (Departamento depto : departamentos) {
                tableModel.addRow(new Object[]{depto.getClave(), depto.getNombre()});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los departamentos: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField claveField;
    private javax.swing.JLabel claveLabel;
    private javax.swing.JButton eliminarButton;
    private javax.swing.JButton guardarButton;
    private javax.swing.JButton guardarButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
}
