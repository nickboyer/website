package cn.nickboyer.website.api.entry;

import java.io.Serializable;
import java.util.Date;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
public class Btmt implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4456497812401345633L;

	private Integer id;

	private Integer userid;

	private String username;

	private String hidden;

	private Integer themeid;

	private String theme;

	private String mainHeader;

	private String subHeader;

	private byte[] content;

	private String contentStr;

	private byte[] contentDescription;

	private String contentDescriptionStr;

	private Integer comments;

	private Integer agree;

	private Integer disagree;

	private Integer favour;

	private Integer watch;

	private Date createTime;

	private Date updateTime;

	/**
	 * @return watch
	 */
	public Integer getWatch() {
		return watch;
	}

	/**
	 * @param watch 要设置的 watch
	 */
	public void setWatch(Integer watch) {
		this.watch = watch;
	}

	/**
	 * @return contentStr
	 */
	public String getContentStr() {
		return contentStr;
	}

	/**
	 * @param contentStr to set contentStr
	 */
	public void setContentStr(String contentStr) {
		this.contentStr = contentStr;
	}

	/**
	 * @return contentDescriptionStr
	 */
	public String getContentDescriptionStr() {
		return contentDescriptionStr;
	}

	/**
	 * @param contentDescriptionStr to set contentDescriptionStr
	 */
	public void setContentDescriptionStr(String contentDescriptionStr) {
		this.contentDescriptionStr = contentDescriptionStr;
	}

	/**
	 * @return content
	 */
	public byte[] getContent() {
		return content;
	}

	/**
	 * @param content to set content
	 */
	public void setContent(byte[] content) {
		this.content = content;
		this.contentStr = new String(content);
	}

	/**
	 * @return contentDescription
	 */
	public byte[] getContentDescription() {
		return contentDescription;
	}

	/**
	 * @param contentDescription to set contentDescription
	 */
	public void setContentDescription(byte[] contentDescription) {
		this.contentDescription = contentDescription;
		this.contentDescriptionStr = new String(contentDescription);
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