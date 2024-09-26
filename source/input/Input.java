package input;
import java.io.IOException;
import java.util.Scanner;
public class Input
{
    public static char read()
    {
        int in = 0;
        try{
            in = System.in.read();
        }catch (IOException e)
        {
            System.out.println("Error " + e.getMessage());
        }
        char a = (char) in;
        return a;
    }
    public static void clear()
    {
        try{
            while(System.in.available() > 0)
            System.in.read();
        }catch (IOException e)
        {
            System.out.println("Error " + e.getMessage());
        }
    }
}