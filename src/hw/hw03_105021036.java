package hw;
import java.util.Scanner;
public class hw03_105021036 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int sum = 1;
		for(int i = 1;n>=i;i++){
		sum = sum*i;
		}
		System.out.println(sum);
	}

}
