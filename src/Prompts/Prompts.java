package Prompts;

public class Prompts {
  public static void mainPrompt(){
    System.out.println("Develhope managing software");
    System.out.println("1. Manage students");
    System.out.println("2. Manage exercises");
    System.out.println("3. Manage projects");
    System.out.println("4. Manage classes");
    System.out.println("0. Exit the Program");
    System.out.print("Input: ");
  }
  public static void studentManagingPrompt(){
    System.out.println("1. Create a new student");
    System.out.println("2. List all students");
    System.out.println("3. List a specific student");
    System.out.println("4. Delete a student");
    System.out.println("5. Modify a student");
    System.out.println("0. Back to main menu");
    System.out.print("Input: ");
  }

  public static void exerciseManagingPrompt(){
    System.out.println("1. Create a new exercise");
    System.out.println("2. List all exercises");
    System.out.println("3. List a specific exercise");
    System.out.println("4. Delete an exercise");
    System.out.println("5. Modify an exercise");
    System.out.println("0. Back to main menu");
    System.out.print("Input: ");
  }

  public static void studentModifyPrompt(){
    System.out.println("1. Change name");
    System.out.println("2. Change Surname");
    System.out.println("3. Change Major");
    System.out.println("4. Change MajorID");
    System.out.println("0. Back to student menu");
    System.out.print("Input: ");
  }

  public static void exerciseModifyPrompt(){
    System.out.println("1. Change name");
    System.out.println("2. Change description");
    System.out.println("3. Change grade");
    System.out.println("4. Change difficulty");
    System.out.println("5. Change completion status");
    System.out.println("0. Back to student menu");
    System.out.print("Input: ");
  }

  public static void difficultyLevelPrompt(){
    System.out.println("Chose an exercise difficulty");
    System.out.println("1. Beginner");
    System.out.println("2. Easy");
    System.out.println("3. Medium");
    System.out.println("4. Hard");
    System.out.println("5. Expert");
    System.out.print("Input: ");
  }
}
