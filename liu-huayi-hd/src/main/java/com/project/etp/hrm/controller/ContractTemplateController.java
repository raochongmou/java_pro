package com.project.etp.hrm.controller;

import com.project.etp.hrm.dto.RequestDto;
import com.project.etp.hrm.service.ContractTemplateService;
import com.project.etp.hrm.util.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/***
 * @Author: it.wizard@foxmail.com
 * @Date: 2023/3/17 15:27
 * @Description: TODO
 * @Version 1.0
 ***/
@RequestMapping("/ctrcTmpt")
@RestController
public class ContractTemplateController extends BaseController {

    private final static Logger logger = LoggerFactory.getLogger(ContractTemplateController.class);

    private final ContractTemplateService contractTemplateService;

    public ContractTemplateController(ContractTemplateService contractTemplateService) {
        this.contractTemplateService = contractTemplateService;
    }

    @PostMapping("/list")
    public @ResponseBody
    AjaxResult list(@RequestBody RequestDto requestDto) {
        String userId = getUserId();
        requestDto.setUserId(userId);
        return contractTemplateService.list(requestDto);

    }
}
