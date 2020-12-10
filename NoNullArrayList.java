import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

	public boolean add(T value) {
		isNull(value);
		return super.add(value);
	}

	public T set(int index, T value) {
		isNull(value);
		return super.set(index, value);
	}

	private static void isNull(Object value) {
		if (value == null) {
			throw new IllegalArgumentException("Null values are not valid input.");
		}
	}

}
