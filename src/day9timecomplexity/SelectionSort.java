package day9timecomplexity;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {9,8,7,6,2,9};  //n=5
		int loopCounter=0;
		System.out.println("Before "+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				loopCounter++;
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("After "+Arrays.toString(arr));
		System.out.println("Loop Counter" +loopCounter);
	}

}
