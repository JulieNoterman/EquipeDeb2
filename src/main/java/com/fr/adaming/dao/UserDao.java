package com.fr.adaming.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.fr.adaming.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	
	public User findByEmail(String email);
	
	public User getByEmailAndPwd (String email, String pwd);
	
	public List<User> findByEmailIn (String... email);
	
	//findByEmailIn("admin@adaming.fr", "a@adaming.fr", "b@adaming.fr");
	
	//update user set activated = true where role like 'admin'
	@Transactional
	@Modifying
	@Query(value = "update user set activated = true where role like :xRole", nativeQuery = true ) //Par défaut requete hql
	public void activateUserIfItIsAnAdmin(@Param(value = "xRole") String xRole);

}
