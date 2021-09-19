package domaciZooVrt;

public class Sisari extends Zivotinje{
	
	private String bojaDlake;
	private String nacinIshrane;
	private boolean domaceZivotinje;
	
	
	public Sisari(String naziv, String vrsta, String ishrana, String bojaDlake, String nacinIshrane,
			boolean domaceZivotinje) {
		super(naziv, vrsta, ishrana);
		this.bojaDlake = bojaDlake;
		this.nacinIshrane = nacinIshrane;
		this.domaceZivotinje = domaceZivotinje;
	}


	public String getBojaDlake() {
		return bojaDlake;
	}


	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}


	public String getNacinIshrane() {
		return nacinIshrane;
	}


	public void setNacinIshrane(String nacinIshrane) {
		this.nacinIshrane = nacinIshrane;
	}


	public boolean isDomaceZivotinje() {
		return domaceZivotinje;
	}


	public void setDomaceZivotinje(boolean domaceZivotinje) {
		this.domaceZivotinje = domaceZivotinje;
	}

	
	public void stampanje() {
		System.out.println(super.getNaziv()+ " je " + super.getVrsta() 
		+ " koji se hrani" + super.getIshrana()+ ", a boja dlake je " +this.bojaDlake);
		System.out.print("Hrani se uglavnom " + this.nacinIshrane + ", prema covekovoj podeli spada u  ");
		 if(this.domaceZivotinje){
			 System.out.println("domace zivotinje");
			}else{
				System.out.println("divlje zivotinje");
			};
	}
	
	
	
}
