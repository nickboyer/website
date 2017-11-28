package cn.nickboyer.website.core.repository;

import cn.nickboyer.website.core.entry.Btmt;
import cn.nickboyer.website.core.entry.BtmtExample;
import cn.nickboyer.website.core.entry.BtmtWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BtmtMapper {
    int countByExample(BtmtExample example);

    int deleteByExample(BtmtExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BtmtWithBLOBs record);

    int insertSelective(BtmtWithBLOBs record);

    List<BtmtWithBLOBs> selectByExampleWithBLOBs(BtmtExample example);

    List<Btmt> selectByExample(BtmtExample example);

    BtmtWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BtmtWithBLOBs record, @Param("example") BtmtExample example);

    int updateByExampleWithBLOBs(@Param("record") BtmtWithBLOBs record, @Param("example") BtmtExample example);

    int updateByExample(@Param("record") Btmt record, @Param("example") BtmtExample example);

    int updateByPrimaryKeySelective(BtmtWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BtmtWithBLOBs record);

    int updateByPrimaryKey(Btmt record);
}