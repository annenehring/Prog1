
public class Complexity {

    // (1) ->O(n^2)
    static void someMethod(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int x = (i * j) % 7;
            }
        }
    }
    // (2) -> O(n)
    static int anotherOne(int a) {
        int sum = 0;
        for (int i = a-1; i >= 0; i--) {
            sum += i;
        }
        return sum/2;
    }

    // (3) -> O(log n)
    static void myCoolFunction(int n) {
        while (n > 1) {
            n = n / 2;
            double y = Math.sqrt(n);
        }
    }
    // (4) -> O(2^n)
    static int recursionAdventure(int x) {
        if (x <= 1) return 1;
        int a = recursionAdventure(x - 1);
        int b = recursionAdventure(x - 2);
        return a+b;
    }

    // (5) -> O (1)
    static void usefulFunction(int[] arr) {
        for (Integer i : arr) {
            return;
        }
    }
    // (6) -> O (n)
    static void trickyMethod(int n) {
        int i = 0;
        while (i < n) {
            for (int j = 0; j < 5; j++) {
                double x = Math.sin(i + j);
            }
            i += 1;
        }
    }
    // (7) O (n log n)
    static void trickyMethod2(int n) {
        for (int i = 1; i < n; i *= 2) {
            for (int j = 0; j < n; j++) {
                int x = (i + j) % 7;
            }
        }
    }
}
