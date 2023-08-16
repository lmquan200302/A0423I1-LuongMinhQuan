package _08_DSA.BaiTap.BT_1_ArrayList;

import java.util.Arrays;

public class MyList{
    private int size = 10;
    private static final int DEFAULT_CAPACTY = 10;
    private Object elenments[];


    public MyList() {
        this.size = size;
        this.elenments = elenments;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Object[] getElenments() {
        return elenments;
    }

    public void setElenments(Object[] elenments) {
        this.elenments = elenments;
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elenments=" + Arrays.toString(elenments) +
                '}';
    }
}
