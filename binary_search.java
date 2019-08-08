 import java.util.*;
 public class binary_search
 {
 public static void main(String args[])
 {
 Scanner s=new Scanner(System.in);
 System.out.println("enter the size of array");
 int n=s.nextInt();
 System.out.println("Enter the array elements");
 int arr[]=new int[n];
 int i;
 for(i=0;i<n;i++)
 {
 arr[i]=s.nextInt();
 }
 System.out.println("enter the element to b searched");
 int elem=s.nextInt();
 int l=0,r=(n-1);
 int mid=0,flag=0;
 while(l<r)
 {
 mid=(l+r)/2;
 if(arr[mid]==elem)
 {
 	flag=1;
 	break;
 }
 else if(arr[mid]>elem)
 r=mid-1;
 else
 l=mid+1;
 }

 if(flag==0)
 	System.out.println("Sorry ..element not present");
 else
 	System.out.println("Element is present at index "+mid);
 }
 }