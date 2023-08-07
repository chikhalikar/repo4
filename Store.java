package test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Store {
	private final int capacity;
	public final Map<String, LinkedList<String>> usersongs;
	
	public  Store (int capacity)
	
  {
	this.capacity = capacity;
	this.usersongs = new HashMap<>();
  }	
   public void addSong(String user, String song)
	    {
		   usersongs.putIfAbsent(user, new LinkedList<>());
	       LinkedList<String> songsList = usersongs.get(user);

	          if (songsList.size() == capacity)
	             {
	              songsList.removeFirst();
	             }
	         songsList.addLast(song);
	    }

	      public List<String> getRecentSongs(String user) 
	        {
	          return usersongs.getOrDefault(user, new LinkedList<>());
	        }

}
