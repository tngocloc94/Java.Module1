package Module1.src.Bai2;
import	java.util.Scanner;

public class pheptoancoban {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a,b;				//Khai bao bien trong phuong thuc
	
	Scanner input= new Scanner(System.in); // mo luong nhap
		System.out.print("Nhap a: ");
		a=input.nextInt();					// gan vao bien tuy kieu du lieu
		System.out.print("Nhap b: ");
		b=input.nextInt();
	input.close(); // dong luong nhap

	float tong = a/(float)b; // ep kieu bien bat ky truoc khi tinh toan de ket qua khong mat du lieu
	System.out.print("Phep chia cua a va b la: " + tong);
	
	}

}
