import java.util.Scanner;

public class sort  {
	public static void main(String[] args) {
		int n;
		int sum = 0;
		float average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array: ");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements: ");
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextInt();
			sum += a[i];
		}
		for(int i = 0; i < n; i++) {
			for( int j = i+1; j < n; j++) {
				if(a[i]>a[j]){
					//Nếu a[i] > a[j] thì hoán đổi giá trị của a[i] và a[j]
					int temp = a[i];
					    a[i] = a[j];
						a[j] = temp;
				
			}
		}
	}    
		System.out.println("Array after sorting: ");
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
			}
		System.out.println("\nSum: "+sum);
		average = (float)sum/n;
		System.out.println("Average: "+average);
	}
}


