package com.company;
public class SLL <E>{
    node<E>head=null;
    node<E>tail=null;
    int size=0;
    public boolean empty(){
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public E first(){
        if (empty()) return null;
        return head.getElement();
    }
    public E last(){
        if (empty()) return null;
        return tail.getElement();
    }
    public void addfirst(E newelm){
        head=new node<E>(newelm,head);
        if (size==0)
            tail=head;
        size++;
    }
    public void addlast(E newel){
        node<E> newe=new node<E>(newel,null);
        if (size==0)
            head=newe;
        else
            tail.setNext(newe);
        tail =newe;
        size++;
    }
    public E remove(){
        if (empty())return null;
        E delet=head.getElement();
        size--;
        if(size==0)
            tail=null;
        return delet;
    }

    private static class node<E>{
        private E element;
        private node<E> next;

        public node(E element, node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public node<E> getNext() {
            return next;
        }

        public void setNext(node<E> next) {
            this.next = next;
        }
    }

}
