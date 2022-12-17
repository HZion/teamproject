package com.tuto.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {


    @Autowired
    BoardService boardService;

    @RequestMapping(value = "/")
    public String home(){

        return "index";
    }

    @RequestMapping(value = "/board/list", method =  RequestMethod.GET)
    public String boardlist(Model model){
        model.addAttribute("lists",boardService.getGwamogList());
        return "list";
    }
    @RequestMapping(value =  "/board/add", method = RequestMethod.GET)
    public String addPost(){
        return "addpostform";
    }

    @RequestMapping(value =  "/board/addok", method = RequestMethod.POST)
    public String addPostOk(BoardVO vo){
        if(boardService.insertGwamog(vo)==0)
            System.out.println("데이터 추가 실패");
        else
            System.out.println("데이터 추가 성공");

        return "redirect:list";
    }
    @RequestMapping(value = "/board/editform/{id}", method = RequestMethod.GET)
    public String editPost(@PathVariable("id")int id, Model model){
        BoardVO boardVO = boardService.getGwamog(id);
        model.addAttribute("boardVO",boardVO);
        return "editform";
    }
    @RequestMapping(value ="/board/editok", method = RequestMethod.POST)
        public String editPostOk(BoardVO vo){
            if(boardService.updateGwamog(vo)== 0){
                System.out.println("데이터 수정 실패");
        }
            else{
                System.out.println("데이터 수정 성공");
            }
            return "redirect:list";
    }
    @RequestMapping(value ="/board/deleteok/{id}", method = RequestMethod.GET)
        public String deletePostOk(@PathVariable("id") int id) {
        if (boardService.deleteGwamog(id) == 0)
            System.out.println("데이터삭제 실패");
        else
            System.out.println("데이터삭제 성공");

        return "redirect:../list";
        }
    @RequestMapping(value="/signup")
    public String signup(HttpSession session) {
        session.invalidate();
        return "edituser";
    }

}
