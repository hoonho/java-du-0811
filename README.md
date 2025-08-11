# 16일차

<br/>

## 목차
1. [TodoList](#todolist)
2. [ShoppingCart](#shoppingcart)
3. [LoginSystem](#loginsystem)
4. [StudentScoreManager](#studentscoremanager)

<br/>

## 자바의 콜렉션(Collection) 활용 - ArrayList

<br/><br/>

### TodoList
```java
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
```

<br/>

### ShoppingCart
```java
package example;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
  public static void main(String[] args) {
    ArrayList<String> cart = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    String item;

    while (true) {
      System.out.println("장바구니에 넣을 상품 (종료: exit): ");
      item = sc.nextLine();
      if (item.equalsIgnoreCase("exit")) break;
      cart.add(item);
    }

    System.out.println("\n장바구니 목록:");
    for (String product : cart) {
      System.out.println("- " + product);
    }
  }
}
```

<br/><br/>

## 자바의 콜렉션(Collection) 활용 - HashMap

<br/>

### LoginSystem
```java
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
```

<br/>

### StudentScoreManager
```java
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
```




[위로 가기](#16일차)