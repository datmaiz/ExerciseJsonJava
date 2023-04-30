
package view;

import component.RoundPanel;
import event.ListEvent;
import process.ListProcess;
import process.ListStudent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ListPanel extends JPanel {

    ListProcess listProcess = new ListProcess(this);

    public ListPanel() {
        initComponents();
        initEvent();
        listProcess.pushDataToTable(ListStudent.listStudents);
    }

    private void initEvent() {
        export.addActionListener(actionListener);
        save.addActionListener(actionListener);
        sort.addActionListener(actionListener);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel1 = new RoundPanel();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();
        export = new JButton();
        save = new JButton();
        sort = new JButton();

        setOpaque(false);

        roundPanel1.setBackground(new Color(51, 51, 51));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Tên", "Tên trường", "Giới tính", "Tuổi", "Điểm"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable1.getTableHeader().setFont(new Font("Poppins", Font.BOLD, 14));
        jTable1.setFont(new Font("SF Mono", 0, 12));

        export.setFont(new Font("Segoe UI", 1, 12)); // NOI18N
        export.setText("Xuất ra file");

        save.setFont(new Font("Segoe UI", 1, 12)); // NOI18N
        save.setText("Lưu vào DB");

        sort.setFont(new Font("Segoe UI", 1, 12)); // NOI18N
        sort.setText("Sắp xếp");

        GroupLayout roundPanel1Layout = new GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
                    .addGroup(roundPanel1Layout.createSequentialGroup()
                        .addComponent(export, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(save)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sort)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(export, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(save, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sort, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    public JButton getExport() {
        return export;
    }

    public void setExport(JButton export) {
        this.export = export;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public RoundPanel getRoundPanel1() {
        return roundPanel1;
    }

    public void setRoundPanel1(RoundPanel roundPanel1) {
        this.roundPanel1 = roundPanel1;
    }

    public JButton getSave() {
        return save;
    }

    public void setSave(JButton save) {
        this.save = save;
    }

    public JButton getSort() {
        return sort;
    }

    public void setSort(JButton sort) {
        this.sort = sort;
    }

    private ActionListener actionListener = new ListEvent(this, listProcess);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton export;
    private JScrollPane jScrollPane1;
    private JTable jTable1;
    private RoundPanel roundPanel1;
    private JButton save;
    private JButton sort;
    // End of variables declaration//GEN-END:variables
}
