package graphics;
import utils.*;
import input.*;
import battle.*;
import java.io.*;
public class Graphics_Manager{
    public static void run()
    {   try{
        Rand.restart();
        Fscan.reset();
        char a = '\0';
        while(true)
        {
            Control.refresh();
            Fscan.insertWide(4,25,5,1);
            System.out.println(Fscan.readLine(4,5,1));
            Time.pause(1000);
        }
    }catch(IOException e)
    {
    return;
    }
}
}
