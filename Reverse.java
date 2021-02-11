package h;

/**
 * Created by pc on 2/11/2021.
 */
public class Reverse {
    int a[]={1,2,3,4};
    public void rev(){
        int n=a.length-1;
        for (int i=0;i<a.length/2;i++){
            int q=a[i];
            a[i]=a[n];
            a[n]=q;
            n--;
        }}
    public void print(){
        System.out.print("[");
        for (int i=0;i<a.length;i++){
            if (i==a.length-1)
                System.out.print(a[i]);
            else
                System.out.print(a[i]+",");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        Reverse g=new Reverse();
        g.print();
        g.rev();
        g.print();}}


