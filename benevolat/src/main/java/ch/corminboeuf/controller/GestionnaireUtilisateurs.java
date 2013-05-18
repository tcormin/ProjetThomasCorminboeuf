package ch.corminboeuf.controller;

import java.util.Iterator;

import ch.corminboeuf.controller.dao.DaoAdministrateur;
import ch.corminboeuf.controller.dao.DaoAssociation;
import ch.corminboeuf.controller.dao.DaoBenevole;
import ch.corminboeuf.model.Administrateur;
import ch.corminboeuf.model.Association;
import ch.corminboeuf.model.Benevole;



public class GestionnaireUtilisateurs {
	
	private DaoAssociation daoAssociation = new DaoAssociation();
	private DaoBenevole daoBenevole  = new DaoBenevole();
	private DaoAdministrateur daoAdministrateur  = new DaoAdministrateur();
	
	public GestionnaireUtilisateurs(){
	}
	
	public DaoAssociation getDaoAssociation() {
		return daoAssociation;
	}
	public void setDaoAssociation(DaoAssociation daoAssociation) {
		this.daoAssociation = daoAssociation;
	}
	public DaoBenevole getDaoBenevole() {
		return daoBenevole;
	}
	public void setDaoBenevole(DaoBenevole daoBenevole) {
		this.daoBenevole = daoBenevole;
	}
	public DaoAdministrateur getDaoAdministrateur() {
		return daoAdministrateur;
	}
	public void setDaoAdministrateur(DaoAdministrateur daoAdministrateur) {
		this.daoAdministrateur = daoAdministrateur;
	}

	// crée une nouvelle association vide et la renvoie
	public Association addAssociation(){
		Association a = new Association(46);
		this.daoAssociation.getAssociations().add(a);
		return a;
	}
	
	// crée un nouveau bénévole vide et le renvoie
	public Benevole addBenevole(){
		Benevole b = new Benevole(46);
		this.daoBenevole.getBenevoles().add(b);
		return b;
	}

	// crée un nouveau bénévole vide et le renvoie
	public Administrateur addAdministrateur(){
		Administrateur b = new Administrateur(46);
		this.daoAdministrateur.getAdministrateurs().add(b);
		return b;
	}
	
	// retourne vrai si l'email existe déjà dans un utilisateur
	public boolean exist(String email){
		boolean find = false;
		
		Iterator<Benevole> iB = this.daoBenevole.getBenevoles().iterator();
		while(iB.hasNext() && !find){
			if(iB.next().getEmail() == email){
				return true;
			}
		}
		
		Iterator<Association> iA = this.daoAssociation.getAssociations().iterator();
		while(iA.hasNext() && !find){
			if(iA.next().getEmail() == email){
				return true;
			}
		}
		
		Iterator<Administrateur> iAd = this.daoAdministrateur.getAdministrateurs().iterator();
		while(iAd.hasNext() && !find){
			if(iAd.next().getEmail() == email){
				return true;
			}
		}
		return find;
	}
	
	public Association getAssociationFromId(int id){
		Iterator<Association> itr = this.daoAssociation.getAssociations().iterator();
		Association a;
		while(itr.hasNext()){
			a = itr.next();
			if(a.getid()==id){
				return a;
			}
		}
		
		return null;
	}
	
	public Benevole getBenevoleFromId(int id){
		Iterator<Benevole> itr = this.daoBenevole.getBenevoles().iterator();
		Benevole b;
		while(itr.hasNext()){
			b = itr.next();
			if(b.getid()==id){
				return b;
			}
		}
		
		return null;
	}
	
	public Administrateur getAdministrateurFromId(int id){
		Iterator<Administrateur> itr = this.daoAdministrateur.getAdministrateurs().iterator();
		Administrateur a;
		while(itr.hasNext()){
			a = itr.next();
			if(a.getid()==id){
				return a;
			}
		}
		
		return null;
	}

	
}
