package domaciZooVrt;

import java.util.ArrayList;

import zadatak2_pasta.Sastojak;


public class Staniste {

	private ArrayList<Zivotinje> zivotinjeUStanistu;
	
	private String naziv;
	

	public Staniste(ArrayList<Zivotinje> zivotinjeUStanistu, String naziv) {
		super();
		this.zivotinjeUStanistu = zivotinjeUStanistu;
		this.naziv = naziv;	
	}
	
	
	 public Staniste() {
	        zivotinjeUStanistu = new ArrayList<Zivotinje>();
	    }
	 
	 public void dodavanjeZivotinja(Zivotinje a){
	        this.zivotinjeUStanistu.add(a);
	    }

	

	public ArrayList<Zivotinje> getZivotinjeUStanistu() {
		return zivotinjeUStanistu;
	}

	  
	
	public void setZivotinjeUStanistu(ArrayList<Zivotinje> zivotinjeUStanistu) {
		this.zivotinjeUStanistu = zivotinjeUStanistu;
	}

	public String getNaziv() {
		return naziv;
	}
	
	 
	
	public void stampanje() {
		System.out.println("U ovom stanistu zive sledeci stanovnici: ");
		for(int i=0; i<zivotinjeUStanistu.size(); i++) {
			this.zivotinjeUStanistu.get(i).stampanje();
		}
		System.out.println("I oni se bas lepo slazu. ");
	}
	
	
}
