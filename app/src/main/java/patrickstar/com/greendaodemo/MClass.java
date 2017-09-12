package patrickstar.com.greendaodemo;

import java.io.IOException;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by admin on 2017/9/11.
 * 该代码用于生成基于GreenDao所需要的类文件
 */

public class MClass {

    public static  void main(String [] args){

        Schema mySchema = new Schema(1, "com.patrickstar.greendao");
        Entity UserInfo = mySchema.addEntity("UserInfo");
        UserInfo.addStringProperty("userName").primaryKey();
        UserInfo.addStringProperty("realName");
        UserInfo.addIntProperty("age");

        try {
            //运行该句代码将生成指定实体所对应的greendao相关操作类
            new DaoGenerator().generateAll(mySchema, "/users/admin/desktop/greenDao");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
