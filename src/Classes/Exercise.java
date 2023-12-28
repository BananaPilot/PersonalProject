package Classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Exercise {
  private static int counter = 1;
  private final int ID;
  private String name;
  private String description;
  private int grade;
  private Difficulty difficulty;
  private LocalDateTime completionDate;
  private boolean completed;
  public Exercise(String name, String description, Difficulty difficulty) {
    this.ID = incrementAndGet();
    this.name = name;
    this.description = description;
    this.difficulty = difficulty;
    this.completed = false;
  }

  public int getID() {
    return ID;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getGrade() {
    return grade;
  }

  public Difficulty getDifficulty() {
    return difficulty;
  }

  public LocalDateTime getCompletionDate() {
    return completionDate;
  }

  public boolean isCompleted() {
    return completed;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public void setDifficulty(Difficulty difficulty) {
    this.difficulty = difficulty;
  }

  public void setCompleted() {
    this.completed = true;
    this.completionDate = LocalDateTime.now();
  }

  public static InstanceIndex<Exercise> getStudentAndIndex(int ID, ArrayList<Exercise> exercises){
    int index = 0;
    for (Exercise exercise : exercises){
      if (exercise.getID() == ID){
        return new InstanceIndex<>(exercise, index);
      }
      index++;
    }
    return null;
  }

  private static int incrementAndGet(){
    return counter++;
  }
}
