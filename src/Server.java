public class Server {
	private int taille, capacite;

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public Server(int taille, int capacite) {
		this.taille = taille;
		this.capacite = capacite;
	}
	
	public String toString(){
		return "(Serveur: " + taille+":"+capacite+")";
	}
}
