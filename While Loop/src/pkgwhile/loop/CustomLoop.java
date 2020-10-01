
package pkgwhile.loop;

import java.util.Scanner;


public class CustomLoop {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,l,n;
        System.out.println("Enter initial Value: ");
        a=input.nextInt();
        System.out.println("Enter Limit: ");
        l=input.nextInt();
        System.out.println("Enter increment: ");
        n=input.nextInt();
        int i=a;
        while(i<=l)
        {
            System.out.print(i+"+");
            i=i+n;
        }
    }
    
}
