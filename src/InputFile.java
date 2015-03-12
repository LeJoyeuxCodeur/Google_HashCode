import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputFile {
	private List<String> file;
	
	public InputFile(String input){
		file = new ArrayList<String>();
			
		try{
			InputStream ips = new FileInputStream(input); 
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String ligne;
			while ((ligne = br.readLine()) != null)
				file.add(ligne+"\n");
			br.close(); 
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public String toString(){
		String tmp = "";
		
		for(String s : file)
			tmp += s;
		return tmp;
	}
}