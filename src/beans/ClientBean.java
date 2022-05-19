package beans;

public class ClientBean {
	
	private String nom;
	private String prenom;
	private String adresseL;
	private int numT;
	private String email;
	public ClientBean() {
		
		setNom("");
		setPrenom("");
		setAdresseL("");
		setNumT(0);
		setEmail("");
		
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresseL() {
		return adresseL;
	}
	public void setAdresseL(String adresseL) {
		this.adresseL = adresseL;
	}
	public int getNumT() {
		return numT;
	}
	public void setNumT(int numT) {
		this.numT = numT;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
