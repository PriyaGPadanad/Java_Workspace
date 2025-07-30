class BooleanValues {
	public static void main(String[] args)
	{
		boolean a = true, b = false, c = true, d = false, e = true;
		System.out.println("Initial boolean values: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
        a = false; b = true; c = false; d = true; e = false;
        System.out.println("Reinitialized boolean values: " + a + ", " + b + ", " + c + ", " + d + ", " + e);
    }
}