package twitterinformation;
import java.util.*;
import java.io.*;

public class stopwords {
    public static void remove()
    {
         
        try {
            File inputFile=new File("stop.txt");
            int fileSize=(int) inputFile.length();
            FileReader file=new FileReader(inputFile);
            BufferedReader br=new BufferedReader(file);
            String lines[]=new String[fileSize];
            
            for(int i=0;i<fileSize;i++)
            {
            	lines[i]=br.readLine();
            }
            
            
            
            Scanner finp=new Scanner(new File("tweets.txt"));
            
            
            File fout = new File("removed.txt");
            FileOutputStream fos = new FileOutputStream(fout);
               BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            
            while(finp.hasNext())
            {
                int flag=1;
                String s1=finp.next();
                s1=s1.toLowerCase();
                for(int i=0;i<lines.length;i++)
                {
                    
                    if(s1.equals(lines[i]))
                    {
                        flag=0;
                        
                    }
                }
                if(flag!=0)
                {
                    System.out.println(s1);
                    bw.write(s1+" ");
                }    
            }
            file.close();
            bw.close();
        }
        catch(Exception e)
        {
            System.err.println("cannot read file");
        }
    }
    public stopwords()
    {
        remove();
    }
}