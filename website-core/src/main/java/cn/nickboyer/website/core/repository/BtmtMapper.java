package cn.nickboyer.website.core.repository;

import java.util.List;

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
	@Select("select * from btmt order by agree desc,favour desc limit 1")
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
	@Select("select * from btmt order by ${orderBy} ${order}")
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
	@Select("select * from btmt where id = #{id}")
	Btmt selectById(String id);

}