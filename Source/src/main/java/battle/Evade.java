package battle;
import utils.*;
import input.*;
import java.lang.String;
import java.io.*;
import relics.*;
public class Evade {

    static int round = 0;
    public static int round() {
    try{
        String verify = "";
        String attack = get_attack();
        System.out.println(attack);
        int duration = Fscan.readLine(1,2,0)*100;
        prepare();
        Time.pause(duration);
        while(System.in.available()>1)
        verify = verify + Terminal.byteRead();
        if (!verify.equals(attack))
        {
        return 0;}
        Terminal.clear();
        return 1;
        }catch(IOException e)
        {
        System.out.println("Something's wrong");
        }
        return 0;
    }
    public static String get_attack()
    {
        int i = 0;
        int length = Fscan.readLine(1,3,0);
        String result = "";
        for(i = 0;i < length; ++i)
        {
            result = result + Rand.charIn();
        }
        return result;
    }
    public static void update()
    {
        round = Fscan.readLine(1,1,0);
        Fscan.insertLine(1,50 - round,2,0);
        Fscan.insertLine(1,1 + round/3,3,0);
        Relic.evasion();
    }
    public static void prepare()
    {
        try{
            while(System.in.available()>1)
            System.in.read();
        }catch (IOException e)
        {
            System.out.println("Error " + e.getMessage());
        }
    }
}
