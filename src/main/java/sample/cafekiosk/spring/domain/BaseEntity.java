package sample.cafekiosk.spring.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)    // 상속받은 엔티티 클래스들의 생성일자와 수정일자를 자동 관리
public abstract class BaseEntity {    // 인스턴스를 만들 필요가 없으니 추상 클래스로 하기

    @CreatedDate
    private LocalDateTime createdDateTime;

    @LastModifiedDate
    private LocalDateTime modifiedDateTime;

}





// Test
/*

{
    "status": "SUCCESS",    // Enum(String Type): SUCCESS, FAIL, CREATED, DELETED
    "message": "어떤 작업이 성공했는지 간략하게",
    "data": {    // 제네릭(null 허용): 리스트, ResponseDto 등등.. 여러 타입의 반환 데이터
        "users": [     // 어떤 데이터가 반환 되는지 ex) products 상품목록, productDetatil 어느 한 상품의 정보
            {
                "id": 1,
                "name": "이름1"
            },
            {
                "id": 2,
                "name": "이름2"
            }
        ]
    }
}

*/

