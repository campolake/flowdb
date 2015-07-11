package org.flowdb.test.api;

import java.util.List;




public class FileTest {

	public static void main(String[] args) {

		 File file = new File();
		 file.save();
		 
		 List<File> fs = file.query(file);
		 
		 System.out.println(fs.size());

		 for(File f:fs)
		 {
			 /*
			  * 访问内容字段的时候在从数据库从读取
			  */
			 System.out.println(f.getContent().length);
		 }
		
		
	}
	
}
