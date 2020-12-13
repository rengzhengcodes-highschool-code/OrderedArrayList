public class OrderedArrayListTester {

	public static void main(String[] args) {
		boolean failure = false;

		failure = constructorTester() || failure;
		failure = nullTester() || failure;

		TesterMethods.overall(failure);
	}

	public static boolean constructorTester() {
		TesterMethods.tester("constructorTester");
		boolean fail = false;

		try {
			OrderedArrayList<Integer> def = new OrderedArrayList<Integer>();
			//TesterMethods.passMessage("default tester");
		} catch (Exception e) {
			e.printStackTrace();
			fail = true;
			TesterMethods.errorMessage("default tester");
		}

		try {
			int randSize = TesterMethods.randInt(8);
			OrderedArrayList<Integer> rand = new OrderedArrayList<Integer>(randSize);
			//TesterMethods.passMessage("randSize tester");
		} catch (Exception e) {
			e.printStackTrace();
			fail = true;
			TesterMethods.errorMessage("randSize tester");
		}

		try {
			NoNullArrayList<Integer> def = new OrderedArrayList<Integer>();
			//TesterMethods.passMessage("default tester");
		} catch (Exception e) {
			e.printStackTrace();
			fail = true;
			TesterMethods.errorMessage("Improper class extension.");
		}

		TesterMethods.methodMessage("constructorTester", fail);
		return fail;
	}

	public static boolean nullTester() {
		TesterMethods.tester("nullTester");
		boolean fail = false;

		OrderedArrayList<Integer> test = new OrderedArrayList<Integer>();

		for (int n = 0; n < 10; n++) {
			test.add(n);
		}

		try {
			test.add(null);
			fail = true;
			TesterMethods.errorMessage("add(value) added a null");
		} catch (IllegalArgumentException e) {
			//TesterMethods.passMessage("add(value) didn't add a null");
		}

		try {
			for (int i = 0; i < 100; i++) {
				test.add(TesterMethods.randInt(10), null);
			}
			fail = true;
			TesterMethods.errorMessage("add(index, value) added a null");
		} catch (IllegalArgumentException e) {
			//TesterMethods.passMessage("add(index, value) didn't add a null");
		}

		try {
			for (int i = 0; i < 100; i++) {
				test.set(TesterMethods.randInt(10), null);
			}
			fail = true;
			TesterMethods.errorMessage("set(index, value) added a null");
		} catch (IllegalArgumentException e) {
			//TesterMethods.passMessage("set(index, value) didn't add a null");
		}

		TesterMethods.methodMessage("nullTester", fail);
		return fail;
	}
}
