package dao;

import dao.impl.CodeDAOImpl;

/**
 * Created with IntelliJ IDEA.
 * User: Shitov
 * Date: 14.09.15
 * Time: 5:47
 * To change this template use File | Settings | File Templates.
 */
public class Factory {

    private static CodeDAOImpl codeDao = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance(){
        if (instance == null){
            instance = new Factory();
        }
        return instance;
    }

    public CodeGeoutsDao getStudentDAO(){
        if (codeDao == null){
            codeDao = new CodeDAOImpl();
        }
        return codeDao;
    }
}
