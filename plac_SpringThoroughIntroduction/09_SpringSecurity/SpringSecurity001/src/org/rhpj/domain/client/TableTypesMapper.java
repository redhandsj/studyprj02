package org.rhpj.domain.client;

import java.util.List;
import org.rhpj.domain.entity.TableTypes;
import org.rhpj.domain.entity.TableTypesExample;

public interface TableTypesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_TYPES
     *
     * @mbg.generated
     */
    int insert(TableTypes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_TYPES
     *
     * @mbg.generated
     */
    int insertSelective(TableTypes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLE_TYPES
     *
     * @mbg.generated
     */
    List<TableTypes> selectByExample(TableTypesExample example);
}