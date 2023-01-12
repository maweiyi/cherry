package xyz.kiwi.service;

import java.util.List;
import xyz.kiwi.model.Users;

public interface UsersService {
  List<Users> GetInfo();
  List<Users> SelectName(String nickName);
}
