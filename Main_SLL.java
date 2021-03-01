package com.company;
public class Main_SLL {
    public static void main(String[] args) {
        SLL<Integer>list=new SLL<>();
        list.addfirst(4);
        list.addfirst(0);
        list.addlast(8);
        int n=list.size();
        for (int i = 0; i <n ; i++) {
            int x=list.remove();
            System.out.print(x);
        }
        System.out.print(list.size());
    }
}
