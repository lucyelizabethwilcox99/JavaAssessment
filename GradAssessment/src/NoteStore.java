import java.util.ArrayList;

public class NoteStore extends TextAndImageNote {

	
	public void storeNote() {
	
		ArrayList<TextNote>list1 =new ArrayList<TextNote>();
		
		TextNote t1=new TextNote(Java is a set of computer software and specifications developed by James Gosling at Sun Microsystems) {
		list1.add(t1);
		System.out.println("Text Note 1: "+ t1);
		
		TextNote t2=new TextNote(Few books to read - Ikigai, How to win friends and influence people) {
		list1.add(t2);
		System.out.println("Text Note 2: "+ t2);
		
		ArrayList<TextAndImageNote>list2 =new ArrayList<TextAndImageNote>();
		
		TextAndImageNote tt1=new TextAndImageNote(The shopping list on my fridge, //foo/bar1/bar2/imgset1.jpg){
		list2.add(tt1);
		System.out.println("Text and Image Note 1: "+ tt1);
	
		TextAndImageNote tt2=new TextAndImageNote(The shopping list on my fridge, //foo/bar1/bar2/imgset1.jpg){
		list2.add(tt2);
		System.out.println("Text and Image Note 1: "+ tt2);
		
	} 
	
	public ArrayList<TextNote> getAllTextNotes() {	
		ArrayList<TextNote> list1;
		return list1;
		
	}
	
	public ArrayList<TextAndImageNote> getAllTextAndImageNotes() {
		ArrayList<TextAndImageNote> list2;
		return list2;
		
	}
	 
	
	public  ArrayList<TextNote> displayTextNotes(String t) {	
		ArrayList<TextNote> list1;
		System.out.println("Text Note 1: "+ t);
		System.out.println("Text Note 1: "+ t);
		return list1;
		
	}
	
	public ArrayList<TextAndImageNote> displayTextAndImageNotes(String tt) {
		ArrayList<TextAndImageNote> list2;
		System.out.println("Text and Image Note 1: "+ tt);
		System.out.println("Text and Image Note 1: "+ tt);
		return list2;
		
	}

	}
	
	
	

