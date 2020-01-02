
class dayofweek 
{
	static int day(int d,int m,int y)
{
	int finalv=0;
	
	return finalv;
}

  public static void main(String[] args)
  {
	  String date=args[0];
	  String month=args[1];
	  String year=args[2];
	  int d=Integer.parseInt(date);
	  int m=Integer.parseInt(month);
	  int y=Integer.parseInt(year);	 
	  while(d>31 || m>12 || year.length()>4)
	  {
		  System.out.println("Invalid date: ");
		    System.exit(0);
	  }
	  System.out.println(d+" "+m+" "+y);
	  dayofweek.day(d, m, y);
  }



}
