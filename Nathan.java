//Nathan Methods

import java.util.Scanner;
/** @author Nathan Whitacre, Ivan Freeman
 *  @version v0.1.3
 *  **/

public class Nathan {

  //INTEGER METHODS -------------------------------------------------------

  //digitSum Method - Nathan.digitSum(integer)
  //Returns the sum of the inputed integer's digits.

  /** takes a number and sums all its digits
   * @param in the integer in
   * @return the sum of the digits
   * **/
  public static int digitSum(int in) {
    String numS = in + "";
    int length = numS.length();
    char digit;
    String digS;
    int intDig;
    int sum = 0;
    while (length > 0) {
      digit = numS.charAt(length-1);
      digS = digit + "";
      intDig = Integer.parseInt(digS);
      sum += intDig;
      length--;
    }
    return sum;
  }

  //intInput Method - Nathan.intInput(lowerBound, upperBound, invalidMessageString)

  /**Receives input from the user when the desired input is an integer within the specified range. The upper and lower bounds are both inclusive. If an undesired input is received, the user is prompted again, displaying the inputted invalidMessageString. (Note: will still break if user enters an non-numerical input)
   *
   * @param low lowest number in the range
   * @param high highest number in the range
   * @param message message displayed if number isn't in the range
   * @return the number guessed as an int
   */
  public static int intInput(double low, double high, String message) {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print("(Enter your number)\n");
       double dIn = input.nextDouble();
       if ((dIn >= low) && (dIn <= high) && ((dIn % 1) == 0)) {
         return (int)(dIn);
       }
       else {
         System.out.print("\n" + message + "\n");
      }
    }
  }

  //DOUBLE METHODS -------------------------------------------------------

  //roundTenth Method - Nathan.roundTenth(double)

  /** Rounds a double value to the nearest tenth.
   *
   * @param in double in
   * @return double rounded to the nearest tenth
   */
  public static double roundTenth(double in) {
    in = (Math.round(in * 10));
    return in / 10;
  }

  //roundHund Method - Nathan.roundHund(double)

  /** Rounds a double value to the nearest hundredth.
   *
   * @param in double in
   * @return double rounded to the nearest hundredth
   */
  public static double roundHund(double in) {
    in = (Math.round(in * 100));
    return in / 100;
  }


  //roundThou Method - Nathan.roundThou(double)

  /** Rounds a double value to the nearest thousandth.
   *
   * @param in double in
   * @return double rounded to the nearest thousandth
   */
  public static double roundThou(double in) {
    in = (Math.round(in * 1000));
    return in / 1000;
  }

  //STRING & PRINTING METHODS --------------------------------------------

  //spacerLeft Method - Nathan.spacerLeft(String, int spaceSize)
  /**
   *   Prints the amount of spaces equal to the difference between the inputed spaceSize and the length of the inputed string, then prints the string. Useful for creating tables where the length of one cell is inputed as the spaceSize, so that the extra spaces for the cell can be automatically filled for any string inside the cell.
   * @param in string in
   * @param space amount of spaces to the left of the string
   **/

  public static void spacerLeft(String in, int space) {
    space -= in.length();
    while (space > 0) {
      System.out.print(" ");
      space--;
    }
    System.out.print(in);
  }

  //spacerRight Method - Nathan.spacerRight(String, int spaceSize)

  /** Prints the inputed string, then prints the amount of spaces equal to the difference between the inputed spaceSize and the length of the string. Useful for creating tables where the length of one cell is inputed as the spaceSize, so that the extra spaces for the cell can be automatically filled for any string inside the cell.
   *
   * @param in string in
   * @param space amount of spaces to the right of the string
   */
  public static void spacerRight(String in, int space) {
    System.out.print(in);
    space -= in.length();
    while (space > 0) {
      System.out.print(" ");
      space--;
    }
  }

  //charCount Method - Nathan.charCount(String, searchChar)

  /** Counts the number of times an inputed character (searchChar) appears in the inputed string and returns the value as an integer.
   *
   * @param word inputed word
   * @param letter letter to search for in word
   * @return number of letter in word
   */
  public static int charCount(String word, char letter) {
    int count = 0;
    int index = 0;
    word = word.toLowerCase();
    String let = letter + "";
    let = let.toLowerCase();
    letter = let.charAt(0);
    while (index != -1) {
      index = word.indexOf(letter, index+1);
      if (index > 0) {
        count++;
      }
    }
    if (word.charAt(0) == letter) {
      count++;
    }
    return count;
  }

  //intMatrixPrint Method - Nathan.intMatrixPrint(2dArray, elementSpaceSize)

  /** Prints the inputed 2D integer array so that the elements are visably organized in rows and columns. The inputted elementSpaceSize value sets the width of each column.
   *
   * @param matrix 2d int matrix in
   * @param space amount of space between each value
   */
  public static void intMatrixPrint(int[][] matrix, int space) {
    String element;
    for (int[] ints : matrix) {
      for (int colm = 0; colm < ints.length; colm++) {
        element = String.valueOf(ints[colm]);
        spacerLeft(element, space);
        System.out.print(" ");
        if (colm == (ints.length - 1)) {
          System.out.println();
        }
      }
    }
  }

  //doubleMatrixPrint Method - Nathan.doubleMatrixPrint(2dArray, elementSpaceSize)

  /** Prints the inputed 2D double array so that the elements are visably organized in rows and columns. The inputted elementSpaceSize value sets the width of each column.
   *
   * @param matrix 2d double matrix in
   * @param space amount of space between each value
   */
  public static void doubleMatrixPrint(double[][] matrix, int space) {
    String element;
    for (double[] doubles : matrix) {
      for (int colm = 0; colm < doubles.length; colm++) {
        element = String.valueOf(doubles[colm]);
        spacerLeft(element, space);
        System.out.print(" ");
        if (colm == (doubles.length - 1)) {
          System.out.println();
        }
      }
    }
  }

  //BOOLEAN METHODS -----------------------------------------------------

  //choiceInput Method - Nathan.choiceInput(invalidMessageString)

  /** Receives input from the user when the desired input is a yes or no answer, storing "yes" as true and "no" as false in a boolean. If an undesired input is received, the user is prompted again, displaying the inputted invalidMessageString. The input is not case sensitive.
   *
   * @param message yes or no answer
   * @return true if yes, false if no, message if neither
   */
  public static boolean choiceInput(String message) {
    Scanner input = new Scanner(System.in);
    String answer;
    while (true) {
      System.out.print("(Enter yes or no)\n");
      answer = input.nextLine();
      answer = answer.toLowerCase();
      if (answer.equals("no")) {
        return false;
      }
      else if (answer.equals("yes")) {
        return true;
      }
      else {
        System.out.print("\n" + message + "\n");
      }
    }
  }
}
