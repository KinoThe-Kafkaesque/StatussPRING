  
package com.example.stock.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.stock.bean.Status;

@Repository
public interface StatusDao extends JpaRepository<Status, Long> { 
	
	public Status findByCode(String code);
	
//	public List<Status> findByUserLogin(String login);
	
//	int deleteByUserLogin(String login);

	public Status findBycontenu( String contenu);
	
	public Status findBytotalJaime(Long totalJaime);
	
	public Status findBytotalCommentaire(Long totalCommentaire);
	
	public Status findBydateStatus( String dateStatus);
	@Transactional
	public int deleteByCode(String code);
	 
	@Query("SELECT s from Status s WHERE s.likes LIKE 'true' ")
	public List<Status> findByLike();
}