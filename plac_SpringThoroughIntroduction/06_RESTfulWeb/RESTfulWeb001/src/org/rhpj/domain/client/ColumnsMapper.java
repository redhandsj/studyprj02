package org.rhpj.domain.client;

import java.util.List;
import org.rhpj.domain.entity.Columns;
import org.rhpj.domain.entity.ColumnsExample;

public interface ColumnsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMNS
     *
     * @mbg.generated
     */
    int insert(Columns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMNS
     *
     * @mbg.generated
     */
    int insertSelective(Columns record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COLUMNS
     *
     * @mbg.generated
     */
    List<Columns> selectByExample(ColumnsExample example);
}