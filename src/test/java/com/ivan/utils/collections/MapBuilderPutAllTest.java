package com.ivan.utils.collections;

import java.util.Map;
import java.util.WeakHashMap;

public class MapBuilderPutAllTest {
	public static void main(final String[] args) {
		final Map<Integer, String> baseMap = MapBuilder.<Integer, String> hashMap()
				.put(123, "one")
				.put(456, "two")
				.put(789, "three")
				.put(101, "four")
				.build();

		final Map<Integer, String> hashMap = MapBuilder.<Integer, String> hashMap()
				.putAll(baseMap)
				.build();
		final Map<Integer, String> linkedHashMap = MapBuilder.<Integer, String> linkedHashMap()
				.putAll(baseMap)
				.build();
		final Map<Integer, String> treeMap = MapBuilder.<Integer, String> treeMap()
				.putAll(baseMap)
				.build();
		final Map<Integer, String> intMap = MapBuilder.<String> intMap()
				.putAll(baseMap)
				.build();
		final Map<Integer, String> customMap = MapBuilder.map(new WeakHashMap<Integer, String>())
				.putAll(baseMap)
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