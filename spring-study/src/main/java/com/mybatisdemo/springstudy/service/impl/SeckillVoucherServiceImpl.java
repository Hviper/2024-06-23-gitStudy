package com.mybatisdemo.springstudy.service.impl;

import com.mybatisdemo.springstudy.entity.SeckillVoucher;
import com.mybatisdemo.springstudy.mapper.SeckillVoucherMapper;
import com.mybatisdemo.springstudy.service.ISeckillVoucherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 秒杀优惠券表，与优惠券是一对一关系 服务实现类
 * </p>
 *
 * @author 爱迪生
 * @since 2024-06-23
 */
@Service
public class SeckillVoucherServiceImpl extends ServiceImpl<SeckillVoucherMapper, SeckillVoucher> implements ISeckillVoucherService {

}
