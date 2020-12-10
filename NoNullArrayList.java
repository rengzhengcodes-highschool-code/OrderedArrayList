import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

	public boolean add(T value) {
		isNull(value);
		return super.add(value);
	}

	private static void isNull(Object value) {
		if (value == null) {
			throw new IllegalArgumentException("Null values are not valid input.");
		}
	}

}
