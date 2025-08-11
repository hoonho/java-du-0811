package report;

import java.util.*;

public class RandomReport {
  public static void main(String[] args) {
    Set<Integer> rndNum = new HashSet<>();
    Random random = new Random();

    while (rndNum.size() < 6) {
      int number = random.nextInt(45) + 1;
      rndNum.add(number);
    }

    ArrayList<Integer> sortedNum = new ArrayList<>(rndNum);
    Collections.sort(sortedNum);

    System.out.println("생성된 난수: " + sortedNum);
  }
}