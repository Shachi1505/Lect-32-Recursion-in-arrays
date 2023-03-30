public class Easy{
    public static void main(String[] args) {
        int m=2, n=3; 
        // m is total rows
        // n is total cols
        int i=0, j=0; // initialising row and col
        System.out.println(move(m,n,i,j));
    }
    public static int move(int m, int n, int i, int j){
        if(i >= m || j >= n) // beyond the end 
                        return 0;
                if(i == m - 1 && j == n - 1) // When we reach the bottom corner
                        return 1;

                        return move(m,n,i+1,j) + move(m,n,i,j+1);
//                             last col reached + last row reached
        //                    move to next row  + move to next col
    }
}
// OUTPUT:3
