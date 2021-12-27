package buoi4;

import java.util.Scanner;
/*
 * Theo như bảng mã ASCII thì tất cả các ký tự chữ hoa (A-Z) có giá trị ASCII nằm trong khoảng từ 65 đến 90. 
 * Các ký tự chữ thường tương ứng (a-z) của chúng có giá trị ASCII từ 97 đến 122 (hơn 32).
 * Các ký tự số tương ứng(0-9)của chúng có giá trị ASCII từ 48 đến 57
 * */
public class ChuanHoaChuoi {

	// function chuyen ve chu thuong
	public static String chuyenVeChuThuong(String input) {
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 65 && charArray[i] <= 90) {
				charArray[i] += 32;
			}
		}
		return (input = String.valueOf(charArray));
	}

	// function chuyen ve chu hoa
	public static String chuyenVeChuHoa(String input) {

		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 97 && charArray[i] <= 122) {
				charArray[i] -= 32;
			}
		}
		return (input = String.valueOf(charArray));
	}

	//	// function In  ra cac ky tu so
	public static void inKyTuSo(String input) {
		char[] charArray = input.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= 48 && charArray[i] <= 57) {
				System.out.println(charArray[i]);
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message;
		System.out.println("\nNhập vào chuỗi : ");
		message = sc.nextLine();
		char c;
		int chon = 0;
		while (true) {
			System.out.println("Moi chon :");
			System.out.println("1-InKyTuSo");
			System.out.println("2-Chuyen ve chu in hoa:");
			System.out.println("3-Chuyen ve chu thuong:");
			System.out.println("4-Thoat");
			chon = sc.nextInt();
			sc.nextLine();
			switch (chon) {
				case 1: {
					inKyTuSo(message);
					break;
				}
				case 2: {
					System.out.println(chuyenVeChuHoa(message));
					break;
				}
				case 3: {
					System.out.println(chuyenVeChuThuong(message));
					break;
				}
				case 4: {
					
					System.exit(0);
					break;
				}
				default: {
					System.out.println("moi nhap lai !!");
					break;
				}
				
			}
			System.out.println("Ban co muon nhap nua khong: (Y/N)");
			c = sc.nextLine().charAt(0);
			if (c == 'N' || c == 'n')
				break;
		}
	}

}
