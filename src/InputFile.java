import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputFile {
	private List<String> file;
	
	public InputFile(String input){
		file = new ArrayList<String>();
			
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(input)));
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