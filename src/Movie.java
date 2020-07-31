import java.util.Map;

public class Movie {

	//Instance or Fields
	
	private String title;
	private String category;
	
	//constructor
	
	public Movie (String title, String category) {
	  this.title=title;
	  this.category= category;
	}
	
	public Movie (String title ) {
		this.title = title;
	}

	//public Movie toString() {
	//	return String;
	
	
	
	//setters
    public void setTitle(String title) {
	this.title = title;
    }
    
    public void setCategory(String category) {
		this.category = category;
    }
    
    //getters
	public String getTitle() {
		return title;
	}	
	public String getCategory() {
		return category;
}
	
}

