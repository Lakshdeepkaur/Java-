import java.util.*;
public class sqrt
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the element whose square root is to be found");
	int n=s.nextInt();
	int mid=0;
	int l=0,r=(n-1);
	while(l<=r)
	{
		mid=(l+r)/2;
		if((mid*mid)>n)
			r=mid-1;
		else
			l=mid+1;
	}
	System.out.println("Answer is : "+mid);
	}
}