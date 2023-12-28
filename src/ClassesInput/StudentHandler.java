package ClassesInput;

import Classes.InstanceIndex;
import Classes.Student;
import Prompts.Prompts;

import java.util.ArrayList;

public class StudentHandler {

  public static void studentCRUDInterface(){
    ArrayList<Student> students = new ArrayList<>();
    int input;
    do {
      Prompts.studentManagingPrompt();
      input = GetInput.getInput();
      switch (input){
        case 1:
          students.add(createStudent());
          break;
        case 2:
          getStudents(students);
          break;
        case 3:
          InstanceIndex<Student> student = getStudent(students);
          System.out.println(student.element().toString());
          break;
        case 4:
          deleteStudent(students);
          break;
        case 5:
          modifyStudent(students);
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
    String name = In.scanner.nextLine();
    System.out.print("Surname: ");
    String surname = In.scanner.nextLine();
    System.out.print("Major: ");
    String major = In.scanner.nextLine();
    System.out.print("MajorID: ");
    String majorID = In.scanner.nextLine();
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
    int ID = GetInput.getID();
    return Student.getStudentAndIndex(ID, students);
  }

  public static void deleteStudent(ArrayList<Student> students){
    int index = getStudent(students).index();
    students.remove(index);
    System.out.println("Student has been deleted");
  }

  public static void modifyStudent(ArrayList<Student> students){
    Student student = getStudent(students).element();
    int input;
    do {
      Prompts.studentModifyPrompt();
      input = GetInput.getInput();
      switch (input){
        case 1:
          System.out.print("New name: ");
          String name = In.scanner.nextLine();
          assert student != null;
          student.setName(name);
          break;
        case 2:
          System.out.print("New surname: ");
          String surname = In.scanner.nextLine();
          assert student != null;
          student.setSurname(surname);
          break;
        case 3:
          System.out.print("New major: ");
          String major = In.scanner.nextLine();
          assert student != null;
          student.setMajor(major);
          break;
        case 4:
          System.out.print("New majorID: ");
          String majorID = In.scanner.nextLine();
          assert student != null;
          student.setMajorID(majorID);
          break;
        default:
          System.out.print("\n Please enter a valid number \n");
          break;
      }
    } while (input > 0);
  }
}
