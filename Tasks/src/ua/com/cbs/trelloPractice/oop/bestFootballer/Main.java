package ua.com.cbs.trelloPractice.oop.bestFootballer;

import java.util.ArrayList;

/**
 * Фамилия
 * Амплуа
 * Возраст
 * Количество игр
 * Количество голов
 *
 * Определить лучшего форварда, и вывести сведения о футболистах, сыгравших менее 5-ти игр.
 */

public class Main {

  public static void main(String[] args) {
    ArrayList<Footballer> footballers = new ArrayList<>();
    footballers.add(new Footballer("Smith", "defender", 23, 16, 0));
    footballers.add(new Footballer("Braun", "forward", 28, 15, 1));
    footballers.add(new Footballer("Williams", "winger", 30, 12, 0));
    footballers.add(new Footballer("Johnson", "midfield", 26, 6, 1));

    ArrayList<Footballer> bestFootballers = new ArrayList<>();
    ArrayList<Footballer> footballersPlayedLess5Games = new ArrayList<>();

    Footballer bestFootballer = footballers.get(0);

    for (Footballer footballer : footballers) {
      if (footballer.getScore() > 0) {
        if (bestFootballer.getScore() == 0) {
          bestFootballer = footballer;
          bestFootballers.add(bestFootballer);
        } else if (footballer.getScore() > bestFootballer.getScore() && bestFootballer.getScore() != 0) {
          bestFootballer = footballer;
          if (bestFootballers.get(0).getAmountOfGame() != 0) {
            bestFootballers.remove(0);
          }
          bestFootballers.add(0, bestFootballer);
        } else if (footballer.getScore() == bestFootballer.getScore()) {
          bestFootballer = footballer;
          bestFootballers.add(bestFootballer);
        }
      }

      if (footballer.getAmountOfGame() < 5) {
        footballersPlayedLess5Games.add(footballer);
      }
    }

    System.out.println("The best forward(s) :");
    if (!bestFootballers.isEmpty()) {
      for (Footballer footballer : bestFootballers) {
        System.out.println(footballer);
      }
    } else System.out.println("No one!!!");

    System.out.println("\nWho played less than 5 games :");
    if (!footballersPlayedLess5Games.isEmpty()) {
      for (Footballer footballer : footballersPlayedLess5Games) {
        System.out.println(footballer);
      }
    } else System.out.println("No one!!!");
  }
}
