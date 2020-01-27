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
            }
            MessegeClass.computrTakeMessage(3);
            MessegeClass.balance(list.size());
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

//    static int[] arr = new int[Game.startCount];
//    public static void getWinnerArray()
//    {
//        for (int i = 1; i < Game.startCount; i++) {
//            arr[i] = i+4;
//        }
//    }
//    public static void computerAnotherTurn(ArrayList list, int turn) {
//        System.out.println("Ходд номер " + turn);
//        getWinnerArray();
//        while(true){
//            if(turn==1)
//            {
//                for (int i = 0; i < 3); i++) {
//                    list.remove(list.size()-1);
//                }
//            }
//            else
//            {
//                for (int i = 0; i < list.size()-(list.size()-arr[turn]); i++) {
//                    list.remove(list.size()-1);
//                }
//            }
//        }
//    }
//}