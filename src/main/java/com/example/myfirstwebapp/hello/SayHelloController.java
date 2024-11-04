package com.example.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World!";
    }
    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb=new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>Hello World!</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>Hello World rokon !</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
