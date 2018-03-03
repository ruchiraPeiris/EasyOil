package com.oilseller.oilbrocker.history.service.impl;

import com.oilseller.oilbrocker.history.adaptor.HistoryItemModelAdaptor;
import com.oilseller.oilbrocker.history.dao.HistoryDao;
import com.oilseller.oilbrocker.history.dto.HistoryItem;
import com.oilseller.oilbrocker.history.service.HistoryService;
import com.oilseller.oilbrocker.platform.thread.ThreadLocalContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("historyService")
public class HistoryServiceImpl implements HistoryService {

    private HistoryDao historyDao;

    private HistoryItemModelAdaptor historyItemModelAdaptor = new HistoryItemModelAdaptor();

    @Autowired
    public HistoryServiceImpl(HistoryDao historyDao) {
        this.historyDao = historyDao;
    }

    @Transactional
    @Override
    public Boolean addHistoryItem(HistoryItem historyItem) {
        historyDao.addHistoryItem(historyItemModelAdaptor.fromDto(historyItem));
        return Boolean.TRUE;
    }

    @Transactional
    @Override
    public List<HistoryItem> loadHistoryItemByOrderId(Long orderId) {
        return historyItemModelAdaptor.fromModelList(historyDao.loadHistoryByOrderId(orderId));
    }

    @Transactional
    @Override
    public List<HistoryItem> loadStatusChangeActivityByOrderId(Long orderId) {
        return null;
    }
}
