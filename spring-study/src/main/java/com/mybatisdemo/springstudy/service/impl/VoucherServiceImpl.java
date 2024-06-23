package com.mybatisdemo.springstudy.service.impl;

import com.mybatisdemo.springstudy.entity.Voucher;
import com.mybatisdemo.springstudy.mapper.VoucherMapper;
import com.mybatisdemo.springstudy.service.IVoucherService;
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
public class VoucherServiceImpl extends ServiceImpl<VoucherMapper, Voucher> implements IVoucherService {

}
