package fr.dta.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractJdbcRepository {

	protected JdbcTemplate JdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.JdbcTemplate = new JdbcTemplate(dataSource);
	}

}
