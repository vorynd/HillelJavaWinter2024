package homework09;

public class MyStringList {

    private String[] array = new String[10];
    private int indexCounter = 0;

    public boolean add(int index, String value) {
        if (index < indexCounter) {
            if (indexCounter >= array.length - 1) {
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
        if (indexCounter >= array.length - 1) {
            expand();
        }
        array[indexCounter] = value;
        indexCounter++;
        return true;
    }

    public boolean delete(int index) {
        if (index < indexCounter) {
            for (int i = index; i < indexCounter; i++) {
                array[i] = array[i + 1];
            }
            indexCounter--;
            if (indexCounter <= array.length * 0.5 && array.length > 10) {
                shrink();
            }
            return true;
        } else return false;
    }

    public boolean delete(String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(value)) {
                return delete(i);
            }
        }
        return false;
    }

    public String get(int index) {
        if (index < indexCounter) {
            return array[index];
        } else throw new IndexOutOfBoundsException("index " + index + " out of bounds for length " + indexCounter);
    }

    private void expand() {
        String[] tmp = new String[(int) (array.length * 1.6)];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    private void shrink() {
        String[] tmp = new String[(int) (array.length * 0.7)];
        for (int i = 0; i <= indexCounter; i++) {
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
