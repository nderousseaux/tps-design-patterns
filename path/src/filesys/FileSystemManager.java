package filesys;


public class FileSystemManager {



	public FileSystemManager() {
		FabricPath fa = FabricPath.getInstance();
		Path root = fa.createRoot();
		Path home = fa.createFolder("home");
		home.mv(root);
		Path me = fa.createFolder("adrien");
		me.mv(home);
		Path welcome = fa.createFile("welcome.txt", 30);
		welcome.mv(me);
		fa.createFile("A31-tp3.dia",5000).mv(me);
		fa.createFile("A31-tp3.svg",650).mv(me);
		Path html = fa.createFolder("public_html");
		fa.createFile("W31-tp1.php",5000).mv(me);
		html.mv(me);

		System.out.println("me                : " + PathHelper.pwd(me));
		System.out.println("listAll(me)       : " + PathHelper.listAll(me));
		System.out.println("listFiles(me)     : " + PathHelper.listFiles(me));
		System.out.println("listFolders(me)   : " + PathHelper.listFolders(me));
		System.out.println("find(me,'A31*')   : " + PathHelper.find(me,"A31.*"));
		System.out.println("exists(me,'W31*') : " + PathHelper.exists(me,"W31.*"));
		System.out.println("totalSize(me)     : " + PathHelper.totalSize(me));

		System.out.println("Fin de la simulation.");
	}

	public static void main(String[] args) {
		new FileSystemManager();
	}

}