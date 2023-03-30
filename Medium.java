public class Medium {
    public static void main(String[] args) {
        int n=5;
        int[] a={1,2,3,4,5};
        tri(a); // calling original array
    }
    public static void tri(int[] a) {
        if(a.length<1) return;
int[] b = new int[a.length-1]; // creating new array 
for(int i=0; i<a.length-1; i++){
    b[i] = a[i] + a[i+1]; // recursion call
}
tri(b); // To print new array 
    }
}
/* Output
[48]
[20, 28]
[8, 12, 16]
[3, 5, 7, 9]
[1, 2, 3, 4, 5]
*/
