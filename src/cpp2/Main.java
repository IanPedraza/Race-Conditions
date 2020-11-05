package cpp2;

import static cpp2.Algorithms.*;

public class Main extends javax.swing.JFrame {

    public static Hilo thread1, thread2, thread3, thread4;
    private SharedResource sharedResource;
    private Cerradura lock;
    private Mutex mutex;
    
    public Main() {
        initComponents();
        
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Algoritmos");        
        
        sharedResource = new SharedResource();
        
        /*
        thread1 = new Hilo(0, textArea1, labelKilled, sharedResource, lock);
        thread1.setName("Perrito 1");
        
        thread2 = new Hilo(1, textArea2, labelKilled, sharedResource, lock);
        thread2.setName("Perrito 2");
        
        thread3 = new Hilo(2, textArea3, labelKilled, sharedResource, lock);
        thread3.setName("Perrito 3");
        
        thread4 = new Hilo(3, textArea4, labelKilled, sharedResource, lock);
        thread4.setName("Perrito 4");
        */
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        algorithmsGroup = new javax.swing.ButtonGroup();
        btnRun = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea3 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        textArea4 = new javax.swing.JTextArea();
        labelKilled = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem7 = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRun.setText("Run");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });

        btnPause.setText("Kill - 9");
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        textArea2.setColumns(20);
        textArea2.setRows(5);
        jScrollPane1.setViewportView(textArea2);

        textArea3.setColumns(20);
        textArea3.setRows(5);
        jScrollPane2.setViewportView(textArea3);

        textArea1.setColumns(20);
        textArea1.setRows(5);
        jScrollPane3.setViewportView(textArea1);

        textArea4.setColumns(20);
        textArea4.setRows(5);
        jScrollPane4.setViewportView(textArea4);

        jMenu1.setText("File");

        jMenuItem1.setText("Cerrar");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Algoritmos");

        algorithmsGroup.add(jRadioButtonMenuItem6);
        jRadioButtonMenuItem6.setSelected(true);
        jRadioButtonMenuItem6.setText("Condiciones comptencia");
        jRadioButtonMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem6);

        algorithmsGroup.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setText("Desactivación de Interrupciones");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem1);

        algorithmsGroup.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setText("Variable de Cerradura");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem2);

        algorithmsGroup.add(jRadioButtonMenuItem3);
        jRadioButtonMenuItem3.setText("Dekker Alternancia Estricta");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem3);

        algorithmsGroup.add(jRadioButtonMenuItem4);
        jRadioButtonMenuItem4.setText("Dijkstra");
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem4);

        algorithmsGroup.add(jRadioButtonMenuItem5);
        jRadioButtonMenuItem5.setText("Mutex API");
        jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem5);

        algorithmsGroup.add(jRadioButtonMenuItem7);
        jRadioButtonMenuItem7.setText("Mutex");
        jRadioButtonMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStop)
                    .addComponent(btnRun)
                    .addComponent(btnPause)
                    .addComponent(labelKilled))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(450, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btnRun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPause)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStop)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(labelKilled))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        sharedResource.reset();
        
        lock = new Cerradura();
        mutex = new Mutex();
        
        thread1 = new Hilo(0, textArea1, labelKilled, sharedResource, lock);
        thread1.setName("Perrito 1");
        
        thread2 = new Hilo(1, textArea2, labelKilled, sharedResource, lock);
        thread2.setName("Perrito 2");
        
        thread3 = new Hilo(2, textArea3, labelKilled, sharedResource, lock);
        thread3.setName("Perrito 3");
        
        thread4 = new Hilo(3, textArea4, labelKilled, sharedResource, lock);
        thread4.setName("Perrito 4");
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }//GEN-LAST:event_btnRunActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        killThread();                
    }//GEN-LAST:event_btnPauseActionPerformed

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    
    private void killThread() {
        
        switch (getRandomNumber(1, 4)) {
            case 1:
                thread1.setDead(true);
                break;
            
            case 2:
                thread2.setDead(true);
                break;
                
            case 3:
                thread3.setDead(true);
                break;
                
            case 4:
                thread4.setDead(true);
                break;
                
            default:
        }
    }
   
    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        thread1.pause();
        thread2.pause();
        thread3.pause();
        thread4.pause();
        
        textArea1.setText(null);
        textArea2.setText(null);
        textArea3.setText(null);
        textArea4.setText(null);
        labelKilled.setText(null);
    }//GEN-LAST:event_btnStopActionPerformed

    private void jRadioButtonMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem6ActionPerformed
        this.sharedResource.setAlgorithm(CONDITIONS);
    }//GEN-LAST:event_jRadioButtonMenuItem6ActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        this.sharedResource.setAlgorithm(INTERRUPTIONS);
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        this.sharedResource.setAlgorithm(LOCK);
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
        this.sharedResource.setAlgorithm(DEKKER);
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
        this.sharedResource.setAlgorithm(DIJKSTRA);
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void jRadioButtonMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem5ActionPerformed
        this.sharedResource.setAlgorithm(MUTEX);
    }//GEN-LAST:event_jRadioButtonMenuItem5ActionPerformed

    private void jRadioButtonMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem7ActionPerformed
         this.sharedResource.setAlgorithm(MUTEX_ART);
    }//GEN-LAST:event_jRadioButtonMenuItem7ActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup algorithmsGroup;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnRun;
    private javax.swing.JButton btnStop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelKilled;
    private javax.swing.JTextArea textArea1;
    private javax.swing.JTextArea textArea2;
    private javax.swing.JTextArea textArea3;
    private javax.swing.JTextArea textArea4;
    // End of variables declaration//GEN-END:variables

}
