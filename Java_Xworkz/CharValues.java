class CharValues {
	public static void main(String[] args)
	{
		char Math = 'A', Science = 'B', English = 'C', History = 'D', Geography = 'E';
		System.out.println("Initial char values: " + Math + ", " + Science + ", " + English + ", " + History + ", " + Geography);
        Math = 'X'; Science = 'Y'; English = 'Z'; History = 'P'; Geography = 'Q';
        System.out.println("Reinitialized char values: " + Math + ", " + Science + ", " + English + ", " + History + ", " + Geography);
    }
}