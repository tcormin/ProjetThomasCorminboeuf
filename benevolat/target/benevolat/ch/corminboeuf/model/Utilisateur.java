package ch.corminboeuf.model;


public class Utilisateur {

	private String adresse;
	private String npa;
	private String commune;
	private String email;
	private String telephone;
	private String url;

	private final int id;
	
	public Utilisateur(final int id){
		this.id = id;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public String getNpa() {
		return npa;
	}
	public void setNpa(String npa) {
		this.npa = npa;
	}
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune = commune;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getid() {
		return id;
	}
	
}
