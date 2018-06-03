package com.wyait.manage.web.order;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrdersController {

    @RequestMapping("/ordersList")
    public String toOrderList() {
        return "/order/ordersList";
    }
}
