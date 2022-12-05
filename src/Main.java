public class Main
{
    public static void main(String[] args)
    {
        for (int x = 0; x <= 30; x++)
        {
            System.out.println(x);
        }
        for (int l = 0; l < 3; l++)
            System.out.println();

        for (int x = 30; x >= 0; x--)
        {
            System.out.println(x);
        }
        for (int l = 0; l < 3; l++)
            System.out.println();

        for (int x = 0; x <= 18; x += 3) {
            System.out.println(x);
        }

        for (int l = 0; l < 3; l++)
            System.out.println();

        for (int x = 10; x >= 0; x -= 2)
        {
            System.out.println(x);
        }
        for (int l = 0; l < 3; l++)
        {
            System.out.println();
        }
        //Part B
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= 5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
//Extra Credit
        for (int l = 0; l < 3; l++)
        {
            System.out.println();
        }
        for (int i = 5; i >= 3; i--)
        {
            for (int j = 1; j <= 18; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 7; i >= 1; i--)
        {
            for (int j = 1; j <= 1; j++)
            {
                System.out.print("       ****");
            }
            System.out.println();
        }
    }
}