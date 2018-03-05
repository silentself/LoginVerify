package com.atguigu.redis;

import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class JedisTest {
	
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.253.128",6379);
		System.out.println(jedis.ping());
		jedis.set("k1000", "v1000");
		
		jedis.get("k1000");
		
		Set<String> keys = jedis.keys("*");
		for (String string : keys) {
			
			System.out.println(string);
		}
		
		List<String> lrange = jedis.lrange("l1", 0, -1);
		for (String string : lrange) {
			
			System.out.println(string);
		}
		
		Set<String> smembers = jedis.smembers("s1");
		for (String string : smembers) {
			
			System.out.println(string);
		}
		jedis.close();
		
	}

}
