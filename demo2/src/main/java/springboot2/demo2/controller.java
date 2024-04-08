package springboot2.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;


@Controller
public class controller {

    // @Autowired
    // private userrepository userrepo;
    

    // @RequestMapping("")
    // @ResponseBody
    // public String print()
    // {
    //     return "first.jsp";
    // }

    @GetMapping("/first")
    public String homepage()
    {

        return "home";
    }
    
}
