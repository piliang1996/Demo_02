package com.hm.spring_03;


public class StringClient {
	
	public static void main(String[] args) {
		
		IGetString getString =null;
		
		//依赖对象由工厂创建
		getString = StringSourceFactory.ctreat();
		//实例对象
		StringProcess stringProcess = new StringProcess(getString);
		
		String str = stringProcess.Stringprocess();
		
		System.out.println(str);
	}
}
