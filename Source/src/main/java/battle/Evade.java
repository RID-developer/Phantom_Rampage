package battle;
import utils.*;
import input.*;
import java.lang.String;
import java.io.*;
import relics.*;
import graphics.*;
public class Evade {
    static int cool = 0;
    static int heat = 0;
    static int round = 0;
    // public static int round() {
    // try{
    //     String verify = "";
    //     String attack = get_attack();
    //     System.out.println(attack);
    //     int duration = Fscan.readLine(1,2,0)*100;
    //     prepare();
    //     Time.pause(duration);
    //     while(System.in.available()>1)
    //     verify = verify + Terminal.byteRead();
    //     if (!verify.equals(attack))
    //     {
    //     return 0;}
    //     Terminal.clear();
    //     return 1;
    //     }catch(IOException e)
    //     {
    //     System.out.println("Something's wrong");
    //     }
    //     return 0;
    // }
    // public static String get_attack()
    // {
    //     int i = 0;
    //     int length = Fscan.readLine(1,3,0);
    //     String result = "";
    //     for(i = 0;i < length; ++i)
    //     {
    //         result = result + Rand.charIn();
    //     }
    //     return result;
    // }
    public static void move() {
        double x = 0;
        int i = 0;
        if(ready())
        {
        Circles.add(400,Rand.intIn()%500+200,20);
        }
        for(i = 0; i<Circles.i;++i)
        {
        x = Circles.obs[i].getCenterX();
        Circles.obs[i].setCenterX(x+0.70);
        if (x > 1600)
        {
        Circles.remove(i);
        }
        }

    }
    public static boolean ready(){
    if(heat < cool)
    {cool = 0;
    return true;
    }
    else
    {
    cool++;
    return false;
    }
    }
    public static void update()
    {
        round = Fscan.readLine(1,1,0);
        Fscan.insertLine(1,500 - round*10,2,0);
        if (Fscan.readLine(1,2,0) < 5)
        Fscan.insertLine(1,5,2,0);
        Relic.evasion();
        heat = Fscan.readLine(1,2,0);
    }
}
//     public static void prepare()
//     {
//         try{
//             while(System.in.available()>1)
//             System.in.read();
//         }catch (IOException e)
//         {
//             System.out.println("Error " + e.getMessage());
//         }
//     }
// }
