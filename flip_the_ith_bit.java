import java.util.*;
public class flip_the_ith_bit
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	System.out.println("enter which flip u want to flip!!");
	int bit=s.nextInt();
	n=(n^(1<<(bit-1))); // here bit is the human understandable bit..means index from left start with 1 not 0
	System.out.println(n);  // printing number after fliping bit.
	}
}