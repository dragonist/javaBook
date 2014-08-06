package hw02sadari2;

public class Bri {
	Spot first;
	int peo;
	int leg;
	
	public Bri(Spot temp,int peo, int leg){
		first=temp;
		temp.next=null;
		this.peo=peo;
		this.leg=leg;
	}
	public void addSpot(Spot temp){
		if(first==null){
			first=temp;
			temp.next=null;
		}
		
		temp.next=first;
		first=temp;
	}
	public void print(){
		for(Spot s=first; s!=null; s=s.next){
			System.out.println("from"+s.from[0]+s.from[1]+"to"+s.to[0]+s.to[1]);
		}
	}
	public boolean isHasAlready(Spot temp){
		boolean result=false;
		for (Spot s = first; s!= null; s = s.next) {
			if(s.isSameSpot(temp)){
				result=true;
				break;
			}
		}
		if(result==true){
			System.out.print("it arleady has \n again");
		}
		return result;
	}
	public int[] findPerson(int[] answerPer) {
		for (Spot t = first; t != null; t = t.next) {
			
			int value= t.isRight(answerPer);
			if(value==0){
				continue;
			}
			answerPer=t.changeSpot(answerPer,value);
			break;
	    }
		int[] temp= new int[]{answerPer[0],answerPer[1]};
		temp[0]++;//행 증가
		if(answerPer[0]!=leg){
			temp=findPerson(temp);
		}//행==다리길이?
		return temp;
	}
	
	
}
