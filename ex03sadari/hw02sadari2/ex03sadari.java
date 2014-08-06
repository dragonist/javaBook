package hw02sadari2;

public class ex03sadari {

public static void main(String[] args) {
	
	
}
}
class Ladder
{
Row[]  rows;

public Ladder(int countOfRow,int noOfPerson){
	rows= new Row[countOfRow];
	for(int i=0; i<countOfRow; i++){
		rows[i]= new Row(noOfPerson);
	}
}
public void drawLine(int noOfRow,int startPosition){
	rows[noOfRow].drawLine(startPosition);
}

public int run(int nthOfPerson){
	for(int i=0; i<rows.length;i++)
	{
		Row row = rows[i]; 
		nthOfPerson = row.move(nthOfPerson);
	}
		return nthOfPerson;
}
public void show(int nthOfPerson,int level){
	
	for(int i=0; i<rows.length;i++){
		Row row= rows[i];
		if(level==i){
			row.draw(nthOfPerson);
			continue;
		}
		row.draw();
	}
	
	if(level!=rows.length){
		show(nthOfPerson, level+1);
	}
}

}