package lab10.comparablesong;
import java.util.Collections;
import java.util.*;

// PlayList class: contains an ArrayList of Song class objects:

import java.util.*;

public class PlayList {

	private String name;
	private ArrayList< Song > songlist;


	//
	// Constructors:
	//
	public PlayList( String nm ) {
		name = nm;

		// Allocate memory for songlist:
		songlist = new ArrayList< Song >();
	}

	public PlayList() {
		/* Nothing here yet. */
	}



	//
	// Methods:
	//
	public String getName() {
		return name;
	}

	public void addSong( Song song ) {
		songlist.add( song );
	}

	public void listSongs() {
		int num = 1;

		for ( Song song : songlist ) {
			System.out.print( num + ". " );
			/* Making listSongs() list more info on Songs: */
			System.out.println( song.getName() +
					" by " + song.getArtist() +
					" from " + song.getAlbum() +
					" in " + song.getYear() +
					" of the " + song.getGenre() + " genre");
			num++;
		}
	}

	// COMPLETE THIS CODE:
	// Add a method to shuffle the Songs in the songlist:
	
	public void shuffleSongs()
	{
	Collections.shuffle(songlist);
	}
	
	// COMPLETE THIS CODE:
	// Add a method to sort the Songs in the songlist:

	public void sortSongs()
	{
	Collections.sort(songlist);
	}


}
