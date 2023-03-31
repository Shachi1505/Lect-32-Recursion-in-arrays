public class RecinArr {
    public static void comb(int[] a, int n, int r, int idx, int[] data, int i) {
        if (idx == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();
            return;
        }
        if (i >= n)
            return;
        // Recursions( 2 cases)
        // include the current index and move to next
        data[idx] = a[i];
        comb(a, n, r, idx + 1, data, i + 1);
        // exclude current index and move to next(idx remains same)
        comb(a, n, r, idx, data, i + 1);
    }

    public static void printcomb(int[] a, int n, int r) {
        int[] data = new int[r]; // create a new array of length of r
        // call the function
        comb(a, n, r, 0, data, 0);
    }

    public static void main(String[] args) {
        int n = 4;
        int[] a = { 1, 2, 3, 4 };
        int r = 2;
        printcomb(a, n, r);
    }
}
