package h;

import java.util.Arrays;
import java.sql.Array;

public class Remove {
    int a[]={1,2,3,4};
 public void remove(int x[], int y){
     if(y>=0 &&y<x.length){
         int i=y;
         while (i<x.length-1){
             x[i]=x[i+1];
             i++;
         }
         x[i]=0;
     }
 }

    public static void main(String[] args) {
        Remove q=new Remove();
        System.out.println(Arrays.toString(q.a));
        q.remove(q.a,2);
        System.out.println(Arrays.toString(q.a));
    }
}
