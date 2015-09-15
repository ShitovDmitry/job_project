import com.sun.corba.se.impl.logging.ORBUtilSystemException;
import dao.Factory;
import logiс.CodeGeoitsBuff;

import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: Shitov
 * Date: 14.09.15
 * Time: 6:40
 * To change this template use File | Settings | File Templates.
 */
public class test {
    public String code;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void addCode() throws SQLException {
        String buff=getCode();
        CodeGeoitsBuff s1 = new CodeGeoitsBuff();
        s1.setCode(buff);
        Factory.getInstance().getStudentDAO().addCode(s1);



    }






}
