//Srinivasa Manikanta Anumalasetty
// Write code for pattern
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    int rows = 4;

    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
