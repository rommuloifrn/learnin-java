package exercises;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class S13E2 {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("have a nice trip");
		Comment c2 = new Comment("wow thats awesome!");
		
		Post myPost = new Post(myFormat.parse("21/06/2018 13:05:44"), "goin to brazil!", "visiting this wonderful place (mordekaiser sent me here)", 23);
		myPost.addComment(c1);
		myPost.addComment(c2);
		
		System.out.println(myPost);
		
	}

}
