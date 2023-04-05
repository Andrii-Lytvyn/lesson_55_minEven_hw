import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  /*Задача 1
Найти минимальное чётное число в последовательности положительных чисел или вывести -1, если такого
 числа не существует.
Оценить временную и пространственную сложность алгоритма.*/
  public static void main(String[] args) throws IOException { // O(n) - time, O(1) - space
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // O(1)

    System.out.print("Enter number of numbers: "); // O(1)
    int n = Integer.parseInt(br.readLine()); // O(1)
    int min = Integer.parseInt(br.readLine()); // O(1)

    for (int i = 1; i < n; i++) { // O(n) O(1) - space
      int nextNumber = Integer.parseInt(br.readLine());  //O(1) - time, O(1) - space

      if (nextNumber % 2 == 0) {
        if (min % 2 != 0) {
          min = nextNumber;
        }
        if (min > nextNumber) {
          min = nextNumber;
        }
      }
    }
    if (min % 2 == 0) {
      System.out.println("Min even number: " + min); // O(1)
    } else {
      System.out.println("-1"); // O(1)
    }

  }
}