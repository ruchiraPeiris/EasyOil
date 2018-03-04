package com.oilseller.oilbrocker.sellingItem.dao.impl;

import com.oilseller.oilbrocker.platform.dao.AbstractHibernateDao;
import com.oilseller.oilbrocker.sellingItem.dao.SellingItemDao;
import com.oilseller.oilbrocker.sellingItem.dto.SellingItem;
import com.oilseller.oilbrocker.sellingItem.entity.SellingItemEntity;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("sellingItemDao")
public class SellingItemDaoImpl { //extends AbstractHibernateDao implements SellingItemDao {


//    @Override
//    public Long addSellingItem(SellingItemEntity sellingItemEntity) {
//        getSession().save(sellingItemEntity);
//        return sellingItemEntity.getId();
//    }
//
//    @Override
//    public SellingItemEntity updateSellingItem(SellingItemEntity sellingItemEntity) {
//        getSession().update(sellingItemEntity);
//        return sellingItemEntity;
//    }
//
//    @Override
//    public SellingItemEntity loadSellingItem(Long orderItemId) {
//        return getSession().get(SellingItemEntity.class, orderItemId);
//    }
//
//    @Override
//    public SellingItemEntity loadSellingItemByReference(String itemReference) {
//        String hql = "from SellingItemEntity si where si.itemReference =:itemReference";
//        Query query = getSession().createQuery(hql);
//        query.setParameter("itemReference", itemReference);
//        return (SellingItemEntity) query.uniqueResult();
//    }
//
//    @Override
//    public List<SellingItemEntity> getAvailableSellingItems() {
//
//        String hql = "from SellingItemEntity si where si.status =:status";
//        Query query = getSession().createQuery(hql);
//        query.setParameter("status", "AVAILABLE");
//        return query.list();
//    }
}
