package exceptions;

import java.io.FileReader;

public class ExceptionsDemo {
    public static void show()
    {
        final FileReader reader;
        try{
            reader = new FileReader("file.txt");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.print("in finally sction of the code");

        }
    }

    public static void sayhello(String name)
    {
        System.out.println(name.toUpperCase());
    }
}
