package input;
import java.io.*;
import java.util.*;
public class Terminal
{
    static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    public static char byteRead()
    {
        int in = 0;
        try{
            in = System.in.read();
        }catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        return (char)in;
    }
    public static int scanInt()
    {
    //try{
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    return x;
    //}catch (IOException e)
    //{
    //return 0;
    //}
    }
    public static void clear()
    {
        try{
            while(System.in.available()>0)
            buff.readLine();
        }catch (IOException e)
        {
            System.out.println("Error " + e.getMessage());
        }
    }
}
