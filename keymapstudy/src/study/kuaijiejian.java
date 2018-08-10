package study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class kuaijiejian
{
    private static final int INITIAL_SIZE = 10;

    public static int getInitialSize()
    {
        return INITIAL_SIZE;
    }

    public static void main(String[] args)
    {
        //region Description
        System.out.println("kuaijiejian");

        ArrayList list1 = new ArrayList();

        Date date = new Date();
        //endregion
        list1.add(0, "de");
        list1.add(1, "hua");
        System.out.println(list1);
//        Method();
        String str = new String();
        String str1 = new String();
        String str2 = new String();
        Date date2 = new Date();
        System.out.println();

    }

    public static void Method()
    {
        try
        {
            FileInputStream fis = new FileInputStream("hello.txt");
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
