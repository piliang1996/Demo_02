package com.hm.spring_01;

/**
 * 功能：对字符串进行特殊的处理，但是自己并不提供字符串（材料）
 * @author Administrator
 *
 */
public class StringProcess {
	
	//用来接收外来的字符串
	private FileFromString fileFromString;
	
	private NetFromFile netFromFile;
	
	private DBFromString dbFromString;
	
	public StringProcess(){
		this.fileFromString=new FileFromString();
		this.netFromFile=new NetFromFile();
		this.dbFromString=new DBFromString();
	}
	
	
	//处理逻辑 （来源文件）
	public String Stringprocess(){
		return "处理"+this.fileFromString.getString();		
	}
	//新的处理逻辑（来源网络）
	public String Stringprocess_01(){
		return "处理"+this.netFromFile.getString();		
	}
	//新的处理逻辑（来源数据库）
	public String Stringprocess_02(){
		return "处理"+this.dbFromString.getString();		
	}
}
