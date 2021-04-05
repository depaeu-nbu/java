import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;


public class InputStreamReaderTest {

	
	private static Reader isr;
	public static void main(String[] args) throws Exception{
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("EncodeTest.txt");
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			br = new BufferedReader(isr);
			String line = null;
			while((line=br.readLine())!=null)
				System.out.println(line);
		} finally{
			if (br!=null){
				br.close();
			}
		}
	}
	public static void convertGBK2UTF8(String src, String dst) throws Exception{
		String FileContent = "";
		FileInputStream fis = new FileInputStream(src);
		  InputStreamReader isf = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		  String line = null;
		  while((line = br.readLine())!=null){
			  FileContent += line;
			  FileContent += "\r\n";
		  }
		  FileOutputStream fos = new FileOutputStream(dst);
		  OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
		  osw.write(FileContent);
		  osw.flush();
		  }
}
//201521123032
	