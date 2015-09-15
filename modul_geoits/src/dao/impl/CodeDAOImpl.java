package dao.impl;

import dao.CodeGeoutsDao;
import logiс.CodeGeoitsBuff;
import org.hibernate.Session;
import util.HibernateUtil;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Shitov
 * Date: 14.09.15
 * Time: 5:40
 * To change this template use File | Settings | File Templates.
 */
public class CodeDAOImpl implements CodeGeoutsDao {

        public void addCode(CodeGeoitsBuff code) throws SQLException {
            Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.save(code);
                session.getTransaction().commit();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
            } finally {
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }
        }

        public void updateCode(CodeGeoitsBuff code) throws SQLException {
            Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.update(code);
                session.getTransaction().commit();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
            } finally {
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }
        }





    public CodeGeoitsBuff getCodeById(Long id) throws SQLException {
            Session session = null;
        CodeGeoitsBuff code = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                code = (CodeGeoitsBuff) session.load(CodeGeoitsBuff.class, id);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
            } finally {
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }
            return code;
        }

        public List<CodeGeoitsBuff> getAllCode() throws SQLException {
            Session session = null;
            List<CodeGeoitsBuff> codes = new ArrayList<CodeGeoitsBuff>();
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                codes = session.createCriteria(CodeGeoitsBuff.class).list();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
            } finally {
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }
            return codes;
        }



    public void deleteCode(CodeGeoitsBuff code) throws SQLException {
            Session session = null;
            try {
                session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
                session.delete(code);
                session.getTransaction().commit();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.OK_OPTION);
            } finally {
                if (session != null && session.isOpen()) {
                    session.close();
                }
            }
        }
    }