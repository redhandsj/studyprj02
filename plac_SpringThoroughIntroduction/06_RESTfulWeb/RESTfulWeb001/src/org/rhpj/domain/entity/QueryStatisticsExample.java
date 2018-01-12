package org.rhpj.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class QueryStatisticsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    public QueryStatisticsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSqlStatementIsNull() {
            addCriterion("SQL_STATEMENT is null");
            return (Criteria) this;
        }

        public Criteria andSqlStatementIsNotNull() {
            addCriterion("SQL_STATEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andSqlStatementEqualTo(String value) {
            addCriterion("SQL_STATEMENT =", value, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andSqlStatementNotEqualTo(String value) {
            addCriterion("SQL_STATEMENT <>", value, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andSqlStatementGreaterThan(String value) {
            addCriterion("SQL_STATEMENT >", value, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andSqlStatementGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_STATEMENT >=", value, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andSqlStatementLessThan(String value) {
            addCriterion("SQL_STATEMENT <", value, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andSqlStatementLessThanOrEqualTo(String value) {
            addCriterion("SQL_STATEMENT <=", value, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andSqlStatementLike(String value) {
            addCriterion("SQL_STATEMENT like", value, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andSqlStatementNotLike(String value) {
            addCriterion("SQL_STATEMENT not like", value, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andSqlStatementIn(List<String> values) {
            addCriterion("SQL_STATEMENT in", values, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andSqlStatementNotIn(List<String> values) {
            addCriterion("SQL_STATEMENT not in", values, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andSqlStatementBetween(String value1, String value2) {
            addCriterion("SQL_STATEMENT between", value1, value2, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andSqlStatementNotBetween(String value1, String value2) {
            addCriterion("SQL_STATEMENT not between", value1, value2, "sqlStatement");
            return (Criteria) this;
        }

        public Criteria andExecutionCountIsNull() {
            addCriterion("EXECUTION_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andExecutionCountIsNotNull() {
            addCriterion("EXECUTION_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionCountEqualTo(Integer value) {
            addCriterion("EXECUTION_COUNT =", value, "executionCount");
            return (Criteria) this;
        }

        public Criteria andExecutionCountNotEqualTo(Integer value) {
            addCriterion("EXECUTION_COUNT <>", value, "executionCount");
            return (Criteria) this;
        }

        public Criteria andExecutionCountGreaterThan(Integer value) {
            addCriterion("EXECUTION_COUNT >", value, "executionCount");
            return (Criteria) this;
        }

        public Criteria andExecutionCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("EXECUTION_COUNT >=", value, "executionCount");
            return (Criteria) this;
        }

        public Criteria andExecutionCountLessThan(Integer value) {
            addCriterion("EXECUTION_COUNT <", value, "executionCount");
            return (Criteria) this;
        }

        public Criteria andExecutionCountLessThanOrEqualTo(Integer value) {
            addCriterion("EXECUTION_COUNT <=", value, "executionCount");
            return (Criteria) this;
        }

        public Criteria andExecutionCountIn(List<Integer> values) {
            addCriterion("EXECUTION_COUNT in", values, "executionCount");
            return (Criteria) this;
        }

        public Criteria andExecutionCountNotIn(List<Integer> values) {
            addCriterion("EXECUTION_COUNT not in", values, "executionCount");
            return (Criteria) this;
        }

        public Criteria andExecutionCountBetween(Integer value1, Integer value2) {
            addCriterion("EXECUTION_COUNT between", value1, value2, "executionCount");
            return (Criteria) this;
        }

        public Criteria andExecutionCountNotBetween(Integer value1, Integer value2) {
            addCriterion("EXECUTION_COUNT not between", value1, value2, "executionCount");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeIsNull() {
            addCriterion("MIN_EXECUTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeIsNotNull() {
            addCriterion("MIN_EXECUTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeEqualTo(Double value) {
            addCriterion("MIN_EXECUTION_TIME =", value, "minExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeNotEqualTo(Double value) {
            addCriterion("MIN_EXECUTION_TIME <>", value, "minExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeGreaterThan(Double value) {
            addCriterion("MIN_EXECUTION_TIME >", value, "minExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("MIN_EXECUTION_TIME >=", value, "minExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeLessThan(Double value) {
            addCriterion("MIN_EXECUTION_TIME <", value, "minExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeLessThanOrEqualTo(Double value) {
            addCriterion("MIN_EXECUTION_TIME <=", value, "minExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeIn(List<Double> values) {
            addCriterion("MIN_EXECUTION_TIME in", values, "minExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeNotIn(List<Double> values) {
            addCriterion("MIN_EXECUTION_TIME not in", values, "minExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeBetween(Double value1, Double value2) {
            addCriterion("MIN_EXECUTION_TIME between", value1, value2, "minExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMinExecutionTimeNotBetween(Double value1, Double value2) {
            addCriterion("MIN_EXECUTION_TIME not between", value1, value2, "minExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeIsNull() {
            addCriterion("MAX_EXECUTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeIsNotNull() {
            addCriterion("MAX_EXECUTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeEqualTo(Double value) {
            addCriterion("MAX_EXECUTION_TIME =", value, "maxExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeNotEqualTo(Double value) {
            addCriterion("MAX_EXECUTION_TIME <>", value, "maxExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeGreaterThan(Double value) {
            addCriterion("MAX_EXECUTION_TIME >", value, "maxExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("MAX_EXECUTION_TIME >=", value, "maxExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeLessThan(Double value) {
            addCriterion("MAX_EXECUTION_TIME <", value, "maxExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeLessThanOrEqualTo(Double value) {
            addCriterion("MAX_EXECUTION_TIME <=", value, "maxExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeIn(List<Double> values) {
            addCriterion("MAX_EXECUTION_TIME in", values, "maxExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeNotIn(List<Double> values) {
            addCriterion("MAX_EXECUTION_TIME not in", values, "maxExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeBetween(Double value1, Double value2) {
            addCriterion("MAX_EXECUTION_TIME between", value1, value2, "maxExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMaxExecutionTimeNotBetween(Double value1, Double value2) {
            addCriterion("MAX_EXECUTION_TIME not between", value1, value2, "maxExecutionTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeIsNull() {
            addCriterion("CUMULATIVE_EXECUTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeIsNotNull() {
            addCriterion("CUMULATIVE_EXECUTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeEqualTo(Double value) {
            addCriterion("CUMULATIVE_EXECUTION_TIME =", value, "cumulativeExecutionTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeNotEqualTo(Double value) {
            addCriterion("CUMULATIVE_EXECUTION_TIME <>", value, "cumulativeExecutionTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeGreaterThan(Double value) {
            addCriterion("CUMULATIVE_EXECUTION_TIME >", value, "cumulativeExecutionTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("CUMULATIVE_EXECUTION_TIME >=", value, "cumulativeExecutionTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeLessThan(Double value) {
            addCriterion("CUMULATIVE_EXECUTION_TIME <", value, "cumulativeExecutionTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeLessThanOrEqualTo(Double value) {
            addCriterion("CUMULATIVE_EXECUTION_TIME <=", value, "cumulativeExecutionTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeIn(List<Double> values) {
            addCriterion("CUMULATIVE_EXECUTION_TIME in", values, "cumulativeExecutionTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeNotIn(List<Double> values) {
            addCriterion("CUMULATIVE_EXECUTION_TIME not in", values, "cumulativeExecutionTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeBetween(Double value1, Double value2) {
            addCriterion("CUMULATIVE_EXECUTION_TIME between", value1, value2, "cumulativeExecutionTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeExecutionTimeNotBetween(Double value1, Double value2) {
            addCriterion("CUMULATIVE_EXECUTION_TIME not between", value1, value2, "cumulativeExecutionTime");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeIsNull() {
            addCriterion("AVERAGE_EXECUTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeIsNotNull() {
            addCriterion("AVERAGE_EXECUTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeEqualTo(Double value) {
            addCriterion("AVERAGE_EXECUTION_TIME =", value, "averageExecutionTime");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeNotEqualTo(Double value) {
            addCriterion("AVERAGE_EXECUTION_TIME <>", value, "averageExecutionTime");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeGreaterThan(Double value) {
            addCriterion("AVERAGE_EXECUTION_TIME >", value, "averageExecutionTime");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("AVERAGE_EXECUTION_TIME >=", value, "averageExecutionTime");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeLessThan(Double value) {
            addCriterion("AVERAGE_EXECUTION_TIME <", value, "averageExecutionTime");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeLessThanOrEqualTo(Double value) {
            addCriterion("AVERAGE_EXECUTION_TIME <=", value, "averageExecutionTime");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeIn(List<Double> values) {
            addCriterion("AVERAGE_EXECUTION_TIME in", values, "averageExecutionTime");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeNotIn(List<Double> values) {
            addCriterion("AVERAGE_EXECUTION_TIME not in", values, "averageExecutionTime");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeBetween(Double value1, Double value2) {
            addCriterion("AVERAGE_EXECUTION_TIME between", value1, value2, "averageExecutionTime");
            return (Criteria) this;
        }

        public Criteria andAverageExecutionTimeNotBetween(Double value1, Double value2) {
            addCriterion("AVERAGE_EXECUTION_TIME not between", value1, value2, "averageExecutionTime");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeIsNull() {
            addCriterion("STD_DEV_EXECUTION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeIsNotNull() {
            addCriterion("STD_DEV_EXECUTION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeEqualTo(Double value) {
            addCriterion("STD_DEV_EXECUTION_TIME =", value, "stdDevExecutionTime");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeNotEqualTo(Double value) {
            addCriterion("STD_DEV_EXECUTION_TIME <>", value, "stdDevExecutionTime");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeGreaterThan(Double value) {
            addCriterion("STD_DEV_EXECUTION_TIME >", value, "stdDevExecutionTime");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeGreaterThanOrEqualTo(Double value) {
            addCriterion("STD_DEV_EXECUTION_TIME >=", value, "stdDevExecutionTime");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeLessThan(Double value) {
            addCriterion("STD_DEV_EXECUTION_TIME <", value, "stdDevExecutionTime");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeLessThanOrEqualTo(Double value) {
            addCriterion("STD_DEV_EXECUTION_TIME <=", value, "stdDevExecutionTime");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeIn(List<Double> values) {
            addCriterion("STD_DEV_EXECUTION_TIME in", values, "stdDevExecutionTime");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeNotIn(List<Double> values) {
            addCriterion("STD_DEV_EXECUTION_TIME not in", values, "stdDevExecutionTime");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeBetween(Double value1, Double value2) {
            addCriterion("STD_DEV_EXECUTION_TIME between", value1, value2, "stdDevExecutionTime");
            return (Criteria) this;
        }

        public Criteria andStdDevExecutionTimeNotBetween(Double value1, Double value2) {
            addCriterion("STD_DEV_EXECUTION_TIME not between", value1, value2, "stdDevExecutionTime");
            return (Criteria) this;
        }

        public Criteria andMinRowCountIsNull() {
            addCriterion("MIN_ROW_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andMinRowCountIsNotNull() {
            addCriterion("MIN_ROW_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMinRowCountEqualTo(Integer value) {
            addCriterion("MIN_ROW_COUNT =", value, "minRowCount");
            return (Criteria) this;
        }

        public Criteria andMinRowCountNotEqualTo(Integer value) {
            addCriterion("MIN_ROW_COUNT <>", value, "minRowCount");
            return (Criteria) this;
        }

        public Criteria andMinRowCountGreaterThan(Integer value) {
            addCriterion("MIN_ROW_COUNT >", value, "minRowCount");
            return (Criteria) this;
        }

        public Criteria andMinRowCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MIN_ROW_COUNT >=", value, "minRowCount");
            return (Criteria) this;
        }

        public Criteria andMinRowCountLessThan(Integer value) {
            addCriterion("MIN_ROW_COUNT <", value, "minRowCount");
            return (Criteria) this;
        }

        public Criteria andMinRowCountLessThanOrEqualTo(Integer value) {
            addCriterion("MIN_ROW_COUNT <=", value, "minRowCount");
            return (Criteria) this;
        }

        public Criteria andMinRowCountIn(List<Integer> values) {
            addCriterion("MIN_ROW_COUNT in", values, "minRowCount");
            return (Criteria) this;
        }

        public Criteria andMinRowCountNotIn(List<Integer> values) {
            addCriterion("MIN_ROW_COUNT not in", values, "minRowCount");
            return (Criteria) this;
        }

        public Criteria andMinRowCountBetween(Integer value1, Integer value2) {
            addCriterion("MIN_ROW_COUNT between", value1, value2, "minRowCount");
            return (Criteria) this;
        }

        public Criteria andMinRowCountNotBetween(Integer value1, Integer value2) {
            addCriterion("MIN_ROW_COUNT not between", value1, value2, "minRowCount");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountIsNull() {
            addCriterion("MAX_ROW_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountIsNotNull() {
            addCriterion("MAX_ROW_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountEqualTo(Integer value) {
            addCriterion("MAX_ROW_COUNT =", value, "maxRowCount");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountNotEqualTo(Integer value) {
            addCriterion("MAX_ROW_COUNT <>", value, "maxRowCount");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountGreaterThan(Integer value) {
            addCriterion("MAX_ROW_COUNT >", value, "maxRowCount");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_ROW_COUNT >=", value, "maxRowCount");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountLessThan(Integer value) {
            addCriterion("MAX_ROW_COUNT <", value, "maxRowCount");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_ROW_COUNT <=", value, "maxRowCount");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountIn(List<Integer> values) {
            addCriterion("MAX_ROW_COUNT in", values, "maxRowCount");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountNotIn(List<Integer> values) {
            addCriterion("MAX_ROW_COUNT not in", values, "maxRowCount");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountBetween(Integer value1, Integer value2) {
            addCriterion("MAX_ROW_COUNT between", value1, value2, "maxRowCount");
            return (Criteria) this;
        }

        public Criteria andMaxRowCountNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_ROW_COUNT not between", value1, value2, "maxRowCount");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountIsNull() {
            addCriterion("CUMULATIVE_ROW_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountIsNotNull() {
            addCriterion("CUMULATIVE_ROW_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountEqualTo(Long value) {
            addCriterion("CUMULATIVE_ROW_COUNT =", value, "cumulativeRowCount");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountNotEqualTo(Long value) {
            addCriterion("CUMULATIVE_ROW_COUNT <>", value, "cumulativeRowCount");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountGreaterThan(Long value) {
            addCriterion("CUMULATIVE_ROW_COUNT >", value, "cumulativeRowCount");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountGreaterThanOrEqualTo(Long value) {
            addCriterion("CUMULATIVE_ROW_COUNT >=", value, "cumulativeRowCount");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountLessThan(Long value) {
            addCriterion("CUMULATIVE_ROW_COUNT <", value, "cumulativeRowCount");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountLessThanOrEqualTo(Long value) {
            addCriterion("CUMULATIVE_ROW_COUNT <=", value, "cumulativeRowCount");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountIn(List<Long> values) {
            addCriterion("CUMULATIVE_ROW_COUNT in", values, "cumulativeRowCount");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountNotIn(List<Long> values) {
            addCriterion("CUMULATIVE_ROW_COUNT not in", values, "cumulativeRowCount");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountBetween(Long value1, Long value2) {
            addCriterion("CUMULATIVE_ROW_COUNT between", value1, value2, "cumulativeRowCount");
            return (Criteria) this;
        }

        public Criteria andCumulativeRowCountNotBetween(Long value1, Long value2) {
            addCriterion("CUMULATIVE_ROW_COUNT not between", value1, value2, "cumulativeRowCount");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountIsNull() {
            addCriterion("AVERAGE_ROW_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountIsNotNull() {
            addCriterion("AVERAGE_ROW_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountEqualTo(Double value) {
            addCriterion("AVERAGE_ROW_COUNT =", value, "averageRowCount");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountNotEqualTo(Double value) {
            addCriterion("AVERAGE_ROW_COUNT <>", value, "averageRowCount");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountGreaterThan(Double value) {
            addCriterion("AVERAGE_ROW_COUNT >", value, "averageRowCount");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountGreaterThanOrEqualTo(Double value) {
            addCriterion("AVERAGE_ROW_COUNT >=", value, "averageRowCount");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountLessThan(Double value) {
            addCriterion("AVERAGE_ROW_COUNT <", value, "averageRowCount");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountLessThanOrEqualTo(Double value) {
            addCriterion("AVERAGE_ROW_COUNT <=", value, "averageRowCount");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountIn(List<Double> values) {
            addCriterion("AVERAGE_ROW_COUNT in", values, "averageRowCount");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountNotIn(List<Double> values) {
            addCriterion("AVERAGE_ROW_COUNT not in", values, "averageRowCount");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountBetween(Double value1, Double value2) {
            addCriterion("AVERAGE_ROW_COUNT between", value1, value2, "averageRowCount");
            return (Criteria) this;
        }

        public Criteria andAverageRowCountNotBetween(Double value1, Double value2) {
            addCriterion("AVERAGE_ROW_COUNT not between", value1, value2, "averageRowCount");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountIsNull() {
            addCriterion("STD_DEV_ROW_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountIsNotNull() {
            addCriterion("STD_DEV_ROW_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountEqualTo(Double value) {
            addCriterion("STD_DEV_ROW_COUNT =", value, "stdDevRowCount");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountNotEqualTo(Double value) {
            addCriterion("STD_DEV_ROW_COUNT <>", value, "stdDevRowCount");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountGreaterThan(Double value) {
            addCriterion("STD_DEV_ROW_COUNT >", value, "stdDevRowCount");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountGreaterThanOrEqualTo(Double value) {
            addCriterion("STD_DEV_ROW_COUNT >=", value, "stdDevRowCount");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountLessThan(Double value) {
            addCriterion("STD_DEV_ROW_COUNT <", value, "stdDevRowCount");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountLessThanOrEqualTo(Double value) {
            addCriterion("STD_DEV_ROW_COUNT <=", value, "stdDevRowCount");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountIn(List<Double> values) {
            addCriterion("STD_DEV_ROW_COUNT in", values, "stdDevRowCount");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountNotIn(List<Double> values) {
            addCriterion("STD_DEV_ROW_COUNT not in", values, "stdDevRowCount");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountBetween(Double value1, Double value2) {
            addCriterion("STD_DEV_ROW_COUNT between", value1, value2, "stdDevRowCount");
            return (Criteria) this;
        }

        public Criteria andStdDevRowCountNotBetween(Double value1, Double value2) {
            addCriterion("STD_DEV_ROW_COUNT not between", value1, value2, "stdDevRowCount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table QUERY_STATISTICS
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}