package org.rhpj.domain.entity;

public class Locks {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LOCKS.TABLE_SCHEMA
     *
     * @mbg.generated
     */
    private String tableSchema;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LOCKS.TABLE_NAME
     *
     * @mbg.generated
     */
    private String tableName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LOCKS.SESSION_ID
     *
     * @mbg.generated
     */
    private Integer sessionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column LOCKS.LOCK_TYPE
     *
     * @mbg.generated
     */
    private String lockType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LOCKS.TABLE_SCHEMA
     *
     * @return the value of LOCKS.TABLE_SCHEMA
     *
     * @mbg.generated
     */
    public String getTableSchema() {
        return tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LOCKS.TABLE_SCHEMA
     *
     * @param tableSchema the value for LOCKS.TABLE_SCHEMA
     *
     * @mbg.generated
     */
    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LOCKS.TABLE_NAME
     *
     * @return the value of LOCKS.TABLE_NAME
     *
     * @mbg.generated
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LOCKS.TABLE_NAME
     *
     * @param tableName the value for LOCKS.TABLE_NAME
     *
     * @mbg.generated
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LOCKS.SESSION_ID
     *
     * @return the value of LOCKS.SESSION_ID
     *
     * @mbg.generated
     */
    public Integer getSessionId() {
        return sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LOCKS.SESSION_ID
     *
     * @param sessionId the value for LOCKS.SESSION_ID
     *
     * @mbg.generated
     */
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column LOCKS.LOCK_TYPE
     *
     * @return the value of LOCKS.LOCK_TYPE
     *
     * @mbg.generated
     */
    public String getLockType() {
        return lockType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column LOCKS.LOCK_TYPE
     *
     * @param lockType the value for LOCKS.LOCK_TYPE
     *
     * @mbg.generated
     */
    public void setLockType(String lockType) {
        this.lockType = lockType;
    }
}