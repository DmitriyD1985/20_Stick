import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Тут просто прописаны ходы игрока, проверка коллическва введенных игроком спичек и все!
* */
public class Game {
    public static ArrayList<Integer> list = new ArrayList<>(20);
    static int startCount;
    public static int take;

    public void intialList() {
        System.out.println("Введите количество спиек");
        Scanner scanner = new Scanner(System.in);
        startCount = scanner.nextInt();
        for (int i = 0; i < startCount; i++) {
            list.add(1);
        }
    }

    public static void playerMakeTurn(ArrayList list) {
        System.out.println("Ход игрока");
        System.out.println("Введите количество спичек");
        try {
            take = new Scanner(System.in).nextInt();
            if (take < 4 && take > 0) {
                for (int i = 0; i < take; i++) {
                    list.remove(0);
                }
                MessegeClass.balance(list.size());
            } else {
                System.out.println("Вы можете взять от 1 до 3 спичек!");
                playerMakeTurn(list);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Введено не число");
            playerMakeTurn(list);

        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.intialList();
        MessegeClass.starM();
        int turn = 1;
        while (true) {
            ArtificalIntllekt.computerAnotherTurn(list, turn);
            if (list.size() == 1) {
                break;
            }
            playerMakeTurn(list);

            turn++;
        }
        MessegeClass.computerWin();
    }
}
