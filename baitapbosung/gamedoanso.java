package baitapbosung;

import java.util.Random;
import java.util.Scanner;

public class gamedoanso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, i = 0, diem;

		Scanner input = new Scanner(System.in);
		Random rd = new Random();
		do {
			System.out.println("Khởi điểm bạn có 5 điểm ");
			System.out.println("Đoán đúng được + 1 điểm ; đoán sai bị trừ 1 điểm ");
			System.out.println("Game over khi bạn hết điểm ");
			System.out.println("Bạn thắng game nếu được 10 điểm ");
			diem = 5;
			do {
				System.out.println("Mời bạn đoán số ! ");
				System.out.println("Tôi đoán số : ");
				a = input.nextInt();
				int r = rd.nextInt();
				System.out.println("SỐ TRÚNG LÀ : " + r);
				// a = input.nextInt(); //dùng để test trường hợp đoán đúng

				if (a == r) {
					diem += 1;
					System.out.println("Bạn đã đoán đúng, số điểm hiện tại là : " + diem);
				} else {
					diem -= 1;
					System.out.println("Bạn đã đoán sai, số điểm hiện tại là : " + diem);
				}

				switch (diem) {
				case 0:
					System.out.println("Game Over !");
					break;
				case 10:
					System.out.println("Congraturation! You are win ! ");
					break;
				}
			} while (diem != 0 && diem != 10);

			System.out.print("Bạn có muốn tiếp tục (1:có) : ");
			i = input.nextInt();
		} while (i == 1);
		input.close();

	}

}
