package org.rhpj.domain.client;

import java.util.List;
import org.rhpj.domain.entity.TypeInfo;
import org.rhpj.domain.entity.TypeInfoExample;

public interface TypeInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    int insert(TypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    int insertSelective(TypeInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    List<TypeInfo> selectByExample(TypeInfoExample example);
}