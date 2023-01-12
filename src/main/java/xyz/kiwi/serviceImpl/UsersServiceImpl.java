package xyz.kiwi.serviceImpl;

import xyz.kiwi.dao.UsersMapper;
import xyz.kiwi.model.Users;
import xyz.kiwi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {
  @Autowired
  private UsersMapper usersMapper;

  @Override
  public List<Users> GetInfo() {
    return usersMapper.GetInfo();
  }

  @Override
  public List<Users> SelectName(String nickName) {
    return usersMapper.SelectName(nickName);
  }
}
