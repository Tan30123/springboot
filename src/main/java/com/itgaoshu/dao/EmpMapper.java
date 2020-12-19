package com.itgaoshu.dao;

import com.itgaoshu.bean.Emp;
import tk.mybatis.mapper.common.Mapper;

/*自动以Mapper接口需要继承自 tk.mybatis.mapper.common.Mapper <T> 接口*/
/*@Mapper*/
public interface EmpMapper extends Mapper<Emp>{
    /*@Select("select * from emp")
    public List<Emp> selectEmp();*/
}
