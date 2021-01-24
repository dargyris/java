package org.example.zerholc.alg.bfs;

public class MainCrawler {
    public static void main(String[] args) {
        WebCrawler crawler = new WebCrawler();
        String rootUrl = "https://www.bbc.com";
        crawler.crawl(rootUrl);
    }
}
