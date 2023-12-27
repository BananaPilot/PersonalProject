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
    System.out.print("Input: ");
  }

  public static void modifyPrompt(){
    System.out.println("1. Change name");
    System.out.println("2. Change Surname");
    System.out.println("3. Change Major");
    System.out.println("4. Change MajorID");
    System.out.println("0. Back to main menu");
    System.out.print("Input: ");
  }

  public static int getID(){
    System.out.print("ID of the student: ");
    int ID = UserInput.scanner.nextInt();
    UserInput.scanner.nextLine();
    return ID;
  }
}
