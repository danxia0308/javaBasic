package jdk1_8_new_features;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Parallel
{

	public static void main(String[] args)
	{
		testSequential();
		testParallel();
	}

	static void testSequential()
	{
		List<String> list = generateRandomList(10000);
		long start = System.currentTimeMillis();
		Stream<String> stream = list.stream().sorted();
		System.out.println(stream.count());
		long end = System.currentTimeMillis();
		System.out.println("Sequential Time elapse:" + (end-start));
	}
	
	static void testParallel()
	{
		List<String> list = generateRandomList(10000);
		long start = System.currentTimeMillis();
		Stream<String> stream = list.parallelStream().sorted();
		System.out.println(stream.count());
		long end = System.currentTimeMillis();
		System.out.println("Parallel Time elapse:" + (end-start));
	}
	
	static List<String> generateRandomList(int count)
	{
		List<String> list = new ArrayList<String>();
		Random random = new Random(1000);
		for (int i=0; i< count; i++)
		{
			list.add(String.valueOf(random.nextInt()));
		}
		return list;
	}
}
