public class Main {
    public static void main(String[] args) {
        int[] myArray = {2, 5, 12, 5, 1, 18};
        sumArray(myArray);
        System.out.println("================");
        evenNumbers(myArray);
        System.out.println("================");
        String[] myString = {"asztal", "haz", "agy", "fogkefe", "szek", "borond"};
        arrayString(myString);
        System.out.println("================");
        myMEthod();

    }

    public static void sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println(sum);
    }

    public static void evenNumbers(int[] array) {
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
    public static void myMEthod() {
        System.out.println("hi");
    }

    public static void arrayString(String[] array) {
        for (int i = 0; i < array.length; i += 3) {
            for (int j = i; j < i + 3 && j < array.length; j++) {
                System.out.print(array[j] + " ");


            }
            System.out.println();


        }
    }
}