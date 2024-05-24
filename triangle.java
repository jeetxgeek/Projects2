package Projects2;

import java.util.Scanner;

public class triangle 
{
    public static void main(String[] args) 
    {
        Scanner t = new Scanner(System.in);
        System.out.println("enter the number of pattern");
        int n = t.nextInt();
        System.out.println();
        System.out.println();
        int i;int j;
        for(i = 1;i<=n;i++)
        {
            for(j = 1;j<=i;j++)
            {
                System.out.print("$" + " ");
            }
            System.out.println();
        }
    }
}
