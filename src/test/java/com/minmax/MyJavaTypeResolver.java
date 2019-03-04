package com.minmax;

import java.math.BigDecimal;
import java.sql.Types;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

/**
 * 档案名称: java.java 项目名称： MyJavaTypeResolver @author： 胡旭東 创建时间： 2018年5月15日
 * 上午11:29:33 描述: [数据库的数据类型按照指定类型转到Java中]
 */
public class MyJavaTypeResolver extends JavaTypeResolverDefaultImpl {
	/**
	 * @描述: 如果数据库数据类型是double,转到Java的model中为BigDecimal
	 */
	@Override
	public FullyQualifiedJavaType calculateJavaType(IntrospectedColumn introspectedColumn) {
		FullyQualifiedJavaType answer = null;
		JdbcTypeInformation jdbcTypeInformation = typeMap.get(introspectedColumn.getJdbcType());
		if (jdbcTypeInformation != null) {
			switch (introspectedColumn.getJdbcType()) {
			case Types.DOUBLE:
				answer = new FullyQualifiedJavaType(BigDecimal.class.getName());
				break;
			default:
				answer = jdbcTypeInformation.getFullyQualifiedJavaType();
				break;
			}
		}
		return answer;
	}

}
