package com.mycompany.tpcsw_practica03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Departamentos extends javax.swing.JPanel {

    private Map<String, Departamento> departamentosMap = new HashMap<>();
    private JTable departamentosTable;
    private DefaultTableModel tableModel;

    public Departamentos() {
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

        claveLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        claveField = new javax.swing.JTextField();
        nombreField = new javax.swing.JTextField();
        guardarButton = new javax.swing.JButton();
        modificarButton = new javax.swing.JButton();
        eliminarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        claveLabel.setText("Clave");

        nombreLabel.setText("Nombre");

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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(modificarButton)
                            .addGap(53, 53, 53)
                            .addComponent(eliminarButton))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(57, 57, 57)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nombreLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nombreField))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(claveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(claveField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(guardarButton)
                            .addGap(274, 274, 274))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(claveLabel)
                    .addComponent(claveField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardarButton)
                    .addComponent(modificarButton)
                    .addComponent(eliminarButton))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
        try {
            long clave = Long.parseLong(claveField.getText());
            DAODepartamento dao = new DAODepartamento();

            if (dao.delete(clave)) {
                JOptionPane.showMessageDialog(this, "Departamento eliminado exitosamente.");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Departamento no encontrado.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una clave válida.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar el departamento: " + e.getMessage());
        }

    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void claveFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claveFieldActionPerformed
    }//GEN-LAST:event_claveFieldActionPerformed

    private void nombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreFieldActionPerformed
    }//GEN-LAST:event_nombreFieldActionPerformed

    private void cargarDepartamentos() {
        try {
        DAODepartamento daoDepartamento = new DAODepartamento(); // Usar DAODepartamento
        List<Departamento> departamentos = daoDepartamento.findAll(); // Cambia a findAll()

        tableModel.setRowCount(0); // Limpiar el modelo antes de cargar nuevos datos

        for (Departamento depto : departamentos) {
            tableModel.addRow(new Object[]{depto.getClave(), depto.getNombre()}); // Agregar cada departamento al modelo
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton modificarButton;
    private javax.swing.JTextField nombreField;
    private javax.swing.JLabel nombreLabel;
    // End of variables declaration//GEN-END:variables
}
