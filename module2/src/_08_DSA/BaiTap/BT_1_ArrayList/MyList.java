package _08_DSA.BaiTap.BT_1_ArrayList;

import java.util.ArrayList;

public class MyList<E>{
    private  ArrayList<Object> list;
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList(){
        list = new ArrayList<>();

    }
    //void add(int index, E element)
    public void add(int index, E element){
        list.add(index,element);
    }


    //E remove(int index)
    public void  remove(int index){
       list.remove(index);
    }


    //int size
    public int size() {
        return list.size();
    }

    //int boolean contains(E o)
    public boolean contains(Object element) {
        return list.contains(element);
    }


    //E Clone()
    // E get (int index)
    public void get(int index){
        list.get(index);

    }

    public int indexOf(E element){
        return list.indexOf(element);
    }


    //print mylist
    public void printList() {
        System.out.println("MyList: " + list);
    }

}
