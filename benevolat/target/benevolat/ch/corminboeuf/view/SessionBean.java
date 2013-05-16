package ch.corminboeuf.view;

import java.io.Serializable;

import javax.ejb.Stateless;

import ch.corminboeuf.controller.GestionnaireFormations;
import ch.corminboeuf.controller.GestionnaireMissions;
import ch.corminboeuf.controller.GestionnaireUtilisateurs;
import ch.corminboeuf.model.InscriptionMission;
import ch.corminboeuf.model.Status;

//@SessionScoped
@Stateless
public class SessionBean implements Serializable, MainBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4560499167856847377L;

	private GestionnaireFormations gFormations;
	private GestionnaireMissions gMissions;
	private GestionnaireUtilisateurs gUtilisateurs;
	
    public SessionBean() {
    	System.out.println("Session bean cree");
        gFormations = new GestionnaireFormations();
        gMissions = new GestionnaireMissions();
        gUtilisateurs = new GestionnaireUtilisateurs();
        
        gUtilisateurs.getDaoAssociation().getAssociations().get(0).getMissions().add(gMissions.getDaoMission().getMissions().get(0));
		gMissions.getDaoMission().getMissions().get(0).setAssociation(gUtilisateurs.getDaoAssociation().getAssociations().get(0));
		
		gUtilisateurs.getDaoAssociation().getAssociations().get(0).getMissions().add(gMissions.getDaoMission().getMissions().get(1));
		gMissions.getDaoMission().getMissions().get(1).setAssociation(gUtilisateurs.getDaoAssociation().getAssociations().get(0));
		
		gUtilisateurs.getDaoAssociation().getAssociations().get(0).getMissions().add(gMissions.getDaoMission().getMissions().get(2));
		gMissions.getDaoMission().getMissions().get(2).setAssociation(gUtilisateurs.getDaoAssociation().getAssociations().get(0));
		
		gUtilisateurs.getDaoAssociation().getAssociations().get(0).getMissions().add(gMissions.getDaoMission().getMissions().get(3));
		gMissions.getDaoMission().getMissions().get(3).setAssociation(gUtilisateurs.getDaoAssociation().getAssociations().get(0));
		
		InscriptionMission i = new InscriptionMission();
		i.setBenevole(gUtilisateurs.getDaoBenevole().getBenevoles().get(0));
		i.setCommentaire("Trop jeune");
		i.setStatus(Status.REFUSE);
		i.setMission(gMissions.getDaoMission().getMissions().get(0));
		gUtilisateurs.getDaoBenevole().getBenevoles().get(0).getInscriptionsMissions().add(i);
		gMissions.getDaoMission().getMissions().get(0).getInscriptionsMissions().add(i);
		
		i = new InscriptionMission();
		i.setBenevole(gUtilisateurs.getDaoBenevole().getBenevoles().get(0));
		i.setCommentaire("Bienvenue");
		i.setStatus(Status.ACCEPTE);
		i.setMission(gMissions.getDaoMission().getMissions().get(1));
		gUtilisateurs.getDaoBenevole().getBenevoles().get(0).getInscriptionsMissions().add(i);
		gMissions.getDaoMission().getMissions().get(1).getInscriptionsMissions().add(i);
		
		i = new InscriptionMission();
		i.setBenevole(gUtilisateurs.getDaoBenevole().getBenevoles().get(0));
		i.setStatus(Status.EN_COURS);
		i.setMission(gMissions.getDaoMission().getMissions().get(2));
		gUtilisateurs.getDaoBenevole().getBenevoles().get(0).getInscriptionsMissions().add(i);
		gMissions.getDaoMission().getMissions().get(2).getInscriptionsMissions().add(i);
		
		i = new InscriptionMission();
		i.setBenevole(gUtilisateurs.getDaoBenevole().getBenevoles().get(0));
		i.setStatus(Status.EN_COURS);
		i.setMission(gMissions.getDaoMission().getMissions().get(3));
		gUtilisateurs.getDaoBenevole().getBenevoles().get(0).getInscriptionsMissions().add(i);
		gMissions.getDaoMission().getMissions().get(3).getInscriptionsMissions().add(i);
		
		gMissions.getDaoMission().getMissions().get(0).setEvenement(gMissions.getDaoEvenement().getEvenements().get(0));
    }

	public GestionnaireFormations getgFormations() {
		return gFormations;
	}

	public void setgFormations(GestionnaireFormations gFormations) {
		this.gFormations = gFormations;
	}

	public GestionnaireMissions getgMissions() {
		return gMissions;
	}

	public void setgMissions(GestionnaireMissions gMissions) {
		this.gMissions = gMissions;
	}

	public GestionnaireUtilisateurs getgUtilisateurs() {
		return gUtilisateurs;
	}

	public void setgUtilisateurs(GestionnaireUtilisateurs gUtilisateurs) {
		this.gUtilisateurs = gUtilisateurs;
	}


	
    
}
