package homework10;

public class Run {
    public static void main(String[] args) {
        MyStringList myStringList = new MyStringList();

        myStringList.add("sdfsf");
        myStringList.add("4");
        myStringList.add("12");
        System.out.println(myStringList.size());
        myStringList.print();
        System.out.println(myStringList.delete("4"));
        System.out.println(myStringList.delete("7"));
        myStringList.print();
        System.out.println(myStringList.contain("4"));
        System.out.println(myStringList.contain("0"));
        System.out.println(myStringList.contain("sdfsf"));

        myStringList.print();
        myStringList.clear();
        myStringList.print();
    }

}
