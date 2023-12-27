import Classes.Student;
import Interactions.UserInput;
import Prompts.Prompts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in);
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    int input;
    do {
      Prompts.mainPrompt();
      input = UserInput.getInput();
      switch (input){
        case 1:
          students.add(UserInput.createStudent());
          break;
        case 2:
          UserInput.getStudents(students);
          break;
        case 3:
          System.out.println(UserInput.getStudent(students));
          break;
        case 4:
          UserInput.deleteStudent(students);
          break;
      }
    } while (input > 0);
    UserInput.scanner.close();
  }
}
