package com.itgaoshu.contorller;

import com.itgaoshu.bean.Emp;
import com.itgaoshu.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmpContorller {
    @Resource
    private EmpService empService;

    @RequestMapping("selectEmp.do")
    public String  selectEmp(Model model){
        List<Emp> emps = empService.selectEmp();
        model.addAttribute("emps",emps);
        return "freemarker1";
    }
}
