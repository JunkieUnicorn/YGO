package p1Code;

import exception.CaseNonDisponibleException;
import exception.CaseVideException;
//@SuppressWarnings("unused")

public class terrain {
	private Jeton[] Terrain;
	
	public terrain() {
		Terrain = new Jeton[5];
	}
	
	public void addToken(int i) throws CaseNonDisponibleException{
		if (Terrain[i]!=null)
			throw new CaseNonDisponibleException();
		else{
			Jeton t = new Jeton();
			t.CreationMonstre();
			this.Terrain[i]=t;
		}
	}
	
	public void removeToken(int i) throws CaseVideException{
		if (Terrain[i]==null)
			throw new CaseVideException();
		else {
			Terrain[i]=null;
		}
	}

	public void afficheTerrain() {
		for (int i=0; i<5; i++) {
			if (Terrain[i] != null) {
				System.out.print(Terrain[i].getNom()+" - "+Terrain[i].getPositionCombat()+" - "+Terrain[i].getATK()+"/"+Terrain[i].getDEF()+"| ");
			}else
				System.out.print("| Case Vide");
		}
		System.out.println();
	}
}
