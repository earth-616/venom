package com.earth616.venom.entity;

import java.util.ArrayList;
import java.util.List;

public class configurationPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public configurationPOExample() {
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

        public Criteria andWanIpIsNull() {
            addCriterion("WAN_IP is null");
            return (Criteria) this;
        }

        public Criteria andWanIpIsNotNull() {
            addCriterion("WAN_IP is not null");
            return (Criteria) this;
        }

        public Criteria andWanIpEqualTo(String value) {
            addCriterion("WAN_IP =", value, "wanIp");
            return (Criteria) this;
        }

        public Criteria andWanIpNotEqualTo(String value) {
            addCriterion("WAN_IP <>", value, "wanIp");
            return (Criteria) this;
        }

        public Criteria andWanIpGreaterThan(String value) {
            addCriterion("WAN_IP >", value, "wanIp");
            return (Criteria) this;
        }

        public Criteria andWanIpGreaterThanOrEqualTo(String value) {
            addCriterion("WAN_IP >=", value, "wanIp");
            return (Criteria) this;
        }

        public Criteria andWanIpLessThan(String value) {
            addCriterion("WAN_IP <", value, "wanIp");
            return (Criteria) this;
        }

        public Criteria andWanIpLessThanOrEqualTo(String value) {
            addCriterion("WAN_IP <=", value, "wanIp");
            return (Criteria) this;
        }

        public Criteria andWanIpLike(String value) {
            addCriterion("WAN_IP like", value, "wanIp");
            return (Criteria) this;
        }

        public Criteria andWanIpNotLike(String value) {
            addCriterion("WAN_IP not like", value, "wanIp");
            return (Criteria) this;
        }

        public Criteria andWanIpIn(List<String> values) {
            addCriterion("WAN_IP in", values, "wanIp");
            return (Criteria) this;
        }

        public Criteria andWanIpNotIn(List<String> values) {
            addCriterion("WAN_IP not in", values, "wanIp");
            return (Criteria) this;
        }

        public Criteria andWanIpBetween(String value1, String value2) {
            addCriterion("WAN_IP between", value1, value2, "wanIp");
            return (Criteria) this;
        }

        public Criteria andWanIpNotBetween(String value1, String value2) {
            addCriterion("WAN_IP not between", value1, value2, "wanIp");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNull() {
            addCriterion("storeid is null");
            return (Criteria) this;
        }

        public Criteria andStoreidIsNotNull() {
            addCriterion("storeid is not null");
            return (Criteria) this;
        }

        public Criteria andStoreidEqualTo(String value) {
            addCriterion("storeid =", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotEqualTo(String value) {
            addCriterion("storeid <>", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThan(String value) {
            addCriterion("storeid >", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidGreaterThanOrEqualTo(String value) {
            addCriterion("storeid >=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThan(String value) {
            addCriterion("storeid <", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLessThanOrEqualTo(String value) {
            addCriterion("storeid <=", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidLike(String value) {
            addCriterion("storeid like", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotLike(String value) {
            addCriterion("storeid not like", value, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidIn(List<String> values) {
            addCriterion("storeid in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotIn(List<String> values) {
            addCriterion("storeid not in", values, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidBetween(String value1, String value2) {
            addCriterion("storeid between", value1, value2, "storeid");
            return (Criteria) this;
        }

        public Criteria andStoreidNotBetween(String value1, String value2) {
            addCriterion("storeid not between", value1, value2, "storeid");
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