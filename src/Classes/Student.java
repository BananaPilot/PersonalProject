package Classes;

import java.util.ArrayList;

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

  private static int incrementAndGet(){
    return counter++;
  }
}
