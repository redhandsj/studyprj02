package org.rhpj.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    public EquipmentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
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
     * This method corresponds to the database table TEST.EQUIPMENT
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
     * This method corresponds to the database table TEST.EQUIPMENT
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEST.EQUIPMENT
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
     * This class corresponds to the database table TEST.EQUIPMENT
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

        public Criteria andEquipmentIdIsNull() {
            addCriterion("EQUIPMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("EQUIPMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(String value) {
            addCriterion("EQUIPMENT_ID =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(String value) {
            addCriterion("EQUIPMENT_ID <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(String value) {
            addCriterion("EQUIPMENT_ID >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_ID >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(String value) {
            addCriterion("EQUIPMENT_ID <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_ID <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLike(String value) {
            addCriterion("EQUIPMENT_ID like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotLike(String value) {
            addCriterion("EQUIPMENT_ID not like", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<String> values) {
            addCriterion("EQUIPMENT_ID in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<String> values) {
            addCriterion("EQUIPMENT_ID not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_ID between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_ID not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("ROOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("ROOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(String value) {
            addCriterion("ROOM_ID =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(String value) {
            addCriterion("ROOM_ID <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(String value) {
            addCriterion("ROOM_ID >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_ID >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(String value) {
            addCriterion("ROOM_ID <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(String value) {
            addCriterion("ROOM_ID <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLike(String value) {
            addCriterion("ROOM_ID like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotLike(String value) {
            addCriterion("ROOM_ID not like", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<String> values) {
            addCriterion("ROOM_ID in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<String> values) {
            addCriterion("ROOM_ID not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(String value1, String value2) {
            addCriterion("ROOM_ID between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(String value1, String value2) {
            addCriterion("ROOM_ID not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNull() {
            addCriterion("EQUIPMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIsNotNull() {
            addCriterion("EQUIPMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameEqualTo(String value) {
            addCriterion("EQUIPMENT_NAME =", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotEqualTo(String value) {
            addCriterion("EQUIPMENT_NAME <>", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThan(String value) {
            addCriterion("EQUIPMENT_NAME >", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_NAME >=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThan(String value) {
            addCriterion("EQUIPMENT_NAME <", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_NAME <=", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameLike(String value) {
            addCriterion("EQUIPMENT_NAME like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotLike(String value) {
            addCriterion("EQUIPMENT_NAME not like", value, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameIn(List<String> values) {
            addCriterion("EQUIPMENT_NAME in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotIn(List<String> values) {
            addCriterion("EQUIPMENT_NAME not in", values, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_NAME between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentNameNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_NAME not between", value1, value2, "equipmentName");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountIsNull() {
            addCriterion("EQUIPMENT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountIsNotNull() {
            addCriterion("EQUIPMENT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountEqualTo(Integer value) {
            addCriterion("EQUIPMENT_COUNT =", value, "equipmentCount");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountNotEqualTo(Integer value) {
            addCriterion("EQUIPMENT_COUNT <>", value, "equipmentCount");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountGreaterThan(Integer value) {
            addCriterion("EQUIPMENT_COUNT >", value, "equipmentCount");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("EQUIPMENT_COUNT >=", value, "equipmentCount");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountLessThan(Integer value) {
            addCriterion("EQUIPMENT_COUNT <", value, "equipmentCount");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountLessThanOrEqualTo(Integer value) {
            addCriterion("EQUIPMENT_COUNT <=", value, "equipmentCount");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountIn(List<Integer> values) {
            addCriterion("EQUIPMENT_COUNT in", values, "equipmentCount");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountNotIn(List<Integer> values) {
            addCriterion("EQUIPMENT_COUNT not in", values, "equipmentCount");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountBetween(Integer value1, Integer value2) {
            addCriterion("EQUIPMENT_COUNT between", value1, value2, "equipmentCount");
            return (Criteria) this;
        }

        public Criteria andEquipmentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("EQUIPMENT_COUNT not between", value1, value2, "equipmentCount");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksIsNull() {
            addCriterion("EQUIPMENT_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksIsNotNull() {
            addCriterion("EQUIPMENT_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksEqualTo(String value) {
            addCriterion("EQUIPMENT_REMARKS =", value, "equipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksNotEqualTo(String value) {
            addCriterion("EQUIPMENT_REMARKS <>", value, "equipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksGreaterThan(String value) {
            addCriterion("EQUIPMENT_REMARKS >", value, "equipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_REMARKS >=", value, "equipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksLessThan(String value) {
            addCriterion("EQUIPMENT_REMARKS <", value, "equipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksLessThanOrEqualTo(String value) {
            addCriterion("EQUIPMENT_REMARKS <=", value, "equipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksLike(String value) {
            addCriterion("EQUIPMENT_REMARKS like", value, "equipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksNotLike(String value) {
            addCriterion("EQUIPMENT_REMARKS not like", value, "equipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksIn(List<String> values) {
            addCriterion("EQUIPMENT_REMARKS in", values, "equipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksNotIn(List<String> values) {
            addCriterion("EQUIPMENT_REMARKS not in", values, "equipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_REMARKS between", value1, value2, "equipmentRemarks");
            return (Criteria) this;
        }

        public Criteria andEquipmentRemarksNotBetween(String value1, String value2) {
            addCriterion("EQUIPMENT_REMARKS not between", value1, value2, "equipmentRemarks");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TEST.EQUIPMENT
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
     * This class corresponds to the database table TEST.EQUIPMENT
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