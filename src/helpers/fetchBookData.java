package helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class fetchBookData {

	String searchBy;
	String searchVal;
	public String getSearchBy() {
		return searchBy;
	}
	public void setSearchBy(String searchBy) {
		this.searchBy = searchBy;
	}
	public String getSearchVal() {
		return searchVal;
	}
	public void setSearchVal(String searchVal) {
		this.searchVal = searchVal;
	}

	public fetchBookData(){}
	public fetchBookData(String searchBy,String searchVal){
		this.searchBy = searchBy;
		this.searchVal = searchVal;
	}
	
	public void callingService(fetchBookData fetchBookDataObj) throws MalformedURLException, UnsupportedEncodingException,IOException{
		 String inputVals = fetchBookDataObj.getSearchVal();
		 String inputBy = fetchBookDataObj.getSearchBy();
		 String address = "https://www.googleapis.com/books/v1/volumes?q=";
		 String query = inputBy+":"+inputVals;
		 String charset = "UTF-8";
	 
		URL url = new URL(address + URLEncoder.encode(query, charset));
	 
		BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
		String str;
	 
		while ((str = in.readLine()) != null) {
			System.out.println(str);
		}
	 
		in.close();
	}
}
