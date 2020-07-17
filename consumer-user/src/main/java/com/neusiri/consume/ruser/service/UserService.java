package com.neusiri.consume.ruser.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.neusiri.provider.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author zhangdj
 * @date 2020-07-17 16:04
 */
@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void buyTicket(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了" + ticket);
    }
}
