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
			  * ���������ֶε�ʱ���ڴ����ݿ�Ӷ�ȡ
			  */
			 System.out.println(f.getContent().length);
		 }
		
		
	}
	
}
