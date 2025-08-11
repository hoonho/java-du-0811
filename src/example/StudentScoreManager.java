package example;

import java.util.HashMap;
import java.util.Scanner;

public class StudentScoreManager {
  public static void main(String[] args) {
    HashMap<String, Integer> scores = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.println("\n1. 점수 등록");
      System.out.println("2. 점수 조회");
      System.out.println("3. 종료");
      System.out.print("선택: ");
      int choice = sc.nextInt();
      sc.nextLine();

      if (choice == 1) {
        System.out.print("학생 이름: ");
        String name = sc.nextLine();
        System.out.print("점수: ");
        int score = sc.nextInt();
        sc.nextLine();
        scores.put(name, score);
        System.out.println("등록 완료");
      } else if (choice == 2) {
        System.out.print("조회할 학생 이름: ");
        String name = sc.nextLine();
        if (scores.containsKey(name)) {
          System.out.println(name + "의 점수: " + scores.get(name));
        } else {
          System.out.println("해당 학생이 존재하지 않습니다.");
        }
      } else if (choice == 3) {
        System.out.println("프로그램 종료");
        break;
      } else {
        System.out.println("잘못된 입력입니다.");
      }
    }
  }
}
