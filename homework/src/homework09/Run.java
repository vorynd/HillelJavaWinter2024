package homework09;


public class Run {
    public static void main(String[] args) {
        MyStringList myStringList = new MyStringList();


        myStringList.add("1");
        myStringList.add("2");
        myStringList.add("3");
        myStringList.add("4");
        myStringList.add("5");
        myStringList.add("6");
        myStringList.add("7");
        myStringList.add("8");
        myStringList.add("9");
        myStringList.add("10");
        myStringList.add(7,"5555");
        myStringList.add("11");
        myStringList.print();
        myStringList.delete(6);
        myStringList.delete("5");
        myStringList.delete("7");
        myStringList.delete("8");
        myStringList.delete("9");
        myStringList.delete("10");
        myStringList.delete("11");

        myStringList.print();

        System.out.println(myStringList.get(5));
        myStringList.delete(0);
        myStringList.delete(0);
        myStringList.delete(0);
        myStringList.delete(0);
        myStringList.print();

    }
}
