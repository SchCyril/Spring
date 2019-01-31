package fr.dta.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fr.dta.model.Employe;

public final class EmployeMapper implements RowMapper<Employe> {
	public Employe mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employe employe = new Employe();
		employe.setIdentifiant(rs.getLong("id"));
		employe.setNom(rs.getString("lastname"));
		employe.setDateEmbauche(rs.getDate("hiredate").toLocalDate());
		employe.setPrenom(rs.getString("firstname"));
		employe.setSalaire(rs.getBigDecimal("salary"));
		employe.setNumSecu(rs.getString("ssn"));
		return employe;
	}
}