package ClassesInput;

/**
 * <pre>
 *   Class used to group all the methods to get an input from the final user
 * </pre>
 * @methodList
 */
public class GetInput {
  /**
   *  <pre>
   *    Gets and returns the input from the final user
   *  </pre>
   * @return the input entered by the final user
   */
  public static int getInput(){
    int input = In.scanner.nextInt();
    //do not touch this line cause of bug listed in this thread: https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
    In.scanner.nextLine();
    return input;
  }

  /**
   * <pre>
   *   Gets and returns the ID from the final user
   * </pre>
   * @return the ID that the final user entered
   */
  public static int getID(){
    System.out.print("ID of the student: ");
    //do not touch this line cause of bug listed in this thread: https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
    int ID = In.scanner.nextInt();
    In.scanner.nextLine();
    return ID;
  }
}
