package com.javahzs.service.impl;

import com.javahzs.mapper.AutoReplyMapper;
import com.javahzs.pojo.AutoReply;
import com.javahzs.service.AutoReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoReplyServiceImpl implements AutoReplyService {

    @Autowired
    private AutoReplyMapper autoReplyMapper;

    @Override
    public AutoReply selectById(Integer id) {
        AutoReply autoReply = autoReplyMapper.selectById(id);
        return autoReply;
    }
}
