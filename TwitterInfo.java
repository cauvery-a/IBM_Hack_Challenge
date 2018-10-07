package twitterinformation;

import java.util.*;
import java.io.*;
import twitter4j.*;
import twitter4j.conf.*;

public class TwitterInfo {
    public static int count=1;
    
    public TwitterInfo() 
    {
    	try
    	{
    		getTweets();
    	}catch(Exception e) {}
    }
    public void getTweets() throws IOException, TwitterException
    {
        
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey("ohag73a7vJ3AkIP6SY6zrfDw1");
        cb.setOAuthConsumerSecret("m5LZQZe6bJu3TKFCzLe51fKFh8bLmWdKiAwugv3hm6SA1hZn2j");
        cb.setOAuthAccessToken("1042434897325973504-0GyFbgoItjOFiu5fd1umTPCkomcCBH");
        cb.setOAuthAccessTokenSecret("RB97ziKKPScHJvyoQaAlO59Tksb3nUdluVMTO8Rr67KnV");
            
        TwitterFactory tf= new TwitterFactory(cb.build()); 
        twitter4j.Twitter twitter=tf.getInstance();
         
        File fname= new File("tweets.txt");
        FileWriter fwrite = new FileWriter(fname);
        List<Status> status = twitter.getHomeTimeline();
        for(Status s: status)
        {
	            System.out.println(s.getUser().getName()+ " "+ s.getText());
	            fwrite.write("\n"+s.getText());
        }
        fwrite.close();
    }
}