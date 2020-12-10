public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

	public boolean add(T value) {
		int currentSize = this.size();
		for (int index = 0; index < currentSize; index++) {

			if (value.compareTo(this.get(index)) > 0) {
				super.add(index-1, value);
				return true;
			}

		}

		return super.add(value);
	}

}
