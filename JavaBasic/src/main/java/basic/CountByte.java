package basic;

import java.io.UnsupportedEncodingException;

public class CountByte
{

	public static void main(String[] args) throws Exception
	{
		String s="你";
		System.out.println("Count for:" + s);
		countString(s);
		s="Y";
		System.out.println("Count for:" + s);
		countString(s);

	}
	
	public static void countString(String s) throws Exception
	{
		byte[] bytes = s.getBytes();
		System.out.println("DefaultEncode,ByteSize="+bytes.length);
		bytes = s.getBytes("utf-8");
		System.out.println("EnCode=utf-8, ByteSize="+bytes.length);
		bytes = s.getBytes("GBK");
		System.out.println("Encode=GBK,   ByteSize="+bytes.length);
		bytes = s.getBytes("gb2312");
		System.out.println("EnCode=gb2312,ByteSize="+bytes.length);
		
	}

}
