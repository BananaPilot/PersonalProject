package Classes;

import java.time.LocalDateTime;

/**
 * <pre>
 *   Creates a new project
 *   main fields:
 *   - counter: A filed to make the auto increment of the ID possible
 *   - ID: The ID of the exercise
 *   - githubUrl: the link to the github repo
 *   - grade: The grade of the exercise
 *   - competitionDate: the date of competition is automatically set when the filed completed is switched to true
 *   - completed: boolean that controls if the exercise has been completed
 * </pre>
 * <pre>
 *   Example:
 *   {@code
 *   Project project = new Project(githubUrl, grade);
 *   }
 * </pre>
 * @class
 * @see java.lang.Class
 * @constructor (githubUrl, grade)
 */
public class Project {
  private static int counter = 1;
  private final int ID;
  private String githubUrl;
  private int grade;
  private boolean completed;
  private LocalDateTime completionDate;

  public Project(String githubUrl, int grade){
    this.ID = incrementAndGet();
    this.githubUrl = githubUrl;
    this.grade = grade;
    this.completed = false;
  }

  public int getID() {
    return ID;
  }

  public String getGithubUrl() {
    return githubUrl;
  }

  public int getGrade() {
    return grade;
  }

  public boolean isCompleted() {
    return completed;
  }

  public LocalDateTime getCompletionDate() {
    return completionDate;
  }

  public void setGithubUrl(String githubUrl) {
    this.githubUrl = githubUrl;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public void setCompleted() {
    this.completed = true;
    this.completionDate = LocalDateTime.now();
  }

  private static int incrementAndGet(){
    return counter++;
  }
}
