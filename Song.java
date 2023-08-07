package test;



public class Song {

	public static void main(String[] args) 
    {
        Store store = new Store(3);

        store.addSong("user1", "S1");
        store.addSong("user1", "S2");
        store.addSong("user1", "S3");
        store.addSong("user1", "S4");
        System.out.println(store.getRecentSongs("user1"));
        
        store.addSong("user1", "S2");
        System.out.println(store.getRecentSongs("user1"));

        store.addSong("user1", "S1");
        System.out.println(store.getRecentSongs("user1"));

}
}
