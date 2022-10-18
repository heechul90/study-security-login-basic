# study-security-login-basic 저장소입니다.

## 프로젝트 설정
- 프로젝트 선택
    - Project : Gradle Project
    - Language : Java
    - Spring Boot : 2.6.x
- Project Metadata
    - Group : study.security
    - Artifact : login-basic
    - Package name : study.security.loginbasic
    - Packaging : Jar
    - Java : 11  

## 내용

### 폼 로그인
- DefaultLoginPageGeneratingFilter
    - GET /login 을 처리
    - 별도의 로그인 페이지 설정을 하지 않으면 제공되는 필터
    - 기본 로그인 폼을 제공
    - OAuth2 / OpenID / Saml2 로그인과도 같이 사용할 수 있음.
- UsernamePasswordAuthenticationFilter
    - POST /login 을 처리. processingUrl 을 변경하면 주소를 바꿀 수 있음.
    - form 인증을 처리해주는 필터로 스프링 시큐리티에서 가장 일반적으로 쓰임.
- DefaultLogoutPageGeneratingFilter
    - GET /logout 을 처리
    - POST /logout 을 요청할 수 있는 UI 를 제공
    - DefaultLoginPageGeneratingFilter 를 사용하는 경우에 같이 제공됨.
- LogoutFilter
    - POST /logout 을 처리. processiongUrl 을 변경하면 바꿀 수 있음.
    - 로그 아웃을 처리
    - LogoutHandler
    - LogoutSuccessHandler

[[이전으로]](https://github.com/heechul90/study-security-basic) [[다음으로]]