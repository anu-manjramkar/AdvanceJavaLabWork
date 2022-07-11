package com.cdac.app;

import java.time.LocalDate;
import com.cdac.dao.AlbumSongDao;
import com.cdac.dao.GenericDao;
import com.cdac.entity.Album;
import com.cdac.entity.Song;

public class AlbumSongExample {

	public static void main(String[] args) {
	  GenericDao dao = new GenericDao();
		//AlbumSongDao dao = new AlbumSongDao();
		
		//adding an album
		/*Album album = new Album();
		album.setName("Hits of 2017");
		album.setReleaseDate(LocalDate.of(2017, 12, 30));
		album.setCopyright("Zee Music");
		dao.save(album);*/
		
		//adding song to an album
		Album album = (Album) dao.fetchById(Album.class, 1);
		Song song = new Song();
		song.setTitle("India....");
		song.setArtist("Mohit Chauhan");
		song.setDuration(5.30);
		song.setAlbum(album);
		dao.save(song);
		
		/*List<Song> songs = dao.fetchSongsSungBy("Taylor Swift");
		for(Song song : songs)
			System.out.println(song.getTitle() + " " + song.getDuration()); */
		
		
	}
}
