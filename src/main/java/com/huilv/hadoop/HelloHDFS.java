package com.huilv.hadoop;

import java.io.InputStream;
import java.net.URL;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.FsUrlStreamHandlerFactory;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;

/**
 * Hello HDFS!
 */
public class HelloHDFS {
    
    public static void main(String[] args) throws Exception {
//        URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
//        URL url = new URL("hdfs://192.168.137.70:9000/hello.txt");
//        InputStream in = url.openStream();
//        IOUtils.copyBytes(in, System.out, 4096, true);
        
        Configuration conf = new Configuration();  
        conf.set("fs.defaultFS", "hdfs://192.168.137.70:9000");  
        FileSystem fs = FileSystem.get(conf);
//        boolean success = fs.mkdirs(new Path("/zrz"));
//        System.out.println(success ? "成功" : "失败");
    }
}
