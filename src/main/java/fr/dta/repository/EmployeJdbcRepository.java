package fr.dta.repository;

import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.dta.mapper.EmployeMapper;
import fr.dta.model.Employe;

@Repository
public class EmployeJdbcRepository extends AbstractJdbcRepository implements EmployeRepository {

	@Override
	public void saveEmployee(Employe employe) {
		this.JdbcTemplate.update(
				"insert into employee (firstname, hiredate, lastname, salary, ssn) values (?, ?, ?, ?, ?)",
				employe.getPrenom(),
				Date.from(employe.getDateEmbauche().atStartOfDay(ZoneId.systemDefault()).toInstant()), employe.getNom(),
				employe.getSalaire(), employe.getNumSecu());
	}

	@Override
	public List<Employe> findAllEmployees() {
		return this.JdbcTemplate.query("select * from employee", new EmployeMapper());
	}

	@Override
	public Employe findBySsn(String ssn) {
		return this.JdbcTemplate.queryForObject("select * from employee where ssn = ?", new Object[] { ssn },
				new EmployeMapper());
	}

	@Override
	public void updateEmployee(Employe employe) {
		this.JdbcTemplate.update(
				"update employe set firstname = ?, hiredate = ?, lastname = ?; lastname = ?, salary = ?, ssn = ? where id = ?",
				employe.getPrenom(),
				Date.from(employe.getDateEmbauche().atStartOfDay(ZoneId.systemDefault()).toInstant()), employe.getNom(),
				employe.getSalaire(), employe.getNumSecu(), employe.getIdentifiant());
	}

}
