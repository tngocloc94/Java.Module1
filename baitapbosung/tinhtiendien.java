package baitapbosung;

import java.util.Scanner;

public class tinhtiendien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,n,tong=0;
		int i; // biến này để lặp không nên đưa vào trong vòng do...while
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Nhập số điện : ");
			a = input.nextInt();
			for (n=0;n<a&&n<10;n=n+1)
			{
				tong+=6;
			}
			for (n=10;n<a&&n<15;n=n+1)
			{
				tong+=7;
			}
			for (n=15;n<a&&n<20;n=n+1)
			{
				tong+=9;
			}
			for (n=20;n<a;n=n+1)
			{
				tong+=11;
			}
			System.out.println("Tổng tiền phải đóng là : "+ tong);
			System.out.print("Bạn có muốn tiếp tục (1:có) : ");
			i = input.nextInt();
			tong=0;

		} while (i == 1);
		input.close();
	}

}
