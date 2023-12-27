package Interactions;

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

  public static Student getStudent(ArrayList<Student> students){
    int ID = Prompts.getID();
    for (Student student : students){
      if (student.getID() == ID){
        return student;
      }
    }
    return null;
  }

  public static void deleteStudent(ArrayList<Student> students){
    int ID = Prompts.getID();
    int index = 0;
    for (Student student : students){
      if (student.getID() == ID){
        students.remove(index);
        break;
      }
      index++;
    }
    System.out.println("Student with ID " + ID + " has been deleted");
  }

  public static void modifyStudent(ArrayList<Student> students){
    Student student = getStudent(students);
    int input;
    do {
      Prompts.modifyPrompt();
      input = getInput();
      switch (input){
        case 1:
          System.out.print("New name: ");
          String name = scanner.nextLine();
          assert student != null;
          student.setName(name);
          break;
        case 2:
          System.out.print("New surname: ");
          String surname = scanner.nextLine();
          assert student != null;
          student.setSurname(surname);
          break;
        case 3:
          System.out.print("New major: ");
          String major = scanner.nextLine();
          assert student != null;
          student.setMajor(major);
          break;
        case 4:
          System.out.print("New majorID: ");
          String majorID = scanner.nextLine();
          assert student != null;
          student.setMajorID(majorID);
          break;
      }
    } while (input > 0);
  }
}
