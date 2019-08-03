import java.util.*;
public class swapping_adjacent_bits
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=s.nextInt();
	int x=(n>>1)&(0x55555555);
	int y=(n<<1)&(0xAAAAAAAA);
	System.out.println("the answer is"+(x|y));

	}
}