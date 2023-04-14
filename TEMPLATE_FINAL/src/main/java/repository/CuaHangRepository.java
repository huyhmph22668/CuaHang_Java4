package repository;

import com.fpt.poly.pe.util.HibernateUtil;
import entity.CuaHang;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CuaHangRepository {
    private Session chSession ;
    public CuaHangRepository(){
        this.chSession = HibernateUtil.getFACTORY().openSession();
    }
    public void insert(CuaHang ch){
        Transaction transaction = chSession.getTransaction();
        try {
            transaction.begin();
            chSession.persist(ch);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public void update(CuaHang ch){
        Transaction transaction = chSession.getTransaction();
        try {
            transaction.begin();
            chSession.merge(ch);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public void delete(CuaHang ch){
        Transaction transaction = chSession.getTransaction();
        try {
            transaction.begin();
            chSession.delete(ch);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }
    }
    public List<CuaHang> finAllCuaHang(){
        String hql = "SELECT obj from CuaHang obj";
        TypedQuery<CuaHang> q = chSession.createQuery(hql,CuaHang.class);
        return q.getResultList();
    }
    public CuaHang finById(String id){
        return chSession.find(CuaHang.class,id);
    }
    public CuaHang finByMa(String ma){
        String hql = "select obj from CuaHang obj where obj.Ma=?1";
        TypedQuery<CuaHang> q = chSession.createQuery(hql , CuaHang.class);
        q.setParameter(1,ma);
        return q.getSingleResult();
    }
}
