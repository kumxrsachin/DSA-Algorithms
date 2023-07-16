import java.util.Scanner;

public class a75RotatingByD {
    //better approach.................................................
    public static void rotate(int []a,int d)
    {
        int []temp = new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i] = a[i];
        }
        for(int i=d;i<a.length;i++)
        {
            a[i-d]=a[i];
        }
        for(int i=0;i<d;i++)
        {
            a[a.length-d+i]  = temp[i];
        }
    }
    public static void main(String[] args) {
        int [] a = {4,88,17,49,222};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of d: ");
        int d = sc.nextInt();
        rotate(a,d);
        System.out.println("Array elements after rotating: ");
        for (int j : a)
        {
            System.out.print(j + " ");
        }
    }
}
