/**
 * @author abdoulaye KAMA <abdoulayekama@gmail.com>
 */
package tirage;

public class Tirage {
	private String choix [];
	
	public Tirage(String choix []){
		this.choix = choix;
	}
	
	public String [] faireTirage(){
		String res [] = new String [this.choix.length];
		String temp [] = this.choix;
		
		for(int i=0; i<res.length; i++){
			int nb = Tirage.nbAleatoire(temp);
			res[i] = temp[nb];
			temp = Tirage.nvoTableau(temp, nb);
		}
		return res;
	}
	
	public static int nbAleatoire(String plage []){
		if(plage.length==0) return 0;
		else return ((int) (Math.random()*100))%plage.length;
	}
	

	
	public static String [] nvoTableau(String [] tab, int index){
		String [] nvo = new String [tab.length-1];
		int j=0;
		for(int i=0; i<tab.length; i++){
			if(i!=index){
				nvo[j] = tab[i];
				j++;
			}
		}
		return nvo;
	}
	
	public void afficheResultat(){
		for(int i=0; i<this.choix.length; i++) System.out.println(this.choix[i]);
		String res [] = this.faireTirage();
		System.out.println("Resulat\n");
		for(int i=0; i<res.length; i++) System.out.println(res[i]);
	}
}
