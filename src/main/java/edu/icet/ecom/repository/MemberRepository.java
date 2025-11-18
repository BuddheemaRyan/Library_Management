package edu.icet.ecom.repository;

import edu.icet.ecom.model.dto.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class MemberRepository {
    Configuration config = new Configuration();

    public void addMember(Member member){
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(edu.icet.ecom.model.dto.Member.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(member);
        transaction.commit();
    }

    public Member getMember(String id){
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(edu.icet.ecom.model.dto.Member.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        return session.find(Member.class,id);
    }

    public void deleteMember(String id){
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(edu.icet.ecom.model.dto.Member.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.remove(session.find(Member.class,id));
        transaction.commit();
    }

    public void updateMember(Member member){
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(edu.icet.ecom.model.dto.Member.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.merge(member);
        transaction.commit();
    }

    public List<Member> getAll(){
        config.configure("hibernate.cfg.xml");
        config.addAnnotatedClass(edu.icet.ecom.model.dto.Member.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        List<Member> memberList = session.createQuery("FROM Member", Member.class).list();
        return memberList;
    }
}
