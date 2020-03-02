package com.hwua.dao;

import com.hwua.entity.TBrand;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TBrand)表数据库访问层
 *
 * @author makejava
 * @since 2020-03-02 16:18:28
 */
public interface TBrandDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TBrand queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TBrand> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tBrand 实例对象
     * @return 对象列表
     */
    List<TBrand> queryAll(TBrand tBrand);

    /**
     * 新增数据
     *
     * @param tBrand 实例对象
     * @return 影响行数
     */
    int insert(TBrand tBrand);

    /**
     * 修改数据
     *
     * @param tBrand 实例对象
     * @return 影响行数
     */
    int update(TBrand tBrand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}