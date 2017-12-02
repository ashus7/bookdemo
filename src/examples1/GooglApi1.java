package examples1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class GooglApi1 {

	public static void main(String [] args) throws IOException {
		// Query the book database by ISBN code.
		  String isbn = "9788173711466"; // Steve Jobs book 
		  
		  String address = "https://www.googleapis.com/books/v1/volumes?q=";
		String query = "isbn:"+isbn;
		String charset = "UTF-8";
	 
		URL url = new URL(address + URLEncoder.encode(query, charset));
	 
		BufferedReader in = new BufferedReader(new InputStreamReader(
				url.openStream()));
		String str;
	 
		while ((str = in.readLine()) != null) {
			System.out.println(str);
		}
	 
		in.close();
	}
}
