package org.rhpj.domain.client;

import java.util.List;
import org.rhpj.domain.entity.Sequences;
import org.rhpj.domain.entity.SequencesExample;

public interface SequencesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEQUENCES
     *
     * @mbg.generated
     */
    int insert(Sequences record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEQUENCES
     *
     * @mbg.generated
     */
    int insertSelective(Sequences record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SEQUENCES
     *
     * @mbg.generated
     */
    List<Sequences> selectByExample(SequencesExample example);
}