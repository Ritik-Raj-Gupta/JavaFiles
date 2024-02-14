import java.util.Scanner;
public class Array2d{
	public static void main(String[] ar){
		Scanner ip=new Scanner(System.in);
		int arr[][]=new int[4][5];
		int k=0;
		for(int i=0;i<4;i++){
			System.out.print("Enter "+(i+1)+"th row elements: ");
			for(int j=0;j<5;j++){
				k=ip.nextInt();
				arr[i][j]=k;
			}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
