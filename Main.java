public class Main{
  public static void main(String[] args) {
    HiddenWord puzzle = new HiddenWord("HARPS");

    puzzle.getHint("AAAAA");
    puzzle.getHint("HELLO");
    puzzle.getHint("HEART");
    puzzle.getHint("HARMS");
    puzzle.getHint("HARPS");
  }
}
