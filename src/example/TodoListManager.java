package example;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoListManager {
  public static void main(String[] args) {
    ArrayList<String> todoList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
      System.out.println("\n1. 할 일 추가");
      System.out.println("2. 할 일 삭제");
      System.out.println("3. 목록 보기");
      System.out.println("4. 종료");
      System.out.print("선택: ");
      choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          System.out.print("추가할 할 일: ");
          String task = sc.nextLine();
          todoList.add(task);
          break;
        case 2:
        System.out.print("삭제할 인덱스 (0부터 시작): ");
        int index = sc.nextInt();
        if (index >= 0 && index < todoList.size()) {
          todoList.remove(index);
          System.out.println("삭제되었습니다.");
        } else {
          System.out.println("유효하지 않은 인덱스입니다.");
        }
        break;
      case 3:
        System.out.println("현재 할 일 목록: ");
        for (int i = 0; i < todoList.size(); i++) {
          System.out.println(i + ": " + todoList.get(i));
        }
        break;
      case 4:
        System.out.println("종료합니다.");
        break;
      default:
        System.out.println("잘못된 선택입니다.");
      }
    } while (choice != 4);
  }
}
