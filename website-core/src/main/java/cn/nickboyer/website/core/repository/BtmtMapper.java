package cn.nickboyer.website.core.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.nickboyer.website.api.entry.Btmt;

/**
 * @title
 * @description
 * @author Kang.Y
 * @since JDK1.8
 */
@Mapper
public interface BtmtMapper {

	/**
	 * 获取最热门文章
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年11月29日 下午2:48:02
	 */
	@Select("select * from BTMT order by agree desc,favour desc limit 1")
	Btmt selectHottest();

	/**
	 * 获取文章列表
	 * 
	 * @param orderBy
	 * @param order
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月1日 下午3:15:18
	 */
	@Select("select * from BTMT order by ${orderBy} ${order}")
	List<Btmt> selectList(@Param("orderBy") String orderBy, @Param("order") String order);

	/**
	 * 通过主键获取文章
	 * 
	 * @param id
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月4日 下午3:14:58
	 */
	@Select("select * from BTMT where id = #{id}")
	Btmt selectById(String id);

	/**
	 * 获取所有置顶博客
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午10:12:54
	 */
	@Select("select * from BTMT where up = '0'")
	List<Btmt> selectAgrees();

	/**
	 * 获取用户最近十篇
	 * 
	 * @param id
	 * 
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月8日 下午11:13:17
	 */
	@Select("select * from BTMT where userid = #{id} order by create_time desc limit 10")
	List<Btmt> selectUserLasted(String id);

	/**
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月10日 上午10:22:30
	 */
	@Select("select id,userid,username,header,create_time,update_time from BTMT order by create_time desc")
	List<Btmt> selectTimeline();

	/**
	 * @param info
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月11日 下午11:56:23
	 */
	@Insert("insert into btmt (userid,username,user_img,blog_type,header,content,create_time) values (#{userid},#{username},#{userImg},#{blogType},#{header},#{content},#{createTime})")
	@Options(useGeneratedKeys = true, keyProperty = "id")
	void insertBlog(Btmt info);

	/**
	 * @param id
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月16日 下午5:52:55
	 */
	@Update("update btmt set watch = watch +1 where id = #{id}")
	void updateWatch(String id);

	/**
	 * @param username
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月16日 下午11:51:08
	 */
	@Select("select * from BTMT where username = #{username} order by create_time desc limit 10")
	List<Btmt> selectUserLastedByName(String username);

	/**
	 * @param relid
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月17日 上午12:05:55
	 */
	@Update("update btmt set comment = comment + 1 where id = #{relid}")
	void updateComment(Integer relid);

	/**
	 * @return
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月17日 上午12:15:16
	 */
	@Select("select id,header,comment from btmt order by comment desc limit 10")
	List<Btmt> selectComments();

}