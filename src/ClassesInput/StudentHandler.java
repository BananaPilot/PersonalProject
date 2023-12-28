package ClassesInput;

import Classes.InstanceIndex;
import Classes.Student;
import Prompts.Prompts;

import java.util.ArrayList;

/**
 * <pre>
 *   Class that is used to interact with the scanner implements the CRUD (Create, Read, Update, Delete)
 *   is a set of 6 methods:
 *   - studentCRUDInterface: This is our user interface for this project so a way that out application can "talk" to the final user
 *   - createStudent: A method to create a new student
 *   - getStudents: A method to list all students in the array
 *   - getStudent: A method to list a specific student in the array
 *   - deleteStudent: A method to delete a specific student in the array
 *   - modifyStudent: A method to modify a specific student
 * </pre>
 * @methodList
 */
public class StudentHandler {

  /**
   * <pre>
   * implements an easy way to "speak" to the final user my prompting the user with different choices
   * example of prompt:
   * {@code
   *     System.out.println("1. Create a new student");
   *     System.out.println("2. List all students");
   *     System.out.println("3. List a specific student");
   *     System.out.println("4. Delete a student");
   *     System.out.println("5. Modify a student");
   *     System.out.println("0. Back to main menu");
   *     System.out.print("Input: ");
   * }
   * </pre>
   * @method
   */
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

  /**
   * <pre>
   *   Creates a new student by calling the Student constructor
   * </pre>
   * @return new Student
   */
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

  /**
   * <pre>
   *   Lists all the students in out array of students so our final user can see all the students
   * </pre>
   * @param students the array that contains all the students
   */
  public static void getStudents(ArrayList<Student> students){
    if (students.isEmpty()){
      System.out.println("List is empty");
    } else {
      for (Student student : students) {
        System.out.println(student);
      }
    }
  }

  /**
   * <pre>
   *   Lists a specific student by asking the id and searching in the array and finding both the instance and the index in the array
   * </pre>
   * @param students the array that contains all the students
   * @return both the instance of the exercise and the position in the array
   */
  public static InstanceIndex<Student> getStudent(ArrayList<Student> students){
    int ID = GetInput.getID();
    return Student.getStudentAndIndex(ID, students);
  }

  /**
   * <pre>
   *   Gets and delete the specified student
   * </pre>
   * @param students the array that contains all the students
   */
  public static void deleteStudent(ArrayList<Student> students){
    int index = getStudent(students).index();
    students.remove(index);
    System.out.println("Student has been deleted");
  }
  /**
   * <pre>
   *   Gets and modify the specified students
   * </pre>
   * @param students the array that contains all the students
   */
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
