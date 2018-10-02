package twitterinformation;

import java.util.*;
import java.io.*;
import twitter4j.*;
import twitter4j.conf.*;

public class TwitterInfo {
    public static int count=1;
    public static void main(String args[]) throws TwitterException,IOException
    {
        
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey("ohag73a7vJ3AkIP6SY6zrfDw1");
        cb.setOAuthConsumerSecret("m5LZQZe6bJu3TKFCzLe51fKFh8bLmWdKiAwugv3hm6SA1hZn2j");
        cb.setOAuthAccessToken("1042434897325973504-hLRs5VdZb2Vt59BO1ovOV5huuXtCFj");
        cb.setOAuthAccessTokenSecret("SlP4KOCcgA3YlgeK136yDjhhqFMJS6O2yftu4tlXMeitV");
            
        TwitterFactory tf= new TwitterFactory(cb.build()); 
        twitter4j.Twitter twitter=tf.getInstance();
         
        FileWriter fname= new FileWriter("tweets.txt");
        List<Status> status = twitter.getHomeTimeline();
        for(Status s: status)
        {
            System.out.println(s.getUser().getName()+ " "+ s.getText());
            fname.write("\n"+s.getText());
        }
        fname.close();
    }
}