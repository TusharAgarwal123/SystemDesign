package DesignPattern.StructuralDesignPatterns.Bridge;

public class Client {
    public static void main(String[] args) {
        IResource my_artist = new Artist();
        View artist_view = new LongView(my_artist);

        IResource my_album = new Album();
        View album_view = new LongView(my_album);
        artist_view.show();
        album_view.show();
    }
}
