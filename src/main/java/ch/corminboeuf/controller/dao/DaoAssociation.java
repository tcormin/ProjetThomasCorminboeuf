
package ch.corminboeuf.controller.dao;

import java.util.ArrayList;

import ch.corminboeuf.model.Association;
import ch.corminboeuf.model.Domaine;

public class DaoAssociation {

	private ArrayList<Association> associations = new ArrayList<Association>();

	public DaoAssociation(){
		Association a = new Association(2);
		a.setNom("Association Genevoise des Sports");
		a.setAcronyme("AGS");
		a.setAdresse("chemin de Plonjon 4");
		a.setNpa("1207");
		a.setCommune("Genève");
		a.setDateCreation("1941");
		a.setPresentation("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed at massa mauris, in aliquam risus. Morbi viverra laoreet tincidunt. Integer dictum, mi ut accumsan vehicula, nisl ipsum porta lacus, vel tristique turpis diam id mi. Curabitur lectus arcu, dignissim et condimentum eget, feugiat vel sem. Sed eget lorem quis quam congue congue vitae sit amet lorem. Duis interdum.");
		a.setButs("Defendre le sport à Genève");
		a.setEmail("sports-geneve@bluewin.ch");
		a.setTelephone("+41 (0)22 735 61 60");
		a.setContact("Roger Servettaz");
		a.setUrl("www.sportsge.ch");
		a.setDomaineNiveau1(Domaine.SPORT);
		this.associations.add(a);
		
		Association a2 = new Association(3);
		a2.setNom("Cabareve, rire et illusion");
		a2.setAcronyme("Cabareve, rire et illusion");
		a2.setAdresse("c/o moi");
		a2.setButs("Promouvoir les jeunes talents de la région genevoise");
		a2.setEmail("info@cabareve.ch");
		a2.setDomaineNiveau1(Domaine.MUSIQUE);
		this.associations.add(a2);
	}
	
	public ArrayList<Association> getAssociations() {
		return associations;
	}

	public void setAssociations(ArrayList<Association> associations) {
		this.associations = associations;
	}

}
