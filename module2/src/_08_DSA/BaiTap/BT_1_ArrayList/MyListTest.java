package _08_DSA.BaiTap.BT_1_ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(1,"Banana");
        myList.add(2,"Apple");
        myList.add(3,"Lemon");
        myList.add(4,"Orange");

        myList.printList();

        myList.printList();

        System.out.println( myList.size());

        System.out.println(myList.contains("Banana"));

        myList.remove(1);

        System.out.println( myList.size());

        myList.printList();

    }
}
