package org.rhpj.domain.client;

import java.util.List;
import org.rhpj.domain.entity.Tables;
import org.rhpj.domain.entity.TablesExample;

public interface TablesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    int insert(Tables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    int insertSelective(Tables record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    List<Tables> selectByExample(TablesExample example);
}