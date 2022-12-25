public class Task1523 {
    public static void main(String[] args) {
        int result = countOddsSolution(3, 7);
        System.out.println(result);

        int result1 = countOddsSolution1(3, 7);
        System.out.println(result1);
    }

    public static int countOddsSolution(int low, int high) {
        return low % 2 == 0 && high % 2 == 0 ? (high - low) / 2 : (high - low) / 2 + 1;
    }

    public static int countOddsSolution1(int low, int high) {
        int diff = high - low;
        int count = diff / 2;

        if (low % 2 != 0 || high % 2 != 0) count++;

        return count;
    }
}
