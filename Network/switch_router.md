# 개념

## 허브 (L1)

- 여러대 컴퓨터 연결해서 네트워크를 만듬
- 데이터 패킷을 연결된 모든 장치로 보냄 (단순 분배하는 중계장치)
    - 모든 연결된 장치에 패킷을 보내므로 데이터 전송 대역을 분리해서 사용
        - 허브의 데이터 전송속도가 500Mbps라고 하면, 장치 5대가 연결되어 있는 경우 대역폭은 100Mbps로 나눠짐
        - 비효율적
            - 스위치로 대체

## 리피터 (L1)

- 단순 전기 신호만 증폭시키는 역할
    - 먼거리까지 도달할 수 있도록함

## 브리지 (L2)

- 이더넷 장비를 물리적으로 연결
- 프레임 전송거리 연장
- 현재 쓰이지 않고 있음
    - 라우터로 대체

## 스위치 (L2)

- OSI 데이터 링크 계층
- 연결된 장치들의 mac 주소와 port 번호가 기록된 mac 주소 테이블을 가지고 있음
- 원하는 목적지에 테이터 패킷을 전송
- 여러 장치가 있어도 느려지지 않음
- 만약, IP주소와 Port에 일치하는 MAC 주소가 테이블에 존재하지 않는 경우에는, 허브처럼 모든 장치들에게 다 데이터 패킷을 뿌려서(포워딩해서) 테이블을 갱신
    - flooding, 브로드캐스트
- 대역폭을 확대시키는 장치
- VLan을 지원

## 스위치 (L3)

- VLan 간 라우팅을 위해 사용
- 네트워크끼리 연결해줌
- 해당 프로토콜을 쓰는 패킷으 스위칭 가능
- L2 스위치 + 라우팅 기능
- 브로드캐스트 트래픽
    - 성능 저하 예방

## 스위치 (L4)

- 로드밸런싱 기능
    - 서버 부하 분산
- 프로토콜 의존적

## 라우터 (L3)

- LAN을 연결해주는 장치 (외부와 연결)
    - 통신망과 통신망을 연결
    - 최적의 경로를 선택
- IP 주소를 사용해 네트워크 간 데이터 전송
- 미리 라우팅 테이블에 네트워크 정보를 등록해 두어야함
- 라우터로 연결하기 전에 장치를 백본 스위치에 연결
    - 테이블에 정보가 없으면 데이터를 파기
- 방화벽 기능
- 충돌 도메인과 브로드캐스트 도메인 분리
- ex) 공유기

## 스위치 (L7)

- 데이터 안의 실제 내용까지 조회
    - 특정 문자열이나 명령을 기준으로 트래픽 스위칭
- 보안 강화

## 게이트웨이 (L7)

- 서로 다른 프로토콜을 사용하는 네트워크를 이어줌
- 하드웨어일 수 있고 소프트웨어일 수 있음
- ex) 공유기