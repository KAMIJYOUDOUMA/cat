/**
 * All rights Reserved, Designed By www.freemud.cn
 *
 * @Title: MyCatTest
 * @Package com.dianping.cat
 * @Description:
 * @author: song.cai
 * @date: 2018/9/8 22:11
 * @version V1.0
 * @Copyright: 2018 www.freemud.cn Inc. All rights reserved.
 * 注意：本内容仅限于上海非码科技内部传阅，禁止外泄以及用于其他的商业目
 */

import com.dianping.cat.Cat;
import com.dianping.cat.message.Transaction;
import com.dianping.cat.message.internal.AbstractMessage;

public class MyCatTest {
    public static void main(String[] args) throws InterruptedException {
        Transaction transaction = Cat.newTransaction("type","transaction");
        transaction.addData("key","value");
        transaction.setStatus(Transaction.SUCCESS);
        transaction.complete();
        Thread.sleep(5000L);
    }


    static void logEvent() throws InterruptedException {
        while (true) {
            Cat.logEvent("type", "cais");
            Thread.sleep(5000L);
        }
    }
}
