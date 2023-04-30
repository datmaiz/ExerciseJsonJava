
package event;

import process.ListProcess;
import process.ListStudent;
import view.ListPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListEvent implements ActionListener {

    private ListPanel ListPanel;
    private ListProcess listProcess;

    public ListEvent(ListPanel ListPanel, ListProcess listProcess) {
        this.ListPanel = ListPanel;
        this.listProcess = listProcess;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        switch (src) {
            case "Xuất ra file" -> {
                listProcess.exportToFile();
            }
            case "Lưu vào DB" -> listProcess.saveToDatabase(ListStudent.listStudents);
            case "Sắp xếp" -> {
                listProcess.sortStudentByMark(ListStudent.listStudents);
            }
            default -> throw new AssertionError();
        }
    }
    
}
