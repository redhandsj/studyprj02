package org.rhpj.domain.client;

import java.util.List;
import org.rhpj.domain.entity.Indexes;
import org.rhpj.domain.entity.IndexesExample;

public interface IndexesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INDEXES
     *
     * @mbg.generated
     */
    int insert(Indexes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INDEXES
     *
     * @mbg.generated
     */
    int insertSelective(Indexes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INDEXES
     *
     * @mbg.generated
     */
    List<Indexes> selectByExample(IndexesExample example);
}