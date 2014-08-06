package hw02sadari2;

import java.util.Scanner;

class Ask{
	int peo;
	int leg;
	public int howGet(String what){
		Scanner sc = new Scanner(System.in);
		askWhat(what);
		return getIntValue(sc);
	}
	public void askWhat(String what){
		if(what=="peo"){
			System.out.print("사람이 몇명인가요?: ");
		}
		if(what=="leg"){
			System.out.print("다리는 얼마나 길게 할까요?: ");
		}
		if(what=="bridge"){
			System.out.print("다리를 입력하시겠습니까?(숫자입력) 1.yes 2.no :");
		}
		if(what=="answer"){
			System.out.print("사람이 어디있는지 알고싶나요?(숫자입력) 1.yes 2.no :");
		}		
		if(what=="person"){
			System.out.print("몇번째 사람의 답을 알고싶나요?: ");
		}
	}
	public int getIntValue(Scanner sc){
		while(!sc.hasNextInt()){
			sc.next();
			System.err.print("에러!! 다시 입력해주세요: ");
		}
		return sc.nextInt();
	}
	
	
	public Spot askBridge(int peo, int leg){
		this.peo=peo;
		this.leg=leg;
		System.out.println("put spot(-1<x<"+peo+", -1<y<"+leg+") ex) \"1,2 \" ");
		askSpot(1);
		int[] rowcol1=getSpot();
		askSpot(2);
		int[] rowcol2=getSpot();

		return new Spot(rowcol1,rowcol2);
	}
	public void askSpot(int num){
		if(num==1)
		{
			System.out.print("put From spot (row"+num+",col"+num+"): ");	
		}
		if(num==2){
			System.out.print("put To spot (row"+num+",col"+num+"): ");			
		}
	}
	public int[] getSpot(){
		
		String text=getStringValue();
		String[] texts= toSplit(text);
		int[] texti= toInt(texts);
		
		if(texti==null){ 
			System.err.print("\"like 3,4\"! again please :");
			texti=getSpot();
		}
		
		if(outOfRange(texti)){
			System.err.print("Out of range! again please: ");
			texti=getSpot();
		}
		return texti;
		
	}
	public boolean outOfRange(int[] texti){

		if(texti[0]<0 || texti[0]>leg-1)
		{return true;}
		
		if(texti[1]<0 || texti[1]>peo-1)
		{return true;}
		
		return false;
	}
	public String getStringValue(){
		Scanner sc = new Scanner(System.in);
		String text= sc.nextLine();
		if(text.isEmpty()){ 
			return getStringValue();
		}
		return text;
	}
	public String[] toSplit(String text){
		if(text.contains(",")){
		return text.split(",");
		}
		return null;		
	}
	public int[] toInt(String[] texts){
		if(texts==null||texts.length!=2){
			return null;
		}
		int[] numbers = new int[texts.length];
		for(int i=0;i<numbers.length; i++)
		{
			numbers[i]=Integer.parseInt(texts[i]);
		}
		return numbers;
	}
}

