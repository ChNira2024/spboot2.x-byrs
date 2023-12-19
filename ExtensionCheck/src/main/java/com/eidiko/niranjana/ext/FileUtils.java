package com.eidiko.niranjana.ext;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;
@Component
public class FileUtils {

	public static String ExtensionGet(String getExtension)
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put(".png", "C:\\app\\png");
		map.put(".docx", "C:\\app\\docx");
		map.put(".tif", "C:\\app\\tif");
		map.put(".img", "C:\\app\\img");
		map.put(".jpg", "C:\\app\\jpg");
		System.out.println(map);
		if(map.containsKey(getExtension))
		{
			System.out.println("getting"+map.get(".png"));
		}
		else {
			System.out.println("not getting");
		}
		return "ok"+map.containsKey(getExtension);
	}
}
