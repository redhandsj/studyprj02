package org.rhpj.domain.client;

import java.util.List;
import org.rhpj.domain.entity.Room;
import org.rhpj.domain.entity.RoomExample;
import org.rhpj.domain.entity.RoomKey;

public interface RoomMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROOM
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(RoomKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROOM
     *
     * @mbg.generated
     */
    int insert(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROOM
     *
     * @mbg.generated
     */
    int insertSelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROOM
     *
     * @mbg.generated
     */
    List<Room> selectByExample(RoomExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROOM
     *
     * @mbg.generated
     */
    Room selectByPrimaryKey(RoomKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROOM
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Room record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ROOM
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Room record);
}