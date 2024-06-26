---
<div align="center">
<h1>🖥 ERPC 🖥</h1>
</div>

---
## 📚 목차
  - [팀원](#팀원)
  - [프로젝트 소개 및 기획의도](#-프로젝트-소개-및-기획의도) 
  - [기술스택](#기술스택)
  - [문서](#문서)

---
## 👨‍👨‍👦‍👦팀원
<div style="display: flex; justify-content: center;">
  <table style="margin: 0 auto; text-align: center;">
    <tr>
      <td><img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/75edf6b2-ecb1-46b6-a4be-ae24f8a45756" height=150 width=150/></td>
      <td><img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/7b351752-aeb0-4525-bd25-168bd694741f" height=150 width=150/></td>
      <td><img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/08e4faa5-89cd-47e6-b4fb-62e19a582939" height=150 width=150/></td>
      <td><img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/ec7e609b-e780-488b-a132-119f3bfa4440" height=150 width=150/></td>
    </tr>
    <tr>
      <td>윤재은</td>
      <td>조수빈</td>
      <td>송동준</td>
      <td>양지혜</td>
    </tr>
    <tr>
      <td><a href="https://github.com/yunjaeeun"><img src="https://img.shields.io/badge/Github-Link-181717?logo=Github"></a></td>
      <td><a href="https://github.com/chosoobin37"><img src="https://img.shields.io/badge/Github-Link-181717?logo=Github"></a></td>
      <td><a href="https://github.com/dongjunsong"><img src="https://img.shields.io/badge/Github-Link-181717?logo=Github"></a></td>
      <td><a href="https://github.com/Jihye1101"><img src="https://img.shields.io/badge/Github-Link-181717?logo=Github"></a></td>
    </tr>
  </table>
</div>

---
## ✏ 프로젝트 소개 및 기획의도

### 1. 개요
최적의 영업을 위한 영업관리 시스템

### 2. 주제 
컴퓨터와 관련부품들을 영업하는 회사의 ERP 시스템

### 3. 주제 선정 이유
* 개발자로서 가장 많이 접하는 주제
  
* 관련 동향과 전망
  <div style="display: flex; justify-content: space-between;">
  <img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/1c4ded56-994c-4d90-8a15-c7c77d571c28" width="300" alt="image">
  <img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/5d0a3157-fd9b-4de2-bae4-7a206379ad5b" width="300" alt="image">
</div>

* 팬데믹 동안 원격근무와 온라인 교육으로 인해 성장세를 보였던 시장의 정체 <br>

  ➡️ AI와 게임 등 기술 발전에 따른 고성능 컴퓨터의 수요 증가로 다시 성장할 것으로 기대

### 4. 기획의도
* 기존 영업 ERP들의 필수 기능 + 단점 보완 ➡️ 문서화 시간 최소화 및 직관적인 화면 설계
  
* 관련 코드를 통해 연관된 데이터 불러오기 ➡️ 중복된 데이터 입력 생략으로 문서화 시간 감소
  
* 자동 엑셀 변환 및 다운로드 ➡️ 견적서, 계약서, 수주 엑셀 형식으로 자동 변환 및 다운로드 후 첨부 가능

* 직관적인 화면 설계 ➡️ 처음 서비스를 이용하는 사용자도 쉽게 서비스 이용 가능

---
## 🛠기술스택
<h3>Backend</h3>

| Spring Boot | Spring JPA | AWS S3 | Java 17 |
| --- | --- | --- | --- |
| ![Spring Boot](https://img.shields.io/badge/springboot-%236DB33F.svg?style=for-the-badge&logo=springboot&logoColor=white) | ![Spring JPA](https://img.shields.io/badge/Spring%20Data%20JPA-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white) | ![AWS S3](https://img.shields.io/badge/Amazon%20S3-569A31?style=for-the-badge&logo=amazonaws&logoColor=white) | ![Java 17](https://img.shields.io/badge/Java-17-007396?style=for-the-badge&logo=java&logoColor=white) |

<h3>Frontend</h3>

| Vue3 | JavaScript | HTML | CSS |
| --- | --- | --- | --- |
| ![Vue.js](https://img.shields.io/badge/vuejs-%2335495e.svg?style=for-the-badge&logo=vuedotjs&logoColor=%234FC08D) | ![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E) | ![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white) | ![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white) |

<h3>Database</h3>

| MariaDB | AWS RDS |
| --- | --- |
| ![MariaDB](https://img.shields.io/badge/MariaDB-003545?style=for-the-badge&logo=mariadb&logoColor=white) | ![AWS RDS](https://img.shields.io/badge/Amazon%20RDS-527FFF?style=for-the-badge&logo=amazonrds&logoColor=white) |

<h3>CI/CD</h3>

| GitHub Actions | Route53 | Elastic Beanstalk | Prometheus | Grafana |
| --- | --- | --- | --- | --- |
| ![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=for-the-badge&logo=github-actions&logoColor=white) | ![Route53](https://img.shields.io/badge/Amazon%20Route53-4B8EC6?style=for-the-badge&logo=amazonroute53&logoColor=white) | ![Elastic Beanstalk](https://img.shields.io/badge/AWS%20Elastic%20Beanstalk-%23FF9900?style=for-the-badge&logo=aws-elastic-beanstalk&logoColor=white) | ![Prometheus](https://img.shields.io/badge/Prometheus-%233E3E3E.svg?style=for-the-badge&logo=prometheus&logoColor=white) | ![Grafana](https://img.shields.io/badge/Grafana-%23F46800.svg?style=for-the-badge&logo=grafana&logoColor=white) |

<h3>Etc</h3>

| GitHub | Discord | Slack |
| --- | --- | --- |
| ![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white) | ![Discord](https://img.shields.io/badge/Discord-7289DA?style=for-the-badge&logo=discord&logoColor=white) | ![Slack](https://img.shields.io/badge/Slack-4A154B?style=for-the-badge&logo=slack&logoColor=white) |


---
## 🗂문서

<details>
  <summary><h3>📋설계문서</h3></summary>
<details>
  <summary><h4>1. WBS</h4></summary>
  <a href = "https://docs.google.com/spreadsheets/d/17O6hW-91EbhwNmIE26s_ZMHHAI28S691gpfcICxbrkk/edit?usp=sharing">WBS</a>
  <img width="1270" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/3a89bcde-4694-4e94-add2-70347bb099a2">
</details>
  
<details>
  <summary><h4>2. 요구사항 명세서</h4></summary>
  <a href= "https://docs.google.com/spreadsheets/d/17O6hW-91EbhwNmIE26s_ZMHHAI28S691gpfcICxbrkk/edit?usp=sharing">요구사항 명세서</a>
  <img width="1178" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/e8f0aa6e-4937-4180-9edf-b18815084da7">
</details>

<details>
  <summary><h4>3. DDD</h4></summary>
  
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/f635e785-cff2-421a-89de-3cf62c1af5e2)
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/569bc660-9da4-46ea-9d7f-7cbd88b16b23)
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/5cbefffd-22ad-4814-a164-04c0bb80986d)
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/6b5fc6a7-a3c4-4b56-bf06-80c9a5fa2508)
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/d79186b7-f7b5-41bc-8432-120d34d030bb)
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/58016d4d-fe4e-406c-85da-e0818d30782c)
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/696f35cc-bed8-472d-a7f4-63de40261b55)
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/ed4e6298-df5a-4f16-bb8d-e531c9bba524)
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/7d669ce4-151a-4cce-bb33-860577890a89)
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/191eddd4-f750-4cbd-88c7-583da8a7ad26)
</details>
  
<details>
  <summary><h4>4. ERD</h4></summary>
  <h5>1. 논리 모델링</h5>
  
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/607eddf2-36db-4798-9a6f-b642fbeddb87)
  <h5>2. 물리 모델링</h5>
  
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/d407b761-27f5-4c3e-833a-382881782702)

</details>

<details>
  <summary><h4>5. 화면 설계서</h4></summary>

<details>
<summary><h4>5-1. 로그인 + 내 정보</h4> </summary>
  
![와이어프레임 들](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/8e5cac5d-6a34-47c7-9bff-26e291c65459)

![와이어프레임 들 (2)](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/2e3ca30a-220c-4175-9ab0-4a8a0051d0ed)

![이미지 1](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/49031e60-8600-461e-b4a5-85928c2d9a48)

![이미지 2](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/88ddc0b6-9530-42e3-816b-5e3ed8be5142)


</details>

<br>
<details>
<summary><h4>5-2.공지사항 관리</h4> </summary>

![와이어프레임 들 (9)](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/b2c0b401-69d3-403e-8615-d0010514c174)

![와이어프레임 들 (10)](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/288c68d5-c4f7-403d-8a07-788a6cc2e47e)

![와이어프레임 들 (11)](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/8233a8a2-cc6d-4c7d-bf8d-61a06df4af0e)

![와이어프레임 들 (12)](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/67a251a6-9f79-4917-b0a7-9f42f5a52b81)

</details>


<br>
<details>
<summary><h4>5-3. 영업기회 관리</h4> </summary>

![와이어프레임 들 (5)](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/7b572ad5-875f-460a-98a6-9e3a45fc24d4)

![와이어프레임 들 (6)](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/903f13d9-d034-4bd3-82b6-ca748c0eefcd)

![와이어프레임 들 (7)](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/6ea9679e-e60c-4bf0-b3b4-6c05d6b2cab6)


![와이어프레임 들 (8)](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/bd849cd9-ddbd-43b3-8bff-aad12751d8c1)

</details>

<br>
<details>
<summary><h4>5-4. 품목 관리</h4> </summary>
  
![와이어프레임 들 (3)](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/4bc14d9c-421a-474e-a306-ff4f9b4aeaaa)

![와이어프레임 들 (4)](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/d4852f6f-b750-475a-940d-c5554756a176)

</details>
  
<br>
<details>
<summary><h4>5-5. 거래처 관리</h4></summary>
    
![그림2](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/3a778131-aebf-4ad7-8a71-bb8fc6b927a1)

![그림3](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/8d95911e-9844-4b3a-a222-7bf676951183)

![그림4](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/b5e40d7c-7a74-4a58-8e19-12f6f9f76ba8)

![그림5](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/c2ede112-945f-43d6-959d-78a51691cfb3)

</details>

<br>
<details>
<summary><h4>5-6. 견적서 관리</h4></summary>

![그림6](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/4f608452-4ece-4b24-90b2-8e8ec33f3ae7)

![그림7](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/1ed42fb2-c4a3-4986-9f75-38d5ac79556b)

![그림8](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/e57f9047-4b4f-4033-8b0c-35a494e0aa0e)

![그림9](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/d804846b-708b-473d-b7c0-2d6d3137518c)

</details>

<br>
<details>
<summary><h4>5-7. 계약서 관리</h4></summary>

![그림10](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/d85c2316-d4da-4bdb-b110-9cf034879045)

![그림11](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/3a41a8eb-17c0-4b25-9e56-0ee0403cd6f3)

![그림12](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/fb9f3353-0bf7-4004-988c-770a8d511243)

![그림13](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/e27c0f8e-64bf-4dfc-9687-0fa54134a2d8)

</details>

<br>
<details>
<summary><h4>5-8. 수주 관리</h4></summary>

![그림14](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/edf97edf-891f-4f30-ae0d-fb6aaf6a5955)

![그림15](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/c1fb9d81-20f6-4dec-a666-258b63840a2d)

![그림16](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/94e9dfcf-7081-4a6b-bf7f-8c4d0b7b1300)

![그림17](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/836bc2fb-8453-4422-b5ef-e8eaa0591919)

</details>

<br>
<details>
<summary><h4>5-9. 전표 관리</h4></summary>

![그림18](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/f804940d-7c3a-421e-889b-09a9afb802c7)

![그림19](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/63ddd0b7-926c-4a09-8b7e-f7ae60d682be)

</details>

<br>
<details>
<summary><h4>5-10. 실적 관리</h4></summary>

![그림20](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/be4d5fc1-9b96-4ad3-a549-2dfe6a35c690)

</details>

<br>
<details>
<summary><h4>5-11. 결재 관리</h4></summary>

![그림21](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/55d7c4c1-4c9e-4bfb-b854-851ecc8435be)

![그림22](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/4b1b3e87-6d77-4eea-801a-901884d52ff8)

![그림23](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/31c7d00a-cd97-4279-b54e-9691ae6532f1)

![그림24](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/0d2b0ec5-f2f1-41d1-b1ae-d7e807ca490d)

</details>

<br>
<details>
<summary><h4>5-12. 관리자 페이지</h4></summary>
  
![사진 3](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/1b1fe0eb-123a-4bf0-9047-19c2bb465742)

![사진 4](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/36fe7f26-33b8-4aff-9fd8-845cb503186e)

![사진 5](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/fea93cb4-2602-4cc4-a1f9-bf51a2152df5)

![권한](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/2da44c8e-caee-4ed0-96eb-71743dfadf84)

![권한 1](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/8c2f79eb-d30b-485b-9659-6225e58d55ec)

![권한 2](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/aa5603c5-349d-48ce-a06d-86de8b23cf75)
  
</details>
  
</details>

<details>
  <summary><h4>6. API 명세서</h4></summary>
  
  [API 명세서](http://erpc-back-ver2-env.eba-3inzi7ji.ap-northeast-2.elasticbeanstalk.com/swagger-ui/index.html#/)
  
  <h5>1-1. 세금계산서, 영업기회</h5>
  <img width="653" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/772c46b3-9873-4905-8427-ed795a62fe61">

  <h5>1-2. 영업기회 참고사항, 견적서 참고사항, 견적서</h5>
  <img width="653" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/f6d8fc32-45fb-42b3-b971-c90719b6043d">

  <h5>1-3. 수주 참고사항, 수주, 공지사항 댓글, 공지사항</h5>
  <img width="635" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/11006561-2fa3-4e85-8fa3-d984dca72cf5">

  <h5>1-4. 사원, 계약서, 결재</h5>
  <img width="641" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/9f73eed5-6334-488c-9458-ebf856e3fab0">

  <h5>1-5. 결재, 거래처 참고사항, 거래처</h5>
  <img width="624" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/5bea75bc-f9c5-4c1e-8739-3823c9ef0922">

  <h5>1-6. 권한, 출하, 세금계산서 발행, 삭제요청</h5>
  <img width="621" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/3dc8eb85-b00d-441c-bbfc-f5d297252986">

  <h5>1-7. 삭제요청, 창고, 실적</h5>
  <img width="622" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/7ee25378-e270-4e25-b22c-a1075d8aa1e0">

  <h5>1-8. 실적, 품목, POI</h5>
  <img width="622" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/e994ba61-8746-4b23-9aae-51d32dc296e5">
  </details>

<details>
  <summary><h4>7. 업무 흐름도</h4></summary>
  <h5>1-1. 영업관리 업무 흐름도</h5>
  <img width="653" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/509f052b-d768-4500-bccf-e7fe15284b36">

  <h5>1-2. ERP 관리자 업무 흐름도</h5>
  <img width="653" alt="image" src=https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/c3dd0923-9dd8-4283-8b5b-89c27c9a9c5c">

  <h5>1-3. 상급자(팀장) 업무 흐름도</h5>
  <img width="635" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/34f8dcd2-1628-4a76-a519-f61412053de6">
</details>
</details>
</details>

<details>
  <summary><h3>📊테스트</h3></summary>

  <details>
  <summary><h4>1. 백엔드 단위테스트 결과서</h4></summary>
  
  <img alt="백엔드 테스트 명세서" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/77635e98-3f4d-4118-a070-19cab77b9ffe" width="100%" >

</details>
  
  <details>
  <summary><h4>2. UI/UX 단위 테스트 결과서 및  통합테스트</h4></summary>
<br>
<details>
<summary> <h4>2-1. 로그인</h4> </summary>
<h5>2-1-1. 비밀번호 변경 후 로그인 및 로그아웃</h5> 

![영상1](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/f4088fda-dffe-4409-b138-3f5856dd187b)

<h5>2-1-2. 내 정보 확인 비밀번호 변경 권한신청</h5>

![2024-06-12 15;24;47](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/b80b577a-194e-40a1-8b41-6deafca96abd)
</details>
<br>
<details>
<summary> <h4>2-2. 공지사항</h4> </summary>
  
<h5>2-2-1. 공지사항 등록</h5>

![2024-06-12 15;25;58](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/ccb53b22-6780-4c5b-8cf7-3f1632de4166)

<h5>2-2-2. 댓글 작성 및 삭제</h5>

![2024-06-12 15;27;06](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/48d61703-9714-471a-bcc6-5e6a1fc77ae5)

<h5>2-2-3. 공지사항 수정</h5>

![2024-06-12 15;28;29](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/3d9f0808-5947-4556-9adf-1666230941a7)

</details>

<br>
<details>
<summary> <h4>2-3. 품목관리</h4> </summary>

<h5>2-3-1. 품목 목록</h5>

![2024-06-12 15;53;24](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/1355f400-cb2a-4a7b-97e8-de8902aaaa4a)

<h5>2-3-2. 창고 목록</h5>

![2024-06-12 16;12;43](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/ab8eae5f-e095-4bfd-a1ff-c07bcfbe87cf)

</details>

<br>
<details>
<summary> <h4>2-4. 영업기회</h4> </summary>
  
<h5>2-4-1. 영업기회 목록</h5>
  
![2024-06-12 16;21;58](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/caa4b370-4f07-4fe5-8ecf-db26d3ad3c8c)

<h5>2-4-2. 영업기회 상태변경 및 참고사항 작성 및 삭제</h5>

![2024-06-12 16;39;10](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/557c1a19-5f59-4e3d-a08c-ce22bfbe637c)

<h5>2-4-3. 영업기회 등록( 전화번호 형식 이메일 형식 맞아야함)</h5>

![2024-06-12 16;43;48](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/ff9c010c-f396-4fba-b863-6cf1259ea640)

<h5>2-4-4. 영업기회 수정</h5>

![2024-06-12 16;45;35](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/03fe1030-605c-4c31-baa0-d4d25190c378)

</details>

<br>
<details>
<summary> <h4>2-5. 거래처 관리</h4> </summary>

<h5>2-5-1. 거래처 등록 및 목록</h5>
  
![거래처-등록](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/512ea4ff-8da6-454d-a39a-bb0dd2f6bafc)

<h5>2-5-2. 거래처 상세 및 수정/삭제 요청</h5>

![거래처-조회-및-수정](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/354b54f8-a674-4cb4-bf01-a610f20d66cf)

<h5>2-5-3. 거래처별 수주 내역 조회</h5>

![거래처별 수주 내역 조회](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/8694f5b2-39a4-4b48-97e5-d3fb0328764c)

</details>

<br>
<details>
<summary> <h4>2-6. 견적서 관리</h4> </summary>

<h5>2-6-1. 견적서 등록 및 목록</h5>
  
![견적서-등록](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/40f38cc5-1744-4f7e-b31a-eff34030c7ea)

<h5>2-6-2. 견적서 상세 및 수정/엑셀다운/결재요청/삭제요청</h5>

![견적서-조회-및-수정](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/14ceb326-98e6-4985-b150-d1cf9ed839be)

</details>

<br>
<details>
<summary> <h4>2-7. 계약서 관리</h4> </summary>

<h5>2-7-1. 계약서 등록 및 목록</h5>
  
![계약서-등록](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/509a89e6-3416-4d27-8ec4-47c6cca3b3d0)

<h5>2-7-2. 계약서 상세 및 수정/엑셀다운/결재요청/삭제요청</h5>

![계약서-조회-및-수정](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/1b61caa8-995c-4b91-96bb-96900d1d27e5)

</details>

<br>
<details>
<summary> <h4>2-8. 수주/전표 관리</h4> </summary>

<h5>2-8-1. 수주 등록 및 목록</h5>
  
![수주-등록](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/cfd41820-8fab-4f4d-9bb8-39a9d6b7a0e8)

<h5>2-8-2. 수주 상세 및 수정/엑셀다운/결재요청/삭제요청</h5>

![수주-조회-및-수정](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/0d921cbf-27ae-44dc-9b40-b6d458efc977)

<h5>2-8-3. 세금계산서 발행 요청 및 발행내역/출하상태 확인</h5>

![세금계산서-발행-및-수주-출하-확인](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/c3a8b327-659a-476e-97bd-0bbdd592aa8b)

</details>

<br>
<details>
<summary> <h4>2-9. 실적 관리</h4> </summary>

<h5>2-9-1. 연간 실적 조회</h5>
  
<img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/1c770eb6-c1c4-4f23-a9de-5db402ba4c85" width="100%" >

<h5>2-9-2. 팀별 실적 조회</h5>

<img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/6213682a-fa9d-4f66-a77b-7b8c94a2303a" width="100%" >

<h5>2-9-3. 사원별 실적 조회</h5>

<img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/e38a6d58-f0a1-4561-a4d8-808d2b007441" width="100%" >

</details>

<br>
<details>
<summary> <h4>2-10. 결재 관리</h4> </summary>

<h5>2-10-1. 견적서 결재</h5>
  
<img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/af0b6230-598f-4e77-9b4e-8af1407026a6" width="100%" >

<h5>2-10-2. 계약서 결재</h5>

<img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/7c810259-d265-4e1c-a7cc-fdc6c54cc6fa" width="100%" >

<h5>2-10-3. 수주 결재</h5>

<img src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/153909291/dbf9ffff-e5bc-498e-8ebc-d1dc4b4af0ef" width="100%" >

</details>

<br>
<details>
<summary> <h4>2-11. 관리자 페이지 </h4> </summary>

<h5>2-11-1. 사원조회 및 수정</h5>

![사원리스트밎저장](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/4b3837c6-4159-4006-8643-e07115102408)

<h5>2-11-2. 사원등록</h5>

![사원등록](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/eed69439-3c5d-477c-a561-86888742e3dd)

<h5>2-11-3. 권한신청 및 조회</h5>

![권한신청 밎 조회](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/2a4f70e1-dc46-4587-bd7a-a4a766c4e067)

<h5>2-11-4. 권한조회 및 등록</h5>

![권한조회 및 등록](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/470a727f-efec-4e54-bca5-f3de91f37d3f)

<h5>2-11-5. 삭제요청 및 관리 </h5>

<br>
<h5> 영업기회 삭제 요청 관리</h5>

![영업기회 삭제 요청 밎 삭제](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/1ed8955b-91be-4a93-80b6-571caf894100)

<h5> 계약서 삭제 요청 관리</h5>

![계약서 삭제 요청 밎 관리](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/8f9c8426-eb93-4865-a770-c1a52fa12fb6)

<h5> 거래처 삭제 요청 관리</h5>

![거래처 삭제요청 밎 관리](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/f3ac5be7-c719-4f36-a44a-08d005892020)

<h5> 견적서 삭제 요청 관리</h5>

![견적서 삭제 요청 및 관리](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/c446cd0f-487d-4ec8-af3a-33081607d1aa)

<h5> 수주 삭제 요청 관리</h5>

![수주 삭제요청 및 관리](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/113569573/bfd992e4-c15d-4964-ba14-1d7a25e06c86)

</details>


</details>

</details>

<details>
  <summary><h3>📈시스템 아키텍처 및 모니터링</h3></summary>
  <h4>1. 시스템 아키텍처</h4>
  <img width="1318" alt="image" src="https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/469ff274-9418-4376-91cc-652a03f84668">

  <h4>2. Prometheus</h4>
  
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/30425298-ce1d-4eb9-bf07-133bdd4077b3)

  <h4>3. Grafana</h4>
  
  ![image](https://github.com/beyond-sw-camp/be04-final-team06-ERPC/assets/71023617/7d81dd77-76fd-427a-b3a9-7f42b18b6e39)
</details>

---
## 🥳프로젝트 회고

| 이름  | 내용 |
| ----- | ----------|
| 송동준 |  이번 프로젝트에서는 실제 실무와 밀접한 연관이 있는 영업관리 시스템(ERP)을 제작해 보았습니다. 아무래도 ERP 자체가 저희에게 생소한 주제이다 보니 조원들이 서 여러 방면으로 공부해 보고 실제 실무진 멘토의 경험을 바탕으로 프로젝트를 진행하였습니다. <br><br> 이를 통해 기본적인 거래처 견적서 계약서 수주 전표를 실적을 관리하는 기능을 구현하였고 다른 시스템과의 차별성을 두기 위해 여러 정보들을 불러와서 일일이 작성할 필요 없이 자동적으로 작성할 수 있게 편의성을 추가했습니다. <br><br> 생소한 주제라 이해하는데 시간도 오래 걸리고 현업에서 쓰는 시스템인 만큼 많은 기능을 가지고 있어 구현하는 데 어려움을 겪었으나 다른 팀원들 보다 적은 인원수에도 일정을 잘 관리하여 최종 프로젝트를 무사히 완성할 수 있었습니다. <br><br>권한 부여 정보 불러오기 여러 조건들에 의한 상태 값 변화들을 신경 쓰면서 문제 해결 능력을 더 기를 수 있었고 오류 코드를 차근차근 점검해나가면서 차분함을 기를 수 있었습니다 또한 Elastic Beanstalk을 통해 자동 배포 시스템을 이용하면서 실제 현업에서 어떻게 배포하는지를 배울 수 있었습니다 |
| 양지혜 |  |
| 윤재은 | 이번 프로젝트에서는 효율적인 영업을 위한 영업 관리 시스템이라는 생소한 주제를 가지고 2개월 동안 진행하며 많은 새로운 경험을 했습니다. 팀원들이 각각 기획서를 제작하는 과정부터 시작해, 영업 프로세스를 익히기 위해 많은 자료를 조사하고 여러 영업 관련 ERP를 참고하며 장단점을 추출하고 이를 기반으로 기획을 했습니다. 저는 이번 ERPC 프로젝트에서 DB 모델링, RDS 서버 구축, JPA를 활용한 CRUD, GitHub Actions와 Elastic Beanstalk을 활용한 CI/CD, Spring Security, SMTP 설정을 맡았습니다.<br><br> 개발을 시작하기 전 가장 어려울 것이라고 예상했던 권한과, 수주를 구현하기 위해 먼저 스프링 시큐리티에서 권한을 설정하지 않고 DB 모델링에서 이를 고려해 중간 객체를 만들며 권한 문제를 해결하고 JPA를 활용해 수주의 여러 얽힌 기능들을 하나씩 구현하며 많은것을 얻어갈 수 있었습니다.<br><br>이전에 시도해보지 못했던 CI/CD, Spring Security, RDS 구축을 담당하며 많은 어려움도 있었지만, 하나씩 해결해가며 Elastic Beanstalk의 작동 원리, JWT 토큰 발급, 리눅스 환경에서 Nginx 설정 등을 경험 할 수 있는 계기가 되었습니다. Elastic Beanstalk을 통해 자동 배포 시스템을 설정하고 운영하여 배포 효율성을 크게 향상시켰으며, Spring Security를 활용해 JWT 토큰 기반 인증 시스템을 구현했습니다. 또한, 리눅스 환경에서 Nginx를 설정하여 서버 성능과 보안을 강화했습니다.<br><br>비록 이번 프로젝트에서 리프레시 토큰 구현과 실적 데이터를 그래프로 시각화하는 기능을 구현하지 못해 아쉬움을 느끼지만, 이는 추후 고도화 과정에서 새로운 목표로 설정해 개발을 진행 할 계획입니다. |
| 조수빈 | 이번 프로젝트에서는 다양한 기능을 구현하며 많은 성취감을 느꼈습니다. 영업기회, 계약서, 매출 및 목표실적, 세금계산서 요청, 공지사항 관련 기능을 모두 담당하여 성공적으로 구현하였습니다. 특히, 엑셀 변환 및 다운로드 기능은 Apache POI를 이용했고, 파일 업로드는 AWS S3 버킷을 활용했습니다. 또한, 프로메테우스와 그라파나를 통해 모니터링 시스템을 구축하고, 깃허브 웹훅을 통해 디스코드 채널로 알림을 설정하여 팀원들의 진행 상황을 실시간으로 확인할 수 있었습니다.<br><br>세금계산서 관련 기능은 다른 기능들과 밀접하게 연관되어 있어 신경 써서 구현하였으며, 타 부서와의 협업을 고려해 테이블을 분리하여 구현하였습니다. JPA를 활용해 잔금 혹은 일시금을 납부할 경우 자동으로 해당 팀원 및 팀에 매출 실적을 반영하는 기능을 구현하면서 업무 프로세스를 최대한 반영하려고 노력했습니다.<br><br>다른 팀들보다 적은 인원으로 프로젝트를 진행하면서 담당한 업무 분량이 많았지만, 그만큼 더 큰 성취감을 느낄 수 있었고, 꼼꼼하게 일정 관리를 위해 노력했습니다. 특히 새로운 기술을 도입해 파일 업로드와 엑셀 변환 및 다운로드 기능을 구현하고, 여러 오류들을 스스로 해결하며 기술적인 성장을 이뤘습니다.<br><br>실제 실무진인 멘토의 조언을 받아 실무 프로세스를 최대한 반영하려 노력한 것도 큰 도움이 되었습니다. 이번 프로젝트를 통해 백엔드 개발에 사용된 Spring JPA와 Spring Boot, AWS S3를 활용한 파일 업로드, Apache POI를 이용한 엑셀 변환 및 다운로드, 그리고 디스코드 웹훅을 통한 팀원들과의 원활한 소통 등 다양한 기술적 경험을 쌓을 수 있었습니다. 이 프로젝트는 개발자로서의 역량을 한층 더 성장시키는 소중한 기회가 되었습니다. |


