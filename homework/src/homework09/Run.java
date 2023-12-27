package homework09;


public class Run {
    public static void main(String[] args) {
        MyStringList myStringList = new MyStringList();


        myStringList.add("1");
        myStringList.add("2");
        myStringList.add("3");
        myStringList.add("4");
        myStringList.add("5");
        myStringList.add(2,"1444");
        myStringList.add(3,"1444");
        myStringList.add(4,"1444");
        myStringList.add(5,"1444");

        myStringList.print();


        myStringList.delete("0");
        myStringList.print();

        System.out.println(myStringList.get(5));
    }
}
