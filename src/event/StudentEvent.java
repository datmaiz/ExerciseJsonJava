
package event;

import process.StudentProcess;
import view.InputPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentEvent implements ActionListener{

    private InputPanel process;
    private StudentProcess studentProcess;

    public StudentEvent(InputPanel process, StudentProcess studentProcess) {
        this.process = process;
        this.studentProcess = studentProcess;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        switch (src) {
            case "Thêm sinh viên" -> studentProcess.addStudent();
            default -> System.out.println("Không hợp lệ");
        }
    }
    
}
