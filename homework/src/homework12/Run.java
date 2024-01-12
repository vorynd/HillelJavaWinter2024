package homework12;

public class Run {
    public static void main(String[] args) {
        FileNavigator fileNavigator= new FileNavigator();

        fileNavigator.add(new FileData("test",120,"C:\\Program Files"),"C:\\Program Files");
        fileNavigator.add(new FileData("test2",110,"C:\\Program Files"),"C:\\Program Files");
        fileNavigator.add(new FileData("test3",130,"C:\\Users"),"C:\\Users");
        fileNavigator.add(new FileData("test4",10,"C:\\Users"),"C:\\Users");
        fileNavigator.add(new FileData("test5",80,"C:\\Users"),"C:\\Users");
        fileNavigator.add(new FileData("test5",70,"C:\\Program Files (x86)"),"C:\\Program Files (x86)");

        fileNavigator.showAll();
        System.out.println();
        System.out.println(fileNavigator.find("C:\\Program Files"));
        System.out.println();
        System.out.println(fileNavigator.filterBySize(90));
        System.out.println();
        fileNavigator.remove("C:\\Program Files (x86)");
        fileNavigator.showAll();
        System.out.println();
        System.out.println(fileNavigator.sortBySize());

    }
}
