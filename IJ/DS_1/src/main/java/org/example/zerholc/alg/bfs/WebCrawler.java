package org.example.zerholc.alg.bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {
    private Queue<String> queue;
    private List<String> discoveredWebsitesList;

    public WebCrawler() {
        this.queue = new LinkedList<>();
        this.discoveredWebsitesList = new ArrayList<>();
    }

    public void crawl(String root) {
        queue.add(root);
        discoveredWebsitesList.add(root);
        while (!queue.isEmpty()) {
            String webSite = this.queue.remove();
            String rawHtml = readUrl(webSite);

            String regexp = "http://(\\w+\\.)*(\\w+)";
            Pattern pattern = Pattern.compile(regexp);
            Matcher matcher = pattern.matcher(rawHtml);

            while (matcher.find()) {
                String matchedUrl = matcher.group();
                if (!discoveredWebsitesList.contains(matchedUrl)) {
                    discoveredWebsitesList.add(matchedUrl);
                    System.out.println("Found website url: " + matchedUrl);
                    queue.add(matchedUrl);
                }
            }
        }
    }

    private String readUrl(String webSite) {
        String rawHtml = "";
        try {
            URL url = new URL(webSite);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine = "";
            while ((inputLine = in.readLine()) != null) {
                rawHtml += inputLine;
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(rawHtml);
        return rawHtml;
    }
}
