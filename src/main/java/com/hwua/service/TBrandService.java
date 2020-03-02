package com.hwua.service;

import com.hwua.entity.TBrand;
import java.util.List;

/**
 * (TBrand)表服务接口
 *
 * @author makejava
 * @since 2020-03-02 16:18:28
 */
public interface TBrandService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TBrand queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TBrand> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tBrand 实例对象
     * @return 实例对象
     */
    TBrand insert(TBrand tBrand);

    /**
     * 修改数据
     *
     * @param tBrand 实例对象
     * @return 实例对象
     */
    TBrand update(TBrand tBrand);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}