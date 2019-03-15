package cn.org.xinke.service.impl;

import cn.org.xinke.entity.Enterprise;
import cn.org.xinke.mapper.EnterpriseMapper;
import cn.org.xinke.service.EnterpriseService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @description 企业业务层接口实现
 * @author cinco
 * @date 2019-3-15
 */
@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Resource
    private EnterpriseMapper enterpriseMapper;

    /**
     * 企业列表
     *
     * @return List<Enterprise>
     * @throws Exception
     */
    @Override
    public List<Enterprise> list() throws Exception {
        return enterpriseMapper.list();
    }
}
