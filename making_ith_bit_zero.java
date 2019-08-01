import java.util.*;
public class making_ith_bit_zero
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	System.out.println("enter which flip u want to make 0!!");
	int bit=s.nextInt();
	n=(n&(~(1<<(bit-1)))); // here bit is the human understandable bit..means index from left start with 1 not 0
	System.out.println(n);  // printing number after fliping bit.
	}
}