public class Slot {
	private boolean usable;
	private Server server;
	
	public Slot(Server server, boolean usable){
		this.usable = usable;
		this.server = server;
	}

	public boolean isUsable() {
		return usable;
	}

	public void setUsable(boolean usable) {
		this.usable = usable;
	}

	public Server getServer() {
		return server;
	}

	public void setServer(Server server) {
		this.server = server;
	}
	
	public boolean isValidSlot(){
		return isUsable() && getServer() == null;
	}
	public String toString(){
		return server + ":" + usable;
	}
}