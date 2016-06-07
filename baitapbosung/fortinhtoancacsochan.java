package baitapbosung;

import java.util.Scanner;

public class fortinhtoancacsochan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, n, tich = 1;
		int tong = 0;
		double thuong = 1;
		int i; // biến này để lặp không nên đưa vào trong vòng do...while
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("Nhập test giới hạn dãy số cần tính : ");
			a = input.nextInt();
			for (n = 2; n <= a; n = n + 2) {
				tong += n;
				tich *= n;
				thuong /= n;
			}
			System.out.println("Thương các số chẵn từ 1 đến " + a + " là: " + thuong);
			System.out.println("Tích các số chẵn từ 1 đến " + a + " là: " + tich);
			System.out.println("Tổng các số chẵn từ 1 đến " + a + " là: " + tong);
			System.out.println("Hiệu các số chẵn từ 1 đến " + a + " là: " + (4 - tong));
			System.out.print("Bạn có muốn tiếp tục (1:có) : ");
			i = input.nextInt();
			tong = 0;// reset bien tong
			tich = 1;// reset bien tich
			thuong = 1;// reset bien thuong

		} while (i == 1);
		input.close();
	}
}
