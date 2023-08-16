package _08_DSA.BaiTap.BT_1_ArrayList;

import java.util.ArrayList;

public class ArrayList_MyList {
    private ArrayList<MyList> arrayList;

    public ArrayList_MyList()  {
        this.arrayList = new ArrayList<MyList>();
    }
    public ArrayList_MyList( ArrayList<MyList> arrayList){
        this.arrayList = arrayList;
    }

    // h di tao may cai menthod ne may anh zai
    public void add(MyList Element){
        this.arrayList.add(Element);


    }

}
