import java.util.ArrayList;
import java.util.List;

/*
 * Тут признаюсь я вычитал алгоритм, нужно всегода осатвлять игроку определенное число списек.
 * А в случае, если игрок берт спички вторым, а по условию у нас так, то нужно брать столько, чтобы игроку отсавалось всегда 17, 13, 9, 5 и в конце одна спичка.
 * И тут алгоритм такой, в зависимости от того, сколько списе на входе, мы берем столео списек, чтобы осталось 17, 13, 9, 5 или 1 спичка.
 * */


public class ArtificalIntllekt {


    public static void computerAnotherTurn(List list, int turn) {
        if (turn == 1) {
            for (int i = 0; i < 3; i++) {
                list.remove(list.size()-1);
        } else {
            int nedd = 4 - Game.take;
            for (int i = 0; i < nedd; i++) {
                list.remove(list.size()-1);
            }
            MessegeClass.computrTakeMessage(nedd);
            MessegeClass.balance(list.size());
        }

    }
}

            if (list.size() == 1) {
                break;
            }
        }
        MessegeClass.computerWin();
    }
}

