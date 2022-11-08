import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("1人目の身長を入力してください:");
    double height1 = sc.nextDouble();
    System.out.print("1人目の体重を入力してください:");
    double weight1 = sc.nextDouble();
    System.out.print("2人目の身長を入力してください:");
    double height2 = sc.nextDouble();
    System.out.print("2人目の体重を入力してください:");
    double weight2 = sc.nextDouble();
    String bmi1 = String.format("%.2f", (weight1 / (height1 * height1)));
    String bmi2 = String.format("%.2f", (weight2 / (height2 * height2)));
    System.out.println("1人目のBMIは" + bmi1 + "です。");
    System.out.println("2人目のBMIは" + bmi2 + "です。");
    sc.close();
  }
}
