package _08_DSA.ThucHanh;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static  final  int DEFAULT_CAPACITY = 10;
    private Object elenments[];

    public MyList(){
        elenments =  new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa(){
        int newSize = elenments.length * 2;
        elenments = Arrays.copyOf(elenments, newSize);
    }

    public  void add(E e){
        if(size == elenments.length){
            ensureCapa();
        }
        elenments[size++] = e;
    }

    public E get(int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException("Index:" + i + ", Size:" + i );

        }
        return (E) elenments[i];
    }


}

