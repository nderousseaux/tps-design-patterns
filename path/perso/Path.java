public class Path{
	
	//Attributs
	private String name;
	private Long size;
	private Folder parent;
	private Iterable<Path> childrens;

	Path(String name, Long size){
		this.name = name;
		this.parent = parent;
	}

	public void setName(String name){
		name = this.name;
	}
	public String getName(){
		return this.name;
	}

	public void setParent(Folder parent){
		this.parent = parent;
	}

	public Folder getParent(){
		return this.parent;
	}

	public Long getsize(){
		return this.size;
	}

	public void delete(){
		setParent(null);
	}

	public void move(Folder dossier){
		this.getParent().supprimerEnfant(this);
		this.setParent(dossier);
		dossier.ajouterEnfant(this);
	}
}