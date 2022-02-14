package com.ruanhaiqin.smb_server;

import java.io.IOException;

import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        // Sardine sardine = SardineFactory.begin("webdav", "raspberry");
        
        // if (sardine.exists("http://nas.ruanhaiqin.com:666/smb/")) {
        //     System.out.println("file or director exist");
        // }
        new TcpServer();

    }
}
