import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
	private ArrayList<T> values;

	public NoNullArrayList()  {
		this.values = new ArrayList<T>();
	}

	
}
