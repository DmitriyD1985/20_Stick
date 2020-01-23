import java.util.ArrayList;

/*
* Тут признаюсь я вычитал алгоритм, нужно всегода осатвлять игроку определенное число списек.
* А в случае, если игрок берт спички вторым, а по условию у нас так, то нужно брать столько, чтобы игроку отсавалось всегда 17, 13, 9, 5 и в конце одна спичка.
* И тут алгоритм такой, в зависимости от того, сколько списе на входе, мы берем столео списек, чтобы осталось 17, 13, 9, 5 или 1 спичка.
* */


public class ArtificalIntllekt {

    public static void computerAnotherTurn(ArrayList list) {
        int turn = 1;
        int j = list.size();
        while (true) {
            int n = list.size() - (list.size() - 3 * turn);
            for (int m = 0; m < n; m++) {
                list.remove(list.size() - 1);
            }
            MessegeClass.computrTakeMessage(n);
            MessegeClass.balance(list.size());
            if (list.size() == 1) {
                break;
            }
        }
        MessegeClass.computerWin();
    }
}





//        if (j > 17 && j <= 20) {
//            int n = list.size() - 17;
//            for (int m = 0; m < n; m++) {
//                list.remove(list.size() - 1);
//            }
//            MessegeClass.computrTakeMessage(n);
//            MessegeClass.balance(list.size());
//        } else if (j > 13 && j <= 17) {
//            int n = list.size() - 13;
//            for (int m = 0; m < n; m++) {
//                list.remove(list.size() - 1);
//            }
//            MessegeClass.computrTakeMessage(n);
//            MessegeClass.balance(list.size());
//        } else if (j > 9 && j <= 13) {
//            int n = list.size() - 9;
//            for (int m = 0; m < n; m++) {
//                list.remove(list.size() - 1);
//            }
//            MessegeClass.computrTakeMessage(n);
//            MessegeClass.balance(list.size());
//        } else if (j > 5 && j <= 9) {
//            int n = list.size() - 5;
//            for (int m = 0; m < n; m++) {
//                list.remove(list.size() - 1);
//            }
//            MessegeClass.computrTakeMessage(n);
//            MessegeClass.balance(list.size());
//        } else if (j > 1 && j <= 5) {
//            int n = list.size() - 1;
//            for (int m = 0; m < n; m++) {
//                list.remove(list.size() - 1);
//            }
//            MessegeClass.computrTakeMessage(n);
//            MessegeClass.balance(list.size());

//        }
//    }
//}
