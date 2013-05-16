package ch.corminboeuf.controller.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import ch.corminboeuf.model.Domaine;
import ch.corminboeuf.model.Mission;
import ch.corminboeuf.model.TypeMission;


public class DaoMission {
	private ArrayList<Mission> missions = new ArrayList<Mission>();
	private ArrayList<Mission> missionsRegulieres = new ArrayList<Mission>();
	private ArrayList<Mission> missionsPonctuelles = new ArrayList<Mission>();
	
	public ArrayList<Mission> getMissions() {
		return missions;
	}
	public void setMissions(ArrayList<Mission> missions) {
		this.missions = missions;
	}
	public ArrayList<Mission> getMissionsPonctuelles() {
		return missionsPonctuelles;
	}
	public void setMissionsRegulieres(ArrayList<Mission> missionsRegulieres) {
		this.missionsRegulieres = missionsRegulieres;
	}
	public ArrayList<Mission> getMissionsRegulieres() {
		return missionsRegulieres;
	}
	public void setMissionsPonctuelles(ArrayList<Mission> missionsPonctuelles) {
		this.missionsPonctuelles = missionsPonctuelles;
	}

	public DaoMission(){
		
		Mission m = new Mission(5);
		m.setCategorie(Domaine.SPORT);
		m.setLieu("Genève, à domicile");
		m.setDescription(" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed at massa mauris, in aliquam risus. Morbi viverra laoreet tincidunt. Integer dictum, mi ut accumsan vehicula, nisl ipsum porta lacus, vel tristique turpis diam id mi. Curabitur lectus arcu, dignissim et condimentum eget, feugiat vel sem. Sed eget lorem quis quam congue congue vitae sit amet lorem. Duis interdum, sem et consectetur sodales, nibh dolor accumsan arcu, sit amet tincidunt erat nibh non lacus. Nunc ac dui urna. Vestibulum sed lacus elit. Ut id sapien eget diam imperdiet pretium. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.");
		m.setTitre("Trésorier");
		m.setTypeMission(TypeMission.REGULIERE);
		this.missions.add(m);
		
		m = new Mission(6);
		m.setCategorie(Domaine.SPORT);
		m.setLieu("Genève, à domicile");
		m.setDescription(" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed at massa mauris, in aliquam risus. Morbi viverra laoreet tincidunt. Integer dictum, mi ut accumsan vehicula, nisl ipsum porta lacus, vel tristique turpis diam id mi. Curabitur lectus arcu, dignissim et condimentum eget, feugiat vel sem. Sed eget lorem quis quam congue congue vitae sit amet lorem. Duis interdum, sem et consectetur sodales, nibh dolor accumsan arcu, sit amet tincidunt erat nibh non lacus. Nunc ac dui urna. Vestibulum sed lacus elit. Ut id sapien eget diam imperdiet pretium. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.");
		m.setTitre("Président");
		m.setTypeMission(TypeMission.REGULIERE);
		this.missions.add(m);
		
		m = new Mission(7);
		m.setCategorie(Domaine.SPORT);
		m.setLieu("Genève, à domicile");
		m.setDescription(" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed at massa mauris, in aliquam risus. Morbi viverra laoreet tincidunt. Integer dictum, mi ut accumsan vehicula, nisl ipsum porta lacus, vel tristique turpis diam id mi. Curabitur lectus arcu, dignissim et condimentum eget, feugiat vel sem. Sed eget lorem quis quam congue congue vitae sit amet lorem. Duis interdum, sem et consectetur sodales, nibh dolor accumsan arcu, sit amet tincidunt erat nibh non lacus. Nunc ac dui urna. Vestibulum sed lacus elit. Ut id sapien eget diam imperdiet pretium. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.");
		m.setTitre("Buvette");
		m.setDelaiInscription(new Date());
		m.setTypeMission(TypeMission.PONCTUELLE);
		this.missions.add(m);
		
		m = new Mission(8);
		m.setCategorie(Domaine.SPORT);
		m.setLieu("Genève, à domicile");
		m.setDescription(" Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed at massa mauris, in aliquam risus. Morbi viverra laoreet tincidunt. Integer dictum, mi ut accumsan vehicula, nisl ipsum porta lacus, vel tristique turpis diam id mi. Curabitur lectus arcu, dignissim et condimentum eget, feugiat vel sem. Sed eget lorem quis quam congue congue vitae sit amet lorem. Duis interdum, sem et consectetur sodales, nibh dolor accumsan arcu, sit amet tincidunt erat nibh non lacus. Nunc ac dui urna. Vestibulum sed lacus elit. Ut id sapien eget diam imperdiet pretium. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.");
		m.setTitre("Coureur");
		m.setTypeMission(TypeMission.PONCTUELLE);
		this.missions.add(m);
		
		this.prepareOthers();
	}
	
	public void prepareOthers(){
		Iterator<Mission> itr = this.missions.iterator();
		Mission m;
		while(itr.hasNext()){
			m = itr.next();
			if(m.getTypeMission() == TypeMission.PONCTUELLE){
				this.missionsPonctuelles.add(m);
			}
			if(m.getTypeMission() == TypeMission.REGULIERE){
				this.missionsRegulieres.add(m);
			}
		}
	}
	
}
