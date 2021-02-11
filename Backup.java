package h;
import java.util.Scanner;
public class Backup {
    public static void main(String[] args) {
        int i;
        int a[]={1,2,3,4};
        int b[]=new int[a.length];
        b=a;
        b[0]++;
        System.out.println("the arry :");
        for (i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        System.out.println(" ");
        System.out.println("the backup :");
        for (i=0;i<b.length;i++)
        System.out.print(b[i]+" ");
    }
}