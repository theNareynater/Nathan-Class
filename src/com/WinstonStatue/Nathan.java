package com.WinstonStatue;

//Nathan Methods

import java.util.Scanner;

public class Nathan {

  //INTEGER METHODS -------------------------------------------------------

  //digitSum Method - Nathan.digitSum(integer)
  //Returns the sum of the inputed integer's digits.
  /** digitSum takes and int and sums its digits **/
  public static int digitSum(int in) {
    String numS = in + "";
    int length = numS.length();
    char digit = '0';
    String digS = "0";
    int intDig = 0;
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
      //Receives input from the user when the desired input is an integer within the specified range. The upper and lower bounds are both inclusive. If an undesired input is received, the user is prompted again, displaying the inputted invalidMessageString. (Note: will still break if user enters an non-numerical input)
  public static int intInput(double low, double high, String message) {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print("(Enter your number)\n");
       double dIn = input.nextDouble();
       if ((dIn >= low) && (dIn <= high) && ((dIn % 1) == 0)) {
         int iIn = (int)(dIn);
         return iIn;
       }
       else {
         System.out.print("\n" + message + "\n");
         continue;
      }
    }
  }

  //DOUBLE METHODS -------------------------------------------------------

  //roundTenth Method - Nathan.roundTenth(double)
      //Rounds a double value to the nearest tenth.
  public static double roundTenth(double in) {
    in = (Math.round(in * 10));
    return in / 10;
  }

  //roundHund Method - Nathan.roundHund(double)
      //Rounds a double value to the nearest hundredth.
  public static double roundHund(double in) {
    in = (Math.round(in * 100));
    return in / 100;
  }


  //roundThou Method - Nathan.roundThou(double)
      //Rounds a double value to the nearest thousanth.
  public static double roundThou(double in) {
    in = (Math.round(in * 1000));
    return in / 1000;
  }

  //STRING & PRINTING METHODS --------------------------------------------

  //spacerLeft Method - Nathan.spacerLeft(String, int spaceSize)
      //Prints the amount of spaces equal to the difference between the inputed spaceSize and the length of the inputed string, then prints the string. Useful for creating tables where the length of one cell is inputed as the spaceSize, so that the extra spaces for the cell can be automatically filled for any string inside the cell.
  public static void spacerLeft(String in, int space) {
    space -= in.length();
    while (space > 0) {
      System.out.print(" ");
      space--;
    }
    System.out.print(in);
  }

  //spacerRight Method - Nathan.spacerRight(String, int spaceSize)
      //Prints the inputed string, then prints the amount of spaces equal to the difference between the inputed spaceSize and the length of the string. Useful for creating tables where the length of one cell is inputed as the spaceSize, so that the extra spaces for the cell can be automatically filled for any string inside the cell.
  public static void spacerRight(String in, int space) {
    System.out.print(in);
    space -= in.length();
    while (space > 0) {
      System.out.print(" ");
      space--;
    }
  }

  //charCount Method - Nathan.charCount(String, searchChar)
      //Counts the number of times an inputed character (searchChar) appears in the inputed string and returns the value as an integer.
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
      //Prints the inputed 2D integer array so that the elements are visably organized in rows and columns. The inputted elementSpaceSize value sets the width of each column.
  public static void intMatrixPrint(int[][] matrix, int space) {
    String element = " ";
    for (int row = 0; row < matrix.length; row++) {
      for (int colm = 0; colm < matrix[row].length; colm++) {
        element = String.valueOf(matrix[row][colm]);
        spacerLeft(element, space);
        System.out.print(" ");
        if (colm == (matrix[row].length - 1)) {
          System.out.println();
        }
      }
    }
  }

  //doubleMatrixPrint Method - Nathan.doubleMatrixPrint(2dArray, elementSpaceSize)
      //Prints the inputed 2D double array so that the elements are visably organized in rows and columns. The inputted elementSpaceSize value sets the width of each column.
  public static void doubleMatrixPrint(double[][] matrix, int space) {
    String element = " ";
    for (int row = 0; row < matrix.length; row++) {
      for (int colm = 0; colm < matrix[row].length; colm++) {
        element = String.valueOf(matrix[row][colm]);
        spacerLeft(element, space);
        System.out.print(" ");
        if (colm == (matrix[row].length - 1)) {
          System.out.println();
        }
      }
    }
  }

  //BOOLEAN METHODS -----------------------------------------------------

  //choiceInput Method - Nathan.choiceInput(invalidMessageString)
      //Receives input from the user when the desired input is a yes or no answer, storing "yes" as true and "no" as false in a boolean. If an undesired input is received, the user is prompted again, displaying the inputted invalidMessageString. The input is not case sensitive.
  public static boolean choiceInput(String message) {
    Scanner input = new Scanner(System.in);
    String answer = "";
    boolean choice = false;
    while (true) {
      System.out.print("(Enter yes or no)\n");
      answer = input.nextLine();
      answer = answer.toLowerCase();
      if (answer.equals("no") == true) {
        choice = false;
        return choice;
      }
      else if (answer.equals("yes") == true) {
        choice = true;
        return choice;
      }
      else {
        System.out.print("\n" + message + "\n");
      }
    }
  }
}
