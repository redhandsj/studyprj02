package org.rhpj.domain.client;

import java.util.List;
import org.rhpj.domain.entity.Sessions;
import org.rhpj.domain.entity.SessionsExample;

public interface SessionsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SESSIONS
     *
     * @mbg.generated
     */
    int insert(Sessions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SESSIONS
     *
     * @mbg.generated
     */
    int insertSelective(Sessions record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SESSIONS
     *
     * @mbg.generated
     */
    List<Sessions> selectByExample(SessionsExample example);
}