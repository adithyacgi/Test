
public class test2 
{
	public static void main(String args[])
	{
		int arr[]=new int[]{3,8,5,6};
		
	}
	int findMin(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int minVal=arr[i];
			for(int j=1;j<arr.length;j++)
			{
				if(minVal>arr[j])
					minVal=arr[j];
					
			}
			return minVal;
		}
		
		
		return 0;
		
		
	}
}
class BinarySearch
{
	int search(int arr[],int leftIndex,int rightIndex,int key)
	{
		if(leftIndex<=rightIndex)
		{
			int mid=(leftIndex+rightIndex)/2;
			if(arr[mid]==key)
				return mid;
			else if(key<arr[mid])
			{
				return search(arr,leftIndex,mid-1,key);
				
			}
			else return search(arr,mid+1,rightIndex,key);

		}
		return -1;
	}
	void mergeSort(int l,int r)
	{
		if(r>l)
		{
			mergeSort(l, );
			
		}
	}
}