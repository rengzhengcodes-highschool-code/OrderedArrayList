import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

	public void add(T value) {
		isNull(value);
		super.add(value);
	}
	
	private static void isNull(Object value) {
		if (value == null) {
			throw new IllegalArgumentException("Null values are not valid input.");
		}
	}

}
