package com.yunzhiqu.api.modal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TVersionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TVersionInfoExample() {
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

        public Criteria andOsTypeIsNull() {
            addCriterion("os_type is null");
            return (Criteria) this;
        }

        public Criteria andOsTypeIsNotNull() {
            addCriterion("os_type is not null");
            return (Criteria) this;
        }

        public Criteria andOsTypeEqualTo(Integer value) {
            addCriterion("os_type =", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeNotEqualTo(Integer value) {
            addCriterion("os_type <>", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeGreaterThan(Integer value) {
            addCriterion("os_type >", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("os_type >=", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeLessThan(Integer value) {
            addCriterion("os_type <", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("os_type <=", value, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeIn(List<Integer> values) {
            addCriterion("os_type in", values, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeNotIn(List<Integer> values) {
            addCriterion("os_type not in", values, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeBetween(Integer value1, Integer value2) {
            addCriterion("os_type between", value1, value2, "osType");
            return (Criteria) this;
        }

        public Criteria andOsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("os_type not between", value1, value2, "osType");
            return (Criteria) this;
        }

        public Criteria andEditionNoIsNull() {
            addCriterion("edition_no is null");
            return (Criteria) this;
        }

        public Criteria andEditionNoIsNotNull() {
            addCriterion("edition_no is not null");
            return (Criteria) this;
        }

        public Criteria andEditionNoEqualTo(Integer value) {
            addCriterion("edition_no =", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoNotEqualTo(Integer value) {
            addCriterion("edition_no <>", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoGreaterThan(Integer value) {
            addCriterion("edition_no >", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("edition_no >=", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoLessThan(Integer value) {
            addCriterion("edition_no <", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoLessThanOrEqualTo(Integer value) {
            addCriterion("edition_no <=", value, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoIn(List<Integer> values) {
            addCriterion("edition_no in", values, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoNotIn(List<Integer> values) {
            addCriterion("edition_no not in", values, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoBetween(Integer value1, Integer value2) {
            addCriterion("edition_no between", value1, value2, "editionNo");
            return (Criteria) this;
        }

        public Criteria andEditionNoNotBetween(Integer value1, Integer value2) {
            addCriterion("edition_no not between", value1, value2, "editionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNull() {
            addCriterion("version_no is null");
            return (Criteria) this;
        }

        public Criteria andVersionNoIsNotNull() {
            addCriterion("version_no is not null");
            return (Criteria) this;
        }

        public Criteria andVersionNoEqualTo(String value) {
            addCriterion("version_no =", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotEqualTo(String value) {
            addCriterion("version_no <>", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThan(String value) {
            addCriterion("version_no >", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoGreaterThanOrEqualTo(String value) {
            addCriterion("version_no >=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThan(String value) {
            addCriterion("version_no <", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLessThanOrEqualTo(String value) {
            addCriterion("version_no <=", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoLike(String value) {
            addCriterion("version_no like", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotLike(String value) {
            addCriterion("version_no not like", value, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoIn(List<String> values) {
            addCriterion("version_no in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotIn(List<String> values) {
            addCriterion("version_no not in", values, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoBetween(String value1, String value2) {
            addCriterion("version_no between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionNoNotBetween(String value1, String value2) {
            addCriterion("version_no not between", value1, value2, "versionNo");
            return (Criteria) this;
        }

        public Criteria andVersionKeyIsNull() {
            addCriterion("version_key is null");
            return (Criteria) this;
        }

        public Criteria andVersionKeyIsNotNull() {
            addCriterion("version_key is not null");
            return (Criteria) this;
        }

        public Criteria andVersionKeyEqualTo(String value) {
            addCriterion("version_key =", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyNotEqualTo(String value) {
            addCriterion("version_key <>", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyGreaterThan(String value) {
            addCriterion("version_key >", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyGreaterThanOrEqualTo(String value) {
            addCriterion("version_key >=", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyLessThan(String value) {
            addCriterion("version_key <", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyLessThanOrEqualTo(String value) {
            addCriterion("version_key <=", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyLike(String value) {
            addCriterion("version_key like", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyNotLike(String value) {
            addCriterion("version_key not like", value, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyIn(List<String> values) {
            addCriterion("version_key in", values, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyNotIn(List<String> values) {
            addCriterion("version_key not in", values, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyBetween(String value1, String value2) {
            addCriterion("version_key between", value1, value2, "versionKey");
            return (Criteria) this;
        }

        public Criteria andVersionKeyNotBetween(String value1, String value2) {
            addCriterion("version_key not between", value1, value2, "versionKey");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteIsNull() {
            addCriterion("official_site is null");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteIsNotNull() {
            addCriterion("official_site is not null");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteEqualTo(String value) {
            addCriterion("official_site =", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteNotEqualTo(String value) {
            addCriterion("official_site <>", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteGreaterThan(String value) {
            addCriterion("official_site >", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteGreaterThanOrEqualTo(String value) {
            addCriterion("official_site >=", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteLessThan(String value) {
            addCriterion("official_site <", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteLessThanOrEqualTo(String value) {
            addCriterion("official_site <=", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteLike(String value) {
            addCriterion("official_site like", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteNotLike(String value) {
            addCriterion("official_site not like", value, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteIn(List<String> values) {
            addCriterion("official_site in", values, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteNotIn(List<String> values) {
            addCriterion("official_site not in", values, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteBetween(String value1, String value2) {
            addCriterion("official_site between", value1, value2, "officialSite");
            return (Criteria) this;
        }

        public Criteria andOfficialSiteNotBetween(String value1, String value2) {
            addCriterion("official_site not between", value1, value2, "officialSite");
            return (Criteria) this;
        }

        public Criteria andLoginAddrIsNull() {
            addCriterion("login_addr is null");
            return (Criteria) this;
        }

        public Criteria andLoginAddrIsNotNull() {
            addCriterion("login_addr is not null");
            return (Criteria) this;
        }

        public Criteria andLoginAddrEqualTo(String value) {
            addCriterion("login_addr =", value, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andLoginAddrNotEqualTo(String value) {
            addCriterion("login_addr <>", value, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andLoginAddrGreaterThan(String value) {
            addCriterion("login_addr >", value, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andLoginAddrGreaterThanOrEqualTo(String value) {
            addCriterion("login_addr >=", value, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andLoginAddrLessThan(String value) {
            addCriterion("login_addr <", value, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andLoginAddrLessThanOrEqualTo(String value) {
            addCriterion("login_addr <=", value, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andLoginAddrLike(String value) {
            addCriterion("login_addr like", value, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andLoginAddrNotLike(String value) {
            addCriterion("login_addr not like", value, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andLoginAddrIn(List<String> values) {
            addCriterion("login_addr in", values, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andLoginAddrNotIn(List<String> values) {
            addCriterion("login_addr not in", values, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andLoginAddrBetween(String value1, String value2) {
            addCriterion("login_addr between", value1, value2, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andLoginAddrNotBetween(String value1, String value2) {
            addCriterion("login_addr not between", value1, value2, "loginAddr");
            return (Criteria) this;
        }

        public Criteria andVersionEnableIsNull() {
            addCriterion("version_enable is null");
            return (Criteria) this;
        }

        public Criteria andVersionEnableIsNotNull() {
            addCriterion("version_enable is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEnableEqualTo(Integer value) {
            addCriterion("version_enable =", value, "versionEnable");
            return (Criteria) this;
        }

        public Criteria andVersionEnableNotEqualTo(Integer value) {
            addCriterion("version_enable <>", value, "versionEnable");
            return (Criteria) this;
        }

        public Criteria andVersionEnableGreaterThan(Integer value) {
            addCriterion("version_enable >", value, "versionEnable");
            return (Criteria) this;
        }

        public Criteria andVersionEnableGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_enable >=", value, "versionEnable");
            return (Criteria) this;
        }

        public Criteria andVersionEnableLessThan(Integer value) {
            addCriterion("version_enable <", value, "versionEnable");
            return (Criteria) this;
        }

        public Criteria andVersionEnableLessThanOrEqualTo(Integer value) {
            addCriterion("version_enable <=", value, "versionEnable");
            return (Criteria) this;
        }

        public Criteria andVersionEnableIn(List<Integer> values) {
            addCriterion("version_enable in", values, "versionEnable");
            return (Criteria) this;
        }

        public Criteria andVersionEnableNotIn(List<Integer> values) {
            addCriterion("version_enable not in", values, "versionEnable");
            return (Criteria) this;
        }

        public Criteria andVersionEnableBetween(Integer value1, Integer value2) {
            addCriterion("version_enable between", value1, value2, "versionEnable");
            return (Criteria) this;
        }

        public Criteria andVersionEnableNotBetween(Integer value1, Integer value2) {
            addCriterion("version_enable not between", value1, value2, "versionEnable");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateIsNull() {
            addCriterion("need_update is null");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateIsNotNull() {
            addCriterion("need_update is not null");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateEqualTo(Integer value) {
            addCriterion("need_update =", value, "needUpdate");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateNotEqualTo(Integer value) {
            addCriterion("need_update <>", value, "needUpdate");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateGreaterThan(Integer value) {
            addCriterion("need_update >", value, "needUpdate");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_update >=", value, "needUpdate");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateLessThan(Integer value) {
            addCriterion("need_update <", value, "needUpdate");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateLessThanOrEqualTo(Integer value) {
            addCriterion("need_update <=", value, "needUpdate");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateIn(List<Integer> values) {
            addCriterion("need_update in", values, "needUpdate");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateNotIn(List<Integer> values) {
            addCriterion("need_update not in", values, "needUpdate");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateBetween(Integer value1, Integer value2) {
            addCriterion("need_update between", value1, value2, "needUpdate");
            return (Criteria) this;
        }

        public Criteria andNeedUpdateNotBetween(Integer value1, Integer value2) {
            addCriterion("need_update not between", value1, value2, "needUpdate");
            return (Criteria) this;
        }

        public Criteria andBTimeIsNull() {
            addCriterion("b_time is null");
            return (Criteria) this;
        }

        public Criteria andBTimeIsNotNull() {
            addCriterion("b_time is not null");
            return (Criteria) this;
        }

        public Criteria andBTimeEqualTo(Date value) {
            addCriterion("b_time =", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeNotEqualTo(Date value) {
            addCriterion("b_time <>", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeGreaterThan(Date value) {
            addCriterion("b_time >", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("b_time >=", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeLessThan(Date value) {
            addCriterion("b_time <", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeLessThanOrEqualTo(Date value) {
            addCriterion("b_time <=", value, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeIn(List<Date> values) {
            addCriterion("b_time in", values, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeNotIn(List<Date> values) {
            addCriterion("b_time not in", values, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeBetween(Date value1, Date value2) {
            addCriterion("b_time between", value1, value2, "bTime");
            return (Criteria) this;
        }

        public Criteria andBTimeNotBetween(Date value1, Date value2) {
            addCriterion("b_time not between", value1, value2, "bTime");
            return (Criteria) this;
        }

        public Criteria andETimeIsNull() {
            addCriterion("e_time is null");
            return (Criteria) this;
        }

        public Criteria andETimeIsNotNull() {
            addCriterion("e_time is not null");
            return (Criteria) this;
        }

        public Criteria andETimeEqualTo(Date value) {
            addCriterion("e_time =", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotEqualTo(Date value) {
            addCriterion("e_time <>", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeGreaterThan(Date value) {
            addCriterion("e_time >", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeGreaterThanOrEqualTo(Date value) {
            addCriterion("e_time >=", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLessThan(Date value) {
            addCriterion("e_time <", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeLessThanOrEqualTo(Date value) {
            addCriterion("e_time <=", value, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeIn(List<Date> values) {
            addCriterion("e_time in", values, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotIn(List<Date> values) {
            addCriterion("e_time not in", values, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeBetween(Date value1, Date value2) {
            addCriterion("e_time between", value1, value2, "eTime");
            return (Criteria) this;
        }

        public Criteria andETimeNotBetween(Date value1, Date value2) {
            addCriterion("e_time not between", value1, value2, "eTime");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeIsNull() {
            addCriterion("deviationtime is null");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeIsNotNull() {
            addCriterion("deviationtime is not null");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeEqualTo(Integer value) {
            addCriterion("deviationtime =", value, "deviationtime");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeNotEqualTo(Integer value) {
            addCriterion("deviationtime <>", value, "deviationtime");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeGreaterThan(Integer value) {
            addCriterion("deviationtime >", value, "deviationtime");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("deviationtime >=", value, "deviationtime");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeLessThan(Integer value) {
            addCriterion("deviationtime <", value, "deviationtime");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeLessThanOrEqualTo(Integer value) {
            addCriterion("deviationtime <=", value, "deviationtime");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeIn(List<Integer> values) {
            addCriterion("deviationtime in", values, "deviationtime");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeNotIn(List<Integer> values) {
            addCriterion("deviationtime not in", values, "deviationtime");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeBetween(Integer value1, Integer value2) {
            addCriterion("deviationtime between", value1, value2, "deviationtime");
            return (Criteria) this;
        }

        public Criteria andDeviationtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("deviationtime not between", value1, value2, "deviationtime");
            return (Criteria) this;
        }

        public Criteria andVersionlockIsNull() {
            addCriterion("versionlock is null");
            return (Criteria) this;
        }

        public Criteria andVersionlockIsNotNull() {
            addCriterion("versionlock is not null");
            return (Criteria) this;
        }

        public Criteria andVersionlockEqualTo(String value) {
            addCriterion("versionlock =", value, "versionlock");
            return (Criteria) this;
        }

        public Criteria andVersionlockNotEqualTo(String value) {
            addCriterion("versionlock <>", value, "versionlock");
            return (Criteria) this;
        }

        public Criteria andVersionlockGreaterThan(String value) {
            addCriterion("versionlock >", value, "versionlock");
            return (Criteria) this;
        }

        public Criteria andVersionlockGreaterThanOrEqualTo(String value) {
            addCriterion("versionlock >=", value, "versionlock");
            return (Criteria) this;
        }

        public Criteria andVersionlockLessThan(String value) {
            addCriterion("versionlock <", value, "versionlock");
            return (Criteria) this;
        }

        public Criteria andVersionlockLessThanOrEqualTo(String value) {
            addCriterion("versionlock <=", value, "versionlock");
            return (Criteria) this;
        }

        public Criteria andVersionlockLike(String value) {
            addCriterion("versionlock like", value, "versionlock");
            return (Criteria) this;
        }

        public Criteria andVersionlockNotLike(String value) {
            addCriterion("versionlock not like", value, "versionlock");
            return (Criteria) this;
        }

        public Criteria andVersionlockIn(List<String> values) {
            addCriterion("versionlock in", values, "versionlock");
            return (Criteria) this;
        }

        public Criteria andVersionlockNotIn(List<String> values) {
            addCriterion("versionlock not in", values, "versionlock");
            return (Criteria) this;
        }

        public Criteria andVersionlockBetween(String value1, String value2) {
            addCriterion("versionlock between", value1, value2, "versionlock");
            return (Criteria) this;
        }

        public Criteria andVersionlockNotBetween(String value1, String value2) {
            addCriterion("versionlock not between", value1, value2, "versionlock");
            return (Criteria) this;
        }

        public Criteria andControlAddrIsNull() {
            addCriterion("control_addr is null");
            return (Criteria) this;
        }

        public Criteria andControlAddrIsNotNull() {
            addCriterion("control_addr is not null");
            return (Criteria) this;
        }

        public Criteria andControlAddrEqualTo(String value) {
            addCriterion("control_addr =", value, "controlAddr");
            return (Criteria) this;
        }

        public Criteria andControlAddrNotEqualTo(String value) {
            addCriterion("control_addr <>", value, "controlAddr");
            return (Criteria) this;
        }

        public Criteria andControlAddrGreaterThan(String value) {
            addCriterion("control_addr >", value, "controlAddr");
            return (Criteria) this;
        }

        public Criteria andControlAddrGreaterThanOrEqualTo(String value) {
            addCriterion("control_addr >=", value, "controlAddr");
            return (Criteria) this;
        }

        public Criteria andControlAddrLessThan(String value) {
            addCriterion("control_addr <", value, "controlAddr");
            return (Criteria) this;
        }

        public Criteria andControlAddrLessThanOrEqualTo(String value) {
            addCriterion("control_addr <=", value, "controlAddr");
            return (Criteria) this;
        }

        public Criteria andControlAddrLike(String value) {
            addCriterion("control_addr like", value, "controlAddr");
            return (Criteria) this;
        }

        public Criteria andControlAddrNotLike(String value) {
            addCriterion("control_addr not like", value, "controlAddr");
            return (Criteria) this;
        }

        public Criteria andControlAddrIn(List<String> values) {
            addCriterion("control_addr in", values, "controlAddr");
            return (Criteria) this;
        }

        public Criteria andControlAddrNotIn(List<String> values) {
            addCriterion("control_addr not in", values, "controlAddr");
            return (Criteria) this;
        }

        public Criteria andControlAddrBetween(String value1, String value2) {
            addCriterion("control_addr between", value1, value2, "controlAddr");
            return (Criteria) this;
        }

        public Criteria andControlAddrNotBetween(String value1, String value2) {
            addCriterion("control_addr not between", value1, value2, "controlAddr");
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