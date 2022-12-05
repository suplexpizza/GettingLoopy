import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double tempC = 0;
        double tempF = 0;
        String trash = "";
        boolean isValid = false;

        do
        {

            System.out.print("Enter the temp in C: ");

            if (in.hasNextInt())
            {

                isValid = true;
                tempC = in.nextDouble();
                tempF = tempC * 1.8 + 32;

            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid number!");
                isValid = false;
            }
        }
        while(!isValid);
        System.out.println("The temp in F is " + tempF);

    }
}