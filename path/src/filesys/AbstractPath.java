package filesys;

import java.util.Collection;

public abstract class AbstractPath implements Path {

	private String _name;
	private Integer _size;

	private Folder _parent;

	public AbstractPath( String name, Integer size ) {
		_name = name;
		_size = size;
		_parent = null;
	}

	@Override
	public String getName() {
		return _name;
	}

	@Override
	public Integer getSize() {
		return _size;
	}

	@Override
	public Boolean isLeaf() {
		return true;
	}

	@Override
	public Path getParent() {
		return _parent;
	}

	@Override
	public void removeParent() {
		_parent = null;
	}

	@Override
	public Collection<Path> getChildren() {
		return null;
	}

	@Override
	public void rm() {
		if ( _parent != null ) {
			_parent.removeChild(this);
			_parent = null;
		}
	}

	@Override
	public void mv( Path path ) {
		try {
			if ( _parent != null )
				_parent.removeChild(this);
			_parent = (Folder) path;
			_parent.appendChild(this);
		}
		catch( ClassCastException exception ) {
			System.out.println("Error: The path '" + path.getName() + "' should be a filesys.Folder.");
		}
	}
}