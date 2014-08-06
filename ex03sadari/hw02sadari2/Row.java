package hw02sadari2;

public class Row {
	int[] persons;
	
	Row(int noOfPersons){
		persons= new int[noOfPersons];
	}
	
	public void drawLine( int startPosition) {
		persons[startPosition]=1;
		persons[startPosition+1]=-1;
	}

	public int move(int nthOfPerson) {
		if(isNoLine(nthOfPerson)){
			return nthOfPerson;
		}
		return nthOfPerson+persons[nthOfPerson];
	}
	private boolean isNoLine(int nthOfPerson) {
		return persons[nthOfPerson]==0;
	}
	public void draw(){
		for(int i=0 ;i<persons.length;i++){
			
			System.out.print("\t"+persons[i]);

		}
			System.out.println("");	
	}
	public void draw(int nthOfPerson){
		for(int i=0 ;i<persons.length;i++){
			
			System.out.print("\t"+persons[i]);
			if(nthOfPerson==i){
				System.out.print("*");
			}

		}
			System.out.println("");	
	}
}
