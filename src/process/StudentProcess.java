
package process;

import entities.Student;
import view.InputPanel;

import javax.swing.*;

public class StudentProcess {

    private InputPanel inputPanel;

    public StudentProcess(InputPanel inputPanel) {
        this.inputPanel = inputPanel;
    }
    
    public void addStudent() {
        String name = inputPanel.getNameField().getText();
        String gender = inputPanel.getMale().isSelected() ? "Nam" : "Nữ";
        String schoolName = inputPanel.getSchoolField().getText();
        double mark;
        int age;
        
        try {
            mark = Double.parseDouble(inputPanel.getMarkField().getText());
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Trường điểm nhập không hợp lệ");
            return;
        }
        
        try {
            age = Integer.parseInt(inputPanel.getAgeField().getText());
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Trường tuổi nhập không hợp lệ");
            return;
        }

        if(validInfo(name, schoolName, gender, age, mark)) {
            Student student = new Student(name, schoolName, gender, age, mark);
            ListStudent.listStudents.add(student);
        }
        else {
            JOptionPane.showMessageDialog(null, "Thông tin chưa hợp lệ");
        }
        
    }
    
    private boolean validInfo(String name, String school, String gender, int age, double mark) {
        if(name.isBlank()) return false;
        if(school.isBlank()) return false;
        if(gender.isBlank()) return false;
        if(age < 0) return false;
        return !(mark < 0) && !(mark > 10);
    }
    
}
