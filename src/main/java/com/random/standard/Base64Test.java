package com.random.standard;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import org.junit.Test;

/**
 * @description 有关JDK8之后引入的Base64编码和解码.
 * @author random
 * @version 1.0
 * @date 2018年8月1日
 * 	自jdk1.8之后
 */

public class Base64Test {
	final Decoder decoder = Base64.getDecoder();
	final Encoder encoder = Base64.getEncoder();
	final String text = "字串文字";
	
	@Test
	public void encode() throws UnsupportedEncodingException{
		// 编码
		final String encodedText = encoder.encodeToString(text.getBytes("UTF-8"));
		System.out.println(encodedText);
		// 解码
		System.out.println(new String(decoder.decode(encodedText), "UTF-8"));
	}
	
}
