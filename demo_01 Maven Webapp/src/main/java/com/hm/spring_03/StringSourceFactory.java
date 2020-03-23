package com.hm.spring_03;

import java.io.File;
import java.net.URL;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * 生成数据源对象
 * @author Administrator
 *
 */
public class StringSourceFactory {

	public static IGetString ctreat(){
		
		IGetString getString =null;
		//读取配置文件信息
		try {
			String sourceName = parseXml();
			Class  clz= Class.forName(sourceName);
			getString=(IGetString)clz.newInstance();
		} catch (DocumentException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return getString;		
	}

	/**
	 * 解析xml的方法
	 * @return
	 * @throws DocumentException 
	 */
	private static String parseXml() throws DocumentException {
		// TODO Auto-generated method stub
		SAXReader saxReader=new SAXReader();
		//从class目录找
		URL url = StringSourceFactory.class.getResource("/config.xml");
		Document doc=saxReader.read(url);
		Element rootEle = doc.getRootElement();
		Element daEle = rootEle.element("datasource");
		String id = daEle.attributeValue("id");
		String className = daEle.attributeValue("class");
		return className;
	}

	
}
