package com.mybatisdemo.springstudy.service.impl;

import com.mybatisdemo.springstudy.entity.BlogComments;
import com.mybatisdemo.springstudy.mapper.BlogCommentsMapper;
import com.mybatisdemo.springstudy.service.IBlogCommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 爱迪生
 * @since 2024-06-23
 */
@Service
public class BlogCommentsServiceImpl extends ServiceImpl<BlogCommentsMapper, BlogComments> implements IBlogCommentsService {

}
