package ch.corminboeuf.view;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import ch.corminboeuf.model.Association;

@RequestScoped
public class AllAssociationsView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2643943138080056668L;

	//@ManagedProperty(value="sessionBean")
	@EJB
	private SessionBean sessionBean;
	
	private List<Association> associations;
	
	public AllAssociationsView(){
		this.associations = this.sessionBean.getgUtilisateurs().getDaoAssociation().getAssociations();
	}

	



	public SessionBean getSessionBean() {
		return sessionBean;
	}





	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}





	public List<Association> getAssociations() {
		return associations;
	}

	public void setAssociations(List<Association> association) {
		this.associations = association;
	}
	
	
	
}
