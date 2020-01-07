import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalTime;
import java.util.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DcLolToFmRestController {

    private static String IMAGE_DESTINATION_FOLDER = "/Users/veneziar/Downloads/image/";

    public static void main(String[] args) {

        // jsoup
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        String dogdrip = "https://www.dogdrip.net/?mid=dogdrip&sort_index=popular";
        String origin = "https://www.dogdrip.net/";

        Document doc = null;
        HashMap<String, String> headers = new HashMap();
        String etorrentUrl = "http://www.etoland.co.kr";
//        headers.put("Content-Type","application/json; charset=utf-8");
//        headers.put("User-Agent","Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/74.0.3729.169 Chrome/74.0.3729.169 Safari/537.36");

        List<String> html_tag = new ArrayList<>();
        List<String> img_tag_arr = new ArrayList<>();

        try{

            Connection.Response response = Jsoup.connect(dogdrip)
                    .headers(headers)
                    .timeout(20000)
                    .execute();

            if (response.statusCode() == 200) {
                doc = response.parse();
            }


            Element divHtml =  doc.select("table.ed.table.table-divider").first();
            for( Element childDiv : divHtml.select("tbody tr")){
                System.out.println("title : " +childDiv.select("td.title a span.ed.title-link").first().text());
            }









            System.out.println("html_tag :: " +html_tag);
        } catch (IOException e) {
            e.printStackTrace();
        }








        // selenium
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        String url = "http://i2.linkoooo.com/1912/20191229012328_1368ac83a87950ebc28578c9f22f924f_hqpe.jpg";
//        String dcUrl = "https://image.fmkorea.com/files/attach/new/20200101/486616/1697021828/2558706808/5c63fd30ddf8ad40266f00079642741a.gif.thumb.jpg";
//
//
//        String[] imgArr = dcUrl.split("\\.");
//        System.out.println("imgArr : " +Arrays.toString(imgArr).contains("gif"));
//        LocalTime currentDate = LocalTime.now();
//        String saveStrImageName = currentDate+"";
//
//        OutputStream os = null;
//        InputStream is = null;
//
//        try{
//
//            String imgName = "eagueoflegends3-20190803-001350-000.gif";
//            String imgExpension = "";
//            int lastIndex = 0;
//            lastIndex = url.lastIndexOf(".");
//
//            imgName = url.substring(lastIndex);
//            System.out.println("imgName : " +imgName);
//
//            URL urlImage = new URL(url);
//
//            URLConnection urlCon = urlImage.openConnection();
//
//            urlCon.setRequestProperty("User-agent","Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Ubuntu Chromium/74.0.3729.169 Chrome/74.0.3729.169 Safari/537.36");
//            urlCon.setRequestProperty("Content-Type","application/json; charset=utf-8");
////            urlCon.setRequestProperty("Referer","https://gall.dcinside.com/");
//            urlCon.setDoOutput(true);
//
//            byte[] buffer = new byte[4096];
//            int n = 0;
//            is = urlCon.getInputStream();
//            os = new FileOutputStream( IMAGE_DESTINATION_FOLDER + "/" + saveStrImageName + imgName );
//            while ( (n = is.read(buffer)) > 0 ){
//                os.write(buffer, 0, n);
//            }
//
//            //close the stream
//            os.close();
//            is.close();
//            System.out.println("I : mage saved");
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//
//        }


    }



}
