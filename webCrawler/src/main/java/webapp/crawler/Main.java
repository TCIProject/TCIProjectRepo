package webapp.crawler;

import java.io.IOException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException
    {
        final Crawler crawler = new Crawler(new URL("http://i319728.hera.fhict.nl/"));
    }

}
