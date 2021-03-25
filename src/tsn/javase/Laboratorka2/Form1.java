package tsn.javase.Laboratorka2;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Form1 extends javax.swing.JFrame {

    private float a;

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Создание простейшей визуальной программы на  JAVA ");
        setIconImage(Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("B");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 50, 20, 14);

        jLabel2.setText("D");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 80, 20, 14);

        jLabel3.setText("X");
        jLabel3.setToolTipText("");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 20, 20, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(40, 20, 59, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(40, 50, 59, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(40, 80, 59, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tsn/javase/Laboratorka2/variant.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 20, 380, 90);

        jButton1.setText("Выход");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 120, 140, 30);

        jButton2.setText("Очистить");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 120, 140, 30);

        jButton3.setText("Решить");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 120, 150, 30);

        jLabel5.setText("ОТВЕТ:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 160, 450, 14);

        setSize(new java.awt.Dimension(524, 239));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Решение примера
        float x, b, d, y; // Вещественные переменные

        try {
            float a = Float.parseFloat(jTextField1.getText());
            x = Float.parseFloat(jTextField1.getText()); // Получение данных
            b = Float.parseFloat(jTextField2.getText()); // Получение данных
            d = Float.parseFloat(jTextField3.getText()); // Получение данных
        } catch (Exception ex) {
            // Выводим окошко с сообщением об ошибке
            JOptionPane.showMessageDialog(rootPane, "Ошибка введенных данных!", 
                    "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
            jTextField1.requestFocus(); // Устанавливаем фокус на компонент
            jLabel5.setText("В введенных значениях допущены ошибки");
            jTextField1.setText(""); // Очистка данных
            jTextField2.setText(""); // Очистка данных
            jTextField3.setText(""); // Очистка данных
            return; // Выход из метода (процедуры)
        }

        if (x < 6) { // Вычисление выражения
            y = (float) (Math.pow(a + b,2) / (x - 2));
        } else {
            y = d * d * d * x + b * b;
        }
        jLabel5.setText("ОТВЕТ: " + String.format("%.2f", y)); // Выдача ответа с двумя знаками после запятой

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Выход из программы
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Очистка полей ввода
        jLabel5.setText("ОТВЕТ:");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
