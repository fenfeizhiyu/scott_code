package com.info.work.util;

public class NumberUtil {

	public static int getRandNumber(int min,int max)
	{
		return (int)((max-min)* Math.random())+min;
	}
	
	
	public static int[] getNumbers(int size,int min,int max)
	{
		if(size<0)
			return null;
		if(min<0||max<0||min>max)
			return null;
		int[] arrs=new int[size];
		for(int i=0;i<size;i++)
		{
			arrs[i]=getRandNumber(min,max);
		}
		return arrs;
	}
	
	public static void main(String[] args)
	{
		/*
		for(int i=0;i<30;i++)
		{
			System.out.print(getRandNumber(1,10)+" ");
		}
		*/
		int arrs[]=getNumbers(30,0,10);
		PrintUtils.printArrays(arrs, true);
	}
	
	
}
