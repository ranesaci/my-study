package other;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class ReadJarFilesContents {

	public static void main(String[] args) {
		
		String JAR_PATH = "/home/sachin/Qualys/created jar/url-scanner-0.0.1-SNAPSHOT.jar";
		readJarContents(JAR_PATH);

	}
	
	public static void readJarContents(String jarFileToRead) {
		JarFile jarFile = null;
		try {
			jarFile = new JarFile(jarFileToRead);
			JarEntry entry = jarFile.getJarEntry("BOOT-INF/classes/application.properties");
			InputStream inputStream = jarFile.getInputStream(entry);
			
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
			String read = null;
			StringBuffer sb = new StringBuffer();
			while((read = bufferedReader.readLine()) != null) {
			    sb.append(read+ "\n");
			}
			System.out.println(sb.toString());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
	}
	

}
