
import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
			double a, b, a11, a12, a21, a22, b1, b2, p, q, r;
			System.out.println("Phuong trinh mot an ax+b = 0: ");
			System.out.println("Nhap vao so a: ");
			a = sc.nextDouble();
			System.out.println("Nhap vao so b: ");
			b = sc.nextDouble();
			if(a == 0) 
			{
				System.out.println(" Phuong trinh 0x + " + b + " = 0 khong giai duoc");
			}
			else
				System.out.println(" x = " + (-b / a));
			
			    System.out.println("\n**************\n"
					+ "He phuong trinh bac hai voi hai bien: \n" + "a11x + a12y = b1\n" + "a12x + a22y = b2");
			System.out.println("Nhap vao so a11: ");
			a11 = sc.nextDouble();
			System.out.println("Nhap vao so a12: ");
			a12 = sc.nextDouble();
			System.out.println("Nhap vao so b1: ");
			b1 = sc.nextDouble();
			System.out.println("Nhap vao so a21: ");
			a21 = sc.nextDouble();
			System.out.println("Nhap vao so a22: ");
			a22 = sc.nextDouble();
			System.out.println("Nhap vao so b2: ");
			b2 = sc.nextDouble();
			double D, D1, D2;
			D = a11 * a22 - a21 * a12;
			D1 = b1 * a22 - b2 * a12;
			D2 = a11 * b2 - a21 * b1;
			if (D1 == 0 && D2 == 0) {
				System.out.println(" He co vo so nghiem ");
			}
			else if (D != 0) {
				
				System.out.println(" (x1, x2) = " + "(" + D1/D + ", " + D2/D + ")");
			}
			else
				System.out.println(" He vo nghiem ");
			
			System.out.println("\n*****************\n" + "Phuong trinh bac hai : ax^2 + bx + c = 0");
			System.out.println("Nhap vao so a: ");
			p = sc.nextDouble();
			System.out.println("Nhap vao so b: ");
			q = sc.nextDouble();
			System.out.println("Nhap vao so c: ");
			r = sc.nextDouble();
			if(p ==0)
				System.out.println("Khong la phuong trinh bac hai");
			else {
				double Delta;
				Delta = q*q - 4*r*p;
			
				if(Delta > 0) {
					double sqrt_del = Math.sqrt(Delta);
					System.out.println("Solution: (x1, x2) = " + "(" + (float)((-q + sqrt_del) / 2*p)
							+ ", " + (float)((-q - sqrt_del) / 2*p) + ")");
				}
				else if(Delta == 0) {
					
						System.out.println(" x1 = x2 = " + (-q/2*p));
				}
				else
					System.out.println(" Vo nghiem ");
			}
		}
	}

