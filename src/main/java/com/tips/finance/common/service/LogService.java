package com.tips.finance.common.service;

import org.springframework.stereotype.Service;

import com.tips.finance.common.domain.LogDO;
import com.tips.finance.common.domain.PageDO;
import com.tips.finance.common.utils.Query;
@Service
public interface LogService {
	PageDO<LogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(Long[] ids);
}
