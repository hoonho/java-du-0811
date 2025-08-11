package example;

import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {
  public static void main(String[] args) {
    HashMap<String, String> users = new HashMap<>();
    users.put("admin", "1234");
    users.put("user1", "abcd");

    Scanner sc = new Scanner(System.in);
    System.out.print("ID 입력: ");
    String id = sc.nextLine();
    System.out.print("PW 입력: ");
    String pw = sc.nextLine();

    if (users.containsKey(id)) {
      if (users.get(id).equals(pw)) {
        System.out.println("로그인 성공");
      } else {
        System.out.println("비밀번호가 틀렸습니다.");
      }
    } else {
      System.out.println("존재하지 않는 ID입니다.");
    }
  }
}
