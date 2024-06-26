# A3.1 OSS 프로젝트 최종보고서

## I. 프로젝트 수행팀 개요

- 수행 학기:  2024-1학기
- 프로젝트명: DUEL (Dongguk University E-Learning Laboratory)
- Key Words :
    - 개발자, 그룹 매니징, TIL(Today I Learn)학습일지,  기록, 개발자 학습 플랫폼
    - 동국대에 적용 가능한 서비스
- 팀명: 물음표 (Questionmark)

| 구분 | 성명 | 학번 | 소속학과 | 연계전공 | 이메일 |
| --- | --- | --- | --- | --- | --- |
| 팀장 | 정동현 | 2019112473 | 산업시스템공학과 | 융합SW연계전공 | mailto:wsdv4444@dgu.edu |
| 팀원 | 이희주 | 2018111039 | 사회학과 | 융합SW연계전공 | mailto:lhj2778@naver.com |
| 팀원 | 이하연 | 2019110914 | 경제학과 | 융합SW연계전공 | mailto:hlee09300@naver.com |
- 지도교수 : 대학혁신지원사업단 이길섭 교수님
- 공동교수: SW교육원 박효순 교수

## II. 프로젝트 수행 결과

### 1. 프로젝트 개요

### 1.1 개발 동기 및 목적

**문제 상황 인식**

1. **융합 SW 연계전공 학습 중 문제점**
    - 매주 제출하는 코딩 과제 및 GitHub 연동의 복잡성.
    - 정보가 정리되어 있지 않고 학습 참고가 어려움.
    - 학생과 운영진 모두에게 불편함이 존재함.
2. **자기주도적 개발 학습의 어려움**
    - 개발, 스택 공부의 시작이 어려움.
    - 공부 순서 및 진행 확인의 어려움.

**문제 해결 방안**

1. **그룹 로드맵 서비스**
    - 로드맵 생성 및 구성원 가입 가능.
    - 각 단계별 학습 및 TIL 제출 기능.
    - 제출된 TIL 한눈에 확인 가능.
2. **로드맵 제공 및 TIL (Today I Learn)학습일지 공유**
    - 과목별, 과제별 로드맵 제공.
    - 학습 및 제출 지원.
    - 다른 사람의 TIL을 통한 자가 학습 평가 지원.

### 1.2 필요성

**(1)우리 서비스의 필요성**

- **TIL(Today I Learn)학습일지 작성 편의성** :  템플릿을 통해 더 손쉽게 작성할 수 있음.
- **학습 성취 컨텐츠 제공** : 잔디밭, 티어 제도를 통해 학습일지 작성에 대한 성취감 획득 가능.
- **그룹 로드맵 서비스** : 스터디 그룹을 형성함으로써 그룹원들과 학습 일지를 공유하고 평가할 수 있음.
- **관리자 편의성** : 관리자의 입장에서 교육생들의 학습일지 제출 여부를 손쉽게 확인할 수 있음.
- **사용자 상호작용** : 피드백, 평가 기능으로 학습 일지를 쉽게 평가하고 리뷰 해 줄 수 있음.

**(2)  선행 기술 및 사례 분석**

<img width="543" alt="선행기술사례" src="https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/cefaccdd-6373-4a73-ac76-6eed64e10203">


### 1.3 개발 목표

- 그룹 로드맵 서비스 기반 개발 학습 환경 플랫폼
    - **TIL 기능 개발**: 사용자가 학습 내용을 일지 형태로 기록하고 관리할 수 있도록 함.
    - **로그인 기능 구현**: 사용자가 이메일을 통해 로그인하고, 각 사용자의 정보를 안전하게 저장하고 관리.
    - **Step 관리 기능 구현**: 사용자가 학습 주제를 생성하고, 각 주제에 맞는 단계 별 학습 내용을 작성, 수정, 삭제 가능.
    - **로드맵 기능 제공**: 사용자가 특정 학습 주제를 신청하면, 해당 주제에 맞는 단계별 학습 로드맵을 생성하고 관리.
    - **코멘트 기능 구현**: 다른 사용자의 학습 일지에 댓글을 달고, 의견을 공유하며 상호 피드백 가능.
    - **알림 기능 추가**: 사용자가 작성한 TIL에 다른 사용자가 댓글을 달면, 이를 알림으로 받아볼 수 있음.

### 2. 최종결과물 소개

# 주요 기능
|로그인|회원가입|
|:--:|:--:|
|- 회원 정보 이메일을 통한 아이디<br/>-숫자 및 영문과 특수문자 조합 PW<br/> |- 이메일 인증<br/>- 비밀번호 확인 인증|
|<img width="500" alt="로그인" src="https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/7e18eb81-099c-4c20-91ee-a7351f497e38">|<img width="500" alt="회원가입" src="https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/48c775af-134a-4855-a5c0-82a2f4215ab2">|

|TIL 작성|학습 참고 및 코멘트|
|:--:|:--:|
|- 마크다운 에디터를 통한 TIL 작성<br/>-사라질 걱정 없는 상시 저장 기능<br/> |- 각 STEP별 참고자료 확인<br/>- 글에 대한 코멘트 확인|
|<img width="500" alt="TIL작성" src="https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/562392e9-4faa-4880-a25a-1fff726a834a">|<img width="500" alt="참고자료및코멘트" src="https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/0a41ee79-95b5-4f7d-99df-84cff503fba0">|

|메인|참고 자료|
|:--:|:--:|
|- 작성한 TIL 목록들을 검색하고 확인<br/>- 장미밭을 통해 학습 열정 확인 <br/> - 개인, 그룹 로드맵을 분류하여 관리|- 로드맵에 참고할 자료를 첨부하는 기능<br/>-유튜브, 참고자료 링크<br/> |
|<img width="500" alt="메인페이지" src="https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/9855d95c-e6da-4c3a-807d-4a418c034ce9">|<img width="500" alt="참고자료업로드" src="https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/c8455eca-4376-4c18-9e70-c2d98c4022e5">|

|로드맵 목록|구성원 관리|
|:--:|:--:|
|- 내가 참여하고 있는 로드맵의 목록을 확인<br/>- 현재 모집중인 그룹 로드맵 목록 확인|- 현재 로드맵에 속한 그룹원 목록<br/>-멤버 권한 변경, 강퇴 기능<br/> -그룹원의 학습일지 작성현황 확인<br/>  -로드맵 신청 관리, 수락 거절<br/>|
|<img width="500" alt="로드맵목록" src="https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/2ff9c35d-422b-47b1-a7f8-0da002cc4b3e">|<img width="500" alt="구성원관리" src="https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/2b72784c-7597-4a80-9e88-ab83efe068d2">|

|TIL 공유하기|
|:--:|
|- 내가 공부하는 주제에 대해 타인과 생각을 공유<br/>|
|<img width="500" alt="작성공유" src="https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/464300eb-0f71-4d8d-8f62-aea27cf5e997">|

### 3. 프로젝트 추진 내용

### 3.1 프로젝트 진행과정

**(1) 프로젝트 추진 일정 - 간트차트**

![간트차트](https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/186fed11-21d2-4051-8f3f-6a3a91472b2e)

**(2)User Flow**

![유저플로우](https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/4d948c4c-ca3a-45e0-a3c5-da53e2b87029)


- **혼자 학습**: 사용자가 혼자 카테고리를 만들고 공부하며 TIL을 작성합니다.
- **로드맵 학습**: 제공된 로드맵(틀리 로드맵) 또는 사용자가 직접 만든 로드맵(그룹 로드맵)을 통해 단계별 학습을 진행합니다.
- **GitHub 연동**: 작성한 TIL을 클릭 한 번으로 GitHub에 업로드할 수 있습니다.

**(3)Sequence Diagram**
![image](https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/6ebd9563-bf45-402e-a64a-1dae53f9d313)




- **로그인 기능**: 사용자가 이메일과 비밀번호로 로그인 요청을 하면 서버에서 인증을 처리하고 결과를 반환합니다.
- **TIL 작성**: 사용자가 학습 내용을 작성하고 서버에 저장하면, 서버는 저장 결과를 클라이언트에 반환합니다.
- **로드맵 제작**: 사용자가 카테고리와 제목을 입력해 로드맵을 작성 요청하면, 서버가 로드맵 정보를 저장하고 템플릿을 적용한 후 결과를 반환합니다.

**(4)Data Flow Block Diagram**
![데이터플로우블록](https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/fe9cf8d7-a8b8-4cfa-9088-00a42f241fb4)

**(5)UseCase Diagram**
![image](https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/9e07fb61-6f1b-44d3-9e76-b0fe6ce7395a)



- **사용자 기능**: 회원가입, 로그인 후 메인페이지에서 로드맵 페이지, TIL 작성 페이지, 마이페이지, 그룹 페이지로 이동 가능.
- **로드맵 관리**: 로드맵 페이지에서 DUEL 로드맵 생성, 그룹 로드맵 생성, 로드맵 조회 및 관리 페이지로 이동.
- **관리자 기능**: 로드맵 생성 및 관리 페이지를 통해 전체 로드맵을 관리.

### **3.2 프로젝트 구현 과정**

### **ERD**

![ERD](https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/assets/112611541/dd625383-ca32-46d9-b114-e94e7b6ad653)

## 백엔드 개발 중점 ( BE )

| 기능 | 설명 |
| --- | --- |
| 로그인/회원가입 | gmail(smtp)와 redis를 사용하여 이메일 인증 시스템을 구현했지만, 배포환경 변화로 인해 크램폴린에 배포하지는 못함로그인과 재발급 요청에 따른 access token, refresh token 발급을 통해 JWT 관리 |
| 검색 기능 구현 | 메인 페이지에서 TIL 제목으로 검색, 장미밭 클릭으로 특정 날짜의 TIL 조회, 로드맵 페이지에서 로드맵 이름으로 검색, 상세 페이지에서 구성원 이름으로 검색 기능 구현 |
| 이미지 업로드 | S3 구축과 연동을 통해 프로필 사진 업로드, TIL 사진 업로드, 삭제 기능 구현 (크램폴린에서 연동하지 못함) |
| 알림 기능 구현 | 자신이 제출한 TIL에 달린 댓글에 대한 알림 기능 구현 |
| 댓글 기능 구현 | 제출한 TIL에 댓글 작성과 수정, 삭제 기능 구현 |
| 삭제 기능 구현 | 삭제 기능을 Soft delete로 구현하여, 데이터 무결성을 유지하고, 삭제된 데이터의 이력을 추적하거나 데이터 분석에 활용할 수 있도록 함.JPQL과 @Where을 이용하여 실제로 데이터가 삭제되지 않고 삭제된 것처럼 보이도록 구현. |
| 예외 처리 | 예외 코드를 ExceptionCode로 일괄 관리를 통해 유지 보수성와 중복 최소화 함 |
| 권한 처리 | 로드맵에서의 사용자의 역할(master, manager, member, none)에 맞는 권한 처리 |
| 테스트 코드 작성 | Junit을 이용하여 컨트룰러 단위 테스트를 진행하며 프로덕션 환경에서의 안전성 확보함 |
| 성능 개선 | lazy fetching 전략과 fetch join 사용으로 N+1 문제 개선 및 쿼리 효율성을 증가시킴또한 엔티티 간 양방향 연관 관계가 아닌 단방향 연관 관계 설정을 통해 불필요한 참조와 의존성을 줄임 |
| 가독성 및 리팩토링 | DTO를 class가 아닌 record로 구현해 depth를 줄이고 재사용성과 가독성을 높임 |

## 프론트엔드 개발 중점 ( FE )

- **SSR을 이용한 접근 권한 관리**: Next.js를 사용해 서버 사이드에서 로그인 여부와 접근 권한을 확인하여 로그인 페이지로 리다이렉션하는 방식으로 깜빡임 현상을 해결했습니다.
- **React-Query를 통한 데이터 SSR**: `prefetchQuery`와 `dehydrate`를 사용해 서버 사이드에서 데이터를 미리 가져와 클라이언트 렌더링 이전에 페칭을 완료했습니다.
- **에러 핸들링**: GET 요청 실패 시, 에러 바운더리와 fallback UI를 사용해 전체 페이지 대신 실패한 부분만 처리했습니다.
- **데이터 변경 실패 처리**: POST, PATCH, DELETE 요청 실패 시, 페이지를 유지하고 TOAST 메시지를 통해 사용자에게 에러를 알렸습니다.
- **Global Error Boundary**: 예상치 못한 에러를 처리하기 위해 전체 페이지에 Global Error Boundary를 설정했습니다.
- **404 페이지 커스텀**: Next.js의 404 페이지를 커스텀하여 없는 페이지 접근 시 사용자에게 적절한 안내를 제공했습니다.
- **웹 접근성**:
    - WCAG 2.0 레벨 AA 준수: 검은색(#000000)과 흰색(#FFFFFF) 대비율 4.5:1 이상을 가진 로즈색(#EA103C) 사용.
    - 색상 대비 개선: 작은 텍스트의 대비를 높여 접근성 강화.
    - 스크린 리더 최적화: 버튼에 alt 속성 추가, Heading 태그를 계층에 맞게 사용하고 필요 시 보이지 않는 텍스트로 유지.
- **검색 엔진 최적화**:
    - SSR 및 SSG 사용: Next.js를 이용해 SEO 최적화.
    - 공개 페이지 구성: 로드맵 목록 및 상세 페이지는 인증되지 않은 유저도 접근 가능하도록 설정.
    - 검색 엔진 접근성 강화: 로드맵 상세 페이지에 Server-Side Rendering 적용으로 SEO 강화.
- **에디터 자동 저장 기능 요약**
1. **자동 저장 케이스**:
    - 10초 간격으로 자동 저장
    - `ctrl + S`로 직접 저장
    - 에디터에서 focus가 blur 되는 경우
2. **발견된 문제점**:
    - `ctrl + S`를 계속 입력하는 경우
    - 저장이 발생했음에도 10초 간격 자동 저장 주기와 겹쳐 연달아 서버에 요청이 보내지는 경우
3. **해결 방법**:
    - **첫번째 문제**: throttle을 사용해 `ctrl + S` 입력 시 5초 간격을 두어 서버 부하를 줄임.
    - **두번째 문제**: 디바운스를 적용해 10초 간격 저장 외 다른 저장 케이스 발생 시 다시 10초를 부여하여 서버 요청 횟수를 줄임.

### 4. 기대효과

- **개발 역량 향상**:
    - 학습 일지(TIL)를 통해 개발자들이 자신의 학습 내용을 체계적으로 기록하고 복습함으로써 학습 효율을 극대화할 수 있습니다.
    - 로드맵 기능을 통해 체계적이고 단계적인 학습 계획을 수립할 수 있어, 목표 지향적인 학습이 가능합니다.
- **지식 공유와 협업 촉진**:
    - 학습 일지와 로드맵을 통해 다른 사용자들과 학습 과정을 공유하고 피드백을 주고받음으로써 커뮤니티 내 지식 공유와 협업이 촉진됩니다.
    - 코멘트 기능을 통해 사용자는 자신의 학습 내용을 다른 사람들과 논의하고, 다양한 관점에서 피드백을 받을 수 있습니다.
- **동기부여 및 지속적인 학습 환경 조성**:
    - 알림 기능을 통해 다른 사용자의 피드백을 실시간으로 받아볼 수 있어, 학습에 대한 동기부여가 지속적으로 제공됩니다.
    - 학습 커뮤니티를 형성하여, 사용자 간의 상호작용이 활발해짐으로써 지속적인 학습 환경이 조성됩니다.
- **개인 맞춤형 학습 경로 제공**:
    - 사용자가 자신의 학습 주제와 단계별 학습 계획을 세울 수 있어, 개인 맞춤형 학습 경로를 제공할 수 있습니다.
    - 각 사용자의 학습 진행 상황을 시각적으로 확인할 수 있어, 자기주도적인 학습이 가능합니다.

### 5. 팀원 역할

| 구분 | 성명 | 팀내 역할 |
| --- | --- | --- |
| 팀장 | 정동현 | BE/FE 총괄 , 와이어프레임 제작 , 전체 커밋관리 , 이슈관리  |
| 팀원 | 이하연 | BE개발 , 디자인 컴포넌트 제작 , 회의록 작성 , 논의 및 이슈관리  |
| 팀원 | 이희주 | FE개발 , PPT제작 , 팀 REPO 관리 |

### 6. 참고문헌

1. 우아형제들,우아한 타입스크립with 리액트, 한빛미디어, 2023.10.31
2. 팍스, **React 리액트 마스터: 모바일과 웹 사용자 인터페이스 개발을 위한 최고의 라이브러리,** https://wikidocs.net/book/10082
3. 팍스, **효율과 성능의 삼위일체: Django Rest Framework, React, Next.js 웹 개발의 진수,** https://wikidocs.net/book/9596
4. 깃헙, https://github.com/
5. 노션, https://www.notion.so/ko-kr
6. 김태민, 홀라, https://holaworld.io/
7. 한 번에 끝내는 프론트엔드 개발 초격차 패키지, 패스트 캠퍼스 / https://fastcampus.co.kr/dev_online_frontend
8. 프로젝트로 완성하는 백엔드 개발 초격차 패키지, 패스트 캠퍼스/ https://fastcampus.co.kr/dev_online_befinal

### 7. 프로젝트 성과

| 항목 | 세부내용 |
| --- | --- |
| Github 등록 | https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07.git |

### 8. 전체 커밋 기록

- BE :  https://github.com/Donghyun-Jung/Questionmark_BE.git
- FE : https://github.com/Donghyun-Jung/Questionmark_FE.git

## Readme.md 로 돌아가기

---

[README.md](https://github.com/CSID-DGU/2024-1-OSSProj-Questionmark-07/blob/main/README.md)
