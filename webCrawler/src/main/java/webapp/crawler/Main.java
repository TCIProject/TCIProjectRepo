package webapp.crawler;

import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException
    {
        System.out.println("Say hello!");
        final Crawler crawler = new Crawler(new URL("http://www.gutenberg.org/"));
    }

}
