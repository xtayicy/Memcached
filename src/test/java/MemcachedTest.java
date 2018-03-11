import org.junit.Test;

import com.whalin.MemCached.MemCachedClient;
import com.whalin.MemCached.SockIOPool;

/**
 * 
 * @author harry
 *
 */
public class MemcachedTest {
	MemCachedClient memCachedClient = new MemCachedClient();
	
	static{
		SockIOPool pool = SockIOPool.getInstance();
		pool.setServers(new String[]{"localhost:11211"});
		pool.initialize();
	}
	
	@Test
	public void testAdd(){
		System.out.println(memCachedClient.add("username", "tom"));
	}
	
	@Test
	public void testQuery(){
		System.out.println(memCachedClient.get("username"));
	}
	
	@Test
	public void testReplace(){
		System.out.println(memCachedClient.replace("username", "marry"));
	}
	
	@Test
	public void testDelete(){
		System.out.println(memCachedClient.delete("username"));
	}
}
