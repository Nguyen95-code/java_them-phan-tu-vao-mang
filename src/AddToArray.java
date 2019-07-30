import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("nhap so can them :");
        int x = scanner.nextInt();
        System.out.println("nhap vi tri them :");
        int index = scanner.nextInt();
        array = addElement(index, x, array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] addElement(int index, int element, int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        newArray[index] = element;
        for (int i = index + 1; i < array.length; i++) {
            newArray[i] = array[i - 1];
        }
        return newArray;
    }
}
