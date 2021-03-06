package org.rhpj.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class TablesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    public TablesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
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
     * This method corresponds to the database table TABLES
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
     * This method corresponds to the database table TABLES
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TABLES
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
     * This class corresponds to the database table TABLES
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

        public Criteria andTableCatalogIsNull() {
            addCriterion("TABLE_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIsNotNull() {
            addCriterion("TABLE_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andTableCatalogEqualTo(String value) {
            addCriterion("TABLE_CATALOG =", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotEqualTo(String value) {
            addCriterion("TABLE_CATALOG <>", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogGreaterThan(String value) {
            addCriterion("TABLE_CATALOG >", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_CATALOG >=", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLessThan(String value) {
            addCriterion("TABLE_CATALOG <", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLessThanOrEqualTo(String value) {
            addCriterion("TABLE_CATALOG <=", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogLike(String value) {
            addCriterion("TABLE_CATALOG like", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotLike(String value) {
            addCriterion("TABLE_CATALOG not like", value, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogIn(List<String> values) {
            addCriterion("TABLE_CATALOG in", values, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotIn(List<String> values) {
            addCriterion("TABLE_CATALOG not in", values, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogBetween(String value1, String value2) {
            addCriterion("TABLE_CATALOG between", value1, value2, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableCatalogNotBetween(String value1, String value2) {
            addCriterion("TABLE_CATALOG not between", value1, value2, "tableCatalog");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNull() {
            addCriterion("TABLE_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIsNotNull() {
            addCriterion("TABLE_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andTableSchemaEqualTo(String value) {
            addCriterion("TABLE_SCHEMA =", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <>", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThan(String value) {
            addCriterion("TABLE_SCHEMA >", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA >=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThan(String value) {
            addCriterion("TABLE_SCHEMA <", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLessThanOrEqualTo(String value) {
            addCriterion("TABLE_SCHEMA <=", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaLike(String value) {
            addCriterion("TABLE_SCHEMA like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotLike(String value) {
            addCriterion("TABLE_SCHEMA not like", value, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaIn(List<String> values) {
            addCriterion("TABLE_SCHEMA in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotIn(List<String> values) {
            addCriterion("TABLE_SCHEMA not in", values, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaBetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableSchemaNotBetween(String value1, String value2) {
            addCriterion("TABLE_SCHEMA not between", value1, value2, "tableSchema");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("TABLE_NAME <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("TABLE_NAME like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNull() {
            addCriterion("TABLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTableTypeIsNotNull() {
            addCriterion("TABLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTableTypeEqualTo(String value) {
            addCriterion("TABLE_TYPE =", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotEqualTo(String value) {
            addCriterion("TABLE_TYPE <>", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThan(String value) {
            addCriterion("TABLE_TYPE >", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_TYPE >=", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThan(String value) {
            addCriterion("TABLE_TYPE <", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLessThanOrEqualTo(String value) {
            addCriterion("TABLE_TYPE <=", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeLike(String value) {
            addCriterion("TABLE_TYPE like", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotLike(String value) {
            addCriterion("TABLE_TYPE not like", value, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeIn(List<String> values) {
            addCriterion("TABLE_TYPE in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotIn(List<String> values) {
            addCriterion("TABLE_TYPE not in", values, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeBetween(String value1, String value2) {
            addCriterion("TABLE_TYPE between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andTableTypeNotBetween(String value1, String value2) {
            addCriterion("TABLE_TYPE not between", value1, value2, "tableType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNull() {
            addCriterion("STORAGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNotNull() {
            addCriterion("STORAGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeEqualTo(String value) {
            addCriterion("STORAGE_TYPE =", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotEqualTo(String value) {
            addCriterion("STORAGE_TYPE <>", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThan(String value) {
            addCriterion("STORAGE_TYPE >", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("STORAGE_TYPE >=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThan(String value) {
            addCriterion("STORAGE_TYPE <", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThanOrEqualTo(String value) {
            addCriterion("STORAGE_TYPE <=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLike(String value) {
            addCriterion("STORAGE_TYPE like", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotLike(String value) {
            addCriterion("STORAGE_TYPE not like", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIn(List<String> values) {
            addCriterion("STORAGE_TYPE in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotIn(List<String> values) {
            addCriterion("STORAGE_TYPE not in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeBetween(String value1, String value2) {
            addCriterion("STORAGE_TYPE between", value1, value2, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotBetween(String value1, String value2) {
            addCriterion("STORAGE_TYPE not between", value1, value2, "storageType");
            return (Criteria) this;
        }

        public Criteria andSqlIsNull() {
            addCriterion("SQL is null");
            return (Criteria) this;
        }

        public Criteria andSqlIsNotNull() {
            addCriterion("SQL is not null");
            return (Criteria) this;
        }

        public Criteria andSqlEqualTo(String value) {
            addCriterion("SQL =", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotEqualTo(String value) {
            addCriterion("SQL <>", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlGreaterThan(String value) {
            addCriterion("SQL >", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlGreaterThanOrEqualTo(String value) {
            addCriterion("SQL >=", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlLessThan(String value) {
            addCriterion("SQL <", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlLessThanOrEqualTo(String value) {
            addCriterion("SQL <=", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlLike(String value) {
            addCriterion("SQL like", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotLike(String value) {
            addCriterion("SQL not like", value, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlIn(List<String> values) {
            addCriterion("SQL in", values, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotIn(List<String> values) {
            addCriterion("SQL not in", values, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlBetween(String value1, String value2) {
            addCriterion("SQL between", value1, value2, "sql");
            return (Criteria) this;
        }

        public Criteria andSqlNotBetween(String value1, String value2) {
            addCriterion("SQL not between", value1, value2, "sql");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andLastModificationIsNull() {
            addCriterion("LAST_MODIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andLastModificationIsNotNull() {
            addCriterion("LAST_MODIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andLastModificationEqualTo(Long value) {
            addCriterion("LAST_MODIFICATION =", value, "lastModification");
            return (Criteria) this;
        }

        public Criteria andLastModificationNotEqualTo(Long value) {
            addCriterion("LAST_MODIFICATION <>", value, "lastModification");
            return (Criteria) this;
        }

        public Criteria andLastModificationGreaterThan(Long value) {
            addCriterion("LAST_MODIFICATION >", value, "lastModification");
            return (Criteria) this;
        }

        public Criteria andLastModificationGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_MODIFICATION >=", value, "lastModification");
            return (Criteria) this;
        }

        public Criteria andLastModificationLessThan(Long value) {
            addCriterion("LAST_MODIFICATION <", value, "lastModification");
            return (Criteria) this;
        }

        public Criteria andLastModificationLessThanOrEqualTo(Long value) {
            addCriterion("LAST_MODIFICATION <=", value, "lastModification");
            return (Criteria) this;
        }

        public Criteria andLastModificationIn(List<Long> values) {
            addCriterion("LAST_MODIFICATION in", values, "lastModification");
            return (Criteria) this;
        }

        public Criteria andLastModificationNotIn(List<Long> values) {
            addCriterion("LAST_MODIFICATION not in", values, "lastModification");
            return (Criteria) this;
        }

        public Criteria andLastModificationBetween(Long value1, Long value2) {
            addCriterion("LAST_MODIFICATION between", value1, value2, "lastModification");
            return (Criteria) this;
        }

        public Criteria andLastModificationNotBetween(Long value1, Long value2) {
            addCriterion("LAST_MODIFICATION not between", value1, value2, "lastModification");
            return (Criteria) this;
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("TYPE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("TYPE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("TYPE_NAME =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("TYPE_NAME <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("TYPE_NAME >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("TYPE_NAME <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("TYPE_NAME <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("TYPE_NAME like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("TYPE_NAME not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("TYPE_NAME in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("TYPE_NAME not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("TYPE_NAME between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("TYPE_NAME not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTableClassIsNull() {
            addCriterion("TABLE_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andTableClassIsNotNull() {
            addCriterion("TABLE_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andTableClassEqualTo(String value) {
            addCriterion("TABLE_CLASS =", value, "tableClass");
            return (Criteria) this;
        }

        public Criteria andTableClassNotEqualTo(String value) {
            addCriterion("TABLE_CLASS <>", value, "tableClass");
            return (Criteria) this;
        }

        public Criteria andTableClassGreaterThan(String value) {
            addCriterion("TABLE_CLASS >", value, "tableClass");
            return (Criteria) this;
        }

        public Criteria andTableClassGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_CLASS >=", value, "tableClass");
            return (Criteria) this;
        }

        public Criteria andTableClassLessThan(String value) {
            addCriterion("TABLE_CLASS <", value, "tableClass");
            return (Criteria) this;
        }

        public Criteria andTableClassLessThanOrEqualTo(String value) {
            addCriterion("TABLE_CLASS <=", value, "tableClass");
            return (Criteria) this;
        }

        public Criteria andTableClassLike(String value) {
            addCriterion("TABLE_CLASS like", value, "tableClass");
            return (Criteria) this;
        }

        public Criteria andTableClassNotLike(String value) {
            addCriterion("TABLE_CLASS not like", value, "tableClass");
            return (Criteria) this;
        }

        public Criteria andTableClassIn(List<String> values) {
            addCriterion("TABLE_CLASS in", values, "tableClass");
            return (Criteria) this;
        }

        public Criteria andTableClassNotIn(List<String> values) {
            addCriterion("TABLE_CLASS not in", values, "tableClass");
            return (Criteria) this;
        }

        public Criteria andTableClassBetween(String value1, String value2) {
            addCriterion("TABLE_CLASS between", value1, value2, "tableClass");
            return (Criteria) this;
        }

        public Criteria andTableClassNotBetween(String value1, String value2) {
            addCriterion("TABLE_CLASS not between", value1, value2, "tableClass");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateIsNull() {
            addCriterion("ROW_COUNT_ESTIMATE is null");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateIsNotNull() {
            addCriterion("ROW_COUNT_ESTIMATE is not null");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateEqualTo(Long value) {
            addCriterion("ROW_COUNT_ESTIMATE =", value, "rowCountEstimate");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateNotEqualTo(Long value) {
            addCriterion("ROW_COUNT_ESTIMATE <>", value, "rowCountEstimate");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateGreaterThan(Long value) {
            addCriterion("ROW_COUNT_ESTIMATE >", value, "rowCountEstimate");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateGreaterThanOrEqualTo(Long value) {
            addCriterion("ROW_COUNT_ESTIMATE >=", value, "rowCountEstimate");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateLessThan(Long value) {
            addCriterion("ROW_COUNT_ESTIMATE <", value, "rowCountEstimate");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateLessThanOrEqualTo(Long value) {
            addCriterion("ROW_COUNT_ESTIMATE <=", value, "rowCountEstimate");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateIn(List<Long> values) {
            addCriterion("ROW_COUNT_ESTIMATE in", values, "rowCountEstimate");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateNotIn(List<Long> values) {
            addCriterion("ROW_COUNT_ESTIMATE not in", values, "rowCountEstimate");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateBetween(Long value1, Long value2) {
            addCriterion("ROW_COUNT_ESTIMATE between", value1, value2, "rowCountEstimate");
            return (Criteria) this;
        }

        public Criteria andRowCountEstimateNotBetween(Long value1, Long value2) {
            addCriterion("ROW_COUNT_ESTIMATE not between", value1, value2, "rowCountEstimate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TABLES
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
     * This class corresponds to the database table TABLES
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