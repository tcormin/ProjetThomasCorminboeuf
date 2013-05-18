package ch.corminboeuf.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import ch.corminboeuf.model.Benevole;
import ch.corminboeuf.model.InscriptionMission;
import ch.corminboeuf.model.Status;
import ch.corminboeuf.model.Utilisateur;

@RequestScoped
public class MyMissionsView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -998019519804607972L;

	//@ManagedProperty(value = "sessionBean")
	@EJB
	private SessionBean sessionBean;
	
	Utilisateur utilisateur = sessionBean.getgUtilisateurs().getDaoBenevole().getBenevoles().get(0);
	
	private List<InscriptionMission> missionsAcceptees = new ArrayList<InscriptionMission>();
	private List<InscriptionMission> missionsRefusees = new ArrayList<InscriptionMission>();
	private List<InscriptionMission> missionsEnCours = new ArrayList<InscriptionMission>();
	
	public MyMissionsView(){
		if (utilisateur.getClass() == Benevole.class){
			Benevole b = (Benevole) this.utilisateur;
			Iterator<InscriptionMission> itr = b.getInscriptionsMissions().iterator();
			InscriptionMission i;
			while(itr.hasNext()){
				i=itr.next();
				if(i.getStatus() == Status.EN_COURS){
					missionsEnCours.add(i);
				}
				if(i.getStatus() == Status.REFUSE){
					missionsRefusees.add(i);
				}
				if(i.getStatus() == Status.ACCEPTE){
					missionsAcceptees.add(i);
				}
			}
		}
	}
	
	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}

	public List<InscriptionMission> getMissionsAcceptees() {
		return missionsAcceptees;
	}
	public void setMissionsAcceptees(List<InscriptionMission> missionsAcceptees) {
		this.missionsAcceptees = missionsAcceptees;
	}
	public List<InscriptionMission> getMissionsRefusees() {
		return missionsRefusees;
	}
	public void setMissionsRefusees(List<InscriptionMission> missionsRefusees) {
		this.missionsRefusees = missionsRefusees;
	}
	public List<InscriptionMission> getMissionsEnCours() {
		return missionsEnCours;
	}
	public void setMissionsEnCours(List<InscriptionMission> missionsEnCours) {
		this.missionsEnCours = missionsEnCours;
	}
	
}
