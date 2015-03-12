public class Main {
	public static void main(String[] args) {
		InputFile input = new InputFile("res/input.txt");
		Groupe g1 = new Groupe(new Server(2, 2), new Server(3, 3));
		System.out.println(input);
		System.out.println("--------------------------------");
		
		DataCenter dc = new DataCenter(10, 10);

		for(Server s : g1.getListeServ())
			dc.ajoute(s);
		System.out.println(dc);
	}
}