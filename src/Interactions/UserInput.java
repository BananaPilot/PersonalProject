package Interactions;

import Classes.InstanceIndex;
import Classes.Student;
import Prompts.Prompts;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
  public static Scanner scanner = new Scanner(System.in);

  public static int getInput(){
    int input = scanner.nextInt();
    scanner.nextLine();
    return input;
  }

  public static void studentCRUDInterface(){
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
        case 5:
          UserInput.modifyStudent(students);
          break;
        default:
          if (input != 0){
            System.out.print("\n Please enter a valid number \n");
          }
          break;
      }
    } while (input > 0);
  }

  public static Student createStudent(){
    System.out.print("Name: ");
    String name = scanner.nextLine();
    System.out.print("Surname: ");
    String surname = scanner.nextLine();
    System.out.print("Major: ");
    String major = scanner.nextLine();
    System.out.print("MajorID: ");
    String majorID = scanner.nextLine();
    return new Student(name, surname, major, majorID);
  }

  public static void getStudents(ArrayList<Student> students){
    if (students.isEmpty()){
      System.out.println("List is empty");
    } else {
      for (Student student : students) {
        System.out.println(student);
      }
    }
  }

  public static InstanceIndex<Student> getStudent(ArrayList<Student> students){
    int ID = Prompts.getID();
    return Student.getStudentAndIndex(ID, students);
  }

  public static void deleteStudent(ArrayList<Student> students){
    int index = getStudent(students).index();
    students.remove(index);
    System.out.println("Student has been deleted");
  }

  public static void modifyStudent(ArrayList<Student> students){
    InstanceIndex<Student> student = getStudent(students);
    int input;
    do {
      Prompts.modifyPrompt();
      input = getInput();
      switch (input){
        case 1:
          System.out.print("New name: ");
          String name = scanner.nextLine();
          assert student != null;
          student.element().setName(name);
          break;
        case 2:
          System.out.print("New surname: ");
          String surname = scanner.nextLine();
          assert student != null;
          student.element().setSurname(surname);
          break;
        case 3:
          System.out.print("New major: ");
          String major = scanner.nextLine();
          assert student != null;
          student.element().setMajor(major);
          break;
        case 4:
          System.out.print("New majorID: ");
          String majorID = scanner.nextLine();
          assert student != null;
          student.element().setMajorID(majorID);
          break;
        default:
          System.out.print("\n Please enter a valid number \n");
          break;
      }
    } while (input > 0);
  }
}
