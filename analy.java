package twitterinformation;

import java.util.*;
import java.io.*;

public class analy {
    public float hper,sper;
    public analy()
    {
        sentimentAnalysis();
    }
   
    public void sentimentAnalysis()
    {
        int sentiment;
        try 
        {
            int count=0,happy=0,sad=0;
            
            Scanner finput=new Scanner(new File("removed.txt"));
            while(finput.hasNextLine())
            {
                String s=finput.nextLine();
                count++;
            }
            
            Scanner finput1=new Scanner(new File("removed.txt"));
            while(finput1.hasNextLine())
            {
                String s=finput1.nextLine();
                s=s.toLowerCase();
                Scanner finp1=new Scanner(new File("happy.txt"));
                
                while(finp1.hasNextLine())
                {
                    String s1=finp1.nextLine();
                    s1=s1.toLowerCase();
                    if(s1.equals(s)) happy++;
                }
            }
            Scanner finput2=new Scanner(new File("removed.txt"));
            while(finput2.hasNextLine())
            {
                String s=finput2.nextLine();
                s=s.toLowerCase();
                Scanner finp2=new Scanner(new File("sad.txt"));
                
                while(finp2.hasNextLine())
                {
                    String s2=finp2.nextLine();
                    s2=s2.toLowerCase();
                    if(s2.equals(s)) sad++;
                }
            }
            System.out.println(count);         
            System.out.println(happy);
            System.out.println(sad);
            
            hper=((float)happy/count)*100;
            sper=((float)sad/count)*100;
            System.out.println("Happiness Percentage "+hper+" %");
            System.out.println("Sadness Percentage "+sper+" %");
            
            if(hper>sper)
            {
                System.out.println("Hackelite is happy");
            }
            
            else
                System.out.println("Hackelite is sad");
        }
        catch(Exception e)
        {
            System.err.println("cannot read file");
        }
    }
   
}