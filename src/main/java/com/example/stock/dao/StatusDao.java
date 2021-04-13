  
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

//	@Query("from Status  WHERE likes =1 ")
//	@Query("SELECT  id code contenu totalJaime totalCommentaire dateStatus likes from status s WHERE likes = 1 ")
	@Query
	public Iterable<Status> findByLikes(Boolean likes);
}