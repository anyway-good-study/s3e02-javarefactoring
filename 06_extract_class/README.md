- 너무 많은 책임을 지는 클래스를 분리
  - 클래스 생성
  - 필드 이동
  - 메서드 이동
  - 검토
    - 사용 안하는 메서드가 있는가?
    - 공개필요 없는 메서드가 있는가?
    - 클래스 자체를 공개할 필요가 있는가?
  - Immutable Interface
    - 원하는 객체의 getter만 선언한 인터페이스를 만들고 객체가 구현하게 함.
    - 읽기 전용 객체를 쓰고 싶을 때 그 인터페이스 타입으로 선언.