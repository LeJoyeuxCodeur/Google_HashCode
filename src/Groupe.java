import java.util.ArrayList;
import java.util.List;

public class Groupe {
	private List<Server> listeServ;
	
	public Groupe(Server... serv){
		listeServ = new ArrayList<Server>();
		for(Server s : serv)
			listeServ.add(s);
	}
	
	public List<Server> getListeServ(){
		return listeServ;
	}
}