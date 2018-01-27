import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Journal {
	
	List<String> entries = new ArrayList<String>();
	int count =0;
	
	public void addComments(String text) {
		entries.add("" +count++ +":" + text );
	}

	public void removeComments(int index) {
		entries.remove(index);
	}
	
	@Override
	public String toString() {
		
		return String.join(System.lineSeparator(), entries);
		
	}
}

public class Demo{
	public static void main(String[] args) {
		Journal j = new Journal();
		j.addComments("test1");
		j.addComments("test2");
		Persister p = new Persister(); 
		p.saveJounral(j, "D:\\ARAS\\jounral.txt");
	}
}


class Persister{
	public void saveJounral(Journal j, String fileName) {	
		try {
			PrintStream p = new PrintStream(fileName);
			p.println(j);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}



