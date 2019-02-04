package fr.dta.repository;

import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import fr.dta.exception.EmployeNotFoundException;
import fr.dta.mapper.EmployeMapper;
import fr.dta.model.Employe;

@Repository
public class EmployeJdbcRepository extends AbstractJdbcRepository implements EmployeRepository {

	@Override
	public void saveEmployee(Employe employe) {
		this.JdbcTemplate.update(
				"insert into employe (prenom, dateEmbauche, nom, salaire, numSecu) values (?, ?, ?, ?, ?)",
				employe.getPrenom(),
				Date.from(employe.getDateEmbauche().atStartOfDay(ZoneId.systemDefault()).toInstant()), employe.getNom(),
				employe.getSalaire(), employe.getNumSecu());
	}

	@Override
	public List<Employe> findAllEmployees() {
		return this.JdbcTemplate.query("select * from employe", new EmployeMapper());
	}

	@Override
	public Employe findBySsn(String ssn) {
		return this.JdbcTemplate.queryForObject("select * from employee where ssn = ?", new Object[] { ssn },
				new EmployeMapper());
	}

	@Override
	public void updateEmployee(Employe employe) {
		if (this.JdbcTemplate.update(
				"update employe set prenom = ?, dateEmbauche = ?, nom = ?, salaire = ?, numSecu = ? where id = ?",
				employe.getPrenom(),
				Date.from(employe.getDateEmbauche().atStartOfDay(ZoneId.systemDefault()).toInstant()), employe.getNom(),
				employe.getSalaire(), employe.getNumSecu(), employe.getId()) != 1) {
			throw new EmployeNotFoundException("raté");
		}

	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
	}

}
