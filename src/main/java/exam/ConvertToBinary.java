package exam;
import java.util.Scanner;
public class Main {
  public static void main(String args[]){
    int n,q,i=1,j;
    int b[] = new int[50];
    Scanner sc = new Scanner(System.in);
    System.out.println("Input a decimal number: ");
    n = sc.nextInt();
    q=n;
    while(q!=0){
      b[i++] = q%2;
      q = q/2;
    }
    System.out.println("Binary number is: ");
    for(j = i-1;j>0;j--){
      System.out.println(b[j]);
    }
    System.out.println("\n");
  }}

  
