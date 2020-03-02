package com.hwua.service.impl;

import com.hwua.entity.TBrand;
import com.hwua.dao.TBrandDao;
import com.hwua.service.TBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TBrand)表服务实现类
 *
 * @author makejava
 * @since 2020-03-02 16:18:28
 */
@Service("tBrandService")
public class TBrandServiceImpl implements TBrandService {
    @Resource
    private TBrandDao tBrandDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TBrand queryById(Integer id) {
        return this.tBrandDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TBrand> queryAllByLimit(int offset, int limit) {
        return this.tBrandDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tBrand 实例对象
     * @return 实例对象
     */
    @Override
    public TBrand insert(TBrand tBrand) {
        this.tBrandDao.insert(tBrand);
        return tBrand;
    }

    /**
     * 修改数据
     *
     * @param tBrand 实例对象
     * @return 实例对象
     */
    @Override
    public TBrand update(TBrand tBrand) {
        this.tBrandDao.update(tBrand);
        return this.queryById(tBrand.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tBrandDao.deleteById(id) > 0;
    }
}