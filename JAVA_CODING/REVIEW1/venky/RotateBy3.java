class RotateBy3
{
	public static void main(String[] args)
	{
		int temp=0;
		int[] array ={1,2,3,4,5,6};
		for(int i=0;i<3;i++)
		{
			temp = array[i];
			array[i] = 0;
			array[i+3] = temp;
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
}