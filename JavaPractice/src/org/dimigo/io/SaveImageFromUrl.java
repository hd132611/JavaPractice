package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/*
 * <pre>
 * org.dimigo.io
 * 		|_ SaveImageFromUrl
 * 1. 개요 : 
 * 2. 작성일 : 2015. 10. 23.
 * </pre>
 * @author 신준섭
 *
 */
public class SaveImageFromUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "http://pds24.egloos.com/pds/201204/27/26/d0024426_4f9a6e6fa42fa.jpg";
		try{
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/Talon.jpg")){
				
				//파일에 write하기
				byte[] buf = new byte[100];
				int result;
				
				while((result = is.read(buf)) != -1){
					os.write(buf , 0 , result);
				}
				System.out.println("파일 생성완료!!!");
		
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
