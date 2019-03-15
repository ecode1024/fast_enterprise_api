package cn.org.xinke.service;

import cn.org.xinke.entity.Enterprise;
import java.util.List;

/**
 * @description 企业业务层接口定义
 * @author cinco
 * @date 2019-3-15
 */
public interface EnterpriseService {

    /**
     * 企业列表
     *
     * @return List<Enterprise>
     * @throws Exception
     */
    List<Enterprise> list() throws Exception;
}
