package com.nt.main;

public class Pratice {

	public static void main(String[] args) {

			String str2 = "gh nin jjnu";
			String[] str3 = str2.split("\\s");
			System.out.println(str3);
			for(String str4 :str3)
			{
				System.out.println(str4);
			}
//===================================================
			
			String[] str5 = { "koko", "momo","puppy","momo"};
			for(String str6 :str5)
			{
				System.out.println(str6);
				System.out.println(str6.startsWith("m"));
			}
	}
}
