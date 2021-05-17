package oops.interfaces;

interface YouTuber extends VideoEditor{

	void makeVideo();
	// after changes in java 8.0 we can implement concrete methods in interfaces using default
	default void uploadVideo() {
		System.out.println("Uploading Video...");
	}
}
