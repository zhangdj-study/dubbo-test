package com.neusiri.provider.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author zhangdj
 * @date 2020-07-17 15:37
 * @Service 发布为dubbo服务
 */
@Component
@Service
public class TicketServiceImpl implements TicketService{
    @Override
    public String getTicket() {
        return "ticket-1";
    }
}
