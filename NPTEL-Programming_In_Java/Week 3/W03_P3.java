import java.util.Scanner;
public class W03_P3{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int num=sc.nextInt();
  //Use while loop to count number of digits in an integer
  int count = 0;
  if (num == 0) {
    count = 1;
  } else {
    while (num > 0) {
      count++;
      num /= 10;
    }
  }
  System.out.print(count);
  }
}

