
public class ArtificalIntllekt {
    public static void computerAnotherTurn() {
        if (Player.take == 0) {
            Game.count = Game.count - 3;
            MessegeClass.computrTakeMessage(3);
            MessegeClass.balance(Game.count);
        } else {
            Game.count = Game.count - (4 - Player.take);
            MessegeClass.computrTakeMessage(4 - Player.take);
            MessegeClass.balance(Game.count);
        }
    }
}

