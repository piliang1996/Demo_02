package com.hm.spring_02;

import java.util.Scanner;

public class StringClient {
	
	public static void main(String[] args) {
		
		IGetString getString =null;
		
		System.out.println("请选择数据源：1、文件 2、网络 3、DB 4、XML");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		//依赖对象由工厂创建
		getString = StringSourceFactory.ctreat(num);
		
		StringProcess stringProcess = new StringProcess(getString);
		
		String str = stringProcess.Stringprocess();
		
		System.out.println(str);
	}
}
