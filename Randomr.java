package h;
import java.util.Random;
public class Randomr {
    public static void main(String[] args){
        int[] array={1,2,3,4,5};
        removeE(array);
    }
    static void removeE(int[] array){
        int y;
        Randomr r=new h.Randomr();
        while (array.length>0){
            y = r.nextInt(array.length-1);
            System.out.println("the index :"+y+", the element :" +array[y]);
            int[] array1=new int[array.length-1];
            for (int i = 0; i <y ; i++)
                array1[i]=array[i];
            for (int i = y; i <array.length ; i++)
                array1[i]=array[i+1];
            array=array1;
        }
    }

    private int nextInt(int i) {
        return i;
    }

}
