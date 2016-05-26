package Module1.src.Bai2;

import java.util.Scanner;

public class tinhsongaythang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int thang, nam,i;
		Scanner input = new Scanner(System.in);
	do {
		System.out.print("Nhap thang : ");
		thang = input.nextInt();
		System.out.print("Nhap nam : ");
		nam = input.nextInt();

		while (nam == 0||nam<0||thang<=0||thang>12) 
		{
			System.out.println("Nam khong hop le, de nghi nhap lai)");
			System.out.print("Nhap thang : ");
			thang = input.nextInt();
			System.out.print("Nhap nam : ");
			nam = input.nextInt();
		}
			if (nam > 0) 
			{
				switch (thang) 
				{	case 1:
					case 3:
					case 5:
					case 7:
					case 8:
					case 10:
					case 12:
						System.out.print("Thang nay co 31 ngay !");
						break;
					case 4:
					case 6:
					case 9:
					case 11:
						System.out.print("Thang nay co 30 ngay !");
						break;

					case 2:
						if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)) {
							System.out.print("Thang nay co 29 ngay !");
						} else {
							System.out.println("Thang nay co 28 ngay ! ");
						}
						break;
				}//switch
			}//if
			System.out.println();
			System.out.println("Ban co muon tinh tiep khong (1=co/0=khong): ");
			i = input.nextInt();
	}while (i==1); //vong do...while de hoi co tiep tuc chuong trinh.
	input.close(); // nen giai phong luong input sau cung se khong bi loi.
		}//main
	}//class

