import java.util.Arrays;

public class DataCenter {
	private Slot[][] dataCenter;
	
	public DataCenter(int nbRangees, int nbCases){
		dataCenter = new Slot[nbRangees][nbCases];
		
		for(int i = 0; i < dataCenter.length; i++){
			for(int j = 0; j < dataCenter[0].length; j++){
				dataCenter[i][j] = new Slot(null, true);
			}
		}
		dataCenter[0][1] = new Slot(null, false);
	}
	
	public boolean ajoute(Server s){
		int[] freeIndex = getFirstFreeIndex(s.getCapacite());
		
		if(freeIndex[0] == -1)
			return false;
		dataCenter[freeIndex[0]][freeIndex[1]] = new Slot(s, true);
		return true;
	}
	
	public int[] getFirstFreeIndex(int capacité){
		for(int i = 0; i < dataCenter.length; i++){
			for(int j = 0; j < dataCenter[0].length; j++){
				if(dataCenter[i][j].isValidSlot()){
					for(int k = 0; k < capacité - 1; k++){
						if(dataCenter[i][j+k].isValidSlot())
							return new int[]{i, j};
					}
				}
			}
		}
		return new int[]{-1, -1};
	}
	
	public String toString(){
		String tmp = "";
		
		for(int i = 0; i < dataCenter.length; i++){
			for(int j = 0; j < dataCenter[0].length; j++){
				tmp += dataCenter[i][j]+"  ";
			}
			tmp += "\n\n";
		}
		return tmp;
	}
}