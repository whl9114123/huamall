package com.huamall.util;

import org.apache.tomcat.jni.Pool;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisUtil {
	
	private JedisPool jedisPool;
	public void initPool(String host,int port,int database) {
		JedisPoolConfig poolConfig = new JedisPoolConfig();
		poolConfig.setMaxIdle(30);
		poolConfig.setMaxWaitMillis(10*1000);
		poolConfig.setMaxTotal(200);
		poolConfig.setBlockWhenExhausted(true);
		jedisPool=new JedisPool(poolConfig,host,port,20*1000,null,database);
		
	}
	public Jedis getJedis() {
		Jedis jedis = jedisPool.getResource();
		return jedis;
	}

}
