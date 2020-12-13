import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {

	public NoNullArrayList() {
		super();
	}

	public NoNullArrayList(int startSize) {
		super(startSize);
	}

	public boolean add(T value) {
		isNull(value);
		return super.add(value);
	}

	public void add(int index, T value) {
		isNull(value);
		super.add(index, value);
	}

	public T set(int index, T value) {
		isNull(value);
		return super.set(index, value);
	}

	public static void isNull(Object value) {
		if (value == null) {
			throw new IllegalArgumentException("Null values are not valid input.");
		}
	}

}
