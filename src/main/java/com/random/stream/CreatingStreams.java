package com.random.stream;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @description 创建流的各种方式.
 * @author random
 * @version 1.0
 * @date 2018年9月27日
 * 
 */
public class CreatingStreams {
	public static <T> void show(String title, Stream<T> stream) {
		final int SIZE = 10;
		List<T> firstElements = stream.limit(SIZE + 1).collect(Collectors.toList());
		System.out.println(title + ": ");
		for (int i = 0; i < firstElements.size(); i++) {
			if (i > 0)	System.out.print(", ");
			if (i < SIZE)  {System.out.println(firstElements.get(i));}
			else  System.out.print("...");
		}
		System.out.println();
	}

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/Administrator/Desktop/radish.txt");
		String contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

		Stream<String> words = Stream.of(contents.split("\\PL+"));
		show("words", words);
		Stream<String> song = Stream.of("gently","domn","the","stream");
		show("song", song);
		Stream<String> silence = Stream.empty();
		show("silence", silence);
		Stream<String> echo = Stream.generate(()->"Echo");
		show("echo", echo);
		Stream<Double> randoms = Stream.generate(Math::random);
		show("randoms", randoms);
		Stream<BigInteger> integers= Stream.iterate(BigInteger.ONE,n->n.add(BigInteger.ONE));
		show("integers", integers);
		Stream<String> wordsAntherWay = Pattern.compile("\\PL+").splitAsStream(contents);
		show("wordsAntherWay", wordsAntherWay);
		
		try(Stream<String> lines = Files.lines(path,StandardCharsets.UTF_8)){
			show("lines", lines);
		}
	}
}
