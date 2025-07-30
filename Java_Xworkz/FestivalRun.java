class FestivalRun{
	
	public static void main(String[] values){

    String name="Music Fest";
	String location="Downtown";
	int year=2026;
 
 	Festival festival1=new Festival(name,location,year);
	System.out.println("festival1:"+festival1.name+", "+festival1.location+","+festival1.year);

	Festival festival2=new Festival("Art Fair","City Park",2025);
	System.out.println("festival2:"+festival2.name+", "+festival2.location+", "+festival2.year);
	
	Festival festival3=new Festival("Food Expo","Convention center",2027);
	System.out.println("festival3:"+festival3.name+","+festival3.location+","+festival3.year);
	
	Festival festival4=new Festival("Film festival","cinema District",2024);
	System.out.println("festival4:"+festival4.name+","+festival4.location+","+festival4.year);
	
	Festival festival5=new Festival("Tech Conference","innovation hub",2028);
	System.out.println("festival5:"+festival5.name+","+festival5.location+","+festival5.year);
	
	}
	
}