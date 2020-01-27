import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    public static int take = 0;

    public static void playerMakeTurn() {
        System.out.println("Ход игрока");
        System.out.println("Введите количество спичек");
        try {
            // Эта провекра нужна чтобы игрок не ввел слишкомм много или мало спичек
            take = new Scanner(System.in).nextInt();
            if (take < 4 && take > 0) {
                Game.count = Game.count - take;
                MessegeClass.playerTakeMessage(take);
                MessegeClass.balance(Game.count);
            } else {
                System.out.println("Вы можете взять от 1 до 3 спичек!");
                //Если игрок вводит количество спичек не в рамках разрешенного, то через рекурсию ему предлагается снова ввести колличество
                playerMakeTurn();
            }
        } catch (
                InputMismatchException exception) {
            System.out.println("Введено не число");
        }
    }
}
