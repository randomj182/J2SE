package com.random.stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * @description 添加类的描述.
 * @author random
 * @version 1.0
 * @date 2018年9月26日
 * 
 */

public class CreateDir {
   public static void main(String args[]) throws IOException {
	   String contents = new String(Files.readAllBytes(Paths.get("C:/Users/Administrator/Desktop/radish.txt")),StandardCharsets.UTF_8);
	   List<String> words = Arrays.asList(contents.split("\\PL+"));
	   System.out.println(words);
	   long count = 0;
	   for(String w:words){
		   if(w.length()>12) count++;
	   }
	   System.out.println(count);
	   
	   count = words.stream().filter(w -> w.length() >12).count();
	   System.out.println(count);
	   
	   count = words.parallelStream().filter(w -> w.length() >12).count();
	   System.out.println(count);
  }
}
