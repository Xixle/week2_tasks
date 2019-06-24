import java.util.Scanner;

class foobar{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Write ur number : "); 
		int a = in.nextInt();

		if(a < 0 ){
			System.out.println("ERROR: Write pos number");
		}else if(a%2==1){
			System.out.println("Ur number is odd");
		}else if(a%2==0){
			System.out.println("Ur number is even");
		}
	}
}