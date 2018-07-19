package other;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

public class OpenFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		/*System.out.println(Desktop.isDesktopSupported());
		Desktop.getDesktop().open(new File("/home/sachin/Desktop/Java Programming Interviews Exposed.pdf"));
		*/
		FileInputStream fileInputStream = new FileInputStream("/home/sachin/Desktop/test.txt");
		
		FileOutputStream  fileOutputStream = new FileOutputStream("/home/sachin/Desktop/test111.gz",true);
		/*int x;
		while( (x = fileInputStream.read()) != -1) {
			fileOutputStream.write(x);
		}*/

		int i = 0;
		byte[] b = new byte[1000];
		
		/*System.out.println("read bytes:"+fileInputStream.read(b));
		System.out.println("print bytes");
		for (byte c : b) {
			System.out.println((char) c);
		}*/
	
		
		/*while((i= fileInputStream.read(b)) != -1) {
			System.out.println((char)b[2]);
			
		}*/
		/*fileOutputStream.write(b, 0, b.length);
		
		Thread.sleep(10000);
		
		fileOutputStream.write("I am from Pune".getBytes(), 0, "I am from Pune".length());*/
		
		/*RandomAccessFile randomAccessFile = new RandomAccessFile("/home/sachin/Desktop/test.txt", "rw");
		randomAccessFile.seek(randomAccessFile.length());
		randomAccessFile.write("fdf".getBytes());
		System.out.println(randomAccessFile.getFilePointer());*/
		
		/*URL url = new URL("http://103.66.178.220/ftp/HDD2/Hindi%20Movies/2018/Hichki%202018.mkv");
		BufferedInputStream bufferedInputStream = new  BufferedInputStream(url.openStream());
		FileOutputStream stream = new FileOutputStream("/home/sachin/Desktop/test.mkv");
		
		
		int count=0;
		byte[] b1 = new byte[100];
		
		while((count = bufferedInputStream.read(b1)) != -1) {
			System.out.println("b1:"+b1+">>"+count+ ">> KB downloaded:"+new File("/home/sachin/Desktop/test.mkv").length()/1024);
			stream.write(b1, 0, count);
		}*/
		
		GZIPOutputStream gzipOutputStream =new GZIPOutputStream(fileOutputStream); 
		int count=0;
		byte[] b1 = new byte[100];
		
		while((fileInputStream.read(b1)!= -1)) {
			gzipOutputStream.write(b1, 0, b1.length);
		}
		
		fileInputStream.close();
		gzipOutputStream.close();
		
		
		
		
	}

}
