package com.ali.trillium;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.input.Tailer;
import org.apache.commons.io.input.TailerListenerAdapter;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Author Ali!
 *
 */
public class App extends TailerListenerAdapter {

    public void handle(String line) {
        App main =new App();
        super.handle(line);

       Readfile rf = new Readfile();
            try {
               rf.lineRead(line);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    public static void main(String args[]) throws IOException {

        App listener = new App();
        Tailer tailer = new Tailer(new File("src/main/java/com/ali/trillium/p0f.log"), listener, 1);
        tailer.run();


    }


    }

