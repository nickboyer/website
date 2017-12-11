package cn.nickboyer.website.core.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
	@Select("select * from BTMT where agree = '1'")
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
	@Select("select id,userid,username,theme,main_header,agree,disagree,favour,watch,create_time,update_time from BTMT order by create_time desc")
	List<Btmt> selectTimeline();

	/**
	 * @param info
	 *
	 * @authz Kang.Y
	 * @createtime 2017年12月11日 下午11:56:23
	 */
	@Insert("insert into btmt (userid,themeid,main_header,content,create_time) values (#{userid},#{themeid},#{mainHeader},#{content},#{createTime})")
	void insertBlog(Btmt info);

}