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
