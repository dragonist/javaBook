package hw02sadari2;


public class Spot{
	int[] from=new int[2];
	int[] to=new int[2];
	Spot next;
	
	
	
	public Spot(int row1,int col1,int row2,int col2){
		from[0]=row1;
		from[1]=col1;
		to[0]=row2;
		to[1]=col2;
	}
	public Spot(int[] from, int[] to){
		this.from=from;
		this.to=to;
	}
	public int isRight(int[] answerPer)
	{
		if(from[0]==answerPer[0] && from[1]==answerPer[1])
		{return 1;}
		if(to[0]==answerPer[0] && to[1]==answerPer[1])
		{return 2;}
		return 0;
	}
	public boolean isSameSpot(Spot temp){
		if(from[0]==temp.from[0] && from[1]==temp.from[1]){
			return true;
		}
		if(from[0]==temp.to[0] && from[1]==temp.to[1]){
			return true;
		}
		if(to[0]==temp.to[0] && to[1]==temp.to[1]){
			return true;
		}
		if(to[0]==temp.from[0] && to[1]==temp.from[1]){
			return true;
		}
		return false;
	}
	public int[] changeSpot(int[] person,int value){
		switch(value){
			case 1:
				System.out.println("from"+person[0]+person[1]+"to"+to[0]+to[1]);
				return to;
			case 2:
				System.out.println("from"+person[0]+person[1]+"to"+from[0]+from[1]);
				return from;	
			default:
				System.out.println("from"+person[0]+person[1]+"to"+(person[0]+1)+person[1]);
				return person;
		}
	}
	
}