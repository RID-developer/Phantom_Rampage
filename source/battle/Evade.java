package battle;
import utils.*;
import input.Input;
import java.lang.String;
public class Evade {
    public void round() {
        Rand.in();
    }
    public static char[] get_attack()
    {
        int i;
        char[] result = new char[10];
        for(i = 0;i < 5; ++i)
        {
            result[i] = Rand.in();
        }
        return result;
    }
}
