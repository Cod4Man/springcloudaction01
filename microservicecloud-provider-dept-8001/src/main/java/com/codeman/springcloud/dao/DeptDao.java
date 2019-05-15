package com.codeman.springcloud.dao;

import com.codeman.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author 张鸿杰
 * Date：2019-05-12
 * Time:18:20
 */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
