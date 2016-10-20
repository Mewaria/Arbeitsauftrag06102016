import java.io.BufferedReader;
import java.io.FileReader;

public class Starter {

	public static void main(String[] args) {
		BufferedReader in=null;
		
		try {
			in = new BufferedReader(new FileReader("kosten.csv"));
		} catch (Exception e) {
			System.err.println("Konnte Datei nicht öffnen");
			e.printStackTrace();
		}
		 
		String headlines= null;
		String data = null;
		
		try {
			headlines = in.readLine();
			data = in.readLine();
			
		} catch (Exception e) {
			System.err.println("Konnte Überschrften oder daten nicht lesen");
		}
		
		
		String[] val = data.split(";");
		for(int a=0;a<val.length;a++){
			val[a] = val[a].substring(1,val[a].length()-1);
			System.out.println(val[a]);
			
		} 
		
	}

}
