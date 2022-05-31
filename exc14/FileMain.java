package exc14;
import java.io.*;
public class FileMain {
	public String File(String a) {
		String s = null;
		try (InputStream input = new FileInputStream(a)) {
			s = readAsString(input);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s);
		return s;
	}

	public static String readAsString(InputStream input) throws IOException {
		int n;
		StringBuilder sb = new StringBuilder();
		while ((n = input.read()) != -1) {
			sb.append((char) n);
		}
		return sb.toString();
	}

	public void writeFile(String a,String b){
		try (OutputStream output = new FileOutputStream(a)) {
			output.write(b.getBytes("UTF-8"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

