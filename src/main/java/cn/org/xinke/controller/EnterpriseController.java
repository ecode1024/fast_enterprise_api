package cn.org.xinke.controller;

import cn.org.xinke.annotation.Login;
import cn.org.xinke.service.EnterpriseService;
import cn.org.xinke.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 企业
 * @author cinco
 * @date 2019-3-15
 */
@RestController
@RequestMapping("/api/app/enterprise")
public class EnterpriseController {

    @Autowired
    private EnterpriseService enterpriseService;

    /**
     * 企业列表
     *
     * @param result
     * @return JsonResult
     * @throws Exception
     */
    @Login(authentication = "admin")
    @PostMapping("/list")
    public JsonResult list(JsonResult result) throws Exception {
        result.setData(enterpriseService.list());
        return result;
    }
}
