import java.util.Scanner;

public class Game {
    public static int count = 0;

    public static void main(String[] args) {
        System.out.println("Введите начальное количество спичек (кратное 20)");
        count = new Scanner(System.in).nextInt();
        MessegeClass.starM(count);
        while (true) {
            ArtificalIntllekt.computerAnotherTurn();
            if (count == 1) {
                MessegeClass.computerWin();
                break;
            }
            Player.playerMakeTurn();
        }
    }
}
