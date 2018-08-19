package com.javahzs.controller;

import com.javahzs.pojo.AutoReply;
import com.javahzs.service.AutoReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AutoReplyController {

    @Autowired
    private AutoReplyService autoReplyService;

    @RequestMapping("/autoreply/{id}")
    public @ResponseBody AutoReply selectById(@PathVariable Integer id) {
        AutoReply autoReply = autoReplyService.selectById(id);
        return autoReply;
    }
}
