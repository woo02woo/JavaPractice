package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.List;

public class WebCrawling {
    @Deprecated
    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("https://kr.noxinfluencer.com/youtube-channel-rank/top-250-kr-all-youtuber-sorted-by-subs-weekly").get();
            Elements result = doc.select("table").select("a");
            List<String> list = result.eachAttr("href");
            String[] arr= list.toArray(new String[list.size()]);
            System.out.println(arr[0]);
            String str =result.outerHtml();



        }catch(Exception e){
            e.printStackTrace();
        }
    }


}
