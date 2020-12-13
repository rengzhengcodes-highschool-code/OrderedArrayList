public class OrderedArrayListTester {

	public static void main(String[] args) {
		boolean failure = false;

		failure = constructorTester() || failure;

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
}
