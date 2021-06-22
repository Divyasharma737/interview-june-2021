import java.util.*;
 class Main
{  
 public static void main(String args[])
 {
         Scanner sc = new Scanner(System.in);
         int p,n,c;
 
         System.out.println("Enter the number of elements:") ;
         n = sc.nextInt();
         int[] a = new int[n];
 
         System.out.println("Enter the elements") ;
         for(p=0;p<n;p++)
       { 
          a[p] = sc.nextInt();
       }
 
     	   System.out.println("Original array");
         for(p=0;p<n;p++)
       {
         System.out.print(a[p]+" ");
       }
 
     /* shifting array elements */
        c=a[n-1];
        for(p=n-1;p>0;p--)
       {
          a[p]=a[p-1];
        }
         a[0]=c;
 
        System.out.println("\nNew array after rotating by one postion in the right direction");
        for(p=0;p<n;p++)
       {
         System.out.print(a[p]+" ");
        }
 } 
}
