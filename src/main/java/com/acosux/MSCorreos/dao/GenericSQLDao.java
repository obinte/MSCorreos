package com.acosux.MSCorreos.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

public interface GenericSQLDao {

	@Transactional
	<T> List<T> obtenerPorSql(String consulta, Class<T> type);
      
      @Transactional
	<T> List<T> obtenerPorSql(String consulta);

	@Transactional
	<T> T obtenerObjetoPorSql(String consulta, Class<T> type);

	@Transactional
	Object obtenerObjetoPorSql(String consulta);

	@Transactional
	int ejecutarSQL(String consulta);

	Session session();
}