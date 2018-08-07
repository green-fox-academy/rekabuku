package com.company;

public class Main {

    public static void main(String[] args) {
	String url = "https//www.reddit.com/r/nevertellmethebots";
        System.out.println(url.length());
        url = url.replace("nevertellmethebots","nevertellmetheodds");

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"


        System.out.println(url);
    }
}
