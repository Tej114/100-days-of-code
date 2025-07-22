import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();        
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        System.out.println("The element "+x+" occurs "+count+" time(s) in the array.");
    }
}
