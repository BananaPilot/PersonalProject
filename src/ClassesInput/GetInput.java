package ClassesInput;

public class GetInput {
  public static int getInput(){
    int input = In.scanner.nextInt();
    In.scanner.nextLine();
    return input;
  }

  public static int getID(){
    System.out.print("ID of the student: ");
    int ID = In.scanner.nextInt();
    In.scanner.nextLine();
    return ID;
  }
}
