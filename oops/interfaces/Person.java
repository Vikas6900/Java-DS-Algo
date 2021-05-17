package oops.interfaces;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {

//		Person obj = new Person();
//		obj.study();
//		obj.makeVideo();
		
		//YouTuber obj2 = new YouTuber();   cannot instantiate interface
		
		
		//YouTuber obj2 = obj; // here upcasting is done which is possible and now we can use methods of editvideo and youtuber interface with it
		
		YouTuber obj2 = new Person(); // both are same i.e. upcasting
		obj2.makeVideo();
		obj2.editVideo();
		obj2.uploadVideo();
		
	}

	@Override
	public void study() {
		System.out.println("Person is Studying...");
	}

	@Override
	public void makeVideo() {
		System.out.println("Person is Making Videos...");
	}

	@Override
	public void editVideo() {

		System.out.println("YouTuber is Editing a Video");
	}

}
