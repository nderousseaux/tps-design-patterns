public class service{


	public static String fullPath(Path p){
		
		if (p.getParent() != null){return fullPath(p.getParent()) +  "/" +p.getName();}
		else{return p.getName();}
		
	}
}