package webapp.crawler;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;


public class Crawler {
    private final Set<URL> links;
    private final long startTime;
    private String baseUrl;

    public Crawler(final URL startURL) {
        this.baseUrl = startURL.toString();
        this.links = new HashSet<>();
        this.startTime = System.currentTimeMillis();
        crawl(initURLS(startURL));
    }

    private void crawl(final Set<URL> urls){
        urls.removeAll((this.links));
        if(!urls.isEmpty()){
            final Set<URL> newURLS = new HashSet<>();
            try{
                this.links.addAll(urls);
                for(final URL url : urls){
                    System.out.println("Time = " + (System.currentTimeMillis() - this.startTime) + " connected to: " + url);
                    final Document document = Jsoup.connect(url.toString()).get();
                    final Elements linksOnPage = document.select("a[href]");
                    for(final Element element : linksOnPage){
                        final String urlText = element.attr("abs:href");
                        if (urlText.contains(baseUrl))
                        {
                            final URL discoveredURL = new URL(urlText);
                            newURLS.add(discoveredURL);
                        }
                    }
                }
            } catch (final Exception | Error ignored){

            }
            crawl(newURLS);
        }
    }

    private Set<URL> initURLS(final URL startURL){
        return Collections.singleton(startURL);
    }

}
