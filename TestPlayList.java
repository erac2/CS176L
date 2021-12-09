package lab10.comparablesong;

// TestPlayList.java

import java.util.*;

public class TestPlayList {

	public static void main( String[] args ) {

		PlayList mySongs = new PlayList( "My songs" );

		// COMPLETE THIS CODE:
		// Construct at least 3 Songs and add them to the mySongs PlayList.
		Song newSong1 = new Song("Elmo Sings The Blues", "Elmo", "Sesame Street Classics", 2001, "Edutainment", ".mp3");
		Song newSong2 = new Song("The Rainbow Song", "Barney", "Barney's Greatest Hits", 2000, "Edutainment", ".mp3");
		Song newSong3 = new Song("It's Not Easy Being Green", "Kirmit", "Muppet Classics", 1999, "Television", ".mp3");

		mySongs.addSong(newSong1);
		mySongs.addSong(newSong2);
		mySongs.addSong(newSong3);


		// COMPLETE THIS CODE:
		// List all Songs in mySongs.
		
		mySongs.listSongs();
		System.out.println();


		// COMPLETE THIS CODE:
		// Shuffle the Songs in mySongs and then list them all again.

		mySongs.shuffleSongs();
		mySongs.listSongs();


		// COMPLETE THIS CODE:
		// Use the static Song.setSortBy() method to make Songs sortable by name.
		// Sort the Songs in mySongs, then list them all again. 



		// COMPLETE THIS CODE:
		// Use the static Song.setSortBy() method to make Songs sortable by artist.
		// Sort the Songs in mySongs, then list them all again. 



		// COMPLETE THIS CODE:
		// Use the static Song.setSortBy() method to make Songs sortable by album.
		// Sort the Songs in mySongs, then list them all again. 



		// COMPLETE THIS CODE:
		// Use the static Song.setSortBy() method to make Songs sortable by genre.
		// Sort the Songs in mySongs, then list them all again. 




	}
}// end class
