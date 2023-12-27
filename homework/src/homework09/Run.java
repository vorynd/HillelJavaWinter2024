package homework09;


public class Run {
    public static void main(String[] args) {
        MyStringList myStringList = new MyStringList();


        myStringList.add("0");
        myStringList.add(0, "3");
        myStringList.add("0");
        myStringList.add("0");
        myStringList.add(9, "999");
        myStringList.add("0");
        myStringList.add("0");
        myStringList.add("0");
        myStringList.add("0");
        myStringList.print();
        myStringList.delete(5);
        myStringList.delete(10);
        myStringList.delete(11);
        myStringList.delete("0");
        myStringList.add("0");
        myStringList.add("0");
        myStringList.print();

        System.out.println(myStringList.get(5));
    }
}
