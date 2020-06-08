package com.sboot.crud.springbootcrudapi.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sboot.crud.springbootcrudapi.pojo.EmployeeEntity;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
	@Autowired
	private SessionFactory sessionFactory;

	public List<EmployeeEntity> getWork(int primaryKey) {
		CriteriaQuery<EmployeeEntity> criteria = sessionFactory.openSession().getCriteriaBuilder().createQuery(EmployeeEntity.class);
		criteria.from(EmployeeEntity.class);
		return sessionFactory.openSession().createQuery(criteria).getResultList();
	}

}
