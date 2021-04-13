package com.example.stock.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

public class Status implements Serializable {
	
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO)
		private Long id;
		private String code;
		private String contenu;
		private Long totalJaime;
		private Long totalCommentaire;
		private String dateStatus;
		private Boolean likes;
		public Boolean getLikes() {
			return likes;
		}

		public void setLikes(Boolean likes) {
			this.likes = likes;
		}

//		@ManyToOne 
//		private User user;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getContenu() {
			return contenu;
		}

		public void setContenu(String contenu) {
			this.contenu = contenu;
		}

		public Long getTotalJaime() {
			return totalJaime;
		}

		public void setTotalJaime(Long totalJaime) {
			this.totalJaime = totalJaime;
		}

		public Long getTotalCommentaire() {
			return totalCommentaire;
		}

		public void setTotalCommentaire(Long totalCommentaire) {
			this.totalCommentaire = totalCommentaire;
		}

		public String getDateStatus() {
			return dateStatus;
		}

		public void setDateStatus(String dateStatus) {
			this.dateStatus = dateStatus;
		}

//		public User getUser() {
//			return user;
//		}
//
//		public void setUser(User user) {
//			this.user = user;
//		}
//
//		
//	
//	

		
		
	
}