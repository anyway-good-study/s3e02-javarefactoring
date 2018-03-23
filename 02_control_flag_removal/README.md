# 제어 플래그 삭제

- Boolean 값을 가진 변수로 코드 흐름을 제어하는 것은 이해하기 어렵다.
- 플래그 쓸거라면 이름이라도 잘 의미있게 쓰자.
  - SUN core 패키지들은 `is형용사`를 boolean 변수 네이밍한다고 함 http://geosoft.no/development/javastyle.html#Specific
  - JavaBeans 에서는 `형용사`로 boolean 필드를 네이밍하고 getter를 `is형용사()`로 함. http://download.oracle.com/otn-pub/jcp/7224-javabeans-1.01-fr-spec-oth-JSpec/beans.101.pdf?AuthParam=1521762075_9bc45e9ff31bd60745c9189253650b84
- 지역 변수가 아닌 필드 변수나 전역 변수로 사용시 더 유의해야 함.
- 플래그 대신 break, continue, return 사용
- 위와 같이 바꿔쓰면 코드 끝까지 안읽어도 되고 생략됨.
- 필드에 처음 한번만 값을 지정하려면 final 붙이고 생성자에서 초기화하자. 