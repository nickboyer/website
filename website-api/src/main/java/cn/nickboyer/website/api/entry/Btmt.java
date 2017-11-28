package cn.nickboyer.website.api.entry;

import java.util.Date;

public class Btmt {
	private Integer id;

	private Integer userid;

	private String username;

	private String hidden;

	private Integer themeid;

	private String theme;

	private String mainHeader;

	private String subHeader;

	private String content;

	private String contentDescription;

	private Integer comments;

	private Integer agree;

	private Integer disagree;

	private Integer favour;

	private Date createTime;

	private Date updateTime;

	/**
	 * @return content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content to set content
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return contentDescription
	 */
	public String getContentDescription() {
		return contentDescription;
	}

	/**
	 * @param contentDescription to set contentDescription
	 */
	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getHidden() {
		return hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden == null ? null : hidden.trim();
	}

	public Integer getThemeid() {
		return themeid;
	}

	public void setThemeid(Integer themeid) {
		this.themeid = themeid;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme == null ? null : theme.trim();
	}

	public String getMainHeader() {
		return mainHeader;
	}

	public void setMainHeader(String mainHeader) {
		this.mainHeader = mainHeader == null ? null : mainHeader.trim();
	}

	public String getSubHeader() {
		return subHeader;
	}

	public void setSubHeader(String subHeader) {
		this.subHeader = subHeader == null ? null : subHeader.trim();
	}

	public Integer getComments() {
		return comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public Integer getAgree() {
		return agree;
	}

	public void setAgree(Integer agree) {
		this.agree = agree;
	}

	public Integer getDisagree() {
		return disagree;
	}

	public void setDisagree(Integer disagree) {
		this.disagree = disagree;
	}

	public Integer getFavour() {
		return favour;
	}

	public void setFavour(Integer favour) {
		this.favour = favour;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}