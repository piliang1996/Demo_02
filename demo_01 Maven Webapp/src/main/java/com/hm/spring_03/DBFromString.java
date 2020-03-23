package com.hm.spring_03;

public class DBFromString implements IGetString {

	/* (non-Javadoc)
	 * @see com.hm.spring_02.IGetString#getString()
	 */
	@Override
	public String getString(){
		
		return "从数据库中获取字符串";		
	}
}
