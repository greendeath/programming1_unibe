/* ************************************************************************** *\
                Programmierung 1 HS 2016 - Serie 4-2  
					Bachofner Marc 		15-135-916
					Dominique Roux 		16-100-661
\* ************************************************************************* */


public class DVD implements IArticle
{
	private int id;
	private String title;
	private int year;
	private int price; // CHF

	/** constructor */
	public DVD( int id, String title, int year, int price )
	{
		this.id = id;
		this.title = title;
		this.year = year;
		this.price = price;
	}

	public String getDescription()
	{
		return id + " (DVD) " + title +
			", " + year + ", " + price + " CHF";
	}

	public int getPrice() {
		return price; 
	}

	public int getId() { 
		return id; 
	}
}
