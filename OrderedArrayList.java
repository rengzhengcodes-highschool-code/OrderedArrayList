public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

	public OrderedArrayList() {
		super();
	}

	public OrderedArrayList(int startSize) {
		super(startSize);
	}

	public boolean add(T value) {
		NoNullArrayList.isNull(value);
		int currentSize = this.size();
		for (int index = 0; index < currentSize; index++) {

			if (value.compareTo(this.get(index)) <= 0) {
				super.add(index, value);//makes sure it doesn't add to neg indexes if this.get(0) > value.
				return true;
			}

		}

		return super.add(value);
	}

	public void add(int index, T value) {
		this.add(value);
	}

	public T set(int index, T value) {
		T popped = this.remove(index);
		this.add(value);
		return popped;
	}

}
