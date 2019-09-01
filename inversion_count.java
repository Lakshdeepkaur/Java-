import java.util.*;
public class Main
{
public static int merge(int a[],int l,int mid,int r,int aux[])
{
    int i=l,j=mid,k=0;
    int cnt=0;
    for(k=l;k<=r;k++)
    {
        if(j>r)
        {
            aux[k]=a[i++];
        }
        else if(i>mid-1)
        {
            aux[k]=a[j++];
        }
        else if(a[i]<a[j])
        {
            aux[k]=a[i++];
        }
        else
        {
            aux[k]=a[j++];
            cnt++;
        }
    }
    for(k=l;k<=r;k++)
    {
        a[k]=aux[k];
    }
    return cnt;
}
public static int mergesort(int a[],int l,int r,int aux[])
{
    int cnt=0;
    if(l>=r)
    {
        return 0;
    }
   int mid=(l+r)/2;
     cnt+=mergesort(a,l,mid,aux);
     cnt+=mergesort(a,mid+1,r,aux);
     cnt+=merge(a,l,mid+1,r,aux);
    return cnt;
}
public static void main(String []args)
{
    int num;
     Scanner obj=new Scanner(System.in);
     num=obj.nextInt();
     int a[]=new int[num];
     int aux[]=new int[num];
    for(int i=0;i<num;i++)
    {
        a[i]=obj.nextInt();
    }
    int c=mergesort(a,0,num-1,aux);
    for(int i=0;i<num;i++)
    {
        System.out.print(aux[i]+" ");
    }
    System.out.println(c);
}
}

