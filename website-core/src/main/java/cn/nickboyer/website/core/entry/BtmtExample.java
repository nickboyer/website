package cn.nickboyer.website.core.entry;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BtmtExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public BtmtExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andHiddenIsNull() {
            addCriterion("HIDDEN is null");
            return (Criteria) this;
        }

        public Criteria andHiddenIsNotNull() {
            addCriterion("HIDDEN is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenEqualTo(String value) {
            addCriterion("HIDDEN =", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotEqualTo(String value) {
            addCriterion("HIDDEN <>", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThan(String value) {
            addCriterion("HIDDEN >", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenGreaterThanOrEqualTo(String value) {
            addCriterion("HIDDEN >=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThan(String value) {
            addCriterion("HIDDEN <", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLessThanOrEqualTo(String value) {
            addCriterion("HIDDEN <=", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenLike(String value) {
            addCriterion("HIDDEN like", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotLike(String value) {
            addCriterion("HIDDEN not like", value, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenIn(List<String> values) {
            addCriterion("HIDDEN in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotIn(List<String> values) {
            addCriterion("HIDDEN not in", values, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenBetween(String value1, String value2) {
            addCriterion("HIDDEN between", value1, value2, "hidden");
            return (Criteria) this;
        }

        public Criteria andHiddenNotBetween(String value1, String value2) {
            addCriterion("HIDDEN not between", value1, value2, "hidden");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNull() {
            addCriterion("THEMEID is null");
            return (Criteria) this;
        }

        public Criteria andThemeidIsNotNull() {
            addCriterion("THEMEID is not null");
            return (Criteria) this;
        }

        public Criteria andThemeidEqualTo(Integer value) {
            addCriterion("THEMEID =", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotEqualTo(Integer value) {
            addCriterion("THEMEID <>", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThan(Integer value) {
            addCriterion("THEMEID >", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("THEMEID >=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThan(Integer value) {
            addCriterion("THEMEID <", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidLessThanOrEqualTo(Integer value) {
            addCriterion("THEMEID <=", value, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidIn(List<Integer> values) {
            addCriterion("THEMEID in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotIn(List<Integer> values) {
            addCriterion("THEMEID not in", values, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidBetween(Integer value1, Integer value2) {
            addCriterion("THEMEID between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeidNotBetween(Integer value1, Integer value2) {
            addCriterion("THEMEID not between", value1, value2, "themeid");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("THEME is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("THEME is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("THEME =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("THEME <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("THEME >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("THEME >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("THEME <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("THEME <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("THEME like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("THEME not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("THEME in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("THEME not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("THEME between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("THEME not between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andMainHeaderIsNull() {
            addCriterion("MAIN_HEADER is null");
            return (Criteria) this;
        }

        public Criteria andMainHeaderIsNotNull() {
            addCriterion("MAIN_HEADER is not null");
            return (Criteria) this;
        }

        public Criteria andMainHeaderEqualTo(String value) {
            addCriterion("MAIN_HEADER =", value, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andMainHeaderNotEqualTo(String value) {
            addCriterion("MAIN_HEADER <>", value, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andMainHeaderGreaterThan(String value) {
            addCriterion("MAIN_HEADER >", value, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andMainHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_HEADER >=", value, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andMainHeaderLessThan(String value) {
            addCriterion("MAIN_HEADER <", value, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andMainHeaderLessThanOrEqualTo(String value) {
            addCriterion("MAIN_HEADER <=", value, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andMainHeaderLike(String value) {
            addCriterion("MAIN_HEADER like", value, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andMainHeaderNotLike(String value) {
            addCriterion("MAIN_HEADER not like", value, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andMainHeaderIn(List<String> values) {
            addCriterion("MAIN_HEADER in", values, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andMainHeaderNotIn(List<String> values) {
            addCriterion("MAIN_HEADER not in", values, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andMainHeaderBetween(String value1, String value2) {
            addCriterion("MAIN_HEADER between", value1, value2, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andMainHeaderNotBetween(String value1, String value2) {
            addCriterion("MAIN_HEADER not between", value1, value2, "mainHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderIsNull() {
            addCriterion("SUB_HEADER is null");
            return (Criteria) this;
        }

        public Criteria andSubHeaderIsNotNull() {
            addCriterion("SUB_HEADER is not null");
            return (Criteria) this;
        }

        public Criteria andSubHeaderEqualTo(String value) {
            addCriterion("SUB_HEADER =", value, "subHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderNotEqualTo(String value) {
            addCriterion("SUB_HEADER <>", value, "subHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderGreaterThan(String value) {
            addCriterion("SUB_HEADER >", value, "subHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderGreaterThanOrEqualTo(String value) {
            addCriterion("SUB_HEADER >=", value, "subHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderLessThan(String value) {
            addCriterion("SUB_HEADER <", value, "subHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderLessThanOrEqualTo(String value) {
            addCriterion("SUB_HEADER <=", value, "subHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderLike(String value) {
            addCriterion("SUB_HEADER like", value, "subHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderNotLike(String value) {
            addCriterion("SUB_HEADER not like", value, "subHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderIn(List<String> values) {
            addCriterion("SUB_HEADER in", values, "subHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderNotIn(List<String> values) {
            addCriterion("SUB_HEADER not in", values, "subHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderBetween(String value1, String value2) {
            addCriterion("SUB_HEADER between", value1, value2, "subHeader");
            return (Criteria) this;
        }

        public Criteria andSubHeaderNotBetween(String value1, String value2) {
            addCriterion("SUB_HEADER not between", value1, value2, "subHeader");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(Integer value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(Integer value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(Integer value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(Integer value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<Integer> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<Integer> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(Integer value1, Integer value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andAgreeIsNull() {
            addCriterion("AGREE is null");
            return (Criteria) this;
        }

        public Criteria andAgreeIsNotNull() {
            addCriterion("AGREE is not null");
            return (Criteria) this;
        }

        public Criteria andAgreeEqualTo(Integer value) {
            addCriterion("AGREE =", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeNotEqualTo(Integer value) {
            addCriterion("AGREE <>", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeGreaterThan(Integer value) {
            addCriterion("AGREE >", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AGREE >=", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeLessThan(Integer value) {
            addCriterion("AGREE <", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeLessThanOrEqualTo(Integer value) {
            addCriterion("AGREE <=", value, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeIn(List<Integer> values) {
            addCriterion("AGREE in", values, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeNotIn(List<Integer> values) {
            addCriterion("AGREE not in", values, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeBetween(Integer value1, Integer value2) {
            addCriterion("AGREE between", value1, value2, "agree");
            return (Criteria) this;
        }

        public Criteria andAgreeNotBetween(Integer value1, Integer value2) {
            addCriterion("AGREE not between", value1, value2, "agree");
            return (Criteria) this;
        }

        public Criteria andDisagreeIsNull() {
            addCriterion("DISAGREE is null");
            return (Criteria) this;
        }

        public Criteria andDisagreeIsNotNull() {
            addCriterion("DISAGREE is not null");
            return (Criteria) this;
        }

        public Criteria andDisagreeEqualTo(Integer value) {
            addCriterion("DISAGREE =", value, "disagree");
            return (Criteria) this;
        }

        public Criteria andDisagreeNotEqualTo(Integer value) {
            addCriterion("DISAGREE <>", value, "disagree");
            return (Criteria) this;
        }

        public Criteria andDisagreeGreaterThan(Integer value) {
            addCriterion("DISAGREE >", value, "disagree");
            return (Criteria) this;
        }

        public Criteria andDisagreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISAGREE >=", value, "disagree");
            return (Criteria) this;
        }

        public Criteria andDisagreeLessThan(Integer value) {
            addCriterion("DISAGREE <", value, "disagree");
            return (Criteria) this;
        }

        public Criteria andDisagreeLessThanOrEqualTo(Integer value) {
            addCriterion("DISAGREE <=", value, "disagree");
            return (Criteria) this;
        }

        public Criteria andDisagreeIn(List<Integer> values) {
            addCriterion("DISAGREE in", values, "disagree");
            return (Criteria) this;
        }

        public Criteria andDisagreeNotIn(List<Integer> values) {
            addCriterion("DISAGREE not in", values, "disagree");
            return (Criteria) this;
        }

        public Criteria andDisagreeBetween(Integer value1, Integer value2) {
            addCriterion("DISAGREE between", value1, value2, "disagree");
            return (Criteria) this;
        }

        public Criteria andDisagreeNotBetween(Integer value1, Integer value2) {
            addCriterion("DISAGREE not between", value1, value2, "disagree");
            return (Criteria) this;
        }

        public Criteria andFavourIsNull() {
            addCriterion("FAVOUR is null");
            return (Criteria) this;
        }

        public Criteria andFavourIsNotNull() {
            addCriterion("FAVOUR is not null");
            return (Criteria) this;
        }

        public Criteria andFavourEqualTo(Integer value) {
            addCriterion("FAVOUR =", value, "favour");
            return (Criteria) this;
        }

        public Criteria andFavourNotEqualTo(Integer value) {
            addCriterion("FAVOUR <>", value, "favour");
            return (Criteria) this;
        }

        public Criteria andFavourGreaterThan(Integer value) {
            addCriterion("FAVOUR >", value, "favour");
            return (Criteria) this;
        }

        public Criteria andFavourGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAVOUR >=", value, "favour");
            return (Criteria) this;
        }

        public Criteria andFavourLessThan(Integer value) {
            addCriterion("FAVOUR <", value, "favour");
            return (Criteria) this;
        }

        public Criteria andFavourLessThanOrEqualTo(Integer value) {
            addCriterion("FAVOUR <=", value, "favour");
            return (Criteria) this;
        }

        public Criteria andFavourIn(List<Integer> values) {
            addCriterion("FAVOUR in", values, "favour");
            return (Criteria) this;
        }

        public Criteria andFavourNotIn(List<Integer> values) {
            addCriterion("FAVOUR not in", values, "favour");
            return (Criteria) this;
        }

        public Criteria andFavourBetween(Integer value1, Integer value2) {
            addCriterion("FAVOUR between", value1, value2, "favour");
            return (Criteria) this;
        }

        public Criteria andFavourNotBetween(Integer value1, Integer value2) {
            addCriterion("FAVOUR not between", value1, value2, "favour");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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