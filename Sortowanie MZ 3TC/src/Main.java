//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        int[] array = {4,2,1,3};
        System.out.println("przed sortowaniem:" + java.util.Arrays.toString(array));

        bubbleSort(array);

        System.out.println("przed sortowaniem:" + java.util.Arrays.toString(array));

    }
}