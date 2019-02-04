package fr.dta.repository;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import fr.dta.exception.EmployeNotFoundException;
import fr.dta.model.Employe;


@Repository
public class EmployeJpaRepository extends AbstractJpaRepository<Employe> implements EmployeRepository {

	@Override
	protected Class<Employe> getEntityClass() {
		return Employe.class;
	}

	@Override

	public void saveEmployee(Employe employe) {
		this.save(employe);

	}

	@Override
	public List<Employe> findAllEmployees() {
		return this.findAll();
	}

	@Override
	public Employe findBySsn(String ssn) {
		TypedQuery<Employe> query = em.createQuery("from Employe e where e.numSecu =:numSecu", Employe.class);
		query.setParameter("numSecu", ssn);
		
		return query.getSingleResult();
	}

	@Override
	public void updateEmployee(Employe employe) {
		if (!isNew(employe)) {
			this.save(employe);
		} else {
			throw new EmployeNotFoundException("not updatable");
		}
	}

	@Override
	public void deleteAllEmployees() {
		em.createQuery("delete from Employe").executeUpdate();
	}

}
