package Classes;

import java.util.ArrayList;

/**
 * <pre>
 *   Creates a new student
 *   main fields:
 *   - name: Name of the students
 *   - surname: Surname of the student
 *   - major: What is the student majoring in
 *   - majorID: Class ID
 *   - exercises: The exercises that the student needs to make or has already made
 *   - projects: The projects that the student needs to make or has already made
 * </pre>
 * <pre>
 *   Example:
 *   {@code
 *   Student student = new Student(name, surname, major, majorID);
 *   }
 * </pre>
 * @class
 * @see java.lang.Class
 * @constructor (name, surname, major, majorID)
 */
public class Student {
  private static int counter = 1;
  private final int ID;
  private String name;
  private String surname;
  private String major;
  private String majorID;
  private ArrayList<Exercise> exercises;
  private ArrayList<Project> projects;

  public Student(String name, String surname, String major, String majorID){
    this.name = name;
    this.surname = surname;
    this.major = major;
    this.majorID = majorID;
    this.ID = incrementAndGet();
  }

  public int getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getMajor() {
    return major;
  }

  public String getMajorID() {
    return majorID;
  }

  public ArrayList<Exercise> getExercises() {
    return exercises;
  }

  public ArrayList<Project> getProjects() {
    return projects;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public void setMajorID(String majorID) {
    this.majorID = majorID;
  }

  public void setExercises(ArrayList<Exercise> exercises) {
    this.exercises = exercises;
  }

  public void setProjects(ArrayList<Project> projects) {
    this.projects = projects;
  }

  public void addExercise(Exercise exercise) {
    this.exercises.add(exercise);
  }

  public void removeExercise(int ID) {

  }

  public void modifyExercise(int ID) {

  }

  public void getExercise(int ID) {

  }

  public void addProject(Project project) {
    this.projects.add(project);
  }

  public void removeProject(int ID) {

  }

  public void modifyProject(int ID) {

  }

  public void getProject(int ID) {

  }

  /**
   * <pre>
   *   used to get both the instance and the position in the array of students
   * </pre>
   * @method
   * @param ID The ID of the student
   * @param students The array of students
   * @return an object that contains both the instance of Student and the index of the array
   */
  public static InstanceIndex<Student> getStudentAndIndex(int ID, ArrayList<Student> students){
    int index = 0;
    for (Student student : students){
      if (student.getID() == ID){
        return new InstanceIndex<>(student, index);
      }
      index++;
    }
    return null;
  }

  /**
   * used to have auto-incremental ID
   * @method
   * @return the increment of counter + 1
   */
  private static int incrementAndGet(){
    return counter++;
  }

  @Override
  public String toString() {
    return "Student{" +
            "ID=" + ID +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", major='" + major + '\'' +
            ", majorID='" + majorID + '\'' +
            ", exercises=" + exercises +
            ", projects=" + projects +
            '}';
  }
}
