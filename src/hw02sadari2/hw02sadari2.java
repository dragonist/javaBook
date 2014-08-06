package hw02sadari2;

class hw02sadari2 {
	
	public static void main(String[] args) {

		Ask you = new Ask();
		int peo = you.howGet("peo");	
		int leg = you.howGet("leg");

		Lad ladder= new Lad(peo,leg);
		System.out.println("사람수: "+peo+"  다리길이: "+leg);

		while(true){
			int answerBri = you.howGet("bridge");
			if(answerBri==2){
				break;
			}//브릿지를 만들껀지 물어본다
			
			Spot s=you.askBridge(peo,leg);
			
			if(!ladder.getBridge(s)){
				System.out.println("it has already");
			}
			
		}
		
		while(true){
			int answerPer = you.howGet("answer");
			if(answerPer==2){
				break;
			}//닶을 알고 싶은지 묻는다.
			
			answerPer=you.howGet("person");
			//사람을 받는다.
			answerPer=ladder.findPeople(answerPer);
			//몇번째인지 받는다.
			System.out.println(answerPer+"번째에 있습니다.");
			//출력한다.
		}
		
	}
}
