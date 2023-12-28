import ClassesInput.ExerciseHandler;
import ClassesInput.GetInput;
import ClassesInput.In;
import ClassesInput.StudentHandler;
import Prompts.Prompts;

public class Main {
  public static void main(String[] args) {
    int input;
    do {
      Prompts.mainPrompt();
      input = GetInput.getInput();
      switch (input){
        case 1:
          StudentHandler.studentCRUDInterface();
          break;
        case 2:
          ExerciseHandler.exerciseCRUDInterface();
          break;
        default:
          if (input != 0){
            System.out.print("\n Please enter a valid number \n");
          }
          break;
      }
    } while (input > 0);
    In.scanner.close();
  }
}
