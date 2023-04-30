
package entities;

public class Student {
    private String name;
    private String nameSchool;
    private String gender;
    private int age;
    private double mark;

    public Student() {
    }

    public Student(String name, String nameSchool, String gender, int age, double mark) {
        this.name = name;
        this.nameSchool = nameSchool;
        this.gender = gender;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", nameSchool='" + nameSchool + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
