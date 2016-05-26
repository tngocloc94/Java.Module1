package Module1.src.Bai2;
import java.io.IOException; 
import java.util.Scanner; 
 
public class phuongtrinhbac2 { 
 
  private static Scanner input; 
 
  public static void main(String[] args) throws IOException { 
    int a,b,c; 
    float x1=0,x2, delta; 
    input = new Scanner(System.in);   
    int i; 
    do { 
    System.out.print("Nhập giá trị a: "); a = input.nextInt(); 
    System.out.print("Nhập giá trị b: "); b = input.nextInt(); 
    System.out.print("Nhập giá trị c: "); c = input.nextInt(); 
    if (a == 0) { 
      x1 = -c/b; 
      System.out.println("Phương trình có nghiệm kép: " + x1); 
    } else { 
      delta = b*b - 4*a*c; 
      if (delta < 0) { 
        System.out.println("Phương trình vô nghiệm"); 
      } else if (delta == 0) {System.out.print("Phương trình có nghiệm kép x1 = x2 = " + x1); 
      x1 = (-b)/(2*a); 
      System.out.println(x1); 
      } else { 
      System.out.println("Phương trình có 2 nghiệm: "); 
      x1 = (float) ((-b + Math.sqrt(delta))/2*a); 
      x2 = (float) (-b - Math.sqrt(delta))/2*a; 
      System.out.print("x1 = "); System.out.println(x1); 
      System.out.print("x2 = "); System.out.println(x2); 
      System.out.println(); 
    } 
  } 
  System.out.print("Bạn có muốn tiếp tục không (1 = tiếp/số bất kỳ = thoát): "); 
  i = input.nextInt(); 
  System.out.println(); 
  }while (i == 1); 
}   
} 