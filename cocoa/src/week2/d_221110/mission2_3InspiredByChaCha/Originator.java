package week2.d_221110.mission2_3InspiredByChaCha;

import java.util.HashMap;

public class Originator {
    // money 객체를 따로 빼서 메서드로 기능을 구현한다?
    // 객체지향적으로 설계한다?
    // Originator내부에서 Memento를 이용한 메서드를 지속적으로 구현 -> 캡슐화에 위배되지는 않는가?
    // 객체지향적으로 설계했다고 말 할 수 있는가?

    // 의문점 1. Originator의 생성자 순서와 Memento의 생성자 순서를 왜 반대로 했을까? 의도가 있나?
    // 의문점 2. createMemento는 문제의 조건에서 보면, Memento에다가 Originator를 저장하는 것인데,
    // createMemento의 메서드를 보면 왜 return값이 new Memento(new Money(0), new HashMap<>)일까?
    // 의문점 3. Memento를 반환하는 메서드를 왜 Originator값에 넣었을까?
    // -> 이것은 객체지향에 반하는 것 아닐까?


    }

