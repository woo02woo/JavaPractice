package org.dimigo.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public class NaverSearch {
    public static void main(String[] args) {
        String clientId = "3MklWe9MA_MramCbJpV6";//애플리케이션 클라이언트 아이디값";
        String clientSecret = "RuUAsED2LA";//애플리케이션 클라이언트 시크릿값";
        try {
            String text = URLEncoder.encode("프로미스나인", "UTF-8");
            String apiURL = "https://openapi.naver.com/v1/search/image?query="+ text; // json 결과
            //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // xml 결과
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", clientId);
            con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) { // 정상 호출
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {  // 에러 발생
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            System.out.println(response.toString());

            parseImage(response.toString());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void parseImage(String json) throws Exception{
        Map map =new ObjectMapper().readValue(json, Map.class);
        List<Map<String,String>> list = (List)map.get("items");
        int i= 0;
        for(Map<String,String> image2 : list){
            String title = image2.get("title");
            System.out.printf("%d. %s\n",++i,title);
        }
    }
}
