package ua.com.cbs.trelloPractice.oop.bestFootballer;

public class Footballer {
  private final String lastName;
  private final String role;
  private final int age;
  private final int amountOfGame;
  private final int score;

  public Footballer(String lastName, String role, int age, int amountOfGame, int score) {
    this.lastName = lastName;
    this.role = role;
    this.age = age;
    this.amountOfGame = amountOfGame;
    this.score = score;
  }

  public int getAmountOfGame() {
    return amountOfGame;
  }

  public int getScore() {
    return score;
  }

  @Override
  public String toString() {
    return "Footballer{" +
        "lastName='" + lastName + '\'' +
        ", role='" + role + '\'' +
        ", age=" + age +
        ", amountOfGame=" + amountOfGame +
        ", score=" + score +
        '}';
  }
}
