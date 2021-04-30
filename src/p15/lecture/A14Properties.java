package p15.lecture;

import java.io.FileReader;
import java.util.Properties;

public class A14Properties {
	public static void main(String[] args) throws Exception {
		Properties props = new Properties();
		String path = "bin/p15/lecture/config1.properties";
		
		props.load(new FileReader(path));
		
		System.out.println(props.get("id"));
		System.out.println(props.get("password"));
		
//		String Value = (String) props.get("id");
		String value = props.getProperty("id");
	}
}
