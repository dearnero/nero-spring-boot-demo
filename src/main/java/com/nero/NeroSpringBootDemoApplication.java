package com.nero;

import com.nero.cache.MathService;
import com.nero.db.Item;
import com.nero.db.ItemRepositoryImpl;
import com.nero.redis.RedisServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
@EnableCaching
public class NeroSpringBootDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(NeroSpringBootDemoApplication.class, args);
    }

    @Autowired
    private MathService mathService;

    @Autowired
    private ItemRepositoryImpl itemRepository;

    @Autowired
    private RedisServiceImpl redisService;

    @Override
    public void run(String... strings) throws Exception {

//		mathService.computePiDecimal(1);
//		mathService.computePiDecimal(2);
//		mathService.computePiDecimal(1);

//		Long id1 = 1013995880545L;
//		Item item = itemRepository.findById(id1);
//		System.out.println(item.toString());
//		Item item1 = itemRepository.findById(id1);
//		System.out.println(item1.toString());

//		redisService.test("");

//        Long id1 = 1006135373926L;
//        Item item = itemRepository.findById(id1);
//        System.out.println("第一次查询：" + item.toString());
//
//        Item item2 = itemRepository.findById(id1);
//        System.out.println("第二次查询：" + item2.toString());
//
//        itemRepository.updateNameById(id1);
//        System.out.println("第一次更新");
//
//        Item item3 = itemRepository.findById(id1);
//        System.out.println("第三次查询：" + item3.toString());
//
//        itemRepository.removeCacheById(id1);
//        System.out.println("第一次删除");
//
//        Item item4 = itemRepository.findById(id1);
//        System.out.println("第四次查询：" + item4.toString());
    }
}
