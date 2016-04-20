package share;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import com.weego.main.dao.NewsDao;
import com.weego.main.model.News;
import com.weego.main.service.NewsService;


public class NewsTest extends BaseTest{

    @Autowired
    NewsDao newsDao;
    
    @Autowired
    NewsService newsService;
    
    @Test
    public void newsDao(){
        
        News news = newsDao.getNewsById("56fcd1ad7f5e47b01916b78d");
        System.out.println(news.getImage());
        
    }
    
    @Test
    public void newsService(){
        
        ModelAndView mv = newsService.getSpecificNews("56fcd1ad7f5e47b01916b78d");
        System.out.println(mv.toString());
        
    }
}
