
package dao;

import connection.MyConnection;
import entities.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDAO {

	public static void addStudent(Student student) {

		int rowChange = 0;

		Connection connection = MyConnection.getConnection();
		String query = "insert into `StudentInfo` (`name`, `schoolName`, `gender`, `age`, `mark`)" +
				" value (?,?,?,?,?)";
		try {
		    PreparedStatement preparedStatement = connection.prepareStatement(query );
			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getNameSchool());
			preparedStatement.setString(3, student.getGender());
			preparedStatement.setInt(4, student.getAge());
			preparedStatement.setDouble(5, student.getMark());
			rowChange = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(rowChange + " dòng đã bị thay đổi");

	}

}
