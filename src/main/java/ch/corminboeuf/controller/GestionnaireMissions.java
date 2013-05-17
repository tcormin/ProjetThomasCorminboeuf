package ch.corminboeuf.controller;

import java.util.Iterator;

import ch.corminboeuf.controller.dao.DaoAttestation;
import ch.corminboeuf.controller.dao.DaoEvenement;
import ch.corminboeuf.controller.dao.DaoMission;
import ch.corminboeuf.controller.dao.DaoReferencement;
import ch.corminboeuf.model.Evenement;
import ch.corminboeuf.model.Mission;

public class GestionnaireMissions {

	private DaoMission daoMission = new DaoMission();
	private DaoAttestation daoAttestation = new DaoAttestation();
	private DaoReferencement daoReferencement = new DaoReferencement();
	private DaoEvenement daoEvenement = new DaoEvenement();
	
	private int missionToSee;
	
	public GestionnaireMissions(){
	}

	public DaoMission getDaoMission() {
		return daoMission;
	}
	public void setDaoMission(DaoMission daoMission) {
		this.daoMission = daoMission;
	}
	public DaoAttestation getDaoAttestation() {
		return daoAttestation;
	}
	public void setDaoAttestation(DaoAttestation daoAttestation) {
		this.daoAttestation = daoAttestation;
	}
	public DaoReferencement getDaoReferencement() {
		return daoReferencement;
	}
	public void setDaoReferencement(DaoReferencement daoReferencement) {
		this.daoReferencement = daoReferencement;
	}
	public DaoEvenement getDaoEvenement() {
		return daoEvenement;
	}
	public void setDaoEvenement(DaoEvenement daoEvenement) {
		this.daoEvenement = daoEvenement;
	}
	public int getMissionToSee() {
		return missionToSee;
	}
	public void setMissionToSee(int missionToSee) {
		this.missionToSee = missionToSee;
	}	
	
	public Mission getMissionFromId(int id){
		Iterator<Mission> itr = this.daoMission.getMissions().iterator();
		Mission m;
		while(itr.hasNext()){
			m= itr.next();
			if(m.getid()==id){
				return m;
			}
		}
		
		return null;
	}
	
	public Evenement getEvenementFromId(int id){
		Iterator<Evenement> itr = this.daoEvenement.getEvenements().iterator();
		Evenement e;
		while(itr.hasNext()){
			e= itr.next();
			if(e.getid()==id){
				return e;
			}
		}
		
		return null;
	}
}
