package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter // Entity 클래스에서는 Setter를 만들지 않는다. 해당 필드의 값을 변경할 경우 명확히 목적과 의도를 나타낼 수 있는 메소드를 추가해야만 한다.
@NoArgsConstructor  // 기본 생성자 자동 추가
@Entity // JPA 어노테이션
// 클래스는 실제 DB의 테이블과 매칭될 클래스
// 보통 Entity 클래스라고도 한다. JPA를 사용하면 실제 쿼리를 날리기 보다는 Entity 클래스의 수정을 통해 작업한다.
public class Posts extends BaseTimeEntity{

    // 해당 클래스의 PK 필드
    @Id
    // PK 생성 규칙 ( 스프링부트 2.0 auto_increment)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 테이블의 칼럼 , 굳이 선언하지 않아도 해당 클래스의 필드는 모두 칼럼이 된다.
    // 선언하는 이유는 기본값 외에 추가로 변경이 필요한 옵션이 있으면 사용한다.
    // 문자열의 경우 기본이 VARCHAR2(255) 인데 사이즈를 500으로 늘리고 싶거나
    // 타입을 TEXT로 변경하고 싶거나 등의 경우에 사용한다.
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition =  "TEXT", nullable = false)
    private String content;

    private String author;

    // 해당 클래스의 빌더 패턴 클래스를 생성
    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }


    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
