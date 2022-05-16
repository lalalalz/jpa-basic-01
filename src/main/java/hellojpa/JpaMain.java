package hellojpa;

import javax.persistence.*;
import java.util.Arrays;

public class JpaMain {
    public static void main(String[] args) {
        // 데이터베이스 연결도 다 됨..
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        Member firstMember = new Member();
        //        firstMember.setId(1L);
        firstMember.setName("TEST");

        Member secondMember = new Member();
        secondMember.setName("TEST2");

        entityManager.persist(firstMember);
        //        entityManager.persist(secondMember);

        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void enumTest(EntityManager entityManager) {
//        Member member = new Member();
//        member.setId(3L);
//        member.setName("memberC");
//        member.setAge(28);
//        member.setRoleType(RoleType.ADMIN);

//        Member member = new Member();
//        member.setId(5L);
//        member.setName("memberE");
//        member.setAge(12);
//        member.setRoleType(RoleType.TEST);
//
//        entityManager.persist(member);
    }

//    public void nullable(EntityManager entityManager) {
//        Member member = new Member();
//        member.setId(2L);
//        member.setName("memberA");
//
//        entityManager.persist(member);
//    }
//
//    public void updateable(EntityManager entityManager) {
//        Member member = new Member();
//        member.setId(2L);
//        member.setName("memberA");
//        member.setAge(19);
//
//        entityManager.persist(member);
//
//        member.setAge(20);
//    }
//
//    public void ex2(EntityManager entityManager) {
//
//        Member member1 = new Member();
//        member1.setId(1L);
//        member1.setName("member1");
//
//        // 1차 캐시에 저장됨
//        entityManager.persist(member1);
//
//    }
//
//    public void ex1(EntityManager entityManager) {
//        Member member1 = new Member();
//        member1.setId(1L);
//        member1.setName("member1");
//
//        System.out.println("---------member1---------");
//        // 1차 캐시에 저장됨
//        entityManager.persist(member1);
//
//        // 1차 캐시에서 조회함
//        Member findMember1 = entityManager.find(Member.class, 1L);
//        System.out.println("---------member1---------");
//
//
//        System.out.println("---------member2---------");
//        // 데이터베이스에서 직접 조회함
//        Member findMember2 = entityManager.find(Member.class, 2L);
//        System.out.println("---------member2---------");
//    }
}
