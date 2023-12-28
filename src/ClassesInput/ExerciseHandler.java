package ClassesInput;

import Classes.Difficulty;
import Classes.Exercise;
import Classes.InstanceIndex;
import Prompts.Prompts;

import java.util.ArrayList;

/**
 * <pre>
 *   Class that is used to interact with the scanner implements the CRUD (Create, Read, Update, Delete)
 *   is a set of 6 methods:
 *   - exerciseCRUDInterface: This is our user interface for this project so a way that out application can "talk" to the final user
 *   - createExercise: A method to create a new Exercise
 *   - getExercises: A method to list all our exercises in the array
 *   - getExercise: A method to list a specific exercise in the array
 *   - deleteExercise: A method to delete a specific exercise in the array
 *   - modifyExercise: A method to modify a specific exercise in the array
 * </pre>
 * @methodList
 */
public class ExerciseHandler {
  /**
   * <pre>
   *   implements an easy way to "speak" to the final user my prompting the user with different choices
   *   example of prompt:
   *    {@code
   *        System.out.println("1. Create a new exercise");
   *        System.out.println("2. List all exercises");
   *        System.out.println("3. List a specific exercise");
   *        System.out.println("4. Delete an exercise");
   *        System.out.println("5. Modify an exercise");
   *        System.out.println("0. Back to main menu");
   *        System.out.print("Input: ");
   *    }
   * </pre>
   * @method
   */
  public static void exerciseCRUDInterface(){
    ArrayList<Exercise> exercises = new ArrayList<>();
    int input;
    do {
      Prompts.exerciseManagingPrompt();
      input = GetInput.getInput();
      switch (input){
        case 1:
          exercises.add(createExercise());
          break;
        case 2:
          getExercises(exercises);
          break;
        case 3:
          InstanceIndex<Exercise> exercise = getExercise(exercises);
          System.out.println(exercise.element().toString());
          break;
        case 4:
          deleteExercise(exercises);
          break;
        case 5:
          modifyExercise(exercises);
          break;
      }
    } while (input > 0);
  }

  /**
   * <pre>
   *   creates a new Exercise by calling the class Exercise constructor
   * </pre>
   * @return new Exercise
   */
  public static Exercise createExercise(){
    System.out.print("Name: ");
    String name = In.scanner.nextLine();
    System.out.print("Description: ");
    String description = In.scanner.nextLine();
    Difficulty difficulty = chooseDifficulty();
    return new Exercise(name, description, difficulty);
  }

  /**
   * <pre>
   *   Lists all the exercises in our exercises array so our final user can easily see all the exercises
   * </pre>
   * @param exercises the array that contains all the exercises
   */
  public static void getExercises(ArrayList<Exercise> exercises){
    if (exercises.isEmpty()){
      System.out.println("List is empty");
    } else {
      for (Exercise exercise : exercises){
        System.out.println(exercise);
      }
    }
  }

  /**
   * <pre>
   *   Lists a specific exercise by asking the id and searching in the array and finding both the instance and the index in the array
   * </pre>
   * @param exercises the array that contains all the exercises
   * @return both the instance of the exercise and the position in the array
   */
  public static InstanceIndex<Exercise> getExercise(ArrayList<Exercise> exercises){
    int ID = GetInput.getID();
    return Exercise.getExerciseAndIndex(ID, exercises);
  }

  public static void deleteExercise(ArrayList<Exercise> exercises) {
    int index = getExercise(exercises).index();
    exercises.remove(index);
    System.out.println("Exercise has been removed");
  }

  public static void modifyExercise(ArrayList<Exercise> exercises){
    Exercise exercise = getExercise(exercises).element();
    int input;
    do {
      Prompts.exerciseModifyPrompt();
      input = GetInput.getInput();
      switch (input){
        case 1:
          System.out.print("New name: ");
          String name = In.scanner.nextLine();
          assert exercise != null;
          exercise.setName(name);
          break;
        case 2:
          System.out.print("New description: ");
          String description = In.scanner.nextLine();
          assert exercise != null;
          exercise.setDescription(description);
          break;
        case 3:
          System.out.print("New grade: ");
          int grade = In.scanner.nextInt();
          In.scanner.nextLine();
          assert exercise != null;
          exercise.setGrade(grade);
          break;
        case 4:
          exercise.setDifficulty(chooseDifficulty());
          break;
        case 5:
          exercise.setCompleted();
        default:
          System.out.print("\n Please enter a valid number \n");
          break;
      }
    } while (input > 0);
  }

  public static Difficulty chooseDifficulty(){
    Prompts.difficultyLevelPrompt();
    int input = GetInput.getInput();
      return switch (input) {
      case 1 -> Difficulty.Beginner;
      case 2 -> Difficulty.Easy;
      case 3 -> Difficulty.Medium;
      case 4 -> Difficulty.Hard;
      case 5 -> Difficulty.Expert;
      default -> {
        System.out.println("Difficulty has been set to beginner");
        yield Difficulty.Beginner;
      }
    };
  }

}
