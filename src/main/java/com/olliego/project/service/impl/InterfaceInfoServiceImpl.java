package com.olliego.project.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.olliego.project.common.ErrorCode;
import com.olliego.project.exception.BusinessException;
import com.olliego.project.model.entity.InterfaceInfo;
import com.olliego.project.model.enums.PostGenderEnum;
import com.olliego.project.model.enums.PostReviewStatusEnum;
import com.olliego.project.service.InterfaceInfoService;
import com.olliego.project.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
* @author OllieGo
* @description 针对表【interface_info(接口信息)】的数据库操作Service实现
* @createDate 2023-10-01 16:26:58
*/
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

}




