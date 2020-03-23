package com.hm.spring_01;

public class StringClient {
	
	public static void main(String[] args) {
		
		//生成对象
		StringProcess stringProcess =new StringProcess();
		
		//得到字符串
		//String str = stringProcess.Stringprocess();
		
		//得到新的字符串
		String str = stringProcess.Stringprocess_01();
		System.out.println(str);
	}
}
