import java.util.Scanner;

public class arraySort {

    public static int searchnumber(int arrSize,int Num,int[] arr)
    {
        int s=0;
        for(int i=0;i<arrSize;i++)
        {
            if(arr[i]==Num)
            {
                s=1;
            }

        }
        return stat;
    }

    public static int[] sort(int arrSize,int[] arr)
    {
        for(int i=0;i<arrSize-1;i++)
        {
            int small=arr[i];
            int lower=i;
            for(int j=i+1;j<arrSize;j++)
            {
                if(arr[j]<small)
                {
                    small=arr[j];
                    lower=j;
                }
            }
            int temp=arr[i];
            arr[i]=small;
            arr[lower]=temp;
        }

        return arr;
    }


    public static void main(String args[])
    {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array size: ");
        int arrSize=sc.nextInt();


        int arr[]=new int[arrSize];

        System.out.println("Enter elements to the array: ");

        for(int i=0;i<arrSize;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter to be searched: ");

        int Num=sc.nextInt();

        int status=searchnumber(arrSize,Num,arr);

        if(status==1)
        {
            System.out.println("Element is Found");
        }
        else
        {
            System.out.println("Element not Found");

        }

        int sortArr[]=sort(arrSize,arr);

        System.out.println("Sorted Array is: ");

        for(int i=0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\t");
        }
    }

}