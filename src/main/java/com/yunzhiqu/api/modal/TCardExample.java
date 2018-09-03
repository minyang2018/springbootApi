package com.yunzhiqu.api.modal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TCardExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUniacidIsNull() {
            addCriterion("uniacid is null");
            return (Criteria) this;
        }

        public Criteria andUniacidIsNotNull() {
            addCriterion("uniacid is not null");
            return (Criteria) this;
        }

        public Criteria andUniacidEqualTo(Integer value) {
            addCriterion("uniacid =", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidNotEqualTo(Integer value) {
            addCriterion("uniacid <>", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidGreaterThan(Integer value) {
            addCriterion("uniacid >", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uniacid >=", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidLessThan(Integer value) {
            addCriterion("uniacid <", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidLessThanOrEqualTo(Integer value) {
            addCriterion("uniacid <=", value, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidIn(List<Integer> values) {
            addCriterion("uniacid in", values, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidNotIn(List<Integer> values) {
            addCriterion("uniacid not in", values, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidBetween(Integer value1, Integer value2) {
            addCriterion("uniacid between", value1, value2, "uniacid");
            return (Criteria) this;
        }

        public Criteria andUniacidNotBetween(Integer value1, Integer value2) {
            addCriterion("uniacid not between", value1, value2, "uniacid");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNull() {
            addCriterion("weixin is null");
            return (Criteria) this;
        }

        public Criteria andWeixinIsNotNull() {
            addCriterion("weixin is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinEqualTo(String value) {
            addCriterion("weixin =", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotEqualTo(String value) {
            addCriterion("weixin <>", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThan(String value) {
            addCriterion("weixin >", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinGreaterThanOrEqualTo(String value) {
            addCriterion("weixin >=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThan(String value) {
            addCriterion("weixin <", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLessThanOrEqualTo(String value) {
            addCriterion("weixin <=", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinLike(String value) {
            addCriterion("weixin like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotLike(String value) {
            addCriterion("weixin not like", value, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinIn(List<String> values) {
            addCriterion("weixin in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotIn(List<String> values) {
            addCriterion("weixin not in", values, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinBetween(String value1, String value2) {
            addCriterion("weixin between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinNotBetween(String value1, String value2) {
            addCriterion("weixin not between", value1, value2, "weixin");
            return (Criteria) this;
        }

        public Criteria andWeixinimgIsNull() {
            addCriterion("weixinImg is null");
            return (Criteria) this;
        }

        public Criteria andWeixinimgIsNotNull() {
            addCriterion("weixinImg is not null");
            return (Criteria) this;
        }

        public Criteria andWeixinimgEqualTo(String value) {
            addCriterion("weixinImg =", value, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andWeixinimgNotEqualTo(String value) {
            addCriterion("weixinImg <>", value, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andWeixinimgGreaterThan(String value) {
            addCriterion("weixinImg >", value, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andWeixinimgGreaterThanOrEqualTo(String value) {
            addCriterion("weixinImg >=", value, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andWeixinimgLessThan(String value) {
            addCriterion("weixinImg <", value, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andWeixinimgLessThanOrEqualTo(String value) {
            addCriterion("weixinImg <=", value, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andWeixinimgLike(String value) {
            addCriterion("weixinImg like", value, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andWeixinimgNotLike(String value) {
            addCriterion("weixinImg not like", value, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andWeixinimgIn(List<String> values) {
            addCriterion("weixinImg in", values, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andWeixinimgNotIn(List<String> values) {
            addCriterion("weixinImg not in", values, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andWeixinimgBetween(String value1, String value2) {
            addCriterion("weixinImg between", value1, value2, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andWeixinimgNotBetween(String value1, String value2) {
            addCriterion("weixinImg not between", value1, value2, "weixinimg");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNull() {
            addCriterion("company is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("company is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("company =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("company <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("company >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("company >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("company <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("company <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("company like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("company not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("company in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("company not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("company between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("company not between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("job is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("job is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("job =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("job <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("job >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("job >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("job <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("job <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("job like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("job not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("job in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("job not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("job between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("job not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andMdescIsNull() {
            addCriterion("mdesc is null");
            return (Criteria) this;
        }

        public Criteria andMdescIsNotNull() {
            addCriterion("mdesc is not null");
            return (Criteria) this;
        }

        public Criteria andMdescEqualTo(String value) {
            addCriterion("mdesc =", value, "mdesc");
            return (Criteria) this;
        }

        public Criteria andMdescNotEqualTo(String value) {
            addCriterion("mdesc <>", value, "mdesc");
            return (Criteria) this;
        }

        public Criteria andMdescGreaterThan(String value) {
            addCriterion("mdesc >", value, "mdesc");
            return (Criteria) this;
        }

        public Criteria andMdescGreaterThanOrEqualTo(String value) {
            addCriterion("mdesc >=", value, "mdesc");
            return (Criteria) this;
        }

        public Criteria andMdescLessThan(String value) {
            addCriterion("mdesc <", value, "mdesc");
            return (Criteria) this;
        }

        public Criteria andMdescLessThanOrEqualTo(String value) {
            addCriterion("mdesc <=", value, "mdesc");
            return (Criteria) this;
        }

        public Criteria andMdescLike(String value) {
            addCriterion("mdesc like", value, "mdesc");
            return (Criteria) this;
        }

        public Criteria andMdescNotLike(String value) {
            addCriterion("mdesc not like", value, "mdesc");
            return (Criteria) this;
        }

        public Criteria andMdescIn(List<String> values) {
            addCriterion("mdesc in", values, "mdesc");
            return (Criteria) this;
        }

        public Criteria andMdescNotIn(List<String> values) {
            addCriterion("mdesc not in", values, "mdesc");
            return (Criteria) this;
        }

        public Criteria andMdescBetween(String value1, String value2) {
            addCriterion("mdesc between", value1, value2, "mdesc");
            return (Criteria) this;
        }

        public Criteria andMdescNotBetween(String value1, String value2) {
            addCriterion("mdesc not between", value1, value2, "mdesc");
            return (Criteria) this;
        }

        public Criteria andZanIsNull() {
            addCriterion("zan is null");
            return (Criteria) this;
        }

        public Criteria andZanIsNotNull() {
            addCriterion("zan is not null");
            return (Criteria) this;
        }

        public Criteria andZanEqualTo(Integer value) {
            addCriterion("zan =", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotEqualTo(Integer value) {
            addCriterion("zan <>", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanGreaterThan(Integer value) {
            addCriterion("zan >", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanGreaterThanOrEqualTo(Integer value) {
            addCriterion("zan >=", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanLessThan(Integer value) {
            addCriterion("zan <", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanLessThanOrEqualTo(Integer value) {
            addCriterion("zan <=", value, "zan");
            return (Criteria) this;
        }

        public Criteria andZanIn(List<Integer> values) {
            addCriterion("zan in", values, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotIn(List<Integer> values) {
            addCriterion("zan not in", values, "zan");
            return (Criteria) this;
        }

        public Criteria andZanBetween(Integer value1, Integer value2) {
            addCriterion("zan between", value1, value2, "zan");
            return (Criteria) this;
        }

        public Criteria andZanNotBetween(Integer value1, Integer value2) {
            addCriterion("zan not between", value1, value2, "zan");
            return (Criteria) this;
        }

        public Criteria andViewIsNull() {
            addCriterion("view is null");
            return (Criteria) this;
        }

        public Criteria andViewIsNotNull() {
            addCriterion("view is not null");
            return (Criteria) this;
        }

        public Criteria andViewEqualTo(Integer value) {
            addCriterion("view =", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotEqualTo(Integer value) {
            addCriterion("view <>", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThan(Integer value) {
            addCriterion("view >", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("view >=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThan(Integer value) {
            addCriterion("view <", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewLessThanOrEqualTo(Integer value) {
            addCriterion("view <=", value, "view");
            return (Criteria) this;
        }

        public Criteria andViewIn(List<Integer> values) {
            addCriterion("view in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotIn(List<Integer> values) {
            addCriterion("view not in", values, "view");
            return (Criteria) this;
        }

        public Criteria andViewBetween(Integer value1, Integer value2) {
            addCriterion("view between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andViewNotBetween(Integer value1, Integer value2) {
            addCriterion("view not between", value1, value2, "view");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCollectIsNull() {
            addCriterion("collect is null");
            return (Criteria) this;
        }

        public Criteria andCollectIsNotNull() {
            addCriterion("collect is not null");
            return (Criteria) this;
        }

        public Criteria andCollectEqualTo(Integer value) {
            addCriterion("collect =", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectNotEqualTo(Integer value) {
            addCriterion("collect <>", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectGreaterThan(Integer value) {
            addCriterion("collect >", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectGreaterThanOrEqualTo(Integer value) {
            addCriterion("collect >=", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectLessThan(Integer value) {
            addCriterion("collect <", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectLessThanOrEqualTo(Integer value) {
            addCriterion("collect <=", value, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectIn(List<Integer> values) {
            addCriterion("collect in", values, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectNotIn(List<Integer> values) {
            addCriterion("collect not in", values, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectBetween(Integer value1, Integer value2) {
            addCriterion("collect between", value1, value2, "collect");
            return (Criteria) this;
        }

        public Criteria andCollectNotBetween(Integer value1, Integer value2) {
            addCriterion("collect not between", value1, value2, "collect");
            return (Criteria) this;
        }

        public Criteria andQrcodeIsNull() {
            addCriterion("qrcode is null");
            return (Criteria) this;
        }

        public Criteria andQrcodeIsNotNull() {
            addCriterion("qrcode is not null");
            return (Criteria) this;
        }

        public Criteria andQrcodeEqualTo(String value) {
            addCriterion("qrcode =", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotEqualTo(String value) {
            addCriterion("qrcode <>", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeGreaterThan(String value) {
            addCriterion("qrcode >", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeGreaterThanOrEqualTo(String value) {
            addCriterion("qrcode >=", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLessThan(String value) {
            addCriterion("qrcode <", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLessThanOrEqualTo(String value) {
            addCriterion("qrcode <=", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeLike(String value) {
            addCriterion("qrcode like", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotLike(String value) {
            addCriterion("qrcode not like", value, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeIn(List<String> values) {
            addCriterion("qrcode in", values, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotIn(List<String> values) {
            addCriterion("qrcode not in", values, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeBetween(String value1, String value2) {
            addCriterion("qrcode between", value1, value2, "qrcode");
            return (Criteria) this;
        }

        public Criteria andQrcodeNotBetween(String value1, String value2) {
            addCriterion("qrcode not between", value1, value2, "qrcode");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andRelationIsNull() {
            addCriterion("relation is null");
            return (Criteria) this;
        }

        public Criteria andRelationIsNotNull() {
            addCriterion("relation is not null");
            return (Criteria) this;
        }

        public Criteria andRelationEqualTo(Integer value) {
            addCriterion("relation =", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotEqualTo(Integer value) {
            addCriterion("relation <>", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThan(Integer value) {
            addCriterion("relation >", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationGreaterThanOrEqualTo(Integer value) {
            addCriterion("relation >=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThan(Integer value) {
            addCriterion("relation <", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationLessThanOrEqualTo(Integer value) {
            addCriterion("relation <=", value, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationIn(List<Integer> values) {
            addCriterion("relation in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotIn(List<Integer> values) {
            addCriterion("relation not in", values, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationBetween(Integer value1, Integer value2) {
            addCriterion("relation between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andRelationNotBetween(Integer value1, Integer value2) {
            addCriterion("relation not between", value1, value2, "relation");
            return (Criteria) this;
        }

        public Criteria andIsvipIsNull() {
            addCriterion("isvip is null");
            return (Criteria) this;
        }

        public Criteria andIsvipIsNotNull() {
            addCriterion("isvip is not null");
            return (Criteria) this;
        }

        public Criteria andIsvipEqualTo(Integer value) {
            addCriterion("isvip =", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotEqualTo(Integer value) {
            addCriterion("isvip <>", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThan(Integer value) {
            addCriterion("isvip >", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThanOrEqualTo(Integer value) {
            addCriterion("isvip >=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThan(Integer value) {
            addCriterion("isvip <", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThanOrEqualTo(Integer value) {
            addCriterion("isvip <=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipIn(List<Integer> values) {
            addCriterion("isvip in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotIn(List<Integer> values) {
            addCriterion("isvip not in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipBetween(Integer value1, Integer value2) {
            addCriterion("isvip between", value1, value2, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotBetween(Integer value1, Integer value2) {
            addCriterion("isvip not between", value1, value2, "isvip");
            return (Criteria) this;
        }

        public Criteria andViptimeIsNull() {
            addCriterion("viptime is null");
            return (Criteria) this;
        }

        public Criteria andViptimeIsNotNull() {
            addCriterion("viptime is not null");
            return (Criteria) this;
        }

        public Criteria andViptimeEqualTo(Date value) {
            addCriterion("viptime =", value, "viptime");
            return (Criteria) this;
        }

        public Criteria andViptimeNotEqualTo(Date value) {
            addCriterion("viptime <>", value, "viptime");
            return (Criteria) this;
        }

        public Criteria andViptimeGreaterThan(Date value) {
            addCriterion("viptime >", value, "viptime");
            return (Criteria) this;
        }

        public Criteria andViptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("viptime >=", value, "viptime");
            return (Criteria) this;
        }

        public Criteria andViptimeLessThan(Date value) {
            addCriterion("viptime <", value, "viptime");
            return (Criteria) this;
        }

        public Criteria andViptimeLessThanOrEqualTo(Date value) {
            addCriterion("viptime <=", value, "viptime");
            return (Criteria) this;
        }

        public Criteria andViptimeIn(List<Date> values) {
            addCriterion("viptime in", values, "viptime");
            return (Criteria) this;
        }

        public Criteria andViptimeNotIn(List<Date> values) {
            addCriterion("viptime not in", values, "viptime");
            return (Criteria) this;
        }

        public Criteria andViptimeBetween(Date value1, Date value2) {
            addCriterion("viptime between", value1, value2, "viptime");
            return (Criteria) this;
        }

        public Criteria andViptimeNotBetween(Date value1, Date value2) {
            addCriterion("viptime not between", value1, value2, "viptime");
            return (Criteria) this;
        }

        public Criteria andThemetypeIsNull() {
            addCriterion("themetype is null");
            return (Criteria) this;
        }

        public Criteria andThemetypeIsNotNull() {
            addCriterion("themetype is not null");
            return (Criteria) this;
        }

        public Criteria andThemetypeEqualTo(Integer value) {
            addCriterion("themetype =", value, "themetype");
            return (Criteria) this;
        }

        public Criteria andThemetypeNotEqualTo(Integer value) {
            addCriterion("themetype <>", value, "themetype");
            return (Criteria) this;
        }

        public Criteria andThemetypeGreaterThan(Integer value) {
            addCriterion("themetype >", value, "themetype");
            return (Criteria) this;
        }

        public Criteria andThemetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("themetype >=", value, "themetype");
            return (Criteria) this;
        }

        public Criteria andThemetypeLessThan(Integer value) {
            addCriterion("themetype <", value, "themetype");
            return (Criteria) this;
        }

        public Criteria andThemetypeLessThanOrEqualTo(Integer value) {
            addCriterion("themetype <=", value, "themetype");
            return (Criteria) this;
        }

        public Criteria andThemetypeIn(List<Integer> values) {
            addCriterion("themetype in", values, "themetype");
            return (Criteria) this;
        }

        public Criteria andThemetypeNotIn(List<Integer> values) {
            addCriterion("themetype not in", values, "themetype");
            return (Criteria) this;
        }

        public Criteria andThemetypeBetween(Integer value1, Integer value2) {
            addCriterion("themetype between", value1, value2, "themetype");
            return (Criteria) this;
        }

        public Criteria andThemetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("themetype not between", value1, value2, "themetype");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNull() {
            addCriterion("themeid is null");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNotNull() {
            addCriterion("themeid is not null");
            return (Criteria) this;
        }

        public Criteria andThemeidEqualTo(Long value) {
            addCriterion("themeid =", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotEqualTo(Long value) {
            addCriterion("themeid <>", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThan(Long value) {
            addCriterion("themeid >", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThanOrEqualTo(Long value) {
            addCriterion("themeid >=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThan(Long value) {
            addCriterion("themeid <", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThanOrEqualTo(Long value) {
            addCriterion("themeid <=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidIn(List<Long> values) {
            addCriterion("themeid in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotIn(List<Long> values) {
            addCriterion("themeid not in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidBetween(Long value1, Long value2) {
            addCriterion("themeid between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotBetween(Long value1, Long value2) {
            addCriterion("themeid not between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andIsnocardIsNull() {
            addCriterion("isnocard is null");
            return (Criteria) this;
        }

        public Criteria andIsnocardIsNotNull() {
            addCriterion("isnocard is not null");
            return (Criteria) this;
        }

        public Criteria andIsnocardEqualTo(Integer value) {
            addCriterion("isnocard =", value, "isnocard");
            return (Criteria) this;
        }

        public Criteria andIsnocardNotEqualTo(Integer value) {
            addCriterion("isnocard <>", value, "isnocard");
            return (Criteria) this;
        }

        public Criteria andIsnocardGreaterThan(Integer value) {
            addCriterion("isnocard >", value, "isnocard");
            return (Criteria) this;
        }

        public Criteria andIsnocardGreaterThanOrEqualTo(Integer value) {
            addCriterion("isnocard >=", value, "isnocard");
            return (Criteria) this;
        }

        public Criteria andIsnocardLessThan(Integer value) {
            addCriterion("isnocard <", value, "isnocard");
            return (Criteria) this;
        }

        public Criteria andIsnocardLessThanOrEqualTo(Integer value) {
            addCriterion("isnocard <=", value, "isnocard");
            return (Criteria) this;
        }

        public Criteria andIsnocardIn(List<Integer> values) {
            addCriterion("isnocard in", values, "isnocard");
            return (Criteria) this;
        }

        public Criteria andIsnocardNotIn(List<Integer> values) {
            addCriterion("isnocard not in", values, "isnocard");
            return (Criteria) this;
        }

        public Criteria andIsnocardBetween(Integer value1, Integer value2) {
            addCriterion("isnocard between", value1, value2, "isnocard");
            return (Criteria) this;
        }

        public Criteria andIsnocardNotBetween(Integer value1, Integer value2) {
            addCriterion("isnocard not between", value1, value2, "isnocard");
            return (Criteria) this;
        }

        public Criteria andImgsexpIsNull() {
            addCriterion("imgsexp is null");
            return (Criteria) this;
        }

        public Criteria andImgsexpIsNotNull() {
            addCriterion("imgsexp is not null");
            return (Criteria) this;
        }

        public Criteria andImgsexpEqualTo(String value) {
            addCriterion("imgsexp =", value, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andImgsexpNotEqualTo(String value) {
            addCriterion("imgsexp <>", value, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andImgsexpGreaterThan(String value) {
            addCriterion("imgsexp >", value, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andImgsexpGreaterThanOrEqualTo(String value) {
            addCriterion("imgsexp >=", value, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andImgsexpLessThan(String value) {
            addCriterion("imgsexp <", value, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andImgsexpLessThanOrEqualTo(String value) {
            addCriterion("imgsexp <=", value, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andImgsexpLike(String value) {
            addCriterion("imgsexp like", value, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andImgsexpNotLike(String value) {
            addCriterion("imgsexp not like", value, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andImgsexpIn(List<String> values) {
            addCriterion("imgsexp in", values, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andImgsexpNotIn(List<String> values) {
            addCriterion("imgsexp not in", values, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andImgsexpBetween(String value1, String value2) {
            addCriterion("imgsexp between", value1, value2, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andImgsexpNotBetween(String value1, String value2) {
            addCriterion("imgsexp not between", value1, value2, "imgsexp");
            return (Criteria) this;
        }

        public Criteria andExp1IsNull() {
            addCriterion("exp1 is null");
            return (Criteria) this;
        }

        public Criteria andExp1IsNotNull() {
            addCriterion("exp1 is not null");
            return (Criteria) this;
        }

        public Criteria andExp1EqualTo(String value) {
            addCriterion("exp1 =", value, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp1NotEqualTo(String value) {
            addCriterion("exp1 <>", value, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp1GreaterThan(String value) {
            addCriterion("exp1 >", value, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp1GreaterThanOrEqualTo(String value) {
            addCriterion("exp1 >=", value, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp1LessThan(String value) {
            addCriterion("exp1 <", value, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp1LessThanOrEqualTo(String value) {
            addCriterion("exp1 <=", value, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp1Like(String value) {
            addCriterion("exp1 like", value, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp1NotLike(String value) {
            addCriterion("exp1 not like", value, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp1In(List<String> values) {
            addCriterion("exp1 in", values, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp1NotIn(List<String> values) {
            addCriterion("exp1 not in", values, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp1Between(String value1, String value2) {
            addCriterion("exp1 between", value1, value2, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp1NotBetween(String value1, String value2) {
            addCriterion("exp1 not between", value1, value2, "exp1");
            return (Criteria) this;
        }

        public Criteria andExp2IsNull() {
            addCriterion("exp2 is null");
            return (Criteria) this;
        }

        public Criteria andExp2IsNotNull() {
            addCriterion("exp2 is not null");
            return (Criteria) this;
        }

        public Criteria andExp2EqualTo(String value) {
            addCriterion("exp2 =", value, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp2NotEqualTo(String value) {
            addCriterion("exp2 <>", value, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp2GreaterThan(String value) {
            addCriterion("exp2 >", value, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp2GreaterThanOrEqualTo(String value) {
            addCriterion("exp2 >=", value, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp2LessThan(String value) {
            addCriterion("exp2 <", value, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp2LessThanOrEqualTo(String value) {
            addCriterion("exp2 <=", value, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp2Like(String value) {
            addCriterion("exp2 like", value, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp2NotLike(String value) {
            addCriterion("exp2 not like", value, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp2In(List<String> values) {
            addCriterion("exp2 in", values, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp2NotIn(List<String> values) {
            addCriterion("exp2 not in", values, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp2Between(String value1, String value2) {
            addCriterion("exp2 between", value1, value2, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp2NotBetween(String value1, String value2) {
            addCriterion("exp2 not between", value1, value2, "exp2");
            return (Criteria) this;
        }

        public Criteria andExp3IsNull() {
            addCriterion("exp3 is null");
            return (Criteria) this;
        }

        public Criteria andExp3IsNotNull() {
            addCriterion("exp3 is not null");
            return (Criteria) this;
        }

        public Criteria andExp3EqualTo(String value) {
            addCriterion("exp3 =", value, "exp3");
            return (Criteria) this;
        }

        public Criteria andExp3NotEqualTo(String value) {
            addCriterion("exp3 <>", value, "exp3");
            return (Criteria) this;
        }

        public Criteria andExp3GreaterThan(String value) {
            addCriterion("exp3 >", value, "exp3");
            return (Criteria) this;
        }

        public Criteria andExp3GreaterThanOrEqualTo(String value) {
            addCriterion("exp3 >=", value, "exp3");
            return (Criteria) this;
        }

        public Criteria andExp3LessThan(String value) {
            addCriterion("exp3 <", value, "exp3");
            return (Criteria) this;
        }

        public Criteria andExp3LessThanOrEqualTo(String value) {
            addCriterion("exp3 <=", value, "exp3");
            return (Criteria) this;
        }

        public Criteria andExp3Like(String value) {
            addCriterion("exp3 like", value, "exp3");
            return (Criteria) this;
        }

        public Criteria andExp3NotLike(String value) {
            addCriterion("exp3 not like", value, "exp3");
            return (Criteria) this;
        }

        public Criteria andExp3In(List<String> values) {
            addCriterion("exp3 in", values, "exp3");
            return (Criteria) this;
        }

        public Criteria andExp3NotIn(List<String> values) {
            addCriterion("exp3 not in", values, "exp3");
            return (Criteria) this;
        }

        public Criteria andExp3Between(String value1, String value2) {
            addCriterion("exp3 between", value1, value2, "exp3");
            return (Criteria) this;
        }

        public Criteria andExp3NotBetween(String value1, String value2) {
            addCriterion("exp3 not between", value1, value2, "exp3");
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