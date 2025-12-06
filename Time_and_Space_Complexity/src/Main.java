public class Main {
    public static void main(String[] args) {


    }

    public int complexity(int[] arr, int n ){
        int result = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                result = arr[i] + arr[j];
            }
        }
        return result;
    }
}