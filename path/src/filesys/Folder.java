package filesys;

import java.util.Collection;
import java.util.HashSet;

public class Folder extends AbstractPath {

	private Collection<Path> _children;

	private static final Integer FOLDER_SIZE = 10;

	public Folder( String name ) {
		super(name,FOLDER_SIZE);
		_children = new HashSet<>();
	}

	@Override
	public Boolean isLeaf() {
		return false;
	}

	@Override
	public Collection<Path> getChildren() {
		return _children;
	}

	protected void appendChild( Path child ) {
		_children.add(child);
	}

	protected void removeChild( Path child ) {
		_children.remove(child);
	}

	@Override
	public void rm() {
		for ( Path child : _children )
			child.removeParent();
		_children.clear();
		super.rm();
	}

	public void rm( Path child ) {
		if ( child != null ) {
			_children.remove(child);
			child.rm();
		}
	}

}