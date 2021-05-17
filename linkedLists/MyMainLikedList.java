package linkedLists;

public class MyMainLikedList {

	public static void main(String[] args) {

		MyLinkedList<String> myll = new MyLinkedList<>();
		
		for(int i = 0;i < 10 ; i++) {
			myll.add(i+"added");
		}
		
		myll.print();
	}

}
