package com.itgaoshu.service.impl;

import com.itgaoshu.dao.EmpMapper;
import com.itgaoshu.bean.Emp;
import com.itgaoshu.service.EmpService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmpServiceImpl  implements EmpService{
    @Resource
    private EmpMapper empMapper;
    @Cacheable("selectEmp")
    public List<Emp> selectEmp(){
        System.out.println("缓存  第一次出 第二次不出");
        return  empMapper.selectAll();
    }
}
