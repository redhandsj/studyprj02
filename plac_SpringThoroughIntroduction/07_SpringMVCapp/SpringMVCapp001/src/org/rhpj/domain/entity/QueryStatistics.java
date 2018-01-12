package org.rhpj.domain.entity;

public class QueryStatistics {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.SQL_STATEMENT
     *
     * @mbg.generated
     */
    private String sqlStatement;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.EXECUTION_COUNT
     *
     * @mbg.generated
     */
    private Integer executionCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.MIN_EXECUTION_TIME
     *
     * @mbg.generated
     */
    private Double minExecutionTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.MAX_EXECUTION_TIME
     *
     * @mbg.generated
     */
    private Double maxExecutionTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.CUMULATIVE_EXECUTION_TIME
     *
     * @mbg.generated
     */
    private Double cumulativeExecutionTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.AVERAGE_EXECUTION_TIME
     *
     * @mbg.generated
     */
    private Double averageExecutionTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.STD_DEV_EXECUTION_TIME
     *
     * @mbg.generated
     */
    private Double stdDevExecutionTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.MIN_ROW_COUNT
     *
     * @mbg.generated
     */
    private Integer minRowCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.MAX_ROW_COUNT
     *
     * @mbg.generated
     */
    private Integer maxRowCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.CUMULATIVE_ROW_COUNT
     *
     * @mbg.generated
     */
    private Long cumulativeRowCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.AVERAGE_ROW_COUNT
     *
     * @mbg.generated
     */
    private Double averageRowCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column QUERY_STATISTICS.STD_DEV_ROW_COUNT
     *
     * @mbg.generated
     */
    private Double stdDevRowCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.SQL_STATEMENT
     *
     * @return the value of QUERY_STATISTICS.SQL_STATEMENT
     *
     * @mbg.generated
     */
    public String getSqlStatement() {
        return sqlStatement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.SQL_STATEMENT
     *
     * @param sqlStatement the value for QUERY_STATISTICS.SQL_STATEMENT
     *
     * @mbg.generated
     */
    public void setSqlStatement(String sqlStatement) {
        this.sqlStatement = sqlStatement;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.EXECUTION_COUNT
     *
     * @return the value of QUERY_STATISTICS.EXECUTION_COUNT
     *
     * @mbg.generated
     */
    public Integer getExecutionCount() {
        return executionCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.EXECUTION_COUNT
     *
     * @param executionCount the value for QUERY_STATISTICS.EXECUTION_COUNT
     *
     * @mbg.generated
     */
    public void setExecutionCount(Integer executionCount) {
        this.executionCount = executionCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.MIN_EXECUTION_TIME
     *
     * @return the value of QUERY_STATISTICS.MIN_EXECUTION_TIME
     *
     * @mbg.generated
     */
    public Double getMinExecutionTime() {
        return minExecutionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.MIN_EXECUTION_TIME
     *
     * @param minExecutionTime the value for QUERY_STATISTICS.MIN_EXECUTION_TIME
     *
     * @mbg.generated
     */
    public void setMinExecutionTime(Double minExecutionTime) {
        this.minExecutionTime = minExecutionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.MAX_EXECUTION_TIME
     *
     * @return the value of QUERY_STATISTICS.MAX_EXECUTION_TIME
     *
     * @mbg.generated
     */
    public Double getMaxExecutionTime() {
        return maxExecutionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.MAX_EXECUTION_TIME
     *
     * @param maxExecutionTime the value for QUERY_STATISTICS.MAX_EXECUTION_TIME
     *
     * @mbg.generated
     */
    public void setMaxExecutionTime(Double maxExecutionTime) {
        this.maxExecutionTime = maxExecutionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.CUMULATIVE_EXECUTION_TIME
     *
     * @return the value of QUERY_STATISTICS.CUMULATIVE_EXECUTION_TIME
     *
     * @mbg.generated
     */
    public Double getCumulativeExecutionTime() {
        return cumulativeExecutionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.CUMULATIVE_EXECUTION_TIME
     *
     * @param cumulativeExecutionTime the value for QUERY_STATISTICS.CUMULATIVE_EXECUTION_TIME
     *
     * @mbg.generated
     */
    public void setCumulativeExecutionTime(Double cumulativeExecutionTime) {
        this.cumulativeExecutionTime = cumulativeExecutionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.AVERAGE_EXECUTION_TIME
     *
     * @return the value of QUERY_STATISTICS.AVERAGE_EXECUTION_TIME
     *
     * @mbg.generated
     */
    public Double getAverageExecutionTime() {
        return averageExecutionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.AVERAGE_EXECUTION_TIME
     *
     * @param averageExecutionTime the value for QUERY_STATISTICS.AVERAGE_EXECUTION_TIME
     *
     * @mbg.generated
     */
    public void setAverageExecutionTime(Double averageExecutionTime) {
        this.averageExecutionTime = averageExecutionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.STD_DEV_EXECUTION_TIME
     *
     * @return the value of QUERY_STATISTICS.STD_DEV_EXECUTION_TIME
     *
     * @mbg.generated
     */
    public Double getStdDevExecutionTime() {
        return stdDevExecutionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.STD_DEV_EXECUTION_TIME
     *
     * @param stdDevExecutionTime the value for QUERY_STATISTICS.STD_DEV_EXECUTION_TIME
     *
     * @mbg.generated
     */
    public void setStdDevExecutionTime(Double stdDevExecutionTime) {
        this.stdDevExecutionTime = stdDevExecutionTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.MIN_ROW_COUNT
     *
     * @return the value of QUERY_STATISTICS.MIN_ROW_COUNT
     *
     * @mbg.generated
     */
    public Integer getMinRowCount() {
        return minRowCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.MIN_ROW_COUNT
     *
     * @param minRowCount the value for QUERY_STATISTICS.MIN_ROW_COUNT
     *
     * @mbg.generated
     */
    public void setMinRowCount(Integer minRowCount) {
        this.minRowCount = minRowCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.MAX_ROW_COUNT
     *
     * @return the value of QUERY_STATISTICS.MAX_ROW_COUNT
     *
     * @mbg.generated
     */
    public Integer getMaxRowCount() {
        return maxRowCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.MAX_ROW_COUNT
     *
     * @param maxRowCount the value for QUERY_STATISTICS.MAX_ROW_COUNT
     *
     * @mbg.generated
     */
    public void setMaxRowCount(Integer maxRowCount) {
        this.maxRowCount = maxRowCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.CUMULATIVE_ROW_COUNT
     *
     * @return the value of QUERY_STATISTICS.CUMULATIVE_ROW_COUNT
     *
     * @mbg.generated
     */
    public Long getCumulativeRowCount() {
        return cumulativeRowCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.CUMULATIVE_ROW_COUNT
     *
     * @param cumulativeRowCount the value for QUERY_STATISTICS.CUMULATIVE_ROW_COUNT
     *
     * @mbg.generated
     */
    public void setCumulativeRowCount(Long cumulativeRowCount) {
        this.cumulativeRowCount = cumulativeRowCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.AVERAGE_ROW_COUNT
     *
     * @return the value of QUERY_STATISTICS.AVERAGE_ROW_COUNT
     *
     * @mbg.generated
     */
    public Double getAverageRowCount() {
        return averageRowCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.AVERAGE_ROW_COUNT
     *
     * @param averageRowCount the value for QUERY_STATISTICS.AVERAGE_ROW_COUNT
     *
     * @mbg.generated
     */
    public void setAverageRowCount(Double averageRowCount) {
        this.averageRowCount = averageRowCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column QUERY_STATISTICS.STD_DEV_ROW_COUNT
     *
     * @return the value of QUERY_STATISTICS.STD_DEV_ROW_COUNT
     *
     * @mbg.generated
     */
    public Double getStdDevRowCount() {
        return stdDevRowCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column QUERY_STATISTICS.STD_DEV_ROW_COUNT
     *
     * @param stdDevRowCount the value for QUERY_STATISTICS.STD_DEV_ROW_COUNT
     *
     * @mbg.generated
     */
    public void setStdDevRowCount(Double stdDevRowCount) {
        this.stdDevRowCount = stdDevRowCount;
    }
}