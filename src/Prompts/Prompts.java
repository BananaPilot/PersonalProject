package Prompts;

import Interactions.UserInput;

public class Prompts {
  public static void mainPrompt(){
    System.out.println("Develhope Student management software");
    System.out.println("1. Create a new student");
    System.out.println("2. List all students");
    System.out.println("3. List a specific student");
    System.out.println("4. Delete a student");
    System.out.println("5. Modify a student");
    System.out.println("0. Exit the program");
    System.out.print("input: ");
  }

  public static int getID(){
    System.out.print("ID of the student: ");
    int ID = UserInput.scanner.nextInt();
    UserInput.scanner.nextLine();
    return ID;
  }
}
