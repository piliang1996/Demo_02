package com.hm.spring_03;

/**
 * 功能：对字符串进行特殊的处理，但是自己并不提供字符串（材料）
 * @author Administrator
 *
 */
public class StringProcess {
	
	
	private IGetString getString;
	//依赖的对象的创建有内部转移到外部【IOC:控制反转】
	public StringProcess(IGetString getString){
		this.getString=getString;
	}
	
	
	//处理逻辑 （来源文件）
	public String Stringprocess(){
		return "处理"+this.getString.getString();		
	}

}
