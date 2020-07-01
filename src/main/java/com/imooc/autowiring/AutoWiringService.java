package main.java.com.imooc.autowiring;

/**
 * @PACKAGE_NAME: main.java.com.imooc.autowiring
 * @NAME: AutoWiringService
 * @date: 2020/6/30 13:21 周二
 * @author: heqinz
 */
public class AutoWiringService {

    private AutoWiringDAO autoWiringDAO;


    public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
        System.out.println("setAutoWiringDAO");
        this.autoWiringDAO = autoWiringDAO;
    }

    public void say(String word) {
        this.autoWiringDAO.say(word);
    }

}
