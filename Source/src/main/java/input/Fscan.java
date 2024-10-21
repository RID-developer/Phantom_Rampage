package input;
import java.util.*;
import java.io.*;
public class Fscan{
    static RandomAccessFile file = null;
    static BufferedReader sc = null;
    static File f = null;
    public static void set(int x) throws FileNotFoundException {
    String dir = System.getProperty("user.dir") + "/run";

    File run = new File(dir);
    if (!run.exists()) {
        run.mkdir();
    }
    switch (x) {
        case 1:
            file = new RandomAccessFile(dir + "/Global", "rw");
            sc = new BufferedReader(new FileReader(dir + "/Global"));
            f = new File(dir + "/Global");
            break;
        case 2:
            file = new RandomAccessFile(dir + "/Enemy", "rw");
            sc = new BufferedReader(new FileReader(dir + "/Enemy"));
            f = new File(dir + "/Enemy");
            break;
        case 3:
            file = new RandomAccessFile(dir + "/Cards", "rw");
            sc = new BufferedReader(new FileReader(dir + "/Cards"));
            f = new File(dir + "/Cards");
            break;
        case 4:
            file = new RandomAccessFile(dir + "/Status", "rw");
            sc = new BufferedReader(new FileReader(dir + "/Status"));
            f = new File(dir + "/Status");
            break;
        case 5:
            file = new RandomAccessFile(dir + "/Relics", "rw");
            sc = new BufferedReader(new FileReader(dir + "/Relics"));
            f = new File(dir + "/Relics");
            break;
        default:
            file = null;
    }
}

    public static void line(int x)
    {   try{
        int i = 0;
        for (i = 0;i < x; ++i)
        sc.readLine();
        }catch(IOException e){
    return;}
    }
    public static int readLine(int ID, int y,int x)
    {   try{
        int i = 0;
        int val = 0;
        String sad = null;
        set(ID);
        line(y);
        sad = sc.readLine();
        file.close();
        try{sad = sad.substring(x*12,x*12+11).trim();
        val = Integer.parseInt(sad);
        } catch (StringIndexOutOfBoundsException e)
        { System.out.println("Too far");
        }
        return val;
        }catch(IOException e){
        return 0;}
    }
    public static int readWide(int ID, int y, int x,int width)
    {   try{
        width = width * 12;
        int i = 0;
        int t = 0;
        int val = 0;
        String sad = null;
        byte[] buffer = new byte[12];
        set(ID);
        file.seek(y* 22 + x * 12);
        file.read(buffer,0,11);
        for (i = 0; i < 12; ++i)
        {
        if(buffer[0]== '-')
        t = 1;
        if((buffer[i]>='0')&&(buffer[i]<='9'))
        {buffer[i] -= '0';
        val = val * 10;
        val += buffer[i];
        }
        }
        if (t == 1)
        { val = val * -1;}
        file.close();
        return val;
        }catch(IOException e){
        return 0;}
    }
    public static void reset()
    {
        try{
        int i = 0,j = 0;
        set(1);
        for(i = 0;i<10;++i)
         file.writeBytes("0          ,\n");
        set(2);
        for(i = 0;i<10;++i)
         file.writeBytes("0          ,0          ,\n");
        set(3);
        for(i = 0;i<4;++i)
        file.writeBytes("0          ,\n");
        set(4);
        for(i = 0;i < 256; ++i)
        file.writeBytes("0          ,0          ,\n");
        set(5);
        for(i = 0;i < 10;++i)
        file.writeBytes("0          ,0          ,\n");
        }catch(IOException e)
        {
        return;
        }
    }
    public static void erase()
    { int i;
    try{
    for(i = 0;i < 5; ++i)
    set(1);
    f.delete();
    }catch(FileNotFoundException e)
    { return;
    }
    }

    public static void insertLine(int ID,int val,int y,int x)
    {try{
    int i = 0;
    int len = 0;
    String value = Integer.toString(val);
    int pad = 12 - value.length();
    set(ID);
    for (i = 0; i < pad-1; ++i)
    value = value + ' ';
    value = value + ',';
    for (i = 0; i < y;++i)
    {
    len += sc.readLine().length();
    }
    file.seek(len+x*12+y);
    file.writeBytes(value);
    return;
    }catch(IOException e){
    return;}
    }
    public static void insertWide(int ID, int val,int y,int x,int width)
    { try{
    width = width * 12;
    int i = 0;
    String value = Integer.toString(val);
    int pad = 12 - value.length();
    set(ID);
    for (i = 0; i < pad-1; ++i)
    value = value + ' ';
    value = value + ',';
    file.seek(y*width+x*12 + y);
    file.writeBytes(value);
    return;
    }catch(IOException e){
    return;}
}
}
