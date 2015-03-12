import java.util.List;

public class Groupe {
	private List<Server> listeServ;
	
	public Groupe(Server... serv){
		for(Server s : serv)
			listeServ.add(s);
	}
}