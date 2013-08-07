package org.alc.util;

import org.springframework.stereotype.Service;

@Service("classLoader")
public class ClassLoader {
	
	public Class<?> load(String className) {
		try {
			return Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
