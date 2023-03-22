public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myListTest = new MyList<>(5);
        System.out.println(myListTest);
        myListTest.add(1);
        myListTest.add(5);
        myListTest.add(7);
        myListTest.add(9);
        System.out.println(myListTest);
        System.out.println(myListTest.size());
        System.out.println(myListTest.clone());
        System.out.println(myListTest.contain(1));
        System.out.println(myListTest.size());
    }
}
