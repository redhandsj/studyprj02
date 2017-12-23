package org.rhpj.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class FunctionAliasesExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FUNCTION_ALIASES
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FUNCTION_ALIASES
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table FUNCTION_ALIASES
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_ALIASES
     *
     * @mbg.generated
     */
    public FunctionAliasesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_ALIASES
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_ALIASES
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_ALIASES
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_ALIASES
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_ALIASES
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_ALIASES
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_ALIASES
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
     * This method corresponds to the database table FUNCTION_ALIASES
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
     * This method corresponds to the database table FUNCTION_ALIASES
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table FUNCTION_ALIASES
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
     * This class corresponds to the database table FUNCTION_ALIASES
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

        public Criteria andAliasCatalogIsNull() {
            addCriterion("ALIAS_CATALOG is null");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogIsNotNull() {
            addCriterion("ALIAS_CATALOG is not null");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogEqualTo(String value) {
            addCriterion("ALIAS_CATALOG =", value, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogNotEqualTo(String value) {
            addCriterion("ALIAS_CATALOG <>", value, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogGreaterThan(String value) {
            addCriterion("ALIAS_CATALOG >", value, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("ALIAS_CATALOG >=", value, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogLessThan(String value) {
            addCriterion("ALIAS_CATALOG <", value, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogLessThanOrEqualTo(String value) {
            addCriterion("ALIAS_CATALOG <=", value, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogLike(String value) {
            addCriterion("ALIAS_CATALOG like", value, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogNotLike(String value) {
            addCriterion("ALIAS_CATALOG not like", value, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogIn(List<String> values) {
            addCriterion("ALIAS_CATALOG in", values, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogNotIn(List<String> values) {
            addCriterion("ALIAS_CATALOG not in", values, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogBetween(String value1, String value2) {
            addCriterion("ALIAS_CATALOG between", value1, value2, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasCatalogNotBetween(String value1, String value2) {
            addCriterion("ALIAS_CATALOG not between", value1, value2, "aliasCatalog");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaIsNull() {
            addCriterion("ALIAS_SCHEMA is null");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaIsNotNull() {
            addCriterion("ALIAS_SCHEMA is not null");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaEqualTo(String value) {
            addCriterion("ALIAS_SCHEMA =", value, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaNotEqualTo(String value) {
            addCriterion("ALIAS_SCHEMA <>", value, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaGreaterThan(String value) {
            addCriterion("ALIAS_SCHEMA >", value, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaGreaterThanOrEqualTo(String value) {
            addCriterion("ALIAS_SCHEMA >=", value, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaLessThan(String value) {
            addCriterion("ALIAS_SCHEMA <", value, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaLessThanOrEqualTo(String value) {
            addCriterion("ALIAS_SCHEMA <=", value, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaLike(String value) {
            addCriterion("ALIAS_SCHEMA like", value, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaNotLike(String value) {
            addCriterion("ALIAS_SCHEMA not like", value, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaIn(List<String> values) {
            addCriterion("ALIAS_SCHEMA in", values, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaNotIn(List<String> values) {
            addCriterion("ALIAS_SCHEMA not in", values, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaBetween(String value1, String value2) {
            addCriterion("ALIAS_SCHEMA between", value1, value2, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasSchemaNotBetween(String value1, String value2) {
            addCriterion("ALIAS_SCHEMA not between", value1, value2, "aliasSchema");
            return (Criteria) this;
        }

        public Criteria andAliasNameIsNull() {
            addCriterion("ALIAS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAliasNameIsNotNull() {
            addCriterion("ALIAS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAliasNameEqualTo(String value) {
            addCriterion("ALIAS_NAME =", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotEqualTo(String value) {
            addCriterion("ALIAS_NAME <>", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameGreaterThan(String value) {
            addCriterion("ALIAS_NAME >", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameGreaterThanOrEqualTo(String value) {
            addCriterion("ALIAS_NAME >=", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameLessThan(String value) {
            addCriterion("ALIAS_NAME <", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameLessThanOrEqualTo(String value) {
            addCriterion("ALIAS_NAME <=", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameLike(String value) {
            addCriterion("ALIAS_NAME like", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotLike(String value) {
            addCriterion("ALIAS_NAME not like", value, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameIn(List<String> values) {
            addCriterion("ALIAS_NAME in", values, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotIn(List<String> values) {
            addCriterion("ALIAS_NAME not in", values, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameBetween(String value1, String value2) {
            addCriterion("ALIAS_NAME between", value1, value2, "aliasName");
            return (Criteria) this;
        }

        public Criteria andAliasNameNotBetween(String value1, String value2) {
            addCriterion("ALIAS_NAME not between", value1, value2, "aliasName");
            return (Criteria) this;
        }

        public Criteria andJavaClassIsNull() {
            addCriterion("JAVA_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andJavaClassIsNotNull() {
            addCriterion("JAVA_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andJavaClassEqualTo(String value) {
            addCriterion("JAVA_CLASS =", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassNotEqualTo(String value) {
            addCriterion("JAVA_CLASS <>", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassGreaterThan(String value) {
            addCriterion("JAVA_CLASS >", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassGreaterThanOrEqualTo(String value) {
            addCriterion("JAVA_CLASS >=", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassLessThan(String value) {
            addCriterion("JAVA_CLASS <", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassLessThanOrEqualTo(String value) {
            addCriterion("JAVA_CLASS <=", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassLike(String value) {
            addCriterion("JAVA_CLASS like", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassNotLike(String value) {
            addCriterion("JAVA_CLASS not like", value, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassIn(List<String> values) {
            addCriterion("JAVA_CLASS in", values, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassNotIn(List<String> values) {
            addCriterion("JAVA_CLASS not in", values, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassBetween(String value1, String value2) {
            addCriterion("JAVA_CLASS between", value1, value2, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaClassNotBetween(String value1, String value2) {
            addCriterion("JAVA_CLASS not between", value1, value2, "javaClass");
            return (Criteria) this;
        }

        public Criteria andJavaMethodIsNull() {
            addCriterion("JAVA_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andJavaMethodIsNotNull() {
            addCriterion("JAVA_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andJavaMethodEqualTo(String value) {
            addCriterion("JAVA_METHOD =", value, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andJavaMethodNotEqualTo(String value) {
            addCriterion("JAVA_METHOD <>", value, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andJavaMethodGreaterThan(String value) {
            addCriterion("JAVA_METHOD >", value, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andJavaMethodGreaterThanOrEqualTo(String value) {
            addCriterion("JAVA_METHOD >=", value, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andJavaMethodLessThan(String value) {
            addCriterion("JAVA_METHOD <", value, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andJavaMethodLessThanOrEqualTo(String value) {
            addCriterion("JAVA_METHOD <=", value, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andJavaMethodLike(String value) {
            addCriterion("JAVA_METHOD like", value, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andJavaMethodNotLike(String value) {
            addCriterion("JAVA_METHOD not like", value, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andJavaMethodIn(List<String> values) {
            addCriterion("JAVA_METHOD in", values, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andJavaMethodNotIn(List<String> values) {
            addCriterion("JAVA_METHOD not in", values, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andJavaMethodBetween(String value1, String value2) {
            addCriterion("JAVA_METHOD between", value1, value2, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andJavaMethodNotBetween(String value1, String value2) {
            addCriterion("JAVA_METHOD not between", value1, value2, "javaMethod");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(Integer value) {
            addCriterion("DATA_TYPE =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(Integer value) {
            addCriterion("DATA_TYPE <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(Integer value) {
            addCriterion("DATA_TYPE >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DATA_TYPE >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(Integer value) {
            addCriterion("DATA_TYPE <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(Integer value) {
            addCriterion("DATA_TYPE <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<Integer> values) {
            addCriterion("DATA_TYPE in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<Integer> values) {
            addCriterion("DATA_TYPE not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(Integer value1, Integer value2) {
            addCriterion("DATA_TYPE between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DATA_TYPE not between", value1, value2, "dataType");
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

        public Criteria andColumnCountIsNull() {
            addCriterion("COLUMN_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andColumnCountIsNotNull() {
            addCriterion("COLUMN_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andColumnCountEqualTo(Integer value) {
            addCriterion("COLUMN_COUNT =", value, "columnCount");
            return (Criteria) this;
        }

        public Criteria andColumnCountNotEqualTo(Integer value) {
            addCriterion("COLUMN_COUNT <>", value, "columnCount");
            return (Criteria) this;
        }

        public Criteria andColumnCountGreaterThan(Integer value) {
            addCriterion("COLUMN_COUNT >", value, "columnCount");
            return (Criteria) this;
        }

        public Criteria andColumnCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("COLUMN_COUNT >=", value, "columnCount");
            return (Criteria) this;
        }

        public Criteria andColumnCountLessThan(Integer value) {
            addCriterion("COLUMN_COUNT <", value, "columnCount");
            return (Criteria) this;
        }

        public Criteria andColumnCountLessThanOrEqualTo(Integer value) {
            addCriterion("COLUMN_COUNT <=", value, "columnCount");
            return (Criteria) this;
        }

        public Criteria andColumnCountIn(List<Integer> values) {
            addCriterion("COLUMN_COUNT in", values, "columnCount");
            return (Criteria) this;
        }

        public Criteria andColumnCountNotIn(List<Integer> values) {
            addCriterion("COLUMN_COUNT not in", values, "columnCount");
            return (Criteria) this;
        }

        public Criteria andColumnCountBetween(Integer value1, Integer value2) {
            addCriterion("COLUMN_COUNT between", value1, value2, "columnCount");
            return (Criteria) this;
        }

        public Criteria andColumnCountNotBetween(Integer value1, Integer value2) {
            addCriterion("COLUMN_COUNT not between", value1, value2, "columnCount");
            return (Criteria) this;
        }

        public Criteria andReturnsResultIsNull() {
            addCriterion("RETURNS_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andReturnsResultIsNotNull() {
            addCriterion("RETURNS_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andReturnsResultEqualTo(Short value) {
            addCriterion("RETURNS_RESULT =", value, "returnsResult");
            return (Criteria) this;
        }

        public Criteria andReturnsResultNotEqualTo(Short value) {
            addCriterion("RETURNS_RESULT <>", value, "returnsResult");
            return (Criteria) this;
        }

        public Criteria andReturnsResultGreaterThan(Short value) {
            addCriterion("RETURNS_RESULT >", value, "returnsResult");
            return (Criteria) this;
        }

        public Criteria andReturnsResultGreaterThanOrEqualTo(Short value) {
            addCriterion("RETURNS_RESULT >=", value, "returnsResult");
            return (Criteria) this;
        }

        public Criteria andReturnsResultLessThan(Short value) {
            addCriterion("RETURNS_RESULT <", value, "returnsResult");
            return (Criteria) this;
        }

        public Criteria andReturnsResultLessThanOrEqualTo(Short value) {
            addCriterion("RETURNS_RESULT <=", value, "returnsResult");
            return (Criteria) this;
        }

        public Criteria andReturnsResultIn(List<Short> values) {
            addCriterion("RETURNS_RESULT in", values, "returnsResult");
            return (Criteria) this;
        }

        public Criteria andReturnsResultNotIn(List<Short> values) {
            addCriterion("RETURNS_RESULT not in", values, "returnsResult");
            return (Criteria) this;
        }

        public Criteria andReturnsResultBetween(Short value1, Short value2) {
            addCriterion("RETURNS_RESULT between", value1, value2, "returnsResult");
            return (Criteria) this;
        }

        public Criteria andReturnsResultNotBetween(Short value1, Short value2) {
            addCriterion("RETURNS_RESULT not between", value1, value2, "returnsResult");
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

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table FUNCTION_ALIASES
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
     * This class corresponds to the database table FUNCTION_ALIASES
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