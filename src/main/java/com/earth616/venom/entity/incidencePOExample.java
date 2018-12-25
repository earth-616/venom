package com.earth616.venom.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class incidencePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public incidencePOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andStoreIdIsNull() {
            addCriterion("STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(String value) {
            addCriterion("STORE_ID =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(String value) {
            addCriterion("STORE_ID <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(String value) {
            addCriterion("STORE_ID >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("STORE_ID >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(String value) {
            addCriterion("STORE_ID <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(String value) {
            addCriterion("STORE_ID <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLike(String value) {
            addCriterion("STORE_ID like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotLike(String value) {
            addCriterion("STORE_ID not like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<String> values) {
            addCriterion("STORE_ID in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<String> values) {
            addCriterion("STORE_ID not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(String value1, String value2) {
            addCriterion("STORE_ID between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(String value1, String value2) {
            addCriterion("STORE_ID not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrIsNull() {
            addCriterion("WAN_IP_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrIsNotNull() {
            addCriterion("WAN_IP_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrEqualTo(String value) {
            addCriterion("WAN_IP_ADDR =", value, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrNotEqualTo(String value) {
            addCriterion("WAN_IP_ADDR <>", value, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrGreaterThan(String value) {
            addCriterion("WAN_IP_ADDR >", value, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrGreaterThanOrEqualTo(String value) {
            addCriterion("WAN_IP_ADDR >=", value, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrLessThan(String value) {
            addCriterion("WAN_IP_ADDR <", value, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrLessThanOrEqualTo(String value) {
            addCriterion("WAN_IP_ADDR <=", value, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrLike(String value) {
            addCriterion("WAN_IP_ADDR like", value, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrNotLike(String value) {
            addCriterion("WAN_IP_ADDR not like", value, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrIn(List<String> values) {
            addCriterion("WAN_IP_ADDR in", values, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrNotIn(List<String> values) {
            addCriterion("WAN_IP_ADDR not in", values, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrBetween(String value1, String value2) {
            addCriterion("WAN_IP_ADDR between", value1, value2, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanIpAddrNotBetween(String value1, String value2) {
            addCriterion("WAN_IP_ADDR not between", value1, value2, "wanIpAddr");
            return (Criteria) this;
        }

        public Criteria andWanPortIsNull() {
            addCriterion("WAN_PORT is null");
            return (Criteria) this;
        }

        public Criteria andWanPortIsNotNull() {
            addCriterion("WAN_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andWanPortEqualTo(Integer value) {
            addCriterion("WAN_PORT =", value, "wanPort");
            return (Criteria) this;
        }

        public Criteria andWanPortNotEqualTo(Integer value) {
            addCriterion("WAN_PORT <>", value, "wanPort");
            return (Criteria) this;
        }

        public Criteria andWanPortGreaterThan(Integer value) {
            addCriterion("WAN_PORT >", value, "wanPort");
            return (Criteria) this;
        }

        public Criteria andWanPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("WAN_PORT >=", value, "wanPort");
            return (Criteria) this;
        }

        public Criteria andWanPortLessThan(Integer value) {
            addCriterion("WAN_PORT <", value, "wanPort");
            return (Criteria) this;
        }

        public Criteria andWanPortLessThanOrEqualTo(Integer value) {
            addCriterion("WAN_PORT <=", value, "wanPort");
            return (Criteria) this;
        }

        public Criteria andWanPortIn(List<Integer> values) {
            addCriterion("WAN_PORT in", values, "wanPort");
            return (Criteria) this;
        }

        public Criteria andWanPortNotIn(List<Integer> values) {
            addCriterion("WAN_PORT not in", values, "wanPort");
            return (Criteria) this;
        }

        public Criteria andWanPortBetween(Integer value1, Integer value2) {
            addCriterion("WAN_PORT between", value1, value2, "wanPort");
            return (Criteria) this;
        }

        public Criteria andWanPortNotBetween(Integer value1, Integer value2) {
            addCriterion("WAN_PORT not between", value1, value2, "wanPort");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeIsNull() {
            addCriterion("CLEAR_TIME is null");
            return (Criteria) this;
        }

        public Criteria andClearTimeIsNotNull() {
            addCriterion("CLEAR_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andClearTimeEqualTo(Date value) {
            addCriterion("CLEAR_TIME =", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotEqualTo(Date value) {
            addCriterion("CLEAR_TIME <>", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThan(Date value) {
            addCriterion("CLEAR_TIME >", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CLEAR_TIME >=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThan(Date value) {
            addCriterion("CLEAR_TIME <", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeLessThanOrEqualTo(Date value) {
            addCriterion("CLEAR_TIME <=", value, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeIn(List<Date> values) {
            addCriterion("CLEAR_TIME in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotIn(List<Date> values) {
            addCriterion("CLEAR_TIME not in", values, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeBetween(Date value1, Date value2) {
            addCriterion("CLEAR_TIME between", value1, value2, "clearTime");
            return (Criteria) this;
        }

        public Criteria andClearTimeNotBetween(Date value1, Date value2) {
            addCriterion("CLEAR_TIME not between", value1, value2, "clearTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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