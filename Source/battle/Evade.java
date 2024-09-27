package battle;
import utils.*;
import input.*;
import java.lang.String;
public class Evade {
    public static void round() {

        get_attack();

    }
    public static char[] get_attack()
    {
        int i;
        char[] result = new char[10];
        for(i = 0;i < 5; ++i)
        {
            result[i] = Rand.charIn();
        }
        return result;
    }
}
