package graphics;
class Control{
    public static void refresh()
    {
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
    }
    public static void clear(int start, int end)
    {
        int i;
        for (i = start;i <= end;++i)
        {
            System.out.print("\033[" + i + ";1H\033[K");
            System.out.flush();
        }
    }
    public static void move(int line)
    {
        System.out.print("\033["+ line + ";1H");
    }
}