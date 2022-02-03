package jpabook.jpashop;

import jpabook.jpashop.domain.Member;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class MemberRepository {

    @PersistenceContext
    private EntityManager em;

    public long save(Member member) {
        em.persist(member);
        return member.getId();
    }

    public Member find(long id) {
        return em.find(Member.class, id);
    }
}
