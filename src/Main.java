import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input;
    do{
      System.out.println("Develhope Student management software");
      System.out.println("1. Create a new student");
      System.out.println("2. List all students");
      System.out.println("3. List a specific student");
      System.out.println("4. Delete a student");
      System.out.println("5. Modify a student");
      System.out.println("0. Exit the program");
      System.out.print("input: ");
      input = scanner.nextInt();
    }while(input > 0);
    scanner.close();
  }
}
