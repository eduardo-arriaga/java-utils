package com.ivan.utils.collections.map;

import java.util.Map;
import java.util.WeakHashMap;

import com.ivan.utils.collections.map.MapBuilder;

public class MapBuilderPutTest {
	public static void main(final String[] args) {
		final Map<Integer, String> hashMap = MapBuilder.<Integer, String> hashMap()
				.put(123, "one")
				.put(456, "two")
				.put(789, "three")
				.put(101, "four")
				.build();
		final Map<Integer, String> linkedHashMap = MapBuilder.<Integer, String> linkedHashMap()
				.put(123, "one")
				.put(456, "two")
				.put(789, "three")
				.put(101, "four")
				.build();
		final Map<Integer, String> treeMap = MapBuilder.<Integer, String> treeMap()
				.put(123, "one")
				.put(456, "two")
				.put(789, "three")
				.put(101, "four")
				.build();
		final Map<Integer, String> intMap = MapBuilder.<String> intMap()
				.put(123, "one")
				.put(456, "two")
				.put(789, "three")
				.put(101, "four")
				.build();
		final Map<Integer, String> customMap = MapBuilder.map(new WeakHashMap<Integer, String>())
				.put(123, "one")
				.put(456, "two")
				.put(789, "three")
				.put(101, "four")
				.build();

		printMap(hashMap);
		printMap(linkedHashMap);
		printMap(treeMap);
		printMap(intMap);
		printMap(customMap);
	}

	private static void printMap(final Map<Integer, String> map) {
		System.out.println(map + " -- " + map.getClass().getSimpleName());
	}
}
