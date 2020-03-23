package com.tzl.mapper;

import com.tzl.bean.Department;
import org.apache.ibatis.annotations.*;

//加载类上已经配置了批量扫描
//@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(name) values(#{name})")
    public int insertDept(Department department);

    @Update("update department set name=#{name} where id=#{id}")
    public int updateDept(Department department);
}
