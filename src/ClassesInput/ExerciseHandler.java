package ClassesInput;

import Classes.Difficulty;
import Classes.Exercise;
import Classes.InstanceIndex;
import Prompts.Prompts;

import java.util.ArrayList;

public class ExerciseHandler {
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

  public static Exercise createExercise(){
    System.out.print("Name: ");
    String name = In.scanner.nextLine();
    System.out.print("Description: ");
    String description = In.scanner.nextLine();
    Difficulty difficulty = chooseDifficulty();
    return new Exercise(name, description, difficulty);
  }

  public static void getExercises(ArrayList<Exercise> exercises){
    if (exercises.isEmpty()){
      System.out.println("List is empty");
    } else {
      for (Exercise exercise : exercises){
        System.out.println(exercise);
      }
    }
  }

  public static InstanceIndex<Exercise> getExercise(ArrayList<Exercise> exercises){
    int ID = GetInput.getID();
    return Exercise.getStudentAndIndex(ID, exercises);
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
