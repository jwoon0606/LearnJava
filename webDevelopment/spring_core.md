# 김영한님 스프링 핵심 원리 - 기본편

### 학습 기간
2025.12.20 ~ 2025.12.28

### 내용
- 스프링이란?
- 객체지향과 스프링
- 순수 자바 코드로 예제 만들어보기 (주문,할인 프로그램)
    - 그냥 흐름대로 짜면 DIP, OCP 위반
    - ex) MemberService가 MemoryMemberRepository(구체적인 클래스)에 의존 => MemberRepository를 다른 걸로 바꾸고 싶으면 MemberService 코드를 고쳐야 함
    - AppConfig 개발
- Annotation을 이용하여 AppConfig 리펙토링 (스프링 사용)
  - @Context
  - @Bean
  - 빈 조회해보기
- 싱글톤 컨테이너
  - 생성자 방식은 호출 할 때마다 객체 생성
  - 생성자를 private으로 막고 getInstance()를 통해 인스턴스 관리 => 지저분한 코드 들어가야 함, getInstance() 라는 구체적인 메서드에 의존해야 하는 상황이 발생
  - 스프링 빈에 등록하면 스프링 컨테이너가 알아서 관리
  - 주의점 : 스프링 빈은 꼭 무상태로 설계할 것. (같은 인스턴스를 공유하니까)
  - @Configuration을 사용하지 않고 @Bean만 사용해도 되지만, 그러면 싱글톤 보장이 되지 않음 => CGLIB에 의한 바이트코드 조작 X
- 컴포넌트 스캔
  - @Component
  - @Autowired
  - 자동 주입 vs 수동 주입
  - 스프링 부트에서는 중복 스캔이 일어났을 경우 오류 처리
- 의존관계 자동주입
  - 생성자 주입을 사용할 것 (필드 주입, Getter Setter 주입은 특별한 상황에만)
  - 특정 타입의 모든 빈들을 주입받고다 할 때는? Map or List
  - Lombok 에너테이션
    - @Getter
    - @Setter
    - @RequiredArgsConstructor
  - 우선 순위 관련
    - @Nullable
    - @Autowired(required = false)
    - @Primary
  - 주로 스프링 제공 컴포넌트(@Servcie, @Controller) + @Primary 사용
- 빈 생성주기 콜백
  - 객체 생성과 초기화 단계 분리하기
    - 의존 관계 주입 이후에 초기화가 필요하기 때문
    - 생성자는 의존관계 주입 전에 실행됨
  - @PostConstruct, @PreDestroy 쓰기
