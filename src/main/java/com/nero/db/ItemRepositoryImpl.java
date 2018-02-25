package com.nero.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * date : 2018/2/9
 * time : 17:57
 * </p>
 *
 * @author Nero
 */
@Repository
@CacheConfig(cacheNames = "item")
public class ItemRepositoryImpl {

    @Autowired
    private ItemMapper itemMapper;

    @Cacheable(key = "\"item_\" + #id")
    public Item findById(Long id) {
        System.out.println("进入查询......" + id);
        return itemMapper.findById(id);
    }

    @CachePut(key = "\"item_\" + #id")
    public Item updateNameById(Long id){
        itemMapper.updateNameById(id);
        return itemMapper.findById(id);
    }

    @CacheEvict(key = "\"item_\" + #id")
    public Integer removeCacheById(Long id){
        return 1;
    }




}
