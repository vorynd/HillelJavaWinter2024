package homework09;

public class MyStringList {

    private String[] array = new String[10];
    private int indexCounter = 0;

    public boolean add(int index, String value) {
        if (index < indexCounter) {
            array[index] = value;
            return true;
        } else return false;
    }

    public boolean add(String value) {
        if (indexCounter >= array.length) {
            String[] tmp = new String[(int) (array.length * 1.6)];
            for (int i = 0; i < array.length; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
        array[indexCounter] = value;
        indexCounter++;
        return true;
    }

    public boolean delete(int index) {
        if (index < indexCounter) {
            array[index] = null;
            return true;
        } else return false;
    }

    boolean delete(String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                array[i] = null;
                return true;
            }
        }
        return false;
    }

    public String get(int index) {
        return array[index];
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("index " + i + " = " + array[i]);
        }
        System.out.println();
    }

}
