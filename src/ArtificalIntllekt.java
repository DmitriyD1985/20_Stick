import java.util.ArrayList;

public class ArtificalIntllekt {

    public static void computerAnotherTurn(ArrayList list) {
        int j = list.size();
        if (j > 17 && j <= 20) {
            int n = list.size() - 17;
            for (int m = 0; m < n; m++) {
                list.remove(list.size() - 1);
            }
            MessegeClass.computrTakeMessage(n);
            MessegeClass.balance(list.size());
        } else if (j > 13 && j <= 17) {
            int n = list.size() - 13;
            for (int m = 0; m < n; m++) {
                list.remove(list.size() - 1);
            }
            MessegeClass.computrTakeMessage(n);
            MessegeClass.balance(list.size());
        } else if (j > 9 && j <= 13) {
            int n = list.size() - 9;
            for (int m = 0; m < n; m++) {
                list.remove(list.size() - 1);
            }
            MessegeClass.computrTakeMessage(n);
            MessegeClass.balance(list.size());
        } else if (j > 5 && j <= 9) {
            int n = list.size() - 5;
            for (int m = 0; m < n; m++) {
                list.remove(list.size() - 1);
            }
            MessegeClass.computrTakeMessage(n);
            MessegeClass.balance(list.size());
        } else if (j > 1 && j <= 5) {
            int n = list.size() - 1;
            for (int m = 0; m < n; m++) {
                list.remove(list.size() - 1);
            }
            MessegeClass.computrTakeMessage(n);
            MessegeClass.balance(list.size());
            MessegeClass.computerWin();
        }
    }
}
