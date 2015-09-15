package dao;

import logiс.CodeGeoitsBuff;

import java.sql.SQLException;
import java.util.List;
import java.util.ListResourceBundle;

/**
 * Created with IntelliJ IDEA.
 * User: Shitov
 * Date: 14.09.15
 * Time: 5:22
 * To change this template use File | Settings | File Templates.
 */
public interface CodeGeoutsDao {
    public void addCode(CodeGeoitsBuff code) throws SQLException;
    public void updateCode(CodeGeoitsBuff code) throws SQLException;
    public CodeGeoitsBuff getCodeById(Long id) throws SQLException;
    public List getAllCode() throws SQLException;
    public void deleteCode(CodeGeoitsBuff code) throws SQLException;
}
