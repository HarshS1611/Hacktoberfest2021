//Exception example in java
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exception1 {
    public static boolean isValidE123(String s)
    {
        Pattern p = Pattern.compile( "\\d{10}");

        Matcher m = p.matcher(s);
        return (m.find() && m.group().equals(s));
    }

    public static void main(String[] args)
    {
        String phone1 = "7380574434";

            if (isValidE123(phone1))
                System.out.print(phone1+" is valid number");
            else
                System.out.print(phone1+" is invalid number");

            System.out.println();
    }
}

