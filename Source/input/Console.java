package input;
import java.io.*;
public class Console
{
    static BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
    public static int byteRead()
    {
        int in = 0;
        try{
            in = System.in.read();
        }catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        return in;
    }
    public static void clear(boolean all)
    {
        try{
            buff.readLine();
        }catch (IOException e)
        {
            System.out.println("Error " + e.getMessage());
        }
    }
}
