package filesys;

public class FabricPath {
    private static boolean instance = false;

    private FabricPath(){}

    public Folder createFolder(String name){
        return new Folder(name);
    }
    public File createFile(String name, int size){
        return new File(name, size);
    }
    public Root createRoot(){
        return new Root();
    }

    public static FabricPath getInstance(){
        if(instance==false){
            instance = true;
            return new FabricPath();
        }
        return null;
    }
}
