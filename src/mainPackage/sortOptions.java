package mainPackage;

import java.awt.event.ActionEvent;

public class sortOptions extends javax.swing.JFrame {

    public sortOptions() {
        initComponents();
    }

    
    private void initComponents() {
        // TODO Auto-generated method stub
        jLabel1 = new javax.swing.JLabel();
        jBackBut = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("ARRAY CRUDS");

        jBackBut.setText("Back");
        jBackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackButActionPerformed(evt);
            }
        });
        getContentPane().add(jBackBut);
        jBackBut.setBounds(6, 6, 64, 23);

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Bubble Sort");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'jButton1ActionPerformed'");
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Selection Sort");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }

            private void jButton2ActionPerformed(ActionEvent evt) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'jButton2ActionPerformed'");
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Insertion Sort");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }

            private void jButton3ActionPerformed(ActionEvent evt) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'jButton3ActionPerformed'");
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(375, 478));

        setLocationRelativeTo(null);
    }

    private void jBackButActionPerformed(ActionEvent evt) {
        // TODO Auto-generated method stub
        mainFrame backToMn = new mainFrame();
        backToMn.setVisible(true);
        dispose();
    }


    public static void main (String [] args ) {
        new sortOptions().setVisible(true);
    }

    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jBackBut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
}
