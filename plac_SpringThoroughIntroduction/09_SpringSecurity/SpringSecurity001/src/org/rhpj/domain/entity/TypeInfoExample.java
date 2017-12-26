package org.rhpj.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class TypeInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    public TypeInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
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
     * This method corresponds to the database table TYPE_INFO
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
     * This method corresponds to the database table TYPE_INFO
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TYPE_INFO
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
     * This class corresponds to the database table TYPE_INFO
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

        public Criteria andPrecisionIsNull() {
            addCriterion("PRECISION is null");
            return (Criteria) this;
        }

        public Criteria andPrecisionIsNotNull() {
            addCriterion("PRECISION is not null");
            return (Criteria) this;
        }

        public Criteria andPrecisionEqualTo(Integer value) {
            addCriterion("PRECISION =", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionNotEqualTo(Integer value) {
            addCriterion("PRECISION <>", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionGreaterThan(Integer value) {
            addCriterion("PRECISION >", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRECISION >=", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionLessThan(Integer value) {
            addCriterion("PRECISION <", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionLessThanOrEqualTo(Integer value) {
            addCriterion("PRECISION <=", value, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionIn(List<Integer> values) {
            addCriterion("PRECISION in", values, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionNotIn(List<Integer> values) {
            addCriterion("PRECISION not in", values, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionBetween(Integer value1, Integer value2) {
            addCriterion("PRECISION between", value1, value2, "precision");
            return (Criteria) this;
        }

        public Criteria andPrecisionNotBetween(Integer value1, Integer value2) {
            addCriterion("PRECISION not between", value1, value2, "precision");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNull() {
            addCriterion("PREFIX is null");
            return (Criteria) this;
        }

        public Criteria andPrefixIsNotNull() {
            addCriterion("PREFIX is not null");
            return (Criteria) this;
        }

        public Criteria andPrefixEqualTo(String value) {
            addCriterion("PREFIX =", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotEqualTo(String value) {
            addCriterion("PREFIX <>", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThan(String value) {
            addCriterion("PREFIX >", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixGreaterThanOrEqualTo(String value) {
            addCriterion("PREFIX >=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThan(String value) {
            addCriterion("PREFIX <", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLessThanOrEqualTo(String value) {
            addCriterion("PREFIX <=", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixLike(String value) {
            addCriterion("PREFIX like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotLike(String value) {
            addCriterion("PREFIX not like", value, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixIn(List<String> values) {
            addCriterion("PREFIX in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotIn(List<String> values) {
            addCriterion("PREFIX not in", values, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixBetween(String value1, String value2) {
            addCriterion("PREFIX between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andPrefixNotBetween(String value1, String value2) {
            addCriterion("PREFIX not between", value1, value2, "prefix");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNull() {
            addCriterion("SUFFIX is null");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNotNull() {
            addCriterion("SUFFIX is not null");
            return (Criteria) this;
        }

        public Criteria andSuffixEqualTo(String value) {
            addCriterion("SUFFIX =", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotEqualTo(String value) {
            addCriterion("SUFFIX <>", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThan(String value) {
            addCriterion("SUFFIX >", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("SUFFIX >=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThan(String value) {
            addCriterion("SUFFIX <", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThanOrEqualTo(String value) {
            addCriterion("SUFFIX <=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLike(String value) {
            addCriterion("SUFFIX like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotLike(String value) {
            addCriterion("SUFFIX not like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixIn(List<String> values) {
            addCriterion("SUFFIX in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotIn(List<String> values) {
            addCriterion("SUFFIX not in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixBetween(String value1, String value2) {
            addCriterion("SUFFIX between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotBetween(String value1, String value2) {
            addCriterion("SUFFIX not between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andParamsIsNull() {
            addCriterion("PARAMS is null");
            return (Criteria) this;
        }

        public Criteria andParamsIsNotNull() {
            addCriterion("PARAMS is not null");
            return (Criteria) this;
        }

        public Criteria andParamsEqualTo(String value) {
            addCriterion("PARAMS =", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotEqualTo(String value) {
            addCriterion("PARAMS <>", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThan(String value) {
            addCriterion("PARAMS >", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS >=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThan(String value) {
            addCriterion("PARAMS <", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLessThanOrEqualTo(String value) {
            addCriterion("PARAMS <=", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsLike(String value) {
            addCriterion("PARAMS like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotLike(String value) {
            addCriterion("PARAMS not like", value, "params");
            return (Criteria) this;
        }

        public Criteria andParamsIn(List<String> values) {
            addCriterion("PARAMS in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotIn(List<String> values) {
            addCriterion("PARAMS not in", values, "params");
            return (Criteria) this;
        }

        public Criteria andParamsBetween(String value1, String value2) {
            addCriterion("PARAMS between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andParamsNotBetween(String value1, String value2) {
            addCriterion("PARAMS not between", value1, value2, "params");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementIsNull() {
            addCriterion("AUTO_INCREMENT is null");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementIsNotNull() {
            addCriterion("AUTO_INCREMENT is not null");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementEqualTo(Boolean value) {
            addCriterion("AUTO_INCREMENT =", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNotEqualTo(Boolean value) {
            addCriterion("AUTO_INCREMENT <>", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementGreaterThan(Boolean value) {
            addCriterion("AUTO_INCREMENT >", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementGreaterThanOrEqualTo(Boolean value) {
            addCriterion("AUTO_INCREMENT >=", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementLessThan(Boolean value) {
            addCriterion("AUTO_INCREMENT <", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementLessThanOrEqualTo(Boolean value) {
            addCriterion("AUTO_INCREMENT <=", value, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementIn(List<Boolean> values) {
            addCriterion("AUTO_INCREMENT in", values, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNotIn(List<Boolean> values) {
            addCriterion("AUTO_INCREMENT not in", values, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementBetween(Boolean value1, Boolean value2) {
            addCriterion("AUTO_INCREMENT between", value1, value2, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andAutoIncrementNotBetween(Boolean value1, Boolean value2) {
            addCriterion("AUTO_INCREMENT not between", value1, value2, "autoIncrement");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleIsNull() {
            addCriterion("MINIMUM_SCALE is null");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleIsNotNull() {
            addCriterion("MINIMUM_SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleEqualTo(Short value) {
            addCriterion("MINIMUM_SCALE =", value, "minimumScale");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleNotEqualTo(Short value) {
            addCriterion("MINIMUM_SCALE <>", value, "minimumScale");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleGreaterThan(Short value) {
            addCriterion("MINIMUM_SCALE >", value, "minimumScale");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleGreaterThanOrEqualTo(Short value) {
            addCriterion("MINIMUM_SCALE >=", value, "minimumScale");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleLessThan(Short value) {
            addCriterion("MINIMUM_SCALE <", value, "minimumScale");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleLessThanOrEqualTo(Short value) {
            addCriterion("MINIMUM_SCALE <=", value, "minimumScale");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleIn(List<Short> values) {
            addCriterion("MINIMUM_SCALE in", values, "minimumScale");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleNotIn(List<Short> values) {
            addCriterion("MINIMUM_SCALE not in", values, "minimumScale");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleBetween(Short value1, Short value2) {
            addCriterion("MINIMUM_SCALE between", value1, value2, "minimumScale");
            return (Criteria) this;
        }

        public Criteria andMinimumScaleNotBetween(Short value1, Short value2) {
            addCriterion("MINIMUM_SCALE not between", value1, value2, "minimumScale");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleIsNull() {
            addCriterion("MAXIMUM_SCALE is null");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleIsNotNull() {
            addCriterion("MAXIMUM_SCALE is not null");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleEqualTo(Short value) {
            addCriterion("MAXIMUM_SCALE =", value, "maximumScale");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleNotEqualTo(Short value) {
            addCriterion("MAXIMUM_SCALE <>", value, "maximumScale");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleGreaterThan(Short value) {
            addCriterion("MAXIMUM_SCALE >", value, "maximumScale");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleGreaterThanOrEqualTo(Short value) {
            addCriterion("MAXIMUM_SCALE >=", value, "maximumScale");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleLessThan(Short value) {
            addCriterion("MAXIMUM_SCALE <", value, "maximumScale");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleLessThanOrEqualTo(Short value) {
            addCriterion("MAXIMUM_SCALE <=", value, "maximumScale");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleIn(List<Short> values) {
            addCriterion("MAXIMUM_SCALE in", values, "maximumScale");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleNotIn(List<Short> values) {
            addCriterion("MAXIMUM_SCALE not in", values, "maximumScale");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleBetween(Short value1, Short value2) {
            addCriterion("MAXIMUM_SCALE between", value1, value2, "maximumScale");
            return (Criteria) this;
        }

        public Criteria andMaximumScaleNotBetween(Short value1, Short value2) {
            addCriterion("MAXIMUM_SCALE not between", value1, value2, "maximumScale");
            return (Criteria) this;
        }

        public Criteria andRadixIsNull() {
            addCriterion("RADIX is null");
            return (Criteria) this;
        }

        public Criteria andRadixIsNotNull() {
            addCriterion("RADIX is not null");
            return (Criteria) this;
        }

        public Criteria andRadixEqualTo(Integer value) {
            addCriterion("RADIX =", value, "radix");
            return (Criteria) this;
        }

        public Criteria andRadixNotEqualTo(Integer value) {
            addCriterion("RADIX <>", value, "radix");
            return (Criteria) this;
        }

        public Criteria andRadixGreaterThan(Integer value) {
            addCriterion("RADIX >", value, "radix");
            return (Criteria) this;
        }

        public Criteria andRadixGreaterThanOrEqualTo(Integer value) {
            addCriterion("RADIX >=", value, "radix");
            return (Criteria) this;
        }

        public Criteria andRadixLessThan(Integer value) {
            addCriterion("RADIX <", value, "radix");
            return (Criteria) this;
        }

        public Criteria andRadixLessThanOrEqualTo(Integer value) {
            addCriterion("RADIX <=", value, "radix");
            return (Criteria) this;
        }

        public Criteria andRadixIn(List<Integer> values) {
            addCriterion("RADIX in", values, "radix");
            return (Criteria) this;
        }

        public Criteria andRadixNotIn(List<Integer> values) {
            addCriterion("RADIX not in", values, "radix");
            return (Criteria) this;
        }

        public Criteria andRadixBetween(Integer value1, Integer value2) {
            addCriterion("RADIX between", value1, value2, "radix");
            return (Criteria) this;
        }

        public Criteria andRadixNotBetween(Integer value1, Integer value2) {
            addCriterion("RADIX not between", value1, value2, "radix");
            return (Criteria) this;
        }

        public Criteria andPosIsNull() {
            addCriterion("POS is null");
            return (Criteria) this;
        }

        public Criteria andPosIsNotNull() {
            addCriterion("POS is not null");
            return (Criteria) this;
        }

        public Criteria andPosEqualTo(Integer value) {
            addCriterion("POS =", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotEqualTo(Integer value) {
            addCriterion("POS <>", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosGreaterThan(Integer value) {
            addCriterion("POS >", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosGreaterThanOrEqualTo(Integer value) {
            addCriterion("POS >=", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosLessThan(Integer value) {
            addCriterion("POS <", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosLessThanOrEqualTo(Integer value) {
            addCriterion("POS <=", value, "pos");
            return (Criteria) this;
        }

        public Criteria andPosIn(List<Integer> values) {
            addCriterion("POS in", values, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotIn(List<Integer> values) {
            addCriterion("POS not in", values, "pos");
            return (Criteria) this;
        }

        public Criteria andPosBetween(Integer value1, Integer value2) {
            addCriterion("POS between", value1, value2, "pos");
            return (Criteria) this;
        }

        public Criteria andPosNotBetween(Integer value1, Integer value2) {
            addCriterion("POS not between", value1, value2, "pos");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveIsNull() {
            addCriterion("CASE_SENSITIVE is null");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveIsNotNull() {
            addCriterion("CASE_SENSITIVE is not null");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveEqualTo(Boolean value) {
            addCriterion("CASE_SENSITIVE =", value, "caseSensitive");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveNotEqualTo(Boolean value) {
            addCriterion("CASE_SENSITIVE <>", value, "caseSensitive");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveGreaterThan(Boolean value) {
            addCriterion("CASE_SENSITIVE >", value, "caseSensitive");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CASE_SENSITIVE >=", value, "caseSensitive");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveLessThan(Boolean value) {
            addCriterion("CASE_SENSITIVE <", value, "caseSensitive");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveLessThanOrEqualTo(Boolean value) {
            addCriterion("CASE_SENSITIVE <=", value, "caseSensitive");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveIn(List<Boolean> values) {
            addCriterion("CASE_SENSITIVE in", values, "caseSensitive");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveNotIn(List<Boolean> values) {
            addCriterion("CASE_SENSITIVE not in", values, "caseSensitive");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveBetween(Boolean value1, Boolean value2) {
            addCriterion("CASE_SENSITIVE between", value1, value2, "caseSensitive");
            return (Criteria) this;
        }

        public Criteria andCaseSensitiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CASE_SENSITIVE not between", value1, value2, "caseSensitive");
            return (Criteria) this;
        }

        public Criteria andNullableIsNull() {
            addCriterion("NULLABLE is null");
            return (Criteria) this;
        }

        public Criteria andNullableIsNotNull() {
            addCriterion("NULLABLE is not null");
            return (Criteria) this;
        }

        public Criteria andNullableEqualTo(Short value) {
            addCriterion("NULLABLE =", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableNotEqualTo(Short value) {
            addCriterion("NULLABLE <>", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableGreaterThan(Short value) {
            addCriterion("NULLABLE >", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableGreaterThanOrEqualTo(Short value) {
            addCriterion("NULLABLE >=", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableLessThan(Short value) {
            addCriterion("NULLABLE <", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableLessThanOrEqualTo(Short value) {
            addCriterion("NULLABLE <=", value, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableIn(List<Short> values) {
            addCriterion("NULLABLE in", values, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableNotIn(List<Short> values) {
            addCriterion("NULLABLE not in", values, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableBetween(Short value1, Short value2) {
            addCriterion("NULLABLE between", value1, value2, "nullable");
            return (Criteria) this;
        }

        public Criteria andNullableNotBetween(Short value1, Short value2) {
            addCriterion("NULLABLE not between", value1, value2, "nullable");
            return (Criteria) this;
        }

        public Criteria andSearchableIsNull() {
            addCriterion("SEARCHABLE is null");
            return (Criteria) this;
        }

        public Criteria andSearchableIsNotNull() {
            addCriterion("SEARCHABLE is not null");
            return (Criteria) this;
        }

        public Criteria andSearchableEqualTo(Short value) {
            addCriterion("SEARCHABLE =", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableNotEqualTo(Short value) {
            addCriterion("SEARCHABLE <>", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableGreaterThan(Short value) {
            addCriterion("SEARCHABLE >", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableGreaterThanOrEqualTo(Short value) {
            addCriterion("SEARCHABLE >=", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableLessThan(Short value) {
            addCriterion("SEARCHABLE <", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableLessThanOrEqualTo(Short value) {
            addCriterion("SEARCHABLE <=", value, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableIn(List<Short> values) {
            addCriterion("SEARCHABLE in", values, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableNotIn(List<Short> values) {
            addCriterion("SEARCHABLE not in", values, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableBetween(Short value1, Short value2) {
            addCriterion("SEARCHABLE between", value1, value2, "searchable");
            return (Criteria) this;
        }

        public Criteria andSearchableNotBetween(Short value1, Short value2) {
            addCriterion("SEARCHABLE not between", value1, value2, "searchable");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TYPE_INFO
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
     * This class corresponds to the database table TYPE_INFO
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