import graphics.Graphics_Manager;
public class Game{

    public static void main(String[] args)
    {
        start();
    }
    private static void start()
    {
        Graphics_Manager.run();
        System.out.println("Game over");
    }
}
