package cn.org.xinke.mapper;

import cn.org.xinke.entity.Enterprise;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

/**
 * @description 企业Mapper接口定义
 * @author cinco
 * @date 2019-3-15
 */
@Mapper
public interface EnterpriseMapper {

    /**
     * 企业列表
     *
     * @return List<Enterprise>
     * @throws Exception
     */
    @Select("SELECT * FROM fea_enterprise")
    List<Enterprise> list() throws Exception;
}
