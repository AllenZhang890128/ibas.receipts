package org.colorcoding.ibas.receipts.test.bo;

import junit.framework.TestCase;
import org.colorcoding.ibas.bobas.data.*;
import org.colorcoding.ibas.bobas.common.*;
import org.colorcoding.ibas.bobas.repository.*;
import org.colorcoding.ibas.receipts.data.*;
import org.colorcoding.ibas.receipts.bo.receipt.*;
import org.colorcoding.ibas.receipts.repository.*;

/**
* 收款 测试
* 
*/
public class testReceipt extends TestCase {
    /**
     * 获取连接口令
    */
    String getToken() {
        return "a332e755-d264-c3bc-b54d-8cecad384f1e";
    }
    
    /**
     * 基本项目测试
     * @throws Exception 
    */
    public void testBasicItems() throws Exception {
        Receipt bo = new Receipt();
        // 测试属性赋值

        // 测试收款-项目
        IReceiptItem receiptitem = bo.getReceiptItems().create();
        // 测试属性赋值
        receiptitem.setBusinessPartnerCode("C0001");
        receiptitem.setBusinessPartnerCode("奥维科技");
        receiptitem.setAmount(100);


        // 测试对象的保存和查询
        IOperationResult<?> operationResult = null;
        ICriteria criteria = null;
        IBORepositoryReceiptsApp boRepository = new BORepositoryReceipts();
        //设置用户口令
        boRepository.setUserToken(this.getToken());

        // 测试保存
        operationResult = boRepository.saveReceipt(bo);
        assertEquals(operationResult.getMessage(), operationResult.getResultCode(), 0);
        Receipt boSaved = (Receipt)operationResult.getResultObjects().firstOrDefault();


        // 测试查询
        criteria = boSaved.getCriteria();
        criteria.setResultCount(10);
        operationResult = boRepository.fetchReceipt(criteria);
        assertEquals(operationResult.getMessage(), operationResult.getResultCode(), 0);


    }

}
