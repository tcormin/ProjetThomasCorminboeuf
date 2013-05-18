package ch.corminboeuf.view;

import java.io.Serializable;

import javax.ejb.Local;

import ch.corminboeuf.controller.GestionnaireFormations;
import ch.corminboeuf.controller.GestionnaireMissions;
import ch.corminboeuf.controller.GestionnaireUtilisateurs;

@Local
public interface MainBean extends Serializable {
	
	GestionnaireFormations getgFormations();
	GestionnaireMissions getgMissions();
	GestionnaireUtilisateurs getgUtilisateurs();

}
