package com.nero.db;

        import org.apache.ibatis.annotations.Mapper;
        import org.apache.ibatis.annotations.Select;
        import org.apache.ibatis.annotations.Update;


/**
 * <p>
 * date : 2018/2/9
 * time : 17:37
 * </p>
 *
 * @author Nero
 */
@Mapper
public interface ItemMapper {

    @Select("SELECT id, name FROM item where id = #{id}")
    Item findById(Long id);

    @Update("UPDATE item SET NAME = '好的童装' where id = #{id}")
    Integer updateNameById(Long id);
}
