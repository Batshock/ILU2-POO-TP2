package controleur;

import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		Gaulois gaulois = trouverGaulois(nomVendeur);
		if(gaulois==null) {
			return false;
		}
		return true;
	}
}
