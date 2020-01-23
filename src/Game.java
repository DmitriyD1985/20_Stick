import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Тут просто прописаны ходы игрока, проверка коллическва введенных игроком спичек и все!
* */
public class Game {
    public static ArrayList<Integer> list = new ArrayList<>(20);
    public static boolean playerNotMadeTurn = true;
    public static boolean computerNotMadeTurn = true;

    public void intialList() {
        for (int i = 0; i < 20; i++) {
            list.add(1);
        }
    }

    public static void playerMakeTurn(ArrayList list) {
        System.out.println("Ход игрока");
        System.out.println("Введите количество спичек");
        try {
            int take = new Scanner(System.in).nextInt();
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
        while (true) {
            ArtificalIntllekt.computerAnotherTurn(list);
            if (list.size() == 1) {
                break;
            }
            playerMakeTurn(list);
        }
    }
}
