import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("身長を入力してください:");
    double height = sc.nextDouble();
    System.out.print("体重を入力してください:");
    double weight = sc.nextDouble();
    String bmi = String.format("%.2f", (weight / (height * height)));
    System.out.println("あなたのBMIは" + bmi + "です。");
    sc.close();
  }
}