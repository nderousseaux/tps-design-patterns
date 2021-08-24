import java.util.ArrayList;
import java.util.Collection;

public class Folder extends Path{

    private static final Long DIRECTORY_SIZE = Long.valueOf(10);

    static Collection<Path> children;

    private Folder(String name){
        super(name, DIRECTORY_SIZE);
        children = new ArrayList<Path>();
    }

    @Override
    public void delete(){
        for(Path p:children){
            p.delete();
        }
        super.delete();
    }



    public void ajouterEnfant(Path path){
        this.children.add(path);
    }

    public void supprimerEnfant(Path path){
        path.delete();
    }

    public Collection<Path> getEnfants(){
        return children;
    }

}
