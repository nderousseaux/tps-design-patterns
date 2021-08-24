package filesys;

public class File extends AbstractPath {

	/**
	 * @param name
	 * @param parent
	 * @param size
	 */
	public File( String name, Integer size ) {
		super(name,size);
	}

}

