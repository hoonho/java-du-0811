import java.util.*;

public class VectorExample {
  public static void main(String[] args) {
    List<Board> list = new Vector<>();

    list.add(new Board("제목1", "내용1", "작성자1"));
    list.add(new Board("제목2", "내용2", "작성자2"));
    list.add(new Board("제목3", "내용3", "작성자3"));
    list.add(new Board("제목4", "내용4", "작성자4"));
    list.add(new Board("제목5", "내용5", "작성자5"));

    list.remove(2); // Remove the third element
    list.remove(3); // Remove the fourth element

    for (int i = 0; i < list.size(); i++) {
      Board board = list.get(i);
      System.out.println("제목: " + board.getTitle() + "\t 내용: " + board.getContent() + "\t 작성자: " + board.getWriter());
    }
  }  

  public static class Board {
    private String title;
    private String content;
    private String writer;

    public Board(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }
  }
}
