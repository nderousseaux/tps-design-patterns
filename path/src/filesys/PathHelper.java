package filesys;

import java.util.Collection;
import java.util.ArrayList;

public class PathHelper {

	private PathHelper() {}

	public static String pwd( Path path ) {
		if ( path.getParent() != null )
			return pwd(path.getParent()) + "/" + path.getName();
		else
			return path.getName();
	}

	public static String pwdLinear( Path path ) {
		String fullPath = "";
		Path iterator = path;
		while ( iterator != null ) {
			fullPath = iterator.getName()+(iterator.isLeaf()?"":"/")+fullPath;
			iterator = iterator.getParent();
		}
		return fullPath;
	}

	public static Collection<String> listAll( Path path ) {
		Collection<String> list = new ArrayList<>();
		list.add(path.getName());
		for ( Path child : path.getChildren() ) {
			if ( child.isLeaf() )
				list.add(child.getName());
			else
				list.addAll(listAll(child));
		}
		return list;
	}

	public static Collection<String> listFiles( Path path ) {
		Collection<String> list = new ArrayList<>();
		for ( Path child : path.getChildren() ) {
			if ( child.isLeaf() )
				list.add(child.getName());
			else
				list.addAll(listFiles(child));
		}
		return list;
	}

	public static Collection<String> listFolders( Path path ) {
		Collection<String> list = new ArrayList<>();
		for ( Path child : path.getChildren() ) {
			if ( !child.isLeaf() ) {
				list.add(child.getName());
				list.addAll(listFolders(child));
			}
		}
		return list;
	}

	public static Collection<String> find( Path path, String name ) {
		Collection<String> list = new ArrayList<>();
		for ( Path child : path.getChildren() ) {
			if ( child.getName().matches(name) )
				list.add(child.getName());
			if ( !child.isLeaf() )
				list.addAll(find(child,name));
		}
		return list;
	}

	public static Boolean exists( Path path, String name ) {
		Boolean matches = path.getName().matches(name);
		if ( !matches && !path.isLeaf() )
			for ( Path child : path.getChildren() )
				matches |= exists( child, name );
		return matches;
	}

	public static Integer totalSize( Path path ) {
		Integer size = path.getSize();
		if ( !path.isLeaf() )
			for ( Path child : path.getChildren() )
				size += totalSize( child );
		return size;
	}
}