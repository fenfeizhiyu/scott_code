package com.info.work.util;

public class PrintUtils {
	
	public static void printArrays(int[] arrs,boolean line)
	{
		if(arrs==null)
			return;
		if(arrs.length<0)
			return;
		else
		{
			for(int i=0;i<arrs.length;i++)
			{
				if(line)
					System.out.print(arrs[i]+" ");
				else
					System.out.println(arrs[i]);
			}
		}
	}
}
