public class HiddenWord {
  private String correctWord;

  public HiddenWord (String correctWord) {
    this.correctWord = correctWord;
  }

  public String getHint (String guessWord) {
    String guess = "";

    for (int i = 0; i < correctWord.length(); i++) {
      if (correctLetter(i, guessWord)) {
        guess += guessWord.substring(i, i + 1);
      } else if(!(correctLetter(i, guessWord)) && containsLetter(i, guessWord)) {
        guess += "+";
      } else {
        guess += "*";
      }
    }
    System.out.println(guess);
    return guess;
  }

  public boolean correctLetter (int i, String guessWord) {
    if (guessWord.substring(i, i + 1).equals(correctWord.substring(i, i + 1))) {
      return true;
    } else {
      return false;
    }
  }

  public boolean containsLetter (int i, String guessWord) {
    if (correctWord.contains(guessWord.substring(i, i + 1))) {
      return true;
    } else {
      return false;
    }
  }
}
