package org.rhpj.domain.client;

import java.util.List;
import org.rhpj.domain.entity.Domains;
import org.rhpj.domain.entity.DomainsExample;

public interface DomainsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOMAINS
     *
     * @mbg.generated
     */
    int insert(Domains record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOMAINS
     *
     * @mbg.generated
     */
    int insertSelective(Domains record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DOMAINS
     *
     * @mbg.generated
     */
    List<Domains> selectByExample(DomainsExample example);
}