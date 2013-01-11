package com.bookshop.mvc;

import com.bookshop.service.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: leiyu
 * Date: 13-1-9
 * Time: 上午10:57
 * To change this template use File | Settings | File Templates.
 */
public class HomePageController extends AbstractController {
    public HomePageController(){}
    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ArrayList<Book> booksInTheStore = service.getList();
        for(int i=0;i<booksInTheStore.size();i++){
            System.out.println(booksInTheStore.get(i).getBookName()+" "+booksInTheStore.get(i).getPrice()+ " "+booksInTheStore.get(i).getAuthor());
        }
        return new ModelAndView("home","books",booksInTheStore);
    }
    private Service service;
    public void setBookService(Service service){
        this.service = service;
    }
}
