/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import dao.DogDao;
import entities.Dog;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel Augusto
 */
public class DogJFrame extends javax.swing.JFrame {
    /**
     * Creates new form DogJFrame
     */
    public DogJFrame() {
        initComponents(); 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        
        AtualizaTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCod = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbRaca = new javax.swing.JLabel();
        lbIdade = new javax.swing.JLabel();
        lbPeso = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        lbCor = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtRaca = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        cmbBoxSexo = new javax.swing.JComboBox<>();
        txtCod6 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDog = new javax.swing.JTable();
        btnInserir = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de cahorro");

        lbCod.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lbCod.setText("Código");
        lbCod.setMaximumSize(new java.awt.Dimension(44, 21));
        lbCod.setMinimumSize(new java.awt.Dimension(44, 21));

        lbNome.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lbNome.setText("Nome");

        lbRaca.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lbRaca.setText("Raça");

        lbIdade.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lbIdade.setText("Idade");

        lbPeso.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lbPeso.setText("Peso");

        lbSexo.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lbSexo.setText("Sexo");

        lbCor.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        lbCor.setText("Cor");

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        jLabel8.setText("Pesquisar");

        txtCod.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        txtCod.setEnabled(false);
        txtCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N

        txtIdade.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N

        txtRaca.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N

        txtPeso.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        txtCor.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        txtCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorActionPerformed(evt);
            }
        });

        cmbBoxSexo.setFont(new java.awt.Font("Courier New", 1, 15)); // NOI18N
        cmbBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        txtCod6.setFont(new java.awt.Font("Courier New", 0, 15)); // NOI18N
        txtCod6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCod6ActionPerformed(evt);
            }
        });

        tbDog.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        tbDog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Raça", "Idade", "Peso", "Sexo", "Cor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDogMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDog);
        if (tbDog.getColumnModel().getColumnCount() > 0) {
            tbDog.getColumnModel().getColumn(0).setResizable(false);
            tbDog.getColumnModel().getColumn(0).setPreferredWidth(25);
            tbDog.getColumnModel().getColumn(1).setResizable(false);
            tbDog.getColumnModel().getColumn(2).setResizable(false);
            tbDog.getColumnModel().getColumn(3).setResizable(false);
            tbDog.getColumnModel().getColumn(3).setPreferredWidth(25);
            tbDog.getColumnModel().getColumn(4).setResizable(false);
            tbDog.getColumnModel().getColumn(4).setPreferredWidth(25);
            tbDog.getColumnModel().getColumn(5).setResizable(false);
            tbDog.getColumnModel().getColumn(5).setPreferredWidth(10);
            tbDog.getColumnModel().getColumn(6).setResizable(false);
        }

        btnInserir.setFont(new java.awt.Font("Lato Black", 1, 14)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAtualizar.setFont(new java.awt.Font("Lato Black", 1, 14)); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Lato Black", 1, 14)); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Lato Black", 1, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtCod6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbRaca)
                                    .addComponent(lbNome)
                                    .addComponent(lbSexo))
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnInserir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btnAtualizar)
                                .addGap(75, 75, 75)
                                .addComponent(btnDeletar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(lbIdade)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(lbPeso)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cmbBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)
                                            .addComponent(lbCor)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 6, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRaca)
                    .addComponent(lbIdade)
                    .addComponent(lbPeso)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo)
                    .addComponent(cmbBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCor)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserir)
                    .addComponent(btnAtualizar)
                    .addComponent(btnSair)
                    .addComponent(btnDeletar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCod6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorActionPerformed

    private void txtCod6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCod6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCod6ActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        // TODO add your handling code here:
        if(txtCod.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Selecione algum dado para atualizar", "Nenhum dado selecionado", JOptionPane.WARNING_MESSAGE, null);
            txtNome.requestFocus();
            return;
        } else if(isEmptyFields()) {
            return;
        }
        Dog dog = new Dog();
        dog.setCod(Integer.parseInt(txtCod.getText()));
        dog.setNome(txtNome.getText());
        dog.setRaca(txtRaca.getText());
        dog.setIdade(Integer.parseInt(txtIdade.getText()));
        dog.setPeso(Double.parseDouble(txtPeso.getText()));
        dog.setSexo(cmbBoxSexo.getSelectedItem().toString());
        dog.setCor(txtCor.getText());
        DogDao dao = new DogDao();
        dao.update(dog);
        AtualizaTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
        if(txtCod.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Selecione algum dado para apagar", "Nenhum dado selecionado", JOptionPane.WARNING_MESSAGE, null);
            txtNome.requestFocus();
            return;
        }
        Dog dog = new Dog();
        dog.setCod(Integer.parseInt(txtCod.getText()));
        DogDao dao = new DogDao();
        dao.delete(dog);
        AtualizaTabela();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        // TODO add your handling code here:
        if(isEmptyFields()) {
            return;
        }
        Dog dog = new Dog();
        dog.setNome(txtNome.getText());
        dog.setRaca(txtRaca.getText());
        dog.setIdade(Integer.parseInt(txtIdade.getText()));
        dog.setPeso(Double.parseDouble(txtPeso.getText()));
        dog.setSexo(cmbBoxSexo.getSelectedItem().toString());
        dog.setCor(txtCor.getText());
        DogDao dao = new DogDao();
        dao.insert(dog);
        AtualizaTabela();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void tbDogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDogMouseClicked
        // TODO add your handling code here:
        
        txtCod.setText(getSelectedRowColumn(0));
        txtNome.setText(getSelectedRowColumn(1));
        txtRaca.setText(getSelectedRowColumn(2));
        txtIdade.setText(getSelectedRowColumn(3));
        txtPeso.setText(getSelectedRowColumn(4));
        if(getSelectedRowColumn(5).equals("F"))
            cmbBoxSexo.setSelectedIndex(0);
        else
            cmbBoxSexo.setSelectedIndex(1);
        txtCor.setText(getSelectedRowColumn(6));
    }//GEN-LAST:event_tbDogMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DogJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DogJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DogJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DogJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DogJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmbBoxSexo;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCod;
    private javax.swing.JLabel lbCor;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JLabel lbRaca;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JTable tbDog;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtCod6;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables

    private boolean isEmptyFields() {
        if(txtNome.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "O campo nome é obrigatorio", "Campo em branco", JOptionPane.WARNING_MESSAGE, null);
            txtNome.requestFocus();
            return true;
        }
        if(txtRaca.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "O campo raça é obrigatorio", "Campo em branco", JOptionPane.WARNING_MESSAGE, null);
            txtRaca.requestFocus();
            return true;
        }
        if(txtIdade.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "O campo idade é obrigatorio", "Campo em branco", JOptionPane.WARNING_MESSAGE, null);
            txtIdade.requestFocus();
            return true;
        }
        if(txtPeso.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "O campo peso é obrigatorio", "Campo em branco", JOptionPane.WARNING_MESSAGE, null);
            txtPeso.requestFocus();
            return true;
        }
        if(txtCor.getText().isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "O campo cor é obrigatorio", "Campo em branco", JOptionPane.WARNING_MESSAGE, null);
            txtCor.requestFocus();
            return true;
        }
        return false;
    }

    private void AtualizaTabela() {
        DogDao dao = new DogDao();
        DefaultTableModel model = (DefaultTableModel) tbDog.getModel();
        model.setNumRows(0);
        tbDog.removeAll();    
        for (Dog dog : dao.read()) {
            model.addRow(new Object[] {
                dog.getCod(),
                dog.getNome(),
                dog.getRaca(),
                dog.getIdade(),
                dog.getPeso(),
                dog.getSexo(),
                dog.getCor()
            });
        } 
    }

    private String getSelectedRowColumn(int i) {
        return tbDog.getModel().getValueAt(tbDog.getSelectedRow(), i).toString();
    }
}
