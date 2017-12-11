/*
 * Copyright 2014 Buyforyou.cn All rights reserved
 * 
 * @author Kang.Y
 * 
 * @mail
 * 
 * @createtime 2017年12月11日 下午10:19:22
 */
package cn.nickboyer.website.core.mybatis.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BlobTypeHandler;
import org.apache.ibatis.type.JdbcType;

/**
 * @title 自定义typehandler，解决mybatis存储blob字段后，出现乱码的问题
 * @description
 * @since JDK1.8
 */
// @MappedTypes(value = { Btmt.class })
public class ConvertBlobTypeHandler extends BlobTypeHandler {
	// ###指定字符集
	private static final String DEFAULT_CHARSET = "utf-8";

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.apache.ibatis.type.BlobTypeHandler#setNonNullParameter(java.sql.PreparedStatement, int, byte[], org.apache.ibatis.type.JdbcType)
	 */
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, byte[] parameter, JdbcType jdbcType) throws SQLException {
		// TODO 自动生成方法存根
		super.setNonNullParameter(ps, i, parameter, jdbcType);
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.apache.ibatis.type.BlobTypeHandler#getNullableResult(java.sql.ResultSet, java.lang.String)
	 */
	@Override
	public byte[] getNullableResult(ResultSet rs, String columnName) throws SQLException {

		return super.getNullableResult(rs, columnName);
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.apache.ibatis.type.BlobTypeHandler#getNullableResult(java.sql.ResultSet, int)
	 */
	@Override
	public byte[] getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO 自动生成方法存根
		return super.getNullableResult(rs, columnIndex);
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see org.apache.ibatis.type.BlobTypeHandler#getNullableResult(java.sql.CallableStatement, int)
	 */
	@Override
	public byte[] getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {

		return super.getNullableResult(cs, columnIndex);
	}

}