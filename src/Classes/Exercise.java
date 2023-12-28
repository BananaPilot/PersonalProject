package Classes;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 * <pre>
 *   Creates a new exercise
 *   main fields:
 *   - counter: A filed to make the auto increment of the ID possible
 *   - ID: The ID of the exercise
 *   - name: The name of the exercise
 *   - description: The description of the exercise
 *   - grade: The grade of the exercise
 *   - difficulty (implemented in src/Classes/Difficulty): the difficulty of the exercise
 *   - competitionDate: the date of competition is automatically set when the filed completed is switched to true
 *   - completed: boolean that controls if the exercise has been completed
 * </pre>
 * <pre>
 *   Example:
 *   {@code
 *   Exercise exercise = new Exercise(name, description, difficulty)
 *   }
 * </pre>
 * @class
 * @see java.lang.Class
 * @constructor (name, description, difficulty)
 */
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

  /**
   * <pre>
   *   used to get both the instance and the position in the array of exercises
   * </pre>
   * @method
   * @param ID The ID of the exercise
   * @param exercises The array of exercises
   * @return an object that contains both the instance of Exercise and the index of the array
   */
  public static InstanceIndex<Exercise> getExerciseAndIndex(int ID, ArrayList<Exercise> exercises){
    int index = 0;
    for (Exercise exercise : exercises){
      if (exercise.getID() == ID){
        return new InstanceIndex<>(exercise, index);
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
}
