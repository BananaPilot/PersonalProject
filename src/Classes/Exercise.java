package Classes;

import Enums.Difficulty;

import java.time.LocalDateTime;

public class Exercise {
  private static int counter = 1;
  private final int ID;
  private String name;
  private String description;
  private int grade;
  private Difficulty difficulty;
  private LocalDateTime completionDate;
  private boolean completed;
  public Exercise(String name, String description, int grade, Difficulty difficulty) {
    this.ID = incrementAndGet();
    this.name = name;
    this.description = description;
    this.grade = grade;
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

  private static int incrementAndGet(){
    return counter++;
  }
}
