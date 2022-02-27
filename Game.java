import java.util.ArrayList;

public class Game {
  public static void play(GameWheel g) {
    // Implement the play method here

    Slice spin1 = (g.spinWheel());
    Slice spin2 = (g.spinWheel());
    Slice spin3 = (g.spinWheel());

    int prize = spin1.getPrizeAmount() + spin2.getPrizeAmount() + spin3.getPrizeAmount();

    if (spin1.getColor().equals(spin2.getColor()) && spin1.getColor().equals(spin3.getColor())
        && spin2.getColor().equals(spin3.getColor())) {

      System.out.println("Total prize money: $" + (prize * 2));

      System.out.println(spin1.toString());
      System.out.println(spin2.toString());
      System.out.println(spin3.toString());

      System.out.println("Three " + spin1.getColor() + "s  = double your money!");

    }

    else {

      System.out.println("Total prize money: $" + prize);

      System.out.println(spin1.toString());
      System.out.println(spin2.toString());
      System.out.println(spin3.toString());

    }

  }
}
