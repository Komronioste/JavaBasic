package com.neotech.lesson30;

import java.util.ArrayList;

public class Homework03 {

	public static void main(String[] args) {

ArrayList<Integer> nums = new ArrayList<>();

nums.add(3);
nums.add(3);
nums.add(4);
nums.add(5);
nums.add(4);
System.out.println(nums);

Integer sum = 0;
for (Integer a : nums)
{
	sum+=a;
}
System.out.println(sum);
	}

}
