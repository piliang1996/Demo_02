package com.hm.spring_02;

public class StringSourceFactory {

	public static IGetString ctreat(int num){
		
		IGetString getString =null;
		switch(num){
		case 1:
			getString =new FileFromString();
			break;
		case 2:
			getString =new NetFromFile();
			break;
		case 3:
			getString =new DBFromString();
			break;
		case 4:
			getString =new XMLFromString();
			break;
	}
		return getString;		
	}
}
