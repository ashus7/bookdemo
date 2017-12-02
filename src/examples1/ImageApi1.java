package examples1;

import org.jsoup.Jsoup;
import org.w3c.dom.Document;

import com.google.gdata.model.Element;

public class ImageApi1 {

	public static String FindImage(String question, String ua) {
        String finRes = "";

try {
        String googleUrl = "https://www.google.com/search?tbm=isch&tbs=iszl&q=" + question.replace(",", "");
        org.jsoup.nodes.Document doc1 = Jsoup.connect(googleUrl).userAgent(ua).timeout(10 * 1000).get();
        org.jsoup.nodes.Element media = doc1.select("[data-src]").first();
        String finUrl = media.attr("abs:data-src"); 

        finRes= "<img src=\"" + finUrl.replace("&quot", "") + "\" border=1 />";
        System.out.println(finRes);
    } catch (Exception e) {
        System.out.println(e);
    }

    return finRes;
}
	public static void main(String[] args) {
		String question ="Something Happened on the Way to Heaven 20 Inspiring Real-life Stories";
		String ua = "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36";
		ImageApi1.FindImage(question, ua);

	}

}
