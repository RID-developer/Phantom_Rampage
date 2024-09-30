package input;
import java.util.*;
import java.io.*;
public class Fscan{
    static RandomAccessFile file = null;
    static BufferedReader sc = null;
    static File f = new File("Global");
    public static void set(int x) throws FileNotFoundException
    {
    switch (x){
    case 1: file = new RandomAccessFile("Global","rw");
    sc = new BufferedReader(new FileReader("Global"));
    break;
    case 2:
    file = new RandomAccessFile("Enemy","rw");
    sc = new BufferedReader(new FileReader("Enemy"));
    break;
    case 3:
    file = new RandomAccessFile("Cards","rw");
    sc = new BufferedReader(new FileReader("Cards"));
    break;
    case 4:
    file = new RandomAccessFile("Status","rw");
    sc = new BufferedReader(new FileReader("Status"));
    break;
    default:
    file = null;
    }
    }
    public static void line(int x) throws IOException
    {
        int i = 0;
        for (i = 0;i < x; ++i)
        sc.readLine();
    }
    public static int readLine(int ID, int y,int x) throws IOException
    {
        int i = 0;
        int val = 0;
        String sad = null;
        set(ID);
        line(y);
        sad = sc.readLine();
        file.close();
        try{sad = sad.substring(x*33,x*33+32).trim();
        val = Integer.parseInt(sad);
        } catch (StringIndexOutOfBoundsException e)
        { System.out.println("Too far");
        }
        return val;
    }
    public static int readWide(int ID, int y, int x) throws IOException
    {   int i = 0;
        int val = 0;
        String sad = null;
        byte[] buffer = new byte[33];
        set(ID);
        file.seek(y* 66 + x*33);
        file.read(buffer,0,32);
        for (i = 0; i < 33; ++i)
        {
        if((buffer[i]>='0')&&(buffer[i]<='9'))
        {buffer[i] -= '0';
        val = val * 10;
        val += buffer[i];
        }
        }
        file.close();
        return val;
    }
    public static void reset() throws IOException
    {
        int i = 0,j = 0;
        set(1);
        for(i = 0;i<10;++i)
         file.writeBytes("0                               ,\n");
        set(2);
        for(i = 0;i<10;++i)
         file.writeBytes("0                               ,\n");
        set(3);
        for(i = 0;i<4;++i)
        file.writeBytes("0                               ,\n");
        set(4);
        for(i = 0;i < 256; ++i)
        file.writeBytes("0                               ,0                               ,\n");
    }
    public static void insertLine(int ID,int val,int y,int x) throws IOException
    {
    int i = 0;
    int len = 0;
    String value = Integer.toString(val);
    int pad = 33 - value.length();
    set(ID);
    for (i = 0; i < pad-1; ++i)
    value = value + ' ';
    value = value + ',';
    for (i = 0; i < y;++i)
    {
    len += sc.readLine().length();
    }
    file.seek(len+x*33+y);
    file.writeBytes(value);
    return;
    }
    public static void insertWide(int ID, int val,int y,int x) throws IOException
    {int i = 0;
    String value = Integer.toString(val);
    int pad = 33 - value.length();
    set(ID);
    for (i = 0; i < pad-1; ++i)
    value = value + ' ';
    value = value + ',';
    file.seek(y*66+x*33 + y);
    file.writeBytes(value);
    return;
}
}
