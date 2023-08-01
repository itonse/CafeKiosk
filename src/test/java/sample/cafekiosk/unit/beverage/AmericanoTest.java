package sample.cafekiosk.unit.beverage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.*;

class AmericanoTest {

    @Test
    void getName() {
        Americano americano = new Americano();

//        assertEquals(americano.getName(), "아메리카노");  // Junit 프레임워크 메서드
        assertThat(americano.getName()).isEqualTo("아메리카노");  // AssertJ 라이브러리 메서드 (더 명확, 메서드체이닝 제공)
    }

    @Test
    void getPrice() {
        Americano americano = new Americano();

        assertThat(americano.getPrice()).isEqualTo(4000);
    }
}