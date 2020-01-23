
/* здесь просто сообщения разные*/
public class MessegeClass {
    public static void starM() {
        System.out.println("Игра начинается");
        System.out.println("На столе 20 спичек");
    }

    public static void computerWin() {
        System.out.println("Компьютер победил");
    }

    public static void computrTakeMessage(int n) {
        System.out.println("Компьютер берет " + n + " спичек");
    }

    public static void playerTakeMessage(int n) {
        System.out.println("Игрок берет " + n + " спичек");
    }

    public static void playerWin() {
        System.out.println("Игрок победил");
    }

    public static void balance(int n) {
        System.out.println("На столе осталось " + n + " спичек");
    }
}
