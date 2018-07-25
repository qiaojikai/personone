//package container.concurrentHashmap;
//
//import javax.swing.text.Segment;
//
//public class ConcurrentHashMap{
//	
//	public ConcurrentHashMap(int initialCapacity,
//			float loadFactor, int concurrencyLevel) {
//		if (!(loadFactor > 0) || initialCapacity < 0 || concurrencyLevel <= 0)
//			throw new IllegalArgumentException();
//		//MAX_SEGMENTS 为1<<16=65536，也就是最大并发数为65536
//		if (concurrencyLevel > MAX_SEGMENTS)
//			concurrencyLevel = MAX_SEGMENTS;
//		//2的sshif次方等于ssize，例:ssize=16,sshift=4;ssize=32,sshif=5
//		int sshift = 0;
//		//ssize 为segments数组长度，根据concurrentLevel计算得出
//		int ssize = 1;   //
//		while (ssize < concurrencyLevel) {
//			++sshift;
//			ssize <<= 1;
//		}
//		//segmentShift和segmentMask这两个变量在定位segment时会用到，后面会详细讲
//		this.segmentShift = 32 - sshift;
//		this.segmentMask = ssize - 1;
//		if (initialCapacity > MAXIMUM_CAPACITY)
//			initialCapacity = MAXIMUM_CAPACITY;
//		//计算cap的大小，即Segment中HashEntry的数组长度，cap也一定为2的n次方.
//		int c = initialCapacity / ssize;
//		if (c * ssize < initialCapacity)
//			++c;
//		int cap = MIN_SEGMENT_TABLE_CAPACITY;
//		while (cap < c)
//			cap <<= 1;
//		//创建segments数组并初始化第一个Segment，其余的Segment延迟初始化
//		Segment<K,V> s0 =
//				new Segment<K,V>(loadFactor, (int)(cap * loadFactor),
//						(HashEntry<K,V>[])new HashEntry[cap]);
//		Segment<K,V>[] ss = (Segment<K,V>[])new Segment[ssize];
//		UNSAFE.putOrderedObject(ss, SBASE, s0); 
//		this.segments = ss;
//	}
//}