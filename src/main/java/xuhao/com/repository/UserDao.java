package xuhao.com.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import xuhao.com.domin.User;

@Repository
public interface UserDao extends JpaRepository<User, Serializable>{
	@Query(value="select * from tb_user1",nativeQuery=true)
	List<User> findAllUser();
}
