package Projects2;

import java.util.Scanner;

/**
 * Fibonacciseries
 */
public class Fibonacciseries {
    public static void main(String args[])
    { 
        Scanner f = new Scanner(System.in);
        
        int n1=0,n2=1,n3,i;  
        System.out.println("enter the no. of series:");
        int count = f.nextInt();

        System.out.print(n1+" "+n2);//printing 0 and 1  
      
     for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed  
     {  
      n3=n1+n2;  
      System.out.print(" "+n3);  
      n1=n2;  
      n2=n3;  
     }  
    
    }}
    