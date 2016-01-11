package tirage;

public class TesteTirage {
	public static void main(String args []){
		String etudiants [] = {"abdoulaye KAMA", "Bassirou NGOM", "Mamadou Diallo",
				"Famara Bodian", "Oumy FALL"};
		
		Tirage tir = new Tirage(etudiants);
		tir.afficheResultat();
	}
}
