package utils;
import java.util.Random;
public class Rand {
    public static Random R;
    public static void restart()
    {
        R = new Random();
    }
    public static char in()
    {
        int x =  R.nextInt(24)+97;
        return (char) x;
    }
}