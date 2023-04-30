package view;

import component.RoundPanel;
import event.SwitchCardEvent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends javax.swing.JFrame {

    public MainView() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        initEvent();
        init();
    }
    
    private void initEvent() {
        inputButton.addActionListener(switchAction);
        listButton.addActionListener(switchAction);
        exit.addActionListener( (e) -> {
            System.exit(0);
        });
    }
    
    private void init() {
        contentPanel.setLayout(cardLayout);
        contentPanel.add(inputPanel, "input");
        contentPanel.add(listPanel, "list");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new RoundPanel();
        roundPanel2 = new RoundPanel();
        inputButton = new JButton();
        listButton = new JButton();
        exit = new JButton();
        contentPanel = new RoundPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        roundPanel1.setBackground(new Color(51, 51, 51));

        roundPanel2.setBackground(new Color(51, 51, 51));

        inputButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputButton.setText("Nhập liệu");
        inputButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        listButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        listButton.setText("Danh sách");
        listButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        exit.setForeground(new Color(255, 51, 51));
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 723, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );

        contentPanel.setBackground(new Color(51, 51, 51));

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 532, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
    
    public MainView(RoundPanel contentPanel, JButton inputButton, JButton listButton, RoundPanel roundPanel1, RoundPanel roundPanel2) throws HeadlessException {
        this.contentPanel = contentPanel;
        this.inputButton = inputButton;
        this.listButton = listButton;
        this.roundPanel1 = roundPanel1;
        this.roundPanel2 = roundPanel2;
    }

    public ListPanel getListPanel() {
        return listPanel;
    }

    public void setListPanel(ListPanel listPanel) {
        this.listPanel = listPanel;
    }

    public InputPanel getInputPanel() {
        return inputPanel;
    }

    public void setInputPanel(InputPanel inputPanel) {
        this.inputPanel = inputPanel;
    }

    public ActionListener getSwitchAction() {
        return switchAction;
    }

    public void setSwitchAction(ActionListener switchAction) {
        this.switchAction = switchAction;
    }

    public RoundPanel getContentPanel() {
        return contentPanel;
    }

    public void setContentPanel(RoundPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public JButton getInputButton() {
        return inputButton;
    }

    public void setInputButton(JButton inputButton) {
        this.inputButton = inputButton;
    }

    public JButton getListButton() {
        return listButton;
    }

    public void setListButton(JButton listButton) {
        this.listButton = listButton;
    }

    public RoundPanel getRoundPanel1() {
        return roundPanel1;
    }

    public void setRoundPanel1(RoundPanel roundPanel1) {
        this.roundPanel1 = roundPanel1;
    }

    public RoundPanel getRoundPanel2() {
        return roundPanel2;
    }

    public void setRoundPanel2(RoundPanel roundPanel2) {
        this.roundPanel2 = roundPanel2;
    }
    
    public CardLayout getCardLayout() {
        return this.cardLayout;
    }
    
    private ListPanel listPanel = new ListPanel();
    private InputPanel inputPanel = new InputPanel();
    private final CardLayout cardLayout = new CardLayout();
    private ActionListener switchAction = new SwitchCardEvent(this);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RoundPanel contentPanel;
    private JButton exit;
    private JButton inputButton;
    private JButton listButton;
    private RoundPanel roundPanel1;
    private RoundPanel roundPanel2;
    // End of variables declaration//GEN-END:variables
}
