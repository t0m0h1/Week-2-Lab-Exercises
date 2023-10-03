// Week 2 lab


// Instructions:

// Inside main: Uncomment whichever part you want to run.



import java.util.Scanner;

class Grader {
    public String grade(int score) {
        if (score >= 95 && score <= 100) {
            return "Exceptional 1st";
        } else if (score < 95 && score >= 85) {
            return "Outstanding 1st";
        } else if (score < 85 && score >= 75) {
            return "1st";
        } else if (score < 75 && score >= 62) {
            return "2.1";
        } else if (score < 62 && score >= 52) {
            return "2.2";
        } else if (score < 52 && score >= 42) {
            return "3";
        } else if (score < 42 && score >= 32) {
            return "Fail";
        } else {
            return "Abject Fail";
        }
    }
}

public class Main {
    public static void main(String[] args) {
     // Code block for the Grading Tool:
      
      // Scanner scanner = new Scanner(System.in);
      // System.out.println("Enter a score to be graded: ");
      // int score = scanner.nextInt();
      // scanner.close();

      // Grader grader = new Grader();
      // String result = grader.grade(score);
      // System.out.println(result);

      // Code block for the Type Converter
      // Make an instance of the class

      // typeConverter converter1 = new typeConverter();
      // converter1.converter();
      // System.out.println("This is implicit type conversion.");

      // typeConverter newInt = new typeConverter();
      // System.out.println("String value converted to integer: ");
      // newInt.stringToInt("22");

      // Driver code for reverse array:
     
      // ArraysDemo arraysDemo = new ArraysDemo();
      // int[] markingPattern = {42, 45, 48, 52, 55, 58};
      // markingPattern = arraysDemo.reverseArray(markingPattern);
      // for (int num : markingPattern) {
      //   System.out.print(num + " ");
      //    }
    }
}

class typeConverter {
  /**
  * @param args the command line arguments
  */

  public void converter() {
    int x = 19;
    System.out.println(x);
    long y = 9L;
    System.out.println(y);
    y = x; // y is now 15L
    System.out.println(y);
  
  }

  public void stringToInt(String a) {
    int b = Integer.parseInt(a);
    System.out.println(b);
  }
}

class ArraysDemo {
    public static int[] reverseArray(int markingPattern[]) {
      int end = markingPattern.length - 1;
      int start = 0;

      while (start < end) {
          int temp = markingPattern[start];
          markingPattern[start] = markingPattern[end];
          markingPattern[end] = temp;
          start++; // Increment start
          end--;   // Decrement end
      }
      return markingPattern; // Return the reversed array
    }
}


