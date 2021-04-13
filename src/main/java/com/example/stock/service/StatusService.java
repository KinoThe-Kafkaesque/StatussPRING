package com.example.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stock.bean.Status;
//import com.example.stock.bean.User;
import com.example.stock.dao.StatusDao;

@Service
public class StatusService {
	
	@Autowired
	private StatusDao statusDao;
	
//	@Autowired
//	private UserService userService;
//	
	public Status findByCode(String code) {
		return statusDao.findByCode(code);
	}
	
//	public List<Status> findByUserLogin(String login) {
//		return statusDao.findByUserLogin(login);
//	}
//	public int deleteByUserLogin(String login) {
//		return statusDao.deleteByUserLogin(login);
//	}

	public Status findBydateStatus(String dateStatus) {
		return  statusDao.findBydateStatus(dateStatus);
	}
	public  Status findBytotalCommentaire(Long totalCommentaire) {
		return statusDao.findBytotalCommentaire(totalCommentaire);
	}
	public Status findBytotalJaime(Long totalJaime) {
		return statusDao.findBytotalJaime(totalJaime);
	}
	public Status findBycontenu(String contenu) {
		return statusDao.findBycontenu(contenu);
	}
	
	
    public List<Status> findByLike() {
		return statusDao.findByLike();
	}

	public int save(Status status) {
        if (findByCode(status.getCode()) != null) {
            return -1;
        }
//        User user = userService.findByLogin(status.getUser().getLogin());
//        status.setUser(user);
//        if(user == null) {
//        	return -2;
//        }
//        userService.update(user);
        statusDao.save(status);
        return 1;
    }
	
	public List<Status> findAll() {
		return statusDao.findAll();
	}
	
	public int deleteByCode(String code) {
		return statusDao.deleteByCode(code);
	}
	
}