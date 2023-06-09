
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template

 */

/**
 *
 * @author Cesar
 */
public class BLOCK_NOTAS extends javax.swing.JFrame {

    /**
     * Creates new form BLOCK_NOTAS
     */
    public BLOCK_NOTAS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtBlockNotas = new javax.swing.JTextArea();
        ButtonAbrir = new javax.swing.JButton();
        ButtonGuardar = new javax.swing.JButton();
        ButtonCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtBlockNotas.setColumns(20);
        txtBlockNotas.setRows(5);
        jScrollPane1.setViewportView(txtBlockNotas);

        ButtonAbrir.setText("Abrir");
        ButtonAbrir.setToolTipText("");
        ButtonAbrir.setActionCommand("");
        ButtonAbrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonAbrirMouseClicked(evt);
            }
        });
        ButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAbrirActionPerformed(evt);
            }
        });

        ButtonGuardar.setText("Guardar");
        ButtonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonGuardarMouseClicked(evt);
            }
        });

        ButtonCerrar.setText("Cerrar");
        ButtonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ButtonCerrarMouseClicked(evt);
            }
        });
        ButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ButtonGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(ButtonAbrir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ButtonAbrir)
                .addGap(18, 18, 18)
                .addComponent(ButtonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(ButtonCerrar)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAbrirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAbrirActionPerformed

    private void ButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCerrarActionPerformed

    private void ButtonAbrirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAbrirMouseClicked
        System.out.println("ABRIR");
        JFileChooser fileChooser = new JFileChooser("C:\\archivos\\");
        int resu = fileChooser.showOpenDialog(this);
        if(resu == JFileChooser.APPROVE_OPTION){
            //Abrió el archivo
            //Abrir el archivo
            InputStream in;
            InputStreamReader isReader = null;
            BufferedReader bufferedReader = null;
            
            try{
            Path path = fileChooser.getSelectedFile().toPath();
            in = Files.newInputStream(path);
            isReader = new InputStreamReader(in);
            bufferedReader = new BufferedReader(isReader);
            txtBlockNotas.read(bufferedReader, "Abrir el archivo..");
            } catch (IOException ex) {
                Logger.getLogger(BLOCK_NOTAS.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
             
                try {
                    bufferedReader.close();
                    isReader.close();
                } catch (IOException ex) {
                    Logger.getLogger(BLOCK_NOTAS.class.getName()).log(Level.SEVERE, null, ex);
                }
             
            }
            
        }
    }//GEN-LAST:event_ButtonAbrirMouseClicked

    private void ButtonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonGuardarMouseClicked
        System.out.println("GUARDAR");
        JFileChooser fileChooser = new JFileChooser("C:\\archivos\\");
        int resu = fileChooser.showSaveDialog(this);
        if(resu == JFileChooser.APPROVE_OPTION){
            OutputStream out;
            OutputStreamWriter osWriter = null;
            BufferedWriter bufferedWriter = null;
            
            try{
            Path path = fileChooser.getSelectedFile().toPath();
            out = Files.newOutputStream(path);
            osWriter = new OutputStreamWriter(out);
            bufferedWriter = new BufferedWriter(osWriter);
            txtBlockNotas.write(bufferedWriter);
            
           // txtBlockNotas.read(bufferedReader, "Abrir el archivo..");
            } catch (IOException ex) {
                Logger.getLogger(BLOCK_NOTAS.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
             
                try {
                    bufferedWriter.close();
                    osWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(BLOCK_NOTAS.class.getName()).log(Level.SEVERE, null, ex);
                }
             
            }
        }
        
    }//GEN-LAST:event_ButtonGuardarMouseClicked

    private void ButtonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCerrarMouseClicked
        System.out.println("Cerrar");
        System.exit(0);//Cierra
    }//GEN-LAST:event_ButtonCerrarMouseClicked

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
            java.util.logging.Logger.getLogger(BLOCK_NOTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BLOCK_NOTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BLOCK_NOTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BLOCK_NOTAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BLOCK_NOTAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAbrir;
    private javax.swing.JButton ButtonCerrar;
    private javax.swing.JButton ButtonGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBlockNotas;
    // End of variables declaration//GEN-END:variables
}
