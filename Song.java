package lab10.comparablesong;

// Song.java:  Represents a song in a media player

import java.lang.Comparable;

public class Song implements Comparable< Song > {

	// Use the static String variable sortBy to change what field the compareTo() method uses
	// to compare two Songs. By default, Songs are compared using Song name. Other possible values
	// for sortBy are: "artist", "album", "year" and "genre".
	private static String sortBy = "name"; // DO NOT CHANGE THIS LINE.

	private String name;
	private String artist;
	private String album;
	private int    year;
	private String genre;
	private String file;     // where the song file is stored, .e.g, "song.mp3"
	private double length;   // obtained from file
	private double bitrate;  // obtained from file
	private String format;   // obtained from file

	//
	// Constructors:
	//
	public Song( String name, String artist, String album, int year,
			String genre, String file ) {
		this.name   = name;
		this.artist = artist;
		this.album  = album;
		this.year   = year;
		this.genre  = genre;
		this.file   = file;
	}

	public Song() {
		/* Nothing here yet. */
	}

	//
	// Methods:
	//
	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public int getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	/**
	 * COMPLETE THIS CODE:
	 * Write the static method setSortBy() to set the static sortBy variable.
	 * @param sortBy string that is one of the following: "name", "artist", "album", "year", "genre" 
	 * 
	 * Your method must ensure that sortBy is set to only one of the valid values above.
	 */ 
	public static void setSortBy(String variable)
	{
		if (variable == "name")
		{
			sortBy = "name";
		}
		if (variable == "artist")
		{
			sortBy = "artist";
		}
		if (variable == "album")
		{
			sortBy = "album";
		}
		if (variable == "year")
		{
			sortBy = "year";
		}
		if (variable == "genre")
		{
			sortBy = "genre";
		}
	}



	/**
	 * CHANGE THIS METHOD to do the following:
	 * Depending on the value of the static sortBy variable, compare 
	 * this Song vs the other Song by name, artist, album, year or genre.
	 */
	@Override // Need this for Collections.sort():
	public int compareTo( Song other ) 
	{
		String temp1;
		int count = 0;

		if (sortBy == "name")
		{
			count = this.name.compareToIgnoreCase(other.getName());		
		}
		if(sortBy == "artist")
		{
			count = this.artist.compareToIgnoreCase(other.getArtist());
		}
		if(sortBy == "album")
		{
			count = this.album.compareToIgnoreCase(other.getAlbum());
		}
		if(sortBy == "year")
		{
			count = Integer.compare(this.year, other.getYear());		
		}
		if(sortBy == "genre")
		{
			count = this.genre.compareToIgnoreCase(other.getGenre());
		}
		return count;

		// compareToIgnoreCase() is a String class method to
		// compare two Strings while ignoring case.
	}
} // end class