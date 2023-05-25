import java.util.Scanner;
class Main {
  public static String calc(String input) {
    String[] arr = input.split(" ");
    if (arr.length != 3) {
      throw new IllegalArgumentException("Некорректное выражение");
    }
    int a, b;
    try {
      a = Integer.parseInt(arr[0]);
      b = Integer.parseInt(arr[2]);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("Некорректные числа");
    }
    if (a < 1 || a > 10 || b < 1 || b > 10) {
      throw new IllegalArgumentException("Числа должны быть от 1 до 10 включительно");
    }
    int result;
    switch (arr[1]) {
      case "+":
        result = a + b;
        break;
      case "-":
        result = a - b;
        break;
      case "*":
        result = a * b;
        break;
      case "/":
        result = a / b;
        break;
      default:
        throw new IllegalArgumentException("Некорректная операция");
    }
    return Integer.toString(result);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    try {
      System.out.println(calc(input));
    } catch (IllegalArgumentException e) {
      System.out.println("Ошибка: " + e.getMessage());
    }
  }
}
