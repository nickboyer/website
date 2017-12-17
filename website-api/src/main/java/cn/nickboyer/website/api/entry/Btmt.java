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

	private String userImg;

	private String blogType;

	private String header;

	private byte[] content;

	private String contentStr;

	private String up;

	private Integer comment;

	private Integer watch;

	private Integer favour;

	private Date createTime;

	private Date updateTime;

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id 要设置的 id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return userid
	 */
	public Integer getUserid() {
		return userid;
	}

	/**
	 * @param userid 要设置的 userid
	 */
	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username 要设置的 username
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return userImg
	 */
	public String getUserImg() {
		return userImg;
	}

	/**
	 * @param userImg 要设置的 userImg
	 */
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}

	/**
	 * @return blogType
	 */
	public String getBlogType() {
		return blogType;
	}

	/**
	 * @param blogType 要设置的 blogType
	 */
	public void setBlogType(String blogType) {
		this.blogType = blogType;
	}

	/**
	 * @return header
	 */
	public String getHeader() {
		return header;
	}

	/**
	 * @param header 要设置的 header
	 */
	public void setHeader(String header) {
		this.header = header;
	}

	/**
	 * @return content
	 */
	public byte[] getContent() {
		return content;
	}

	/**
	 * @param content 要设置的 content
	 */
	public void setContent(byte[] content) {
		this.content = content;
		this.contentStr = new String(content);
	}

	/**
	 * @return contentStr
	 */
	public String getContentStr() {
		return contentStr;
	}

	/**
	 * @param contentStr 要设置的 contentStr
	 */
	public void setContentStr(String contentStr) {
		this.contentStr = contentStr;
	}

	/**
	 * @return up
	 */
	public String getUp() {
		return up;
	}

	/**
	 * @param up 要设置的 up
	 */
	public void setUp(String up) {
		this.up = up;
	}

	/**
	 * @return comment
	 */
	public Integer getComment() {
		return comment;
	}

	/**
	 * @param comment 要设置的 comment
	 */
	public void setComment(Integer comment) {
		this.comment = comment;
	}

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
	 * @return favour
	 */
	public Integer getFavour() {
		return favour;
	}

	/**
	 * @param favour 要设置的 favour
	 */
	public void setFavour(Integer favour) {
		this.favour = favour;
	}

	/**
	 * @return createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime 要设置的 createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * @param updateTime 要设置的 updateTime
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}