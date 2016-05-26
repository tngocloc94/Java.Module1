package Module1.src.Bai2;
import java.util.Scanner;

public class lamtronso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		int i; // biến này để lặp không nên đưa vào trong vòng do...while
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Nhập số bất kỳ : ");
			a = input.nextDouble();
			if (a - (int) a < 0.5) {
				System.out.println("Kết quả sau khi làm tròn là: " + (int)a);
			} else {
				if (a-(int)a==0.5)
				{
					System.out.println(" Kết quả sau khi làm tròn là : " + a);
				}
				else
				{
					a=(int)a+1;						;
					System.out.println("Kết quả sau khi làm tròn là : " + a);
				}
			}
			System.out.print("Bạn có muốn tiếp tục (1:có) : ");
			i = input.nextInt();
		} while (i == 1);
		input.close();
	}

}
