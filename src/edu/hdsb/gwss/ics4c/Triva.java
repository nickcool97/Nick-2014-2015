/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4c;

/**
 *
 * @author Nick
 */
public class Triva extends javax.swing.JFrame {

    String[][] questions = {
        {"What is Supermans weakness", "Kryptonite", "Chlorine", "Hydrogen", "Steel"},
        {"What is supermans home plant", "Mars", " Krypton", "Pluto", "Venus "},
        {"What is Clark Kent's middle name?", "Thomas", "Joseph", "Jacob", "Walter"},
        {"What member of the Superman family died in Crisis on Infinite Earths?", "Superman", "Lois Lane", "Jimmy Olson", "Supergirl"},
        {"You Win", "Try again", "Exit", "", ""},};

    int[] answers = {1, 2, 2, 4};

    int currentQuetion;

    /**
     * Creates new form Triva
     */
    public Triva() {
        initComponents();
        currentQuetion = 0;
        this.questionBox.setText(questions[currentQuetion][0]);
        this.answerA.setText(questions[currentQuetion][1]);
        this.answerB.setText(questions[currentQuetion][2]);
        this.answerC.setText(questions[currentQuetion][3]);
        this.answerD.setText(questions[currentQuetion][4]);

    }

    public void reset() {
        if (currentQuetion <= this.questions.length) {
            this.questionBox.setText(questions[currentQuetion][0]);
            this.answerA.setText(questions[currentQuetion][1]);
            this.answerB.setText(questions[currentQuetion][2]);
            this.answerC.setText(questions[currentQuetion][3]);
            this.answerD.setText(questions[currentQuetion][4]);
        }
        else {
            this.answerC.setVisible(false);
            this.answerD.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        answerA = new javax.swing.JButton();
        answerB = new javax.swing.JButton();
        answerC = new javax.swing.JButton();
        answerD = new javax.swing.JButton();
        questionBox = new javax.swing.JLabel();
        correctIncorrectBox = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));

        answerA.setText("Kryptonite");
        answerA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                answerAMouseClicked(evt);
            }
        });
        answerA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerAActionPerformed(evt);
            }
        });

        answerB.setText("Chlorine");
        answerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerBActionPerformed(evt);
            }
        });

        answerC.setText("Hydrogen");
        answerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerCActionPerformed(evt);
            }
        });

        answerD.setText("Steel");
        answerD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerDActionPerformed(evt);
            }
        });

        questionBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        questionBox.setText("What is Superman's Weakness");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(questionBox)
                .addGap(151, 151, 151))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(answerA)
                        .addGap(60, 60, 60)
                        .addComponent(answerB)
                        .addGap(50, 50, 50)
                        .addComponent(answerC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(correctIncorrectBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)))
                .addComponent(answerD)
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(questionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerA, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(answerC)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(answerB)
                        .addComponent(answerD)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(correctIncorrectBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
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

    private void answerAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_answerAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_answerAMouseClicked

    private void answerAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerAActionPerformed

        
      
     
        if( currentQuetion == 4 ) {
            currentQuetion = 0;
            reset();
        }
        else if (1 == this.answers[currentQuetion]) {
            this.correctIncorrectBox.setText("Correct");
            currentQuetion++;
            reset();
        } else {
            this.correctIncorrectBox.setText("Incorrect");

        }

    }//GEN-LAST:event_answerAActionPerformed

    private void answerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerBActionPerformed
        // TODO add your handling code here:
        if( currentQuetion == 4 ) {
            this.dispose();
            this.setVisible(false);
            System.exit(-1);
        }
        else if (2 == this.answers[currentQuetion]) {
            this.correctIncorrectBox.setText("Correct");
            currentQuetion++;
            reset();
        } else {
            this.correctIncorrectBox.setText("Incorrect");

        }

    }//GEN-LAST:event_answerBActionPerformed

    private void answerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerCActionPerformed
        // TODO add your handling code here:
        if (3 == this.answers[currentQuetion]) {
            this.correctIncorrectBox.setText("Correct");
            currentQuetion++;
            reset();
        } else {
            this.correctIncorrectBox.setText("Incorrect");

        }
    }//GEN-LAST:event_answerCActionPerformed

    private void answerDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerDActionPerformed
        // TODO add your handling code here:
        if (4 == this.answers[currentQuetion]) {
            this.correctIncorrectBox.setText("Correct");
            currentQuetion++;
            reset();
        } else {
            this.correctIncorrectBox.setText("Incorrect");

        }
    }//GEN-LAST:event_answerDActionPerformed

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
            java.util.logging.Logger.getLogger(Triva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Triva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Triva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Triva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Triva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton answerA;
    private javax.swing.JButton answerB;
    private javax.swing.JButton answerC;
    private javax.swing.JButton answerD;
    private javax.swing.JLabel correctIncorrectBox;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel questionBox;
    // End of variables declaration//GEN-END:variables
}
