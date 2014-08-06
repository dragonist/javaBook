package hw02sadari2;

public class Lad {
	Bri bridge;
	int peo;
	int leg;

	public Lad(int peo,int leg){
		this.peo=peo;
		this.leg=leg;
	}
	
	public boolean getBridge(Spot s){
		if(bridge==null){
			bridge=new Bri(s,peo,leg);
			
			return true;
		}
		if(bridge.isHasAlready(s)){
			return false;
		}
		bridge.addSpot(s);
		bridge.print();
		return true;
		
	}

	public int findPeople(int person){
		if(bridge==null){
			return person;
		}
		int[] answer=bridge.findPerson(new int[]{0,person});
		return answer[1];
	}
}

