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
		
		int flaesche = Integer.parseInt(val[0]);
		int hoehe = Integer.parseInt(val[1]);
		int anzahl = Integer.parseInt(val[2]);
		int jahr = Integer.parseInt(val[3]);
		
		final double VOLUMENFAKTOR = 3.7;
		double faktor = 0.0;
		
		switch(jahr){
			case 1: faktor = 5.0;
			break;
			case 2: faktor = 3.0;
			break;
			case 3: faktor = 1.8;
			break;
			case 4: faktor = 1.0;
			break;
			case 5: faktor = 0.7;
			break;
			case 6: faktor = 0.3;
			break;
			
		}
		
		
		double kosten = flaesche * hoehe * anzahl * VOLUMENFAKTOR * faktor;
		System.out.println("Kosten: " + kosten);
		
	}

}
