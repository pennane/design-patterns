package proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(final String[] arguments) {
		List<Image> photoAlbum = new ArrayList<>();

		photoAlbum.add(new ProxyImage("photo1.jpg"));
		photoAlbum.add(new ProxyImage("photo2.jpg"));
		photoAlbum.add(new ProxyImage("photo3.jpg"));

		System.out.println("Contents of photo album:");

		for (var image : photoAlbum) {
			image.showData();
		}

		System.out.println("Browsing photo album:");

		for (var image : photoAlbum) {
			image.displayImage();
		}
	}

}
