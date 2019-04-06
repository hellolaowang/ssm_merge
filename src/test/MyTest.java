import com.like.domain.Account;
import com.like.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest
{
    @Test
    public void test()
    {
        ApplicationContext context        = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService     accountService = (AccountService) context.getBean("accountService");
        List<Account>      accounts       = accountService.findAll();

        System.out.println(accounts);
    }
}
