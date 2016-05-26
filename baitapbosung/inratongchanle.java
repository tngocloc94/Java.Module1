package baitapbosung;

import java.util.Scanner;

public class inratongchanle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,n,tong=0;
		int i; // biến này để lặp không nên đưa vào trong vòng do...while
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Nhập số nguyên bất kỳ khác 0 : ");
			a = input.nextInt();
			
			while (a==0)
			{
				System.out.println("Không hợp lệ, đề nghị nhập lại !");
				System.out.print("Nhập số nguyên bất kỳ khác 0 : ");
				a=input.nextInt();
			}
		if (a%2!=0&&a>0)
		{
			for (n=2;n<=a;n=n+2)
			{
				tong+=n;				
			}			
			System.out.println("Tổng số chẵn là: " + tong);

		}
		else
		{
			for (n=1;n<=a;n=n+2)
			{
				tong+=n;				
			}
			System.out.println("Tổng số lẻ là: " + tong);

		}
			System.out.print("Bạn có muốn tiếp tục (1:có) : ");
			i = input.nextInt();
			tong=0;
			

		} while (i == 1);
		input.close();
	}

}
