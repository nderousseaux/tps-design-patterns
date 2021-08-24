package filesys;

import java.util.Collection;

public interface Path {
	public String getName();
	public Integer getSize();
	public Boolean isLeaf();
	public Path getParent();
	public void removeParent();
	public Collection<Path> getChildren();
	public void rm();
	public void mv( Path path );
}