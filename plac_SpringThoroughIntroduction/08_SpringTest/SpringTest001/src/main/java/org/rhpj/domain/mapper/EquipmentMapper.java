package org.rhpj.domain.mapper;

import java.util.List;
import org.rhpj.domain.entity.Equipment;
import org.rhpj.domain.entity.EquipmentExample;
import org.rhpj.domain.entity.EquipmentKey;

public interface EquipmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    long countByExample(EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    int deleteByExample(EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(EquipmentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    int insert(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    int insertSelective(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    List<Equipment> selectByExample(EquipmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    Equipment selectByPrimaryKey(EquipmentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Equipment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Equipment record);
}