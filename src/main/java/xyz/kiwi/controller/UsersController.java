package xyz.kiwi.controller;

import xyz.kiwi.model.Users;
import xyz.kiwi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@CrossOrigin
public class UsersController {
  @Autowired
  private UsersService usersService;

  @RequestMapping("/GetInfoApi")
  @ResponseBody
  public Object GetInfoApi(){
    List<Users> list=usersService.GetInfo();
    System.out.println(list);
    return list;
  }
  @RequestMapping("/GetInfo")
  public String GetInfo(HttpServletRequest request,Model model){
    List<Users> list=usersService.GetInfo();
    model.addAttribute("lists",list);
    return "GetInfo";
  }

  @RequestMapping("/GetName")
  public String GetName(HttpServletRequest request,Model model){
    String nickName = request.getParameter("nickName");
    List<Users> list=usersService.SelectName(nickName);
    model.addAttribute("lists",list);
    return "GetInfo";
  }
}

