package utils;
public class Time{
    public static void pause(int time)
    {
        try{
            Thread.sleep(time);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}