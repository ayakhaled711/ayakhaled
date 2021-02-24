import java.util.Random;

public class REV_ARRAY <T>{
    T arry[];
    int num=0;
    public REV_ARRAY() {
        arry=(T[]) new Object[3];}
    public void add(T element){
        if(num<=arry.length-1){
            arry[num++]=element;}}
    public void print(){
        for (int i = 0; i <arry.length ; i++) {
            System.out.print(arry[i]+" ");}}
    public void reverse(){
        int n= arry.length-1;
        for (int i = 0; i < arry.length/2 ; i++) {
            T k=arry[i];
            arry[i]=arry[n];
            arry[n]=k;
            n--;}}
    public static void main(String[] args) {
        REV_ARRAY<String> e1=new REV_ARRAY<>();
        e1.add("aya");
        e1.add("khaled");
        e1.add("khorees");
        e1.print();
        e1.reverse();
        e1.print();}
}
