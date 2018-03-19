// Author: Rafal Daniel Szpecht | MP Practica 1
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;

public class GameView extends javax.swing.JFrame {
    private List<javax.swing.JButton> movementBtns = new ArrayList<javax.swing.JButton>();
    private int[] movement = new int[2];
    private int[] heroPosition = new int[2];
    private ActGame ag;
    
    public GameView() {
        initComponents();
        initBtnList();
        mySetLocation();
        mySetInitState();
        mySetMovement(0,0);
        this.heroPosition[0] = 177;
        this.heroPosition[1] = 171;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelGame = new javax.swing.JPanel();
        jLabelHero = new javax.swing.JLabel();
        jBtnLeft = new javax.swing.JButton();
        jBtnRight = new javax.swing.JButton();
        jBtnDown = new javax.swing.JButton();
        jBtnUp = new javax.swing.JButton();
        jBtnStart = new javax.swing.JButton();
        jTextFieldPre = new javax.swing.JTextField();
        jBtnPause = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNickname = new javax.swing.JTextField();
        jTextFieldX = new javax.swing.JTextField();
        jTextFieldY = new javax.swing.JTextField();
        jTextFieldState = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldSpeed = new javax.swing.JTextField();
        jButtonSpeedUp = new javax.swing.JButton();
        jButtonSpeedDown = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RDS PRACTICA 1 MP");
        setResizable(false);

        jPanelMain.setBackground(new java.awt.Color(192, 221, 243));

        jPanelGame.setBackground(new java.awt.Color(255, 255, 255));
        jPanelGame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabelHero.setText("O");

        javax.swing.GroupLayout jPanelGameLayout = new javax.swing.GroupLayout(jPanelGame);
        jPanelGame.setLayout(jPanelGameLayout);
        jPanelGameLayout.setHorizontalGroup(
            jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGameLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabelHero)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanelGameLayout.setVerticalGroup(
            jPanelGameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGameLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabelHero)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnLeft.setText("<-");
        jBtnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLeftActionPerformed(evt);
            }
        });

        jBtnRight.setText("->");
        jBtnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRightActionPerformed(evt);
            }
        });

        jBtnDown.setText("V");
        jBtnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDownActionPerformed(evt);
            }
        });

        jBtnUp.setText("^");
        jBtnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUpActionPerformed(evt);
            }
        });

        jBtnStart.setText("START");
        jBtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStartActionPerformed(evt);
            }
        });

        jTextFieldPre.setText("Type your nickname");

        jBtnPause.setText("PAUSE");
        jBtnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPauseActionPerformed(evt);
            }
        });

        jLabel1.setText("Nickname:");

        jLabel2.setText("X:");

        jLabel3.setText("Y:");

        jTextFieldNickname.setEditable(false);
        jTextFieldNickname.setText("Playa");
        jTextFieldNickname.setFocusable(false);

        jTextFieldX.setEditable(false);
        jTextFieldX.setText("150");
        jTextFieldX.setFocusable(false);

        jTextFieldY.setEditable(false);
        jTextFieldY.setText("150");
        jTextFieldY.setFocusable(false);

        jTextFieldState.setEditable(false);
        jTextFieldState.setText("Before Start");

        jLabel4.setText("Speed:");

        jTextFieldSpeed.setEditable(false);
        jTextFieldSpeed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldSpeed.setText("10");

        jButtonSpeedUp.setText("+");
        jButtonSpeedUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpeedUpActionPerformed(evt);
            }
        });

        jButtonSpeedDown.setText("-");
        jButtonSpeedDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpeedDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMainLayout = new javax.swing.GroupLayout(jPanelMain);
        jPanelMain.setLayout(jPanelMainLayout);
        jPanelMainLayout.setHorizontalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNickname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                                .addComponent(jBtnPause)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                                .addComponent(jBtnLeft)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jBtnUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtnDown, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(jBtnRight)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                                .addComponent(jTextFieldPre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnStart)
                                .addContainerGap())))
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldState)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonSpeedUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldSpeed)
                                    .addComponent(jButtonSpeedDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanelMainLayout.setVerticalGroup(
            jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMainLayout.createSequentialGroup()
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnStart)
                            .addComponent(jTextFieldPre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNickname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jTextFieldState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSpeedUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jBtnPause))
                            .addGroup(jPanelMainLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSpeedDown)))
                        .addGap(31, 31, 31)
                        .addComponent(jBtnUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnLeft)
                            .addComponent(jBtnRight)
                            .addComponent(jBtnDown)))
                    .addComponent(jPanelGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStartActionPerformed
        mySetInGameState();
    }//GEN-LAST:event_jBtnStartActionPerformed

    private void jBtnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPauseActionPerformed
        mySetPauseState();
    }//GEN-LAST:event_jBtnPauseActionPerformed

    private void jBtnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLeftActionPerformed
        mySetMovement(-1,0);
    }//GEN-LAST:event_jBtnLeftActionPerformed

    private void jBtnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUpActionPerformed
        mySetMovement(0,-1);
    }//GEN-LAST:event_jBtnUpActionPerformed

    private void jBtnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDownActionPerformed
        mySetMovement(0,1);
    }//GEN-LAST:event_jBtnDownActionPerformed

    private void jBtnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRightActionPerformed
        mySetMovement(1,0);
    }//GEN-LAST:event_jBtnRightActionPerformed

    private void jButtonSpeedUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpeedUpActionPerformed
        int vel = ag.getVelocity();
        vel++;
        jTextFieldSpeed.setText(Integer.toString(vel));
        ag.setVelocity(vel);
    }//GEN-LAST:event_jButtonSpeedUpActionPerformed

    private void jButtonSpeedDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpeedDownActionPerformed
        int vel = ag.getVelocity();
        if(!jTextFieldSpeed.getText().equals("1")){
            vel--;
        }
        jTextFieldSpeed.setText(Integer.toString(vel));
        ag.setVelocity(vel);
    }//GEN-LAST:event_jButtonSpeedDownActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDown;
    private javax.swing.JButton jBtnLeft;
    private javax.swing.JButton jBtnPause;
    private javax.swing.JButton jBtnRight;
    private javax.swing.JButton jBtnStart;
    private javax.swing.JButton jBtnUp;
    private javax.swing.JButton jButtonSpeedDown;
    private javax.swing.JButton jButtonSpeedUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelHero;
    private javax.swing.JPanel jPanelGame;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JTextField jTextFieldNickname;
    private javax.swing.JTextField jTextFieldPre;
    private javax.swing.JTextField jTextFieldSpeed;
    private javax.swing.JTextField jTextFieldState;
    private javax.swing.JTextField jTextFieldX;
    private javax.swing.JTextField jTextFieldY;
    // End of variables declaration//GEN-END:variables
    
    public int[] getPosition(){
        return this.heroPosition;
    }
    
    public int[] getHeroSize(){
        int[] size = new int[2];
        
        size[0] = jLabelHero.getWidth();
        size[1] = jLabelHero.getHeight();
        
        return size;
    }
    
    public void endGame(){
        mySetInitState();
        setPosition(new int[] {177,171});
        ag.setAlive(false);
        jBtnStart.setEnabled(true);
        jTextFieldPre.setEnabled(true);
        jTextFieldPre.setEditable(true);
        jTextFieldPre.setFocusable(true);
        jTextFieldState.setText("You have died, try again");
        jTextFieldPre.setBackground(Color.white);
        jTextFieldSpeed.setText("10");
    }
    
    public void setPosition(int[] pos){
        jLabelHero.setLocation(pos[0], pos[1]);
        this.heroPosition = pos;
        jTextFieldX.setText(Integer.toString(pos[0]));
        jTextFieldY.setText(Integer.toString(pos[1]));
    }
    
    public int[] getMovement(){
        return movement;
    }
    
    private void initThread(){
        int[] dim = {jPanelGame.getWidth(),jPanelGame.getHeight()};
        
        ag = new ActGame(10, this, dim);
        ag.start();
        
        mySetMovement(1,0);        
    }
    
    private void mySetLocation(){
        // This method pretends to center the view window on the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double screenWidth = screenSize.getWidth();
        double screenHeight = screenSize.getHeight();
        
        this.setLocation((int) ((screenWidth/2)-(this.getWidth()/2)), (int) ((screenHeight/2)-(this.getHeight()/2))); 
    }
    
    private void initBtnList(){
        movementBtns.add(jBtnUp);
        movementBtns.add(jBtnDown);
        movementBtns.add(jBtnRight);
        movementBtns.add(jBtnLeft);
        movementBtns.add(jButtonSpeedDown);
        movementBtns.add(jButtonSpeedUp);
    }
    
    private void mySetInitState(){
        mySetMovementBtns(false);
        jBtnPause.setEnabled(false);
    }
    
    private void mySetInGameState(){
        mySetMovementBtns(true);
        jBtnPause.setEnabled(true);
        jTextFieldNickname.setText("Wellcome: " + jTextFieldPre.getText());
        jBtnStart.setEnabled(false);
        
        jTextFieldPre.setEditable(false);
        jTextFieldPre.setFocusable(false);
        jTextFieldPre.setText("");
        jTextFieldPre.setBackground(Color.GRAY);
       
        jTextFieldState.setText("PLAYING");
        
        jTextFieldX.setText(Integer.toString(this.heroPosition[0]));
        jTextFieldX.setText(Integer.toString(this.heroPosition[1]));
        
        initThread();
    }
    
    private void mySetPauseState(){
        if (jBtnPause.getText().equals("PAUSE")){
            jBtnPause.setText("PLAY");
            mySetMovementBtns(false);
            jTextFieldState.setText("PAUSE");
            jLabelHero.setText("PAUSED");
            jPanelGame.setBackground(Color.gray);
            ag.setPause(true);
        }else{
            jBtnPause.setText("PAUSE");
            mySetMovementBtns(true);   
            jTextFieldState.setText("PLAYING");
            jLabelHero.setText("O");
            jLabelHero.setLocation(heroPosition[0], heroPosition[1]);
            jPanelGame.setBackground(Color.white);
            ag.setPause(false);
        }
        
    }
    
    private void mySetMovementBtns(boolean bool){
        for(javax.swing.JButton button: movementBtns){
            button.setEnabled(bool);
        }
    }
    
    private void mySetMovement(int xMov, int yMov){
        movement[0] = xMov;
        movement[1] = yMov;
    }
}