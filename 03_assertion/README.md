# 어서션(Assertion) 도입

### 요약
- 주석으로 어떤 값이나 동작의 결과를 예측할 때 사용한다.
- `Error code`, `Testcase`, `Assert` 중 선택이 애매할 때도 있을 듯
- 런타임이 아닌 디버깅 단계에서 에러를 찾고자 하는 경우 유용하다.
- 자바 assert 는 클래스 라이브러리가 아니라 키워드이다.
  - 따라서 코드에 포함되며 실행 시 활성화(`-ea`) 또는 비활성화(`-da`) 옵션을 줄 수 있으며 기본 동작은 비활성화이다.
  - release 모드에도 코드가 포함되어서 불필요하게 바이너리 사이즈를 키우는 것 아닌가 싶지만 자바 어플리케이션은 보통 크기에 민감하지 않은 것 같음. (하지만 임베디드 환경이면 다를 것 같음)
- C에서는 `assert.h` 에 assert 매크로가 정의되어 있다.
  - `NDEBUG` 매크로로 비활성화 가능
- C++ 에서는 객체를 던지는 템플릿을 구현할 수도 있다고 한다.
  - 게임 프로그래밍의 경우에 예외처리는 성능 상의 문제로 잘 사용하지 않고 개발 도중의 버그를 잡기 위해 assert를 사용하는 경우가 많다고 한다.
  - c++의 assert는 runtime에 비교를 수행하기 때문에 성능의 하락을 가져올 수 있다. 그렇다고 #error 를 이용한다고 해도 template이 구체화되게 전에 수행되므로 template은 검사할 수 없게된다.
  - template class or function에서 static_assert를 사용하기에 좋다. static_asssert는 compile 단계에서만 이를 확인하는데 적합하다. 그리고 assert는 debug모드의 runtime에서만 동작하지만 static_assert는 complie time에 동작하기 때문에 compile 단계에서 미리 잡아낼 수 있다. 다만, run time에 발견될 수 있는 것은 static_assert가 발견하지 못하기 때문에 결국 assert를 적재적소에 잘 사용해야 한다는 의미가 된다.
- C# 에는 닷넷 프레임워크에서 클래스 라이브러리로 지원한다고 한다.
- Python 에서는 -O(Optimization flag) 옵션으로 __debug__ 를 False 시킬 수 있다.
  - 그러나 대부분의 Python 개발자들은 이를 생략하고 사용하고 있다. 왜냐하면 정말로 Optimized 되는 것이 아니라 단지 assert를 비활성시키는 것이기 때문이다. 개인적으로 python 언어에서 assert를 비활성화시키는 것이 의미있지 않다.
