

package pkgwhile.loop;


public class sumOf100Num {
    public static void main(String[] args) {
        int i=1,s=0;
        while (i<=100)
        {
            s=i+s;
            i++;
        }
        System.out.println("The sum is: "+s);
    }
    
}
