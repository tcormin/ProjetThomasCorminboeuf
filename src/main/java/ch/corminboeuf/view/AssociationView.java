package ch.corminboeuf.view;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import ch.corminboeuf.model.Association;

@RequestScoped
public class AssociationView implements Serializable{

	private static final long serialVersionUID = 9088185671638510312L;
	
	//@ManagedProperty(value = "sessionBean")
	@EJB
	private SessionManagerImpl sessionBean;
	
	private Association a;
	
	public SessionManagerImpl getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionManagerImpl sessionBean) {
		this.sessionBean = sessionBean;
	}

	public AssociationView(){
		a = this.sessionBean.getgUtilisateurs().getDaoAssociation().getAssociations().get(0);
	}

	public Association getA() {
		return a;
	}

	public void setA(Association a) {
		this.a = a;
	}
	
	public void setNextAssociation(String nextAssociation) {
		this.a = sessionBean.getgUtilisateurs().getAssociationFromId(Integer.parseInt(nextAssociation));
	}
	
}
