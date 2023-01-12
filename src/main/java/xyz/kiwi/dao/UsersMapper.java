package xyz.kiwi.dao;

import xyz.kiwi.model.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersMapper {
  List<Users> GetInfo();
  List<Users> SelectName(@Param("nickName") String nickName);
}
