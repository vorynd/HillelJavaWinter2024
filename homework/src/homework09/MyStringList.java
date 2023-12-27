package homework09;

public class MyStringList {

    private String[] array = new String[10];
    private int indexCounter = 0;

    public boolean add(int index, String value) {
        if (index < indexCounter) {
            if (indexCounter >= array.length) {
                expand();
            }
            for (int i = indexCounter; i >= indexCounter - index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
            indexCounter++;
            return true;
        } else return false;
    }

    public boolean add(String value) {
        if (indexCounter >= array.length) {
            expand();
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

    private void expand() {
        String[] tmp = new String[(int) (array.length * 1.6)];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.println("index " + i + " = " + array[i]);
        }
        System.out.println();
    }

}
