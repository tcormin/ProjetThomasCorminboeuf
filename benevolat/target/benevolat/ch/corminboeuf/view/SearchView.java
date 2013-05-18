package ch.corminboeuf.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import ch.corminboeuf.model.Association;
import ch.corminboeuf.model.Mission;

@RequestScoped
public class SearchView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7083396080063284495L;

	//@ManagedProperty(value = "sessionBean")
	@EJB
	private SessionBean sessionBean;

	private List<Association> a = new ArrayList<Association>();
	private List<Mission> mp = new ArrayList<Mission>();
	private List<Mission> mr = new ArrayList<Mission>();
	private String searchText;
	
	public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}

	public String getSearchText() {
		return searchText;
	}

	public void setSearchText(String searchText) {
		this.searchText = searchText;
		launchSearch();
	}
	
	public List<Association> getA() {
		return a;
	}

	public void setA(List<Association> a) {
		this.a = a;
	}

	public List<Mission> getMp() {
		return mp;
	}

	public void setMp(List<Mission> mp) {
		this.mp = mp;
	}

	public List<Mission> getMr() {
		return mr;
	}

	public void setMr(List<Mission> mr) {
		this.mr = mr;
	}

	public void launchSearch(){
		Iterator<Mission> itr = this.sessionBean.getgMissions().getDaoMission().getMissionsPonctuelles().iterator();
		Mission m;
		
		while(itr.hasNext()){
			m = itr.next();
			if(m.getTitre().contains(this.searchText)){
				this.mp.add(m);
			}
			if(m.getDescription().contains(this.searchText)){
				this.mp.add(m);
			}
		}
	
		itr = this.sessionBean.getgMissions().getDaoMission().getMissionsRegulieres().iterator();
		
		while(itr.hasNext()){
			m = itr.next();
			if(m.getTitre().contains(this.searchText)){
				this.mr.add(m);
			}
			if(m.getDescription().contains(this.searchText)){
				this.mr.add(m);
			}
		}
		
		Iterator<Association> itrA = this.sessionBean.getgUtilisateurs().getDaoAssociation().getAssociations().iterator();
		Association ass;
		while(itrA.hasNext()){
			ass = itrA.next();
			if(ass.getNom().contains(this.searchText)){
				this.a.add(ass);
			}
			if(ass.getPresentation().contains(this.searchText)){
				this.a.add(ass);
			}
		}
	
	}
	
}
