package the.family;

import java.awt.Point;
import javax.swing.JOptionPane;

/**
 *
 * @author Brandon
 */
public class StoryBoard extends javax.swing.JFrame 
{

    /**
     * Creates new form StoryBoard
     */
    public StoryBoard() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        board = new javax.swing.JTextArea();
        chapterLabel = new javax.swing.JLabel();
        choiceOne = new javax.swing.JButton();
        choiceTwo = new javax.swing.JButton();
        yes = new javax.swing.JButton();
        no = new javax.swing.JButton();
        choiceThree = new javax.swing.JButton();
        choiceFour = new javax.swing.JButton();
        next = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        leftPanel = new javax.swing.JPanel();
        invbutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("The Family");
        setLocation(getLocation());
        setName("storyboard"); // NOI18N
        setResizable(false);

        textPanel.setBackground(new java.awt.Color(0, 0, 0));
        textPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        board.setEditable(false);
        board.setBackground(new java.awt.Color(34, 41, 41));
        board.setColumns(20);
        board.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        board.setForeground(new java.awt.Color(255, 255, 255));
        board.setLineWrap(true);
        board.setRows(5);
        board.setAutoscrolls(false);
        board.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        board.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(board);

        chapterLabel.setBackground(new java.awt.Color(255, 255, 255));
        chapterLabel.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        chapterLabel.setForeground(new java.awt.Color(255, 255, 255));
        chapterLabel.setText("Chapter One");
        chapterLabel.setAlignmentX(0.5F);

        choiceOne.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        choiceOne.setText("Alt C 1");
        choiceOne.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(204, 0, 0)));
        choiceOne.setEnabled(false);
        choiceOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceOneActionPerformed(evt);
            }
        });

        choiceTwo.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        choiceTwo.setText("Alt C 2");
        choiceTwo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(204, 0, 0)));
        choiceTwo.setEnabled(false);
        choiceTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceTwoActionPerformed(evt);
            }
        });

        yes.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        yes.setText("Yes");
        yes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(204, 0, 0)));
        yes.setEnabled(false);
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });

        no.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        no.setText("No");
        no.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(204, 0, 0)));
        no.setEnabled(false);
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });

        choiceThree.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        choiceThree.setText("Alt C 3");
        choiceThree.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(204, 0, 0)));
        choiceThree.setEnabled(false);
        choiceThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceThreeActionPerformed(evt);
            }
        });

        choiceFour.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        choiceFour.setText("Alt C 4");
        choiceFour.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(204, 0, 0)));
        choiceFour.setEnabled(false);
        choiceFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceFourActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Calisto MT", 0, 10)); // NOI18N
        next.setText("Next");
        next.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(204, 0, 0)));
        next.setEnabled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout textPanelLayout = new javax.swing.GroupLayout(textPanel);
        textPanel.setLayout(textPanelLayout);
        textPanelLayout.setHorizontalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(textPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(textPanelLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(chapterLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(textPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(choiceOne, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choiceTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yes, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(choiceThree, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(choiceFour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        textPanelLayout.setVerticalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chapterLabel)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choiceOne)
                    .addComponent(yes)
                    .addComponent(choiceThree))
                .addGap(48, 48, 48)
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choiceTwo)
                    .addComponent(no)
                    .addComponent(choiceFour))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        rightPanel.setBackground(new java.awt.Color(0, 0, 0));
        rightPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        nameLabel.setFont(new java.awt.Font("Calisto MT", 0, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Leonard Roman");
        nameLabel.setAlignmentX(0.5F);

        jProgressBar1.setValue(100);

        jLabel1.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Health");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightPanelLayout.createSequentialGroup()
                        .addGroup(rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(nameLabel))
                            .addGroup(rightPanelLayout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        leftPanel.setBackground(new java.awt.Color(0, 0, 0));
        leftPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        invbutton.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        invbutton.setText("Inventory");
        invbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(204, 0, 0)));
        invbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invbuttonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jButton1.setText("Exit Game");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(204, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap())
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(invbutton)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MusicPlayer p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\menuselect.mp3");
        p.start();
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the game?") == 0)
        {
            p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\menuselect.mp3");
            p.start();
            System.exit(0);
        }
        p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\menuselect.mp3");
        p.start();
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        MusicPlayer p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\menuselect.mp3");
        p.start();
        yes.setEnabled(false);
        no.setEnabled(false);
        choice = 2;
        choosing = false;
    }//GEN-LAST:event_yesActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
        MusicPlayer p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\menuselect.mp3");
        p.start();
        yes.setEnabled(false);
        no.setEnabled(false);
        choice = 5;
        choosing = false;
    }//GEN-LAST:event_noActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
       MusicPlayer p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\menuselect.mp3");
       p.start();
       board.setText("");
       next.setEnabled(false);
       ChapterOne.nextPressed = true;
    }//GEN-LAST:event_nextActionPerformed

    private void choiceOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceOneActionPerformed
        choice = 1;
        disableButtons();
        choosing = false;
    }//GEN-LAST:event_choiceOneActionPerformed

    private void choiceThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceThreeActionPerformed
        choice = 4;
        disableButtons();
        choosing = false;
    }//GEN-LAST:event_choiceThreeActionPerformed

    private void choiceTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceTwoActionPerformed
        choice = 3;
        disableButtons();
        choosing = false;
    }//GEN-LAST:event_choiceTwoActionPerformed

    private void choiceFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceFourActionPerformed
        choice = 6;
        disableButtons();
        choosing = false;
    }//GEN-LAST:event_choiceFourActionPerformed

    private void invbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invbuttonActionPerformed
        MusicPlayer p = new MusicPlayer("C:\\Users\\Brandon\\Desktop\\Game Sounds\\menuselect.mp3");
        p.start();
        Inventory.openInventory();
    }//GEN-LAST:event_invbuttonActionPerformed
    
    private void disableButtons()
    {
        choiceOne.setEnabled(false);
        choiceTwo.setEnabled(false);
        choiceThree.setEnabled(false);
        choiceFour.setEnabled(false);
        yes.setEnabled(false);
        no.setEnabled(false);
    }
        private static void sleep(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException e)
        {
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void runStoryBoard() 
    {
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
            java.util.logging.Logger.getLogger(StoryBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoryBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoryBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoryBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new StoryBoard().setVisible(true);
                ChapterOne c = new ChapterOne();
                c.start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea board;
    private javax.swing.JLabel chapterLabel;
    private javax.swing.JButton choiceFour;
    public static javax.swing.JButton choiceOne;
    public static javax.swing.JButton choiceThree;
    public static javax.swing.JButton choiceTwo;
    private javax.swing.JButton invbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JLabel nameLabel;
    public static javax.swing.JButton next;
    public static javax.swing.JButton no;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel textPanel;
    public static javax.swing.JButton yes;
    // End of variables declaration//GEN-END:variables

    public static boolean miniGamePassed = false;
    public static boolean choosing = false;
    public static int choice = 0;
}
