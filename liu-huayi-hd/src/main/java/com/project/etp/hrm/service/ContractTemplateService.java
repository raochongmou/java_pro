package com.project.etp.hrm.service;

import com.project.etp.hrm.dto.RequestDto;
import com.project.etp.hrm.dto.resp.CtrcTmptVo;
import com.project.etp.hrm.entity.ContractTemplate;
import com.project.etp.hrm.service.impl.ContractTemplateServiceImpl;
import com.project.etp.hrm.util.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/***
 * @Author: it.wizard@foxmail.com
 * @Date: 2023/3/17 15:27
 * @Description: TODO
 * @Version 1.0
 ***/
@Service
public class ContractTemplateService {

    private final static Logger logger = LoggerFactory.getLogger(ContractTemplateService.class);

    private final ContractTemplateServiceImpl contractTemplateServiceImpl;

    public ContractTemplateService(ContractTemplateServiceImpl contractTemplateServiceImpl) {
        this.contractTemplateServiceImpl = contractTemplateServiceImpl;
    }

    public AjaxResult list(RequestDto requestDto) {
        logger.info("查询合同模板的接口参数-{}", requestDto);
///     TODO  此处逻辑是查询全部的，没有加上对应的条件、也没有采取分页 ,后面再完成
        List<ContractTemplate> list = contractTemplateServiceImpl.list();
        if (CollectionUtils.isEmpty(list)) {
            return AjaxResult.success("查询成功", new ArrayList<>(), 0L);
        }
        List<CtrcTmptVo> voList = new ArrayList<>();
        ContractTemplate contractTemplate;
        for (int i = 0; i < list.size(); i++) {
            contractTemplate = list.get(i);
            CtrcTmptVo vo = CtrcTmptVo.inject(contractTemplate);
            voList.add(vo);
        }
        return AjaxResult.success(voList, voList.size());
    }
}
