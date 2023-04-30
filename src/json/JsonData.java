package json;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entities.ListStudent;
import entities.Student;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class JsonData {

	public static ArrayList<Student> readJson() {

		Gson gson = new Gson();

		String jsonStr;

		try {
			jsonStr = new String(Files.readAllBytes(Paths.get("output.json")));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		return gson.fromJson(jsonStr, new TypeToken<ArrayList<Student>>(){}.getType());
	}

	public static void writeJson(ArrayList<Student> listStudent) {

		Gson gson = new Gson();

		listStudent.add(new Student("Ngô Thanh Vương", "VKU", "Nam", 19, 10));
		listStudent.add(new Student("Ngô Thanh Đạt", "VKU", "Nam", 19, 10));

		String listJson = gson.toJson(listStudent);

		try {
			Files.write(Paths.get("output.json"), listJson.getBytes());
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		readJson();
//		writeJson(ListStudent.listStudents);
	}

}
