package com.info.work.sort;

import com.info.work.util.NumberUtil;
import com.info.work.util.PrintUtils;

public class Insert {
	
		public int[] insertSort(int[] arrs,boolean asc)
		{
			if(arrs==null||arrs.length<=1)
			{
				System.out.println("the array is empty");
				return null;
			}
			int temp=0;
			for(int i=1;i<arrs.length;i++)
			{
				int j=i;
				while(j>0)
				{
					if(!(arrs[j]<arrs[j-1]^asc))
					{
						temp=arrs[j];
						arrs[j]=arrs[j-1];
						arrs[j-1]=temp;
						
					}
					j--;
				}
			}
			return arrs;
		}
		
		public static void main(String[] args)
		{
			int[] arrs=NumberUtil.getNumbers(100000, 1, 100);
			Insert ins=new Insert();
			System.out.println("开始排序");
			long start=System.currentTimeMillis();
			arrs=ins.insertSort(arrs, true);
			long end=System.currentTimeMillis();
			System.out.println(end-start);
			System.out.println("排序结束");
			//PrintUtils.printArrays(arrs,true);
			System.out.println("******************");
			
		}
	
}
