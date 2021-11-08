package lab6.writtenworks;

//Novel.java: Subclass of WrittenWork

public class Novel extends WrittenWork {

 private String genre;
 private int chapters;

 // constructors:
 public Novel(String title, String author, int year, String genre, int chapters) 
 {
     /* _________Line 11_________ */
     setGenre( genre );
     setChapters( chapters );
 }

 // accessor methods:
 /** 
     Write the getGenre method.
     @return genre of Novel
 */
 public void getGenre()
 {
	 return;
 }


 /**
     Write the getChapters method.
     @return number of Novel chapters
 */
 public void getChapters()
 {
	 
 }


 /**
     Write the setGenre method.
     @param Novel's genre
 */
 public void setGenre()
 {
	 
 }


 /**
     Write the setChapters method.
     @param Number of Novel chapters
 */
 public void setChapters()
 {
	 
 }


} // end class
