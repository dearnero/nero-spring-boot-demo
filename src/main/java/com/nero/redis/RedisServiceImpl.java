package com.nero.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

/**
 * <p>
 * date : 2018/2/11
 * time : 16:56
 * </p>
 *
 * @author Nero
 */
@Service
public class RedisServiceImpl {

    @Autowired
    private StringRedisTemplate template;

    public void test(String... args) throws Exception {
        ValueOperations<String, String> ops = this.template.opsForValue();
        String key = "spring.boot.redis.test";
        if (!this.template.hasKey(key)) {
            ops.set(key, "foo");
        }
        System.out.println("Found key " + key + ", value=" + ops.get(key));
    }

}
