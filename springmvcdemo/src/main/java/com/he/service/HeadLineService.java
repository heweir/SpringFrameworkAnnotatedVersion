package com.imooc.service;

import com.imooc.entity.bo.HeadLine;
import com.imooc.entity.dto.Result;

public interface HeadLineService {
	Result<Boolean> addHeadLine(HeadLine headLine);
}
